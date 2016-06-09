/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.service;

import com.mm.springstock.domain.Product;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author matse
 */
public interface ProductManager extends Serializable
{
    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
    public void setProducts(List<Product> products);
}