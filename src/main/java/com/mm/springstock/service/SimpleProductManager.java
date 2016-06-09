/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.service;

import com.mm.springstock.domain.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matse
 */
public class SimpleProductManager implements ProductManager
{

    private List<Product> products;
    
    public SimpleProductManager(){}
    
    @Override
    public void increasePrice(int percentage) {
        for (Product product : this.products)
        {
            product.setPrice(product.getPrice()*percentage/100);
        }
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    @Override
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
}
