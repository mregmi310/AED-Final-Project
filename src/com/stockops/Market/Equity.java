/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Market;

import com.stockops.Establishments.Company;

/**
 *
 * @author mridulregmi
 */
public class Equity {
    private Company company;
    private String symbol;
    private int price;
    public Equity(){
        
    }
    public Equity(Company company, String symbol, int price){
        this.company=company;
        this.symbol=symbol;
        this.price=price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
