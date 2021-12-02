/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Brokerage;

import com.stockops.Investor.Investor;
import com.stockops.Market.Equity;

/**
 *
 * @author mridulregmi
 */
public class EquityBuyRequest {
    private Investor seller;
    private Investor buyer;
    private Equity equity;
    private int quantity;

    public EquityBuyRequest() {
    }

    public EquityBuyRequest(Investor seller, Investor buyer, Equity equity, int quantity) {
        this.seller = seller;
        this.buyer = buyer;
        this.equity = equity;
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

    public Equity getEquity() {
        return equity;
    }

    public void setEquity(Equity equity) {
        this.equity = equity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
