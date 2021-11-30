/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Business;

import com.stockops.Market.CommodityMarket;
import com.stockops.Market.EquityMarket;
import com.stockops.Market.Market;


/**
 *
 * @author mridulregmi
 */
public class ConfigureASystem {

    public static EcoSystem configure(){
        
        EcoSystem system = new EcoSystem();
        
        Market market = new Market();
        
        EquityMarket equityMarket = new EquityMarket();
        CommodityMarket commodityMarket = new CommodityMarket();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
//        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
//        
//        system.setCustomerDirectory(new CustomerDirectory());
//        system.setDeliveryManDirectory(new DeliveryManDirectory());
//        system.setRestaurantDirectory(new RestaurantDirectory());
//        system.setManagerDirectory(new ManagerDirectory());
//        
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
//        
        return system;
    }
    
}
