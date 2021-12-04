/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import com.stockops.Investor.Investor;
import com.stockops.Market.Commodity;

/**
 *
 * @author mridulregmi
 */
public class CommoditySellRequest {
    private Investor seller;
    private Investor buyer;
    private Commodity commodity;
    private int quantity;
    public CommoditySellRequest(){
        
    }

    public CommoditySellRequest(Investor seller, Investor buyer, Commodity commodity, int quantity) {
        this.seller = seller;
        this.buyer = buyer;
        this.commodity = commodity;
        this.quantity = quantity;
    }

    public Investor getSeller() {
        return seller;
    }

    public void setSeller(Investor seller) {
        this.seller = seller;
    }

    public Investor getBuyer() {
        return buyer;
    }

    public void setBuyer(Investor buyer) {
        this.buyer = buyer;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
