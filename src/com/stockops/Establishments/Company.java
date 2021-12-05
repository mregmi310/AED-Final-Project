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
    private double liabilities;
    private CompanyManager companyManager;
    private InvestmentManager investmentManager;
    public Company() {
        super();
    }
    
}
