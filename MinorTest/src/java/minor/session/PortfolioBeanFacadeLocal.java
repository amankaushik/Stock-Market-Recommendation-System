/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.session;

import java.util.List;
import javax.ejb.Local;
import minor.ejb.PortfolioBean;

/**
 *
 * @author chanakya
 */
@Local
public interface PortfolioBeanFacadeLocal {

    void create(PortfolioBean portfolioBean);

    void edit(PortfolioBean portfolioBean);

    void remove(PortfolioBean portfolioBean);

    PortfolioBean find(Object id);

    List<PortfolioBean> findAll();

    List<PortfolioBean> findRange(int[] range);

    int count();
    
}
