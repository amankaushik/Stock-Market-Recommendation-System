/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crawler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import twitter4j.conf.ConfigurationBuilder;
import java.util.ArrayList;
import java.util.Map;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TwitterFeed {

    /**
     * Usage: java twitter4j.examples.search.SearchTweets [query]
     *     
* @param args
     */
    private static ArrayList<String> tickers;

    public void setTickers(ArrayList<String> tickers) {
        TwitterFeed.tickers = tickers;
    }

    //private static ArrayList<String> names;
    /**
     *
     */
    public void get_tweets() throws SQLException {
        CSVReader cr = new CSVReader();
        ArrayList<String> names = new ArrayList<>();
        Map<String, String> name_ticker;
        names = cr.get_company_names(tickers);
        System.out.println(names);
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setOAuthConsumerKey("WNSycI2GS33ZAwHJ9Fb4A");
        cb.setOAuthConsumerSecret("BBWeSThT3ZV2g9c5BDuUduDyNAWyzouMI0XjQy7KUc");
        cb.setOAuthAccessToken("1852271029-SLfE061bImfcRxWQZpy1pAgpEkfFhg3757Q9JRf");
        cb.setOAuthAccessTokenSecret("1uPSfYPbaENtXFYWsryBIAHnUsmG3pT6lGH0NzxTCGW7O");
        Twitter twitter = new TwitterFactory(cb.build()).getInstance();
        for (String s : names) {
            String[] temp;
            if (s.contains(",")) {
                temp = s.split(",");
            } else {
                temp = s.split(" ");
            }

            System.out.println("--------------------------------------------------------------------------------------" + temp[0]);
            Query query = new Query("#" + temp[0]);
            query.lang("en");
            int numberOfTweets = 500;
            long lastID = Long.MAX_VALUE;
            ArrayList<Status> tweets = new ArrayList<>();
            while (tweets.size() < numberOfTweets) {
                if (numberOfTweets - tweets.size() > 100) {
                    query.setCount(100);
                } else {
                    query.setCount(numberOfTweets - tweets.size());
                }
                try {
                    QueryResult result = twitter.search(query);
                    tweets.addAll(result.getTweets());
                    System.out.println("Gathered " + tweets.size() + " tweets");
                    for (Status t : tweets) {
                        if (t.getId() < lastID) {
                            lastID = t.getId();
                        }
                    }

                } catch (TwitterException te) {
                    System.out.println("Couldn't connect: " + te);
                }
                query.setMaxId(lastID - 1);
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CrawledData", "root", "");
            for (int i = 0; i < tweets.size(); i++) {
                Status t = (Status) tweets.get(i);

                    //GeoLocation loc = t.getGeoLocation();
                String user = t.getUser().getScreenName();
                String msg = t.getText();
                String time = t.getCreatedAt().toString();
                    //if (loc!=null) {
                //    Double lat = t.getGeoLocation().getLatitude();
                //    Double lon = t.getGeoLocation().getLongitude();
                //    System.out.println(i + " USER: " + user + " wrote: " + msg + " located at " + lat + ", " + lon);
                //} 
                //else{ 
                System.out.println(i + " USER: " + user + " wrote: " + msg + " at: " + time);
                //}
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    PreparedStatement ps = con.prepareStatement("INSERT IGNORE INTO TwitterFeed VALUES (?,?,?,?,?)");
                    ps.setString(1, s);
                    ps.setString(2, cr.get_ticker_from_company(s));
                    ps.setString(3, user);
                    ps.setString(4, msg);
                    ps.setString(5, time);

                    int k = ps.executeUpdate();
                    if (k <= 0) {
                        System.out.println("Entry Unsuccessful");
                    } else {
                        System.out.println("Entry Successful");
                    }
                    
                } catch (ClassNotFoundException | SQLException e) {
                    System.out.println(e);
                }
         
            }
            con.close();
        }
    }
}
