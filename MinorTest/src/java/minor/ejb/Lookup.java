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
@Table(name = "lookup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lookup.findAll", query = "SELECT l FROM Lookup l"),
    @NamedQuery(name = "Lookup.findBySymbol", query = "SELECT l FROM Lookup l WHERE l.symbol = :symbol"),
    @NamedQuery(name = "Lookup.findByName", query = "SELECT l FROM Lookup l WHERE l.name = :name"),
    @NamedQuery(name = "Lookup.findByExchange", query = "SELECT l FROM Lookup l WHERE l.exchange = :exchange")})
public class Lookup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "exchange")
    private String exchange;

    public Lookup() {
    }

    public Lookup(String symbol) {
        this.symbol = symbol;
    }

    public Lookup(String symbol, String name, String exchange) {
        this.symbol = symbol;
        this.name = name;
        this.exchange = exchange;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
        hash += (symbol != null ? symbol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lookup)) {
            return false;
        }
        Lookup other = (Lookup) object;
        if ((this.symbol == null && other.symbol != null) || (this.symbol != null && !this.symbol.equals(other.symbol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "minor.ejb.Lookup[ symbol=" + symbol + " ]";
    }
    
}
