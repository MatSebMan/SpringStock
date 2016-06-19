/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.domain;

import java.io.Serializable;

/**
 *
 * @author matse
 */
public class Product implements Serializable
{
    private String description;
    private Double price;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String toString()
    {
        return "Description: " + this.description + "; Price: " + this.price;
    }
}
