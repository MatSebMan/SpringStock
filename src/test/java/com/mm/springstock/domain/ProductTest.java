/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matse
 */
public class ProductTest {
    
    private static final String CHAIR_DESCRIPTION = "Chair";
    private static final Double CHAIR_PRICE = 20.50;
    private Product product;
    
    public ProductTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        this.product = new Product();
        this.product.setDescription(CHAIR_DESCRIPTION);
        this.product.setPrice(CHAIR_PRICE);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Product instance = new Product();
        String expResult = CHAIR_DESCRIPTION;
        instance.setDescription(expResult);
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Product.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = CHAIR_DESCRIPTION;
        Product instance = new Product();
        instance.setDescription(description);
        assertEquals(instance.getDescription(), description);
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        Double expResult = CHAIR_PRICE;
        instance.setPrice(expResult);
        Double result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Double price = CHAIR_PRICE;
        Product instance = new Product();
        instance.setPrice(price);
        assertEquals(instance.getPrice(), price);
    }
    
    @Test
    public void testToString()
    {
        assertEquals(product.toString(), "Description: " + CHAIR_DESCRIPTION + "; Price: " + CHAIR_PRICE);
    }
}
