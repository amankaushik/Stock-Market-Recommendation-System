/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minor.stockQuote;
import java.util.ArrayList;
/**
 *
 * @author chanakya
 */
public class StockDetails {
    
    private String Change;
    private String LastTradePriceOnly;
    private String PERatio;
    private String DaysLow;
    private String DaysHigh;
    private String Name;
    private String Open;
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

    public String getOpen() {
        return Open;
    }

    public void setOpen(String Open) {
        this.Open = Open;
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
    
    
  
    public StockDetails(ArrayList<String> details){
        Change=(details.get(0));
        LastTradePriceOnly=(details.get(1));
        PERatio=(details.get(2));
        DaysLow=(details.get(3));
        DaysHigh=(details.get(4));
        Name=(details.get(5));
        Open=(details.get(6));
        Volume=(details.get(7));
        Ask=(details.get(8));
        AverageDailyVolume=(details.get(9));
        LastTradeDate=(details.get(10));
        EBITDA=(details.get(11));
        DaysRange=(details.get(12));
        FiftydayMovingAverage=(details.get(13));
        PreviousClose=(details.get(14));
        ChangeinPercent=(details.get(15));
        PEGRatio=(details.get(16));
        Symbol=(details.get(17));
        YearRange=(details.get(18)); 
        DaysValueChange=(details.get(19));
        StockExchange=(details.get(20));
        PercentChange=(details.get(21));
    }
}