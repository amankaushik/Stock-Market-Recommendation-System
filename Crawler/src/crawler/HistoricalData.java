/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//http://ichart.yahoo.com/table.csv?s=GOOG&a=0&b=1&c=2000&d=0&e=31&f=2010&g=w&ignore=.csv 


package crawler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author chanakya
 */
public class HistoricalData {
    //private ArrayList<String> tickers;
    private final String base_URL = "http://ichart.finance.yahoo.com/table.csv?s=";
    private final String trading_period = "&g=d";                                      // daily, weekly, monthly
    private final String static_end = "&ignore=.csv";                                  // part of the download URL 
    DataInputStream in=null;
    DataOutputStream out=null;
    FileOutputStream fOut=null;
    public void get_tabular_data(ArrayList<String> tickers){
      for(String s: tickers){
          String url = build_URL(s);
          System.out.println(s+" : "+url);
          try{
                URL remoteFile=new URL(url);
                URLConnection fileStream=remoteFile.openConnection();

                fOut=new FileOutputStream(s+".csv");      // Open the input streams for the remote file 

                out=new DataOutputStream(fOut);           // Open the output streams for saving this file on disk   
  
                in=new DataInputStream(fileStream.getInputStream());

                int data;
                while((data=in.read())!=-1){              // Read the remote on save save the file   
                    fOut.write(data);
                }  
                System.out.println("Download of " + s +".csv" + " is complete." );   
        } catch (IOException e){
        } finally {
            try{
                in.close();
                fOut.flush(); 
                fOut.close();      
            } catch(IOException e){}
        }
      }
    }
        
    public String build_URL(String ticker){
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        String timeString = sdf.format(dt);
        String date_to, date_from;
        date_from = "&a=0&b=1&c=2006";
        date_to = "&d=" + (parseInt(timeString.substring(0, 2)) - 1) + "&e=" + timeString.substring(2, 4) + "&f=" + timeString.substring(4);
        //System.out.println(date_from + " : " + date_to);
        String URL;
        URL = base_URL + ticker + date_from + date_to + trading_period + static_end;
        //System.out.println("URL : " + URL);
        return URL;
    }
}
