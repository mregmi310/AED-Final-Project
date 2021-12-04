/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class Brokerage {
    private ArrayList<EquityBroker> equityBrokersDirectory;
    private ArrayList<CommodityBroker> commodityBrokersDirectory;
    private BrokerageModerator brokerageModerator;
    
    public Brokerage(){
        equityBrokersDirectory=new ArrayList<>();
        commodityBrokersDirectory=new ArrayList<>();
    }

    public BrokerageModerator getBrokerageModerator() {
        return brokerageModerator;
    }

    public void setBrokerageModerator(BrokerageModerator brokerageModerator) {
        this.brokerageModerator = brokerageModerator;
    }
    
}
