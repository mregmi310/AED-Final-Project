/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Business;

import com.stockops.Brokerage.Brokerage;
import com.stockops.Brokerage.BrokerageModerator;
import com.stockops.Establishments.Establishment;
import com.stockops.Establishments.EstablishmentsModerator;
import com.stockops.Investor.Investor;
import com.stockops.Market.CommodityMarket;
import com.stockops.Market.CommodityMarketModerator;
import com.stockops.Market.EquityMarket;
import com.stockops.Market.EquityMarketModerator;
import com.stockops.Market.Market;


/**
 *
 * @author mridulregmi
 */
public class ConfigureASystem {

    public static EcoSystem configure(){
        
        EcoSystem system = new EcoSystem();
        
        //Configure the market enterprise
        Market market = new Market();
        
        EquityMarket equityMarket = new EquityMarket();
        CommodityMarket commodityMarket = new CommodityMarket();
        
        CommodityMarketModerator commodityMarketModerator = new CommodityMarketModerator();
        EquityMarketModerator equityMarketModerator = new EquityMarketModerator();
        
        equityMarketModerator.setAssignedMarket(equityMarket);
        commodityMarketModerator.setMarketAssigned(commodityMarket);
        
        equityMarket.setEquityMarketModerator(equityMarketModerator);
        commodityMarket.setCommodityMarketModerator(commodityMarketModerator);
        
        market.setEquityMarket(equityMarket);
        market.setCommodityMarket(commodityMarket);
        
        system.setMarket(market);
        
        
        //Configure the brokerage enterprise
        Brokerage brokerage = new Brokerage();
        
        BrokerageModerator brokerageModerator = new BrokerageModerator();
        
        brokerage.setBrokerageModerator(brokerageModerator);
        brokerageModerator.setBrokerage(brokerage);
        
        system.setBrokerage(brokerage);
        
        //Configure investor enterprise
        Investor investor = new Investor();
        system.setInvestor(investor);
        
        //Configure Establishments
        Establishment establishment = new Establishment();
        
        EstablishmentsModerator establishmentsModerator = new EstablishmentsModerator();
        
        establishment.setEstablishmentsModerator(establishmentsModerator);
        establishmentsModerator.setEstablishment(establishment);
        
        system.setEstablishment(establishment);
   
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }
    
}

