/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.ejb;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.json.simple.JSONObject;

/**
 *
 * @author chanakya
 */
@Entity
public class ETFDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    private String Change;
    private String LastTradePriceOnly;
    private String PERatio;
    private String DaysLow;
    private String DaysHigh;
    private String Name;
    private String Oopen;
    private String Volume;
    private String Ask;
    private String AverageDailyVolume;
    private String LastTradeDate;
    private String EBITDA;
    private String DaysRange;
    private String FiftydayMovingAverage;
    private String PreviousClose;
    private String ChangeinPercent;
    private String PEGRatio;
    private String Symbol;
    private String YearRange; 
    private String DaysValueChange;
    private String StockExchange;
    private String PercentChange;

    public String getChange() {
        return Change;
    }

    public void setChange(String Change) {
        this.Change = Change;
    }

    public String getLastTradePriceOnly() {
        return LastTradePriceOnly;
    }

    public void setLastTradePriceOnly(String LastTradePriceOnly) {
        this.LastTradePriceOnly = LastTradePriceOnly;
    }

    public String getPERatio() {
        return PERatio;
    }

    public void setPERatio(String PERatio) {
        this.PERatio = PERatio;
    }

    public String getDaysLow() {
        return DaysLow;
    }

    public void setDaysLow(String DaysLow) {
        this.DaysLow = DaysLow;
    }

    public String getDaysHigh() {
        return DaysHigh;
    }

    public void setDaysHigh(String DaysHigh) {
        this.DaysHigh = DaysHigh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOopen() {
        return Oopen;
    }

    public void setOopen(String Oopen) {
        this.Oopen = Oopen;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    public String getAsk() {
        return Ask;
    }

    public void setAsk(String Ask) {
        this.Ask = Ask;
    }

    public String getAverageDailyVolume() {
        return AverageDailyVolume;
    }

    public void setAverageDailyVolume(String AverageDailyVolume) {
        this.AverageDailyVolume = AverageDailyVolume;
    }

    public String getLastTradeDate() {
        return LastTradeDate;
    }

    public void setLastTradeDate(String LastTradeDate) {
        this.LastTradeDate = LastTradeDate;
    }

    public String getEBITDA() {
        return EBITDA;
    }

    public void setEBITDA(String EBITDA) {
        this.EBITDA = EBITDA;
    }

    public String getDaysRange() {
        return DaysRange;
    }

    public void setDaysRange(String DaysRange) {
        this.DaysRange = DaysRange;
    }

    public String getFiftydayMovingAverage() {
        return FiftydayMovingAverage;
    }

    public void setFiftydayMovingAverage(String FiftydayMovingAverage) {
        this.FiftydayMovingAverage = FiftydayMovingAverage;
    }

    public String getPreviousClose() {
        return PreviousClose;
    }

    public void setPreviousClose(String PreviousClose) {
        this.PreviousClose = PreviousClose;
    }

    public String getChangeinPercent() {
        return ChangeinPercent;
    }

    public void setChangeinPercent(String ChangeinPercent) {
        this.ChangeinPercent = ChangeinPercent;
    }

    public String getPEGRatio() {
        return PEGRatio;
    }

    public void setPEGRatio(String PEGRatio) {
        this.PEGRatio = PEGRatio;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getYearRange() {
        return YearRange;
    }

    public void setYearRange(String YearRange) {
        this.YearRange = YearRange;
    }

    public String getDaysValueChange() {
        return DaysValueChange;
    }

    public void setDaysValueChange(String DaysValueChange) {
        this.DaysValueChange = DaysValueChange;
    }

    public String getStockExchange() {
        return StockExchange;
    }

    public void setStockExchange(String StockExchange) {
        this.StockExchange = StockExchange;
    }

    public String getPercentChange() {
        return PercentChange;
    }

    public void setPercentChange(String PercentChange) {
        this.PercentChange = PercentChange;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ETFDetails)) {
            return false;
        }
        ETFDetails other = (ETFDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "minor.ejb.ETFDetails[ id=" + id + " ]";
    }
    public ETFDetails(){
        
    }
    public ETFDetails(JSONObject details){
        Change=details.get("Change").toString();
        LastTradePriceOnly=details.get("LastTradePriceOnly").toString();
        PERatio=details.get("PERatio").toString();
        DaysLow=details.get("DaysLow").toString();
        DaysHigh=details.get("DaysHigh").toString();
        Name=details.get("Name").toString();
        Oopen=details.get("Open").toString();
        Volume=details.get("Volume").toString();
        Ask=details.get("Ask").toString();
        AverageDailyVolume=details.get("AverageDailyVolume").toString();
        LastTradeDate=details.get("LastTradeDate").toString();
        EBITDA=details.get("EBITDA").toString();
        DaysRange=details.get("DaysRange").toString();
        FiftydayMovingAverage=details.get("FiftydayMovingAverage").toString();
        PreviousClose=details.get("PreviousClose").toString();
        ChangeinPercent=details.get("ChangeinPercent").toString();
        PEGRatio=details.get("PEGRatio").toString();
        Symbol=details.get("Symbol").toString();
        YearRange=details.get("YearRange").toString(); 
        DaysValueChange=details.get("DaysValueChange").toString();
        StockExchange=details.get("StockExchange").toString();
        PercentChange=details.get("PercentChange").toString();
                
    }
}
