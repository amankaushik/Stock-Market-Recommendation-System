/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import minor.ejb.ETFlookup;

/**
 *
 * @author chanakya
 */
@Stateless
public class ETFlookupFacade extends AbstractFacade<ETFlookup> implements ETFlookupFacadeLocal {
    @PersistenceContext(unitName = "MinorTestPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ETFlookupFacade() {
        super(ETFlookup.class);
    }
    
}
