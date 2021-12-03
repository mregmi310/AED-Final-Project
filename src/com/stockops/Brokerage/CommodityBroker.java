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
public class CommodityBroker extends AppUser{
    private float rating;
    private ArrayList<CommodityBuyRequest> buyRequests;
    private ArrayList<CommoditySellRequest> sellRequests;
    public CommodityBroker(){
        this.buyRequests=new ArrayList<>();
        this.sellRequests=new ArrayList<>();
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
