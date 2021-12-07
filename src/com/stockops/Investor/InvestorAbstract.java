/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Investor;

import com.stockops.Brokerage.CommodityBuyRequest;
import com.stockops.Brokerage.CommoditySellRequest;
import com.stockops.Brokerage.EquityBuyRequest;
import com.stockops.Brokerage.EquitySellRequest;
import com.stockops.Market.Equity;
import com.stockops.Users.AppUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mridulregmi
 */
public abstract class InvestorAbstract extends AppUser{
    private double balance;
    private ArrayList<EquityBuyRequest> equityBuyRequests;
    private ArrayList<CommodityBuyRequest> commodityBuyRequests;
    private ArrayList<EquitySellRequest> equitySellRequests;
    private ArrayList<CommoditySellRequest> commoditySellRequests;
    private Map<Equity,Integer> holdings;
    
    public InvestorAbstract(){
        equityBuyRequests=new ArrayList<>();
        commodityBuyRequests=new ArrayList<>();
        commoditySellRequests=new ArrayList<>();
        equitySellRequests=new ArrayList<>();
        holdings= new HashMap<>();
        balance=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    
    
}
