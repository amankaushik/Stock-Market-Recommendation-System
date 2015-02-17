/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crawler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author chanakya
 */
public class Crawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        CSVReader ticker = new CSVReader();
        ArrayList<String> tickers;
        tickers = ticker.get_tickers();                          // Company Tickers
        System.out.println("Company Tickers: " + tickers);
        
        //------------------------------------------- Reuters News Articles -------------------------------
        
        ReutersNewsArticles news = new ReutersNewsArticles(tickers);
        Map<String, NewsArticles> articles;
        articles = news.get_articles();
        
        //--------------------------------------------------------------------------------------------------
            
        // --- Pringting News articles with additional information like headline, url, written by etc. -----
        /*
        Iterator<Map.Entry<String, NewsArticles>> entries = articles.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, NewsArticles> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().URL + " ;: " + entry.getValue().headline
                    + " : " + entry.getValue().article_text + " : " + entry.getValue().written_by + " : " + entry.getValue().filed_under + " : " + entry.getValue().time_stamp + "\n\n\n");
        }
        */
        
        try{
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CrawledData","root","");  
        //System.out.println(con);
        Iterator<Map.Entry<String, NewsArticles>> entries2 = articles.entrySet().iterator(); 
        //char quotes ='"';
        while (entries2.hasNext()){
            System.out.println("Inside");
            Map.Entry<String, NewsArticles> entry = entries2.next();
            PreparedStatement ps=con.prepareStatement("INSERT IGNORE INTO ReutersNewsArticles VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1,entry.getValue().company);  
            ps.setString(2,entry.getValue().ticker);
            ps.setString(3,entry.getValue().headline);  
            ps.setString(4,entry.getValue().article_text);
            ps.setString(5,entry.getValue().written_by);  
            ps.setString(6,entry.getValue().filed_under);
            ps.setString(7,entry.getValue().time_stamp);  
            ps.setString(8,entry.getValue().URL);
            
            int i = ps.executeUpdate();
            if(i > 0){
                System.out.println("Entry Successful");
            }
            else{
                System.out.println("Entry Unsuccessful");
            }
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        // --------------------------------------------------------------------------------------------------
        
        // ---------------- Historical Stock Prices ---------------------------------
        /*
        HistoricalData hdata = new HistoricalData();
        hdata.get_tabular_data(tickers);
        */
        //---------------------------------------------------------------------------
        
        // ---------- Analyst Opinion Yahoo Finance ---------------------------------
        /*
        AnalystOpinionYF aopi = new AnalystOpinionYF();
        aopi.get_analyst_opinion(tickers);
        */
        //---------------------------------------------------------------------------
        
        //---------- Twitter Feed ---------------------------------------------------
        /*  
        TwitterFeed tf = new TwitterFeed();
        tf.setTickers(tickers);
        tf.get_tweets();
        */
        //---------------------------------------------------------------------------
    }
}
