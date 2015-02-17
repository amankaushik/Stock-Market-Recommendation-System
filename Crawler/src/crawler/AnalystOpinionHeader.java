/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crawler;

/**
 *
 * @author chanakya
 */
public class AnalystOpinionHeader {
    private String Date, ResearchFirm, Action, From, To;
    public AnalystOpinionHeader(String dt, String rf, String ac, String frm, String t){
        Date = dt;
        ResearchFirm = rf;
        Action = ac;
        From = frm;
        To = t;
    }

    public String getDate() {
        return Date;
    }

    public String getResearchFirm() {
        return ResearchFirm;
    }

    public String getAction() {
        return Action;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }
    
}
