/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import minor.ejb.CommodityDetails;
import org.jboss.weld.util.collections.ArraySet;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author chanakya
 */
public abstract class AbstractFacade<T> {
    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
        public JSONObject getCommodityData(String ticker){
        //String requestQuery = "http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22" + ticker + "%22)%0A%09%09"&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=";
          String requestQuery = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22"+ticker+"%22)&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=";
            //String requestQuery ="http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20%3D%20"+ticker+"%0A%09%09&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=";
            System.out.println(requestQuery);
            ArrayList<String> stockdetails = new ArrayList<String>();
            URL url;
            JSONObject q = new JSONObject();
            try {
                url = new URL(requestQuery);
                URLConnection connection = url.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                //System.out.println("jjjj"+in.readLine());
                JSONParser jsonParser = new JSONParser();
                try {
                    JSONObject jsonObject = (JSONObject) jsonParser.parse(in);
                    //System.out.println(jsonObject);
                    JSONObject query = (JSONObject) jsonObject.get("query");
                    JSONObject results = (JSONObject) query.get("results");
                    JSONObject quote = (JSONObject) results.get("quote");
                    /*
                    System.out.println("iiiii"+quote.toJSONString());
                    Set<String> st = quote.keySet();
                    for(String s: st){
                        if(quote.get(s).toString().equals("{}")){
                            System.out.println("IN IF");
                            quote.remove(s);
                            quote.put(s, "NA");
                        }
                    }
                    System.out.println("klklklk"+quote.toJSONString());
                    */
                    /*
                    stockdetails.add(quote.get("Change").toString());
                    stockdetails.add(quote.get("LastTradePriceOnly").toString());
                    stockdetails.add(quote.get("PERatio").toString());
                    stockdetails.add(quote.get("DaysLow").toString());
                    stockdetails.add(quote.get("DaysHigh").toString());
                    stockdetails.add(quote.get("Name").toString());
                    stockdetails.add(quote.get("Open").toString());
                    stockdetails.add(quote.get("Volume").toString());
                    
                    stockdetails.add(quote.get("Ask").toString());
                    stockdetails.add(quote.get("AverageDailyVolume").toString());
                    stockdetails.add(quote.get("LastTradeDate").toString());
                    stockdetails.add(quote.get("EBITDA").toString());
                    stockdetails.add(quote.get("DaysRange").toString());
                    stockdetails.add(quote.get("FiftydayMovingAverage").toString());
                    stockdetails.add(quote.get("PreviousClose").toString());
                    stockdetails.add(quote.get("ChangeinPercent").toString());
                    
                    stockdetails.add(quote.get("PEGRatio").toString());
                    stockdetails.add(quote.get("Symbol").toString());
                    stockdetails.add(quote.get("YearRange").toString());
                    stockdetails.add(quote.get("DaysValueChange").toString());
                    stockdetails.add(quote.get("StockExchange").toString());
                    stockdetails.add(quote.get("PercentChange").toString());
                    */
                    q = quote;
                } catch (ParseException ex) {
                    Logger.getLogger(CommodityDetails.class.getName()).log(Level.SEVERE, null, ex);
                } catch(NullPointerException ne){
                        
                        }

            } catch (IOException e) {
                System.out.println(e);
            }
            for(String s: stockdetails){
                System.out.println(s);
            }
            //CommodityDetails obj = new CommodityDetails(stockdetails);
            //CommodityDetails obj = new CommodityDetails(q);
            //System.out.println("dddddD"+obj.getChange());
            //List<CommodityDetails> sdList = new ArrayList<>();
            //sdList.add(obj);
            /*
            for(CommodityDetails s: sdList){
                System.out.println("ddfdfdf"+s.getChange() + s.getDaysHigh());
            }
            */
            //return sdList;
            //return stockdetails;
            return q;
            //
    }
        public JSONObject getETFData(String ticker){
        //String requestQuery = "http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22" + ticker + "%22)%0A%09%09"&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=";
          String requestQuery = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22"+ticker+"%22)&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=";
            //String requestQuery ="http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20%3D%20"+ticker+"%0A%09%09&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=";
            System.out.println(requestQuery);
            ArrayList<String> stockdetails = new ArrayList<String>();
            URL url;
            JSONObject q = new JSONObject();
            try {
                url = new URL(requestQuery);
                URLConnection connection = url.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                //System.out.println("jjjj"+in.readLine());
                JSONParser jsonParser = new JSONParser();
                try {
                    JSONObject jsonObject = (JSONObject) jsonParser.parse(in);
                    //System.out.println(jsonObject);
                    JSONObject query = (JSONObject) jsonObject.get("query");
                    JSONObject results = (JSONObject) query.get("results");
                    JSONObject quote = (JSONObject) results.get("quote");
                    /*
                    System.out.println("iiiii"+quote.toJSONString());
                    Set<String> st = quote.keySet();
                    for(String s: st){
                        if(quote.get(s).toString().equals("{}")){
                            System.out.println("IN IF");
                            quote.remove(s);
                            quote.put(s, "NA");
                        }
                    }
                    System.out.println("klklklk"+quote.toJSONString());
                    */
                    /*
                    stockdetails.add(quote.get("Change").toString());
                    stockdetails.add(quote.get("LastTradePriceOnly").toString());
                    stockdetails.add(quote.get("PERatio").toString());
                    stockdetails.add(quote.get("DaysLow").toString());
                    stockdetails.add(quote.get("DaysHigh").toString());
                    stockdetails.add(quote.get("Name").toString());
                    stockdetails.add(quote.get("Open").toString());
                    stockdetails.add(quote.get("Volume").toString());
                    
                    stockdetails.add(quote.get("Ask").toString());
                    stockdetails.add(quote.get("AverageDailyVolume").toString());
                    stockdetails.add(quote.get("LastTradeDate").toString());
                    stockdetails.add(quote.get("EBITDA").toString());
                    stockdetails.add(quote.get("DaysRange").toString());
                    stockdetails.add(quote.get("FiftydayMovingAverage").toString());
                    stockdetails.add(quote.get("PreviousClose").toString());
                    stockdetails.add(quote.get("ChangeinPercent").toString());
                    
                    stockdetails.add(quote.get("PEGRatio").toString());
                    stockdetails.add(quote.get("Symbol").toString());
                    stockdetails.add(quote.get("YearRange").toString());
                    stockdetails.add(quote.get("DaysValueChange").toString());
                    stockdetails.add(quote.get("StockExchange").toString());
                    stockdetails.add(quote.get("PercentChange").toString());
                    */
                    q = quote;
                } catch (ParseException ex) {
                    Logger.getLogger(CommodityDetails.class.getName()).log(Level.SEVERE, null, ex);
                } catch(NullPointerException ne){
                        
                        }

            } catch (IOException e) {
                System.out.println(e);
            }
            for(String s: stockdetails){
                System.out.println(s);
            }
            //CommodityDetails obj = new CommodityDetails(stockdetails);
            //CommodityDetails obj = new CommodityDetails(q);
            //System.out.println("dddddD"+obj.getChange());
            //List<CommodityDetails> sdList = new ArrayList<>();
            //sdList.add(obj);
            /*
            for(CommodityDetails s: sdList){
                System.out.println("ddfdfdf"+s.getChange() + s.getDaysHigh());
            }
            */
            //return sdList;
            //return stockdetails;
            return q;
            //
    }
}
