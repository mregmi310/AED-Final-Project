/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import com.stockops.Users.AppUser;

/**
 *
 * @author mridulregmi
 */
public class EquityMarketModerator extends AppUser{
    private EquityMarket assignedMarket;
    
    public EquityMarketModerator(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public EquityMarket getAssignedMarket() {
        return assignedMarket;
    }

    public void setAssignedMarket(EquityMarket assignedMarket) {
        this.assignedMarket = assignedMarket;
    }
    
}
