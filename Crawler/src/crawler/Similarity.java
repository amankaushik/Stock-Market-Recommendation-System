/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crawler;
import uk.ac.shef.wit.simmetrics.similaritymetrics.*;

/**
 *
 * @author chanakya
 */
public class Similarity {
    public static void main(String[] args){
        AbstractStringMetric metric = new MongeElkan();
        System.out.println(metric.getSimilarity("/article/2014/03/06/apple-samsung-injunction-idUSL1N0M31NG20140306?type=companyNews", "/article/2014/03/06/apple-samsung-injunction-idUSL2N0LD03T20140306?type=companyNews"));
    }
    
}
