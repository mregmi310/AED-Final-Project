/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Establishments;

import com.stockops.Investor.InvestorAbstract;

/**
 *
 * @author mridulregmi
 */
public class Company extends InvestorAbstract{
    
    private double captial;
    private double revenue;
    private double assets;
    private double liabilities;
    private String liscenceStatus;
    private String listingRequestStatus;
    private CompanyManager companyManager;
    private InvestmentManager investmentManager;
    public Company() {
        super();
        investmentManager = null;
    }

    public double getCaptial() {
        return captial;
    }

    public void setCaptial(double captial) {
        this.captial = captial;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getAssets() {
        return assets;
    }

    public void setAssets(double assets) {
        this.assets = assets;
    }

    public double getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(double liabilities) {
        this.liabilities = liabilities;
    }

    public CompanyManager getCompanyManager() {
        return companyManager;
    }

    public void setCompanyManager(CompanyManager companyManager) {
        this.companyManager = companyManager;
    }

    public InvestmentManager getInvestmentManager() {
        return investmentManager;
    }

    public void setInvestmentManager(InvestmentManager investmentManager) {
        this.investmentManager = investmentManager;
    }

    public String getLiscenceStatus() {
        return liscenceStatus;
    }

    public void setLiscenceStatus(String liscenceStatus) {
        this.liscenceStatus = liscenceStatus;
    }

    public String getListingRequestStatus() {
        return listingRequestStatus;
    }

    public void setListingRequestStatus(String listingRequestStatus) {
        this.listingRequestStatus = listingRequestStatus;
    }
    
}
