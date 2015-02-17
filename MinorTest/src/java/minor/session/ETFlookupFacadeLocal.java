/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import java.util.List;
import javax.ejb.Local;
import minor.ejb.ETFlookup;

/**
 *
 * @author chanakya
 */
@Local
public interface ETFlookupFacadeLocal {

    void create(ETFlookup eTFlookup);

    void edit(ETFlookup eTFlookup);

    void remove(ETFlookup eTFlookup);

    ETFlookup find(Object id);

    List<ETFlookup> findAll();

    List<ETFlookup> findRange(int[] range);

    int count();
    
}
