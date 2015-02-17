/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import minor.ejb.CommodityDetails;
import org.json.simple.JSONObject;

/**
 *
 * @author chanakya
 */
@Local
public interface CommodityDetailsFacadeLocal {

    void create(CommodityDetails commodityDetails);

    void edit(CommodityDetails commodityDetails);

    void remove(CommodityDetails commodityDetails);

    CommodityDetails find(Object id);

    List<CommodityDetails> findAll();

    List<CommodityDetails> findRange(int[] range);

    int count();
    
    /**
     *
     * @param ticker
     * @return
     */
    JSONObject getCommodityData(String ticker);
    
}
