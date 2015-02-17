/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import java.util.List;
import javax.ejb.Local;
import minor.ejb.Lookup;

/**
 *
 * @author chanakya
 */
@Local
public interface LookupFacadeLocal {

    void create(Lookup lookup);

    void edit(Lookup lookup);

    void remove(Lookup lookup);

    Lookup find(Object id);

    List<Lookup> findAll();

    List<Lookup> findRange(int[] range);

    int count();
    
}
