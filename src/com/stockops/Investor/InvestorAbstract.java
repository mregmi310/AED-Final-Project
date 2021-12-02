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
import com.stockops.Users.AppUser;
import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public abstract class InvestorAbstract extends AppUser{
    private float balance;
    private ArrayList<EquityBuyRequest> equityBuyRequests;
    private ArrayList<CommodityBuyRequest> commodityBuyRequests;
    private ArrayList<EquitySellRequest> equitySellRequests;
    private ArrayList<CommoditySellRequest> commoditySellRequests;
    public InvestorAbstract(String name){
        this.name=name;
        equityBuyRequests=new ArrayList<>();
        commodityBuyRequests=new ArrayList<>();
        commoditySellRequests=new ArrayList<>();
        equitySellRequests=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    
    
}