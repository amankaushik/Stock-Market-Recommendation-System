/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import uk.ac.shef.wit.simmetrics.similaritymetrics.*;

/**
 *
 * @author chanakya
 */
public class ReutersNewsArticles {

    private final ArrayList<String> tickers;
    private final String base_URL = "http://www.reuters.com/finance/stocks/companyNews?symbol=";
    private final String root_URL = "http://www.reuters.com";
    private final String date_ext = ".O&date=";
    Date dt = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
    private final String timeString = sdf.format(dt);

    ReutersNewsArticles(ArrayList<String> ticker) {
        tickers = ticker;
    }

    public Map<String, NewsArticles> get_articles() throws IOException {
        String URL, extURL;                          // URL and extended URL   
        Document doc = new Document(""), docex, articles;                        // initial document and extended document
        ArrayList<String> dates = new ArrayList<>(); //Dates on(select option values) http://www.reuters.com/finance/stocks/companyNews?symbol=
        Element elements;
        Elements ele1, ele2;
        AbstractStringMetric metric = new MongeElkan();
        ArrayList<String> temp_links = new ArrayList<>();        // links on one date
        ArrayList<String> acc_links = new ArrayList<>();         // all links on all dates combined
        Map<String, ArrayList<String>> all_links = new HashMap<String, ArrayList<String>>();
        Map<String, NewsArticles> headline_url_text = new HashMap<>();
        int crawled = 0;
        for (String s : tickers) {
            URL = base_URL.concat(s);
            //try {
            try {
                doc = Jsoup.connect(URL).get();

                elements = doc.select("div[class=newsDateSelector] select").first();
                for (Element e : elements.children()) {
                    dates.add(e.val().toString());
                }
                //System.out.println(timeString);
                for (String date : dates) {
                    /*
                     if(date.equals("03312014")){
                     break;
                     }
                     */
                    extURL = base_URL + s + date_ext + date;
                    try {
                        docex = Jsoup.connect(extURL).get();
                        if (docex == null) {
                            System.out.println("Docex is NULL");
                            continue;
                        }
                        ele2 = docex.select("div[id=companyNews] div[class=feature]");            //Featured Story - several on every page  
                        temp_links.clear();
                        if (!ele2.isEmpty()) {
                            for (Element e : ele2) {
                                //System.out.println(s+" "+date+" "+"featured");
                                String headline = e.select("h2 a").text();
                                String link = e.select("a[href]").attr("href");

                                //try{
                                int flag = -1;
                                if (temp_links.size() > 0) {
                                    for (String links : temp_links) {
                                        if (metric.getSimilarity(links, link) >= 0.90) {
                                            System.out.println("too similar :"+headline+": "+link);
                                            flag = 1;
                                            break;
                                        }
                                    }
                                    if (flag == -1) {
                                        temp_links.add(link);
                                    }
                                } else {
                                    temp_links.add(link);
                                }

                        //}catch (Exception ex){
                                //System.out.println(ex);
                                //}
                            }
                        } else {                                                                     // If no featured stories then, check for top stories, b/c topstories are included in featyred stories   
                            ele1 = docex.select("div[id=companyNews] div[class=topStory]");        //Top Story - 1 on every page
                            if (!ele1.isEmpty()) {
                                //System.out.println(s+" "+date+" "+"topstory");
                                String headline = ele1.select("h2 a").text();
                                String link = ele1.select("a[href]").attr("href");
                                try {
                                    int flag = -1;
                                    if (temp_links.size() > 0) {
                                        for (String links : temp_links) {
                                            if (metric.getSimilarity(links, link) >= 90.0) {
                                                System.out.println("too similar :"+headline+": "+link);
                                                flag = 1;
                                                break;
                                            }
                                        }
                                        if (flag == -1) {
                                            temp_links.add(link);
                                        }
                                    } else {
                                        temp_links.add(link);
                                    }
                                } catch (Exception ex) {
                                    System.out.println(ex);
                                }
                            }
                        }
                        //all_links.put(s, temp_links);
                    } catch (IOException ex) {
                        Logger.getLogger(ReutersNewsArticles.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    acc_links.addAll(temp_links);
                    /*
                     all_links.addAll(temp_links);
                     for(String k: all_links){
                     System.out.println("Link : " + k + "\n");
                     }
                     */
                    /*
                    Iterator<Map.Entry<String, ArrayList<String>>> entries = all_links.entrySet().iterator();
                    while (entries.hasNext()) {
                        Map.Entry<String, ArrayList<String>> entry = entries.next();
                        ArrayList<String> All_links = entry.getValue();
                        for (String links : All_links) {
                            System.out.println("Link: " + links);
                        }
                    }
                    */            
                }
                all_links.put(s, acc_links);
            }catch (IOException ex) {
                Logger.getLogger(ReutersNewsArticles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Iterator<Map.Entry<String, ArrayList<String>>> entries = all_links.entrySet().iterator();
                    while (entries.hasNext()) {
                        Map.Entry<String, ArrayList<String>> entry = entries.next();
                        ArrayList<String> All_links = entry.getValue();
                        for (String links : All_links) {
                            System.out.println("Link: " + links);
                        }
                    }
                        
                CSVReader cr = new CSVReader();
                String articleText, hd, time_stamp, written_by, filed_under;
                Elements ehd, ets, ele, ewb, efu, etemp;                    // headline, timestamp, article text, written by, filed under
                //String ctickc="";
                System.out.println(all_links.size()+"\n");
                Iterator<Map.Entry<String, ArrayList<String>>> entries2 = all_links.entrySet().iterator();
                while (entries2.hasNext()) {
                    System.out.println("Inside");
                    Map.Entry<String, ArrayList<String>> entry = entries2.next();
                    String s = entry.getKey();
                    ArrayList<String> All_links = entry.getValue();
                    for (String links : All_links) {
                        articleText = "";
                        //ctickc="";
                        try{
                        articles = Jsoup.connect(root_URL + links).get();
                        ehd = articles.select("div[class=column1 gridPanel grid8] h1");
                        hd = ehd.text().toString();
                    //System.out.println("URL : " + root_URL+links + "\n");
                        //System.out.println("Headline : " + hd + "\n");
                        //ctick = articles.select("div[class=sectionContent] div[id=sectionHeader] div[id=sectionTitle] h1").text().toString();
                        //cctick = articles.select("div[class=sectionContent] div[id=sectionHeader] div[id=sectionTitle]");
                        //for(Element e: cctick){
                        //  ctickc += e.text();
                        //}
                        //System.out.println("Extra : " + ctick + "\n");
                        etemp = articles.select("div[class=column1 gridPanel grid8]");
                    //System.out.println(etemp.select("div[id=articleInfo] span[class=timeStamp").text()+"\n");
                        //System.out.println(etemp.select("div[id=articleInfo] p[class=byline").text()+"\n");
                        efu = articles.select("div[class=relatedTopicButtons] div[class=actionButton]");
                        filed_under = efu.text().toString();
                        //System.out.println(efu.text().toString()+"\n");
                        time_stamp = etemp.select("div[id=articleInfo] span[class=timeStamp]").text().toString();
                        written_by = etemp.select("div[id=articleInfo] p[class=byline]").text().toString();
                        //System.out.println(written_by+"\n");
                        ele = etemp.select("span[id=articleText]");
                        for (Element e : ele) {
                            articleText += e.text();
                        }
                    //String[] temp = ctick.split("(");
                        //System.out.println("Article : " + hd + "\n");
                        NewsArticles na = new NewsArticles();
                        na.headline = hd;
                        na.URL = root_URL + links;
                        na.article_text = articleText;
                        na.written_by = written_by;
                        na.filed_under = filed_under;
                        na.time_stamp = time_stamp;
                        na.company = cr.get_company_name(s);
                        na.ticker = s;
                        headline_url_text.put(na.headline, na);
                        crawled++;
                        System.out.println("Article : " + hd + "\n");
                        System.out.println("Crawled : " + crawled + "\n");
                    }catch (IOException ex) {
                Logger.getLogger(ReutersNewsArticles.class.getName()).log(Level.SEVERE, null, ex);
            }
                    }
                }
            //} 
        //}
        return headline_url_text;
    }
}
