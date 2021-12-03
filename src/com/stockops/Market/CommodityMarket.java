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
public class CommodityMarket {
   private ArrayList<Commodity> commodityList;
   private CommodityMarketModerator commodityMarketModerator;
   public CommodityMarket(){
       commodityList = new ArrayList<>();
   }

    public CommodityMarketModerator getCommodityMarketModerator() {
        return commodityMarketModerator;
    }

    public void setCommodityMarketModerator(CommodityMarketModerator commodityMarketModerator) {
        this.commodityMarketModerator = commodityMarketModerator;
    }
   
   
}
