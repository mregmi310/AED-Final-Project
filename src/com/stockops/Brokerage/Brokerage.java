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

    public ArrayList<EquityBroker> getEquityBrokersDirectory() {
        return equityBrokersDirectory;
    }

    public void setEquityBrokersDirectory(ArrayList<EquityBroker> equityBrokersDirectory) {
        this.equityBrokersDirectory = equityBrokersDirectory;
    }

    public ArrayList<CommodityBroker> getCommodityBrokersDirectory() {
        return commodityBrokersDirectory;
    }

    public void setCommodityBrokersDirectory(ArrayList<CommodityBroker> commodityBrokersDirectory) {
        this.commodityBrokersDirectory = commodityBrokersDirectory;
    }
    
    public EquityBroker getBrokerByName(String name){
        for(EquityBroker equityBroker: this.equityBrokersDirectory){
            if(equityBroker.getName().equals(name)){
                return equityBroker;
            }
        }
        return null;
    }
}
