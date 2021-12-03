/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockops.Establishments;

import com.stockops.Users.AppUser;

/**
 *
 * @author mridulregmi
 */
public class EstablishmentsModerator extends AppUser{
    private Establishment establishment;
    public EstablishmentsModerator(){
        
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
    
}
