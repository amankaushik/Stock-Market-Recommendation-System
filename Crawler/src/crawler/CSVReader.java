/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crawler;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
//import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author chanakya
 */
public class CSVReader {

     public ArrayList<String> get_tickers(){
         String[] temp;
         ArrayList<String> comp_ticker;
         comp_ticker = new ArrayList<>();
         int i = 0;
         try (Scanner scanner = new Scanner(new File("tickers.csv"))) {
             scanner.useDelimiter("\t");
             
             while (scanner.hasNext())
             {
                 temp = scanner.nextLine().split("\t"); 
                 comp_ticker.add(temp[0]);
                 //i++;
                 //System.out.println(temp[0]);
             }
         }catch (Exception e){
             System.out.println(e);
         }
         //System.out.println(comp_ticker);
         return comp_ticker;
    }
     public ArrayList<String> get_company_names(ArrayList<String> tickers){
         String[] temp;
         ArrayList<String> comp_names;
         comp_names = new ArrayList<>();
         int i = 0;
         try (Scanner scanner = new Scanner(new File("tickers.csv"))) {
             scanner.useDelimiter("\t");
             
             while (scanner.hasNext()){
                 temp = scanner.nextLine().split("\t");
                 for(String s: tickers){
                     if(s.equals(temp[0])){
                         comp_names.add(temp[1]);
                         break;
                     }
                 }
             }
         }catch (Exception e){
             System.out.println(e);
         }
         //System.out.println(comp_ticker);
         return comp_names;
     }
     public Map<String, String>get_ticker_n_company(ArrayList<String> ticker){
         Map<String, String> tc_map = null;
         for(String s: ticker){
             tc_map.put(s, get_company_name(s));
         }
         return tc_map;
     }
     
     public String get_company_name(String ticker){
         //String c_name;
         String[] temp;
         try (Scanner scanner = new Scanner(new File("tickers.csv"))) {
             scanner.useDelimiter("\t");
             
             while (scanner.hasNext()){
                 temp = scanner.nextLine().split("\t");
                 //for(String s: tickers){
                 if(ticker.equals(temp[0])){
                         return(temp[1]);
                     }
                 //}
             }
         }catch (Exception e){
             System.out.println(e);
         }
         return null;
     }
     
     public String get_ticker_from_company(String com){
         String[] temp;
         try (Scanner scanner = new Scanner(new File("tickers.csv"))) {
             scanner.useDelimiter("\t");
             
             while (scanner.hasNext()){
                 temp = scanner.nextLine().split("\t");
                 //for(String s: tickers){
                 if(com.equals(temp[1])){
                         return(temp[0]);
                     }
                 //}
             }
         }catch (Exception e){
             System.out.println(e);
         }
         return null;
     }
}
