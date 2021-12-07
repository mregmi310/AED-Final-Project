/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class EquityMarket {
    private ArrayList<Equity> equityList;
    private EquityMarketModerator equityMarketModerator;
    private String marketName = "National Stock Exchange";
    public EquityMarket(){
        equityList= new ArrayList<>();
    }

    public EquityMarketModerator getEquityMarketModerator() {
        return equityMarketModerator;
    }

    public void setEquityMarketModerator(EquityMarketModerator equityMarketModerator) {
        this.equityMarketModerator = equityMarketModerator;
    }

    public ArrayList<Equity> getEquityList() {
        return equityList;
    }

    public void setEquityList(ArrayList<Equity> equityList) {
        this.equityList = equityList;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String market) {
        this.marketName = market;
    }
    
    public Equity getEquityByName(String name){
        for(Equity equity: this.equityList){
            if(equity.getCompany().getName().equals(name)){
                return equity;
            }
        }
        return null;
    }
    
}
