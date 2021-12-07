/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Establishments;

import com.stockops.Users.AppUser;
import java.util.ArrayList;

/**
 *
 * @author mridulregmi
 */
public class EstablishmentsModerator extends AppUser{
    private Establishment establishment;
    private ArrayList<Company> companyList;
    private ArrayList<CompanyManager> companyManagerDirectory;
    private ArrayList<InvestmentManager> investmentManagerDirectory;
    public EstablishmentsModerator(){
        super();
        companyList = new ArrayList<>();
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }
    
    public Company getCompanyByName(String name){
        for(Company company: this.companyList){
            if(company.getName().equals(name)){
                return company;
            }
        }
        return null;
    }

    public ArrayList<CompanyManager> getCompanyManagerDirectory() {
        return companyManagerDirectory;
    }

    public void setCompanyManagerDirectory(ArrayList<CompanyManager> companyManagerDirectory) {
        this.companyManagerDirectory = companyManagerDirectory;
    }

    public ArrayList<InvestmentManager> getInvestmentManagerDirectory() {
        return investmentManagerDirectory;
    }

    public void setInvestmentManagerDirectory(ArrayList<InvestmentManager> investmentManagerDirectory) {
        this.investmentManagerDirectory = investmentManagerDirectory;
    }
    
    
}
