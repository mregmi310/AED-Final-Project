/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import com.stockops.Users.AppUser;
import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class EquityBroker extends AppUser{
    private float rating;
    private ArrayList<EquityBuyRequest> buyRequests;
    private ArrayList<EquitySellRequest> sellRequests;
    public EquityBroker(){
        buyRequests= new ArrayList<>();
        sellRequests= new ArrayList<>();
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
    
}
