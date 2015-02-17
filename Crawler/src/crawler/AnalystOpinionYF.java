/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crawler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.googlecode.jcsv.*;
import com.googlecode.jcsv.writer.CSVWriter;
import com.googlecode.jcsv.writer.internal.CSVWriterBuilder;
import java.io.FileWriter;
import java.io.Writer;
/**
 *
 * @author chanakya
 */
public class AnalystOpinionYF {
    private final String base_URL = "http://finance.yahoo.com/q/ud?s=";
    private Document doc;
    public void get_analyst_opinion(ArrayList<String> tickers) throws IOException{
    

    //CSVWriter<Person> csvWriter = new CSVWriterBuilder<Person>(out).entryConverter(new PersonEntryConverter()).build();
    //csvWriter.writeAll(persons);
        for(String s: tickers){
            Writer out = new FileWriter(s+"_ao.csv");
            String target_URL = base_URL + s;
            try {
                doc = Jsoup.connect(target_URL).get();
                Elements ele = doc.select("div[id=content] table[class=yfnc_datamodoutline1] table tbody tr");
                Elements th = ele.select("th");
                Elements td = ele.select("td");
                ArrayList<String> header, data_temp;
                ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
                header = new ArrayList<String>();
                data_temp = new ArrayList<>();
                //data = new ArrayList<>();
                String header_temp = "";
                for(Element e: th){
                    //System.out.println(e.text());
                    //header.add(e.text()+",");
                    header_temp += (e.text()+",");
                }
                header.add(header_temp);
                FileOps fop = new FileOps();
                //System.out.println(header);
                fop.dumpToFile(header, s+"_ao.csv", true);
                int i = 0;
                for(Element e: td){
                    ++i;
                    //System.out.println(i+e.text());
                    
                    if(e.select("th").isEmpty()){
                        data_temp.add(e.text());
                    //data_temp.add("_");
                        if(i%5 == 0){
                            //ArrayList<String> temp = new ArrayList<>();
                            //temp = data_temp;
                            //System.out.println(data_temp);
                            data.add(data_temp);
                            //FileOps fop = new FileOps();
                            //fop.dumpToFile(data_temp, s+"_ao.csv", true);
                            data_temp = new ArrayList<>();
                            //System.out.println(data);
                            //data_temp.clear();
                        }
                    }
                }
                //System.out.println(data);
                //FileOps fop = new FileOps();
                fop.dumpToFile2(data, "," , s+"_ao.csv", true);
                
                /*
                for(Element e: ele){
                    if(!e.select("th").isEmpty()){
                        String[] head = e.select("th").text().split(" ");
                        
                        //List<String> header = Arrays.asList(head);
                        //ArrayList<String> temp = new ArrayList<>(header);
                        //CSVWriter<String> csv_writer = new CSVWriterBuilder<String>(out).entryConverter(new AnalystOpinionEntryConverter()).build();
                        //csv_writer.writeAll(header);
                        //List<AnalystOpinionHeader> header = new ArrayList<>();
                    }
                    else if(!e.select("td").isEmpty()){
                        String[] dt = e.select("td").text().split(" ");
                        List<String> data = Arrays.asList(dt);
                    }
                }*/
            } catch (IOException ex) {
                Logger.getLogger(AnalystOpinionYF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

