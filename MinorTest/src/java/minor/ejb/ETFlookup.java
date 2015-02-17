/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chanakya
 */
@Entity
@Table(name = "ETFlookup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ETFlookup.findAll", query = "SELECT e FROM ETFlookup e"),
    @NamedQuery(name = "ETFlookup.findByTicker", query = "SELECT e FROM ETFlookup e WHERE e.ticker = :ticker"),
    @NamedQuery(name = "ETFlookup.findByName", query = "SELECT e FROM ETFlookup e WHERE e.name = :name"),
    @NamedQuery(name = "ETFlookup.findByExchange", query = "SELECT e FROM ETFlookup e WHERE e.exchange = :exchange")})
public class ETFlookup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ticker")
    private String ticker;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "exchange")
    private String exchange;

    public ETFlookup() {
    }

    public ETFlookup(String ticker) {
        this.ticker = ticker;
    }

    public ETFlookup(String ticker, String name, String exchange) {
        this.ticker = ticker;
        this.name = name;
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticker != null ? ticker.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ETFlookup)) {
            return false;
        }
        ETFlookup other = (ETFlookup) object;
        if ((this.ticker == null && other.ticker != null) || (this.ticker != null && !this.ticker.equals(other.ticker))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "minor.ejb.ETFlookup[ ticker=" + ticker + " ]";
    }
    
}
