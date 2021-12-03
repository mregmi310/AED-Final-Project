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
    public EquityMarket(){
        equityList= new ArrayList<>();
    }

    public EquityMarketModerator getEquityMarketModerator() {
        return equityMarketModerator;
    }

    public void setEquityMarketModerator(EquityMarketModerator equityMarketModerator) {
        this.equityMarketModerator = equityMarketModerator;
    }
    
}
