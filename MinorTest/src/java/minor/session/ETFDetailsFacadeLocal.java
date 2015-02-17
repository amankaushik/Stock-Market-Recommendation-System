/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import java.util.List;
import javax.ejb.Local;
import minor.ejb.ETFDetails;
import org.json.simple.JSONObject;

/**
 *
 * @author chanakya
 */
@Local
public interface ETFDetailsFacadeLocal {

    void create(ETFDetails eTFDetails);

    void edit(ETFDetails eTFDetails);

    void remove(ETFDetails eTFDetails);

    ETFDetails find(Object id);

    List<ETFDetails> findAll();

    List<ETFDetails> findRange(int[] range);

    int count();
    /**
     *
     * @param ticker
     * @return
     */
    JSONObject getETFData(String ticker);
}
