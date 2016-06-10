/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.service;

import com.mm.springstock.domain.Product;
import java.util.ArrayList;
import java.util.List;
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
public class SimpleProductManagerTest {
    
    private SimpleProductManager sPM;
    private static final Integer PRODUCT_COUNT = 2;
    private static final Double CHAIR_PRICE = 20.50;
    private static final Double TABLE_PRICE = 150.10;
    private static final String CHAIR_DESCRIPTION = "Chair";
    private static final String TABLE_DESCRIPTION = "Table";
    private static final Integer INCREASE_PRICE_PERCENTAGE = 15;
    private List<Product> products;
    
    public SimpleProductManagerTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        this.sPM = new SimpleProductManager();
        Product chair = new Product();
        chair.setDescription(CHAIR_DESCRIPTION);
        chair.setPrice(CHAIR_PRICE);
        Product table = new Product();
        table.setDescription(TABLE_DESCRIPTION);
        table.setPrice(TABLE_PRICE);
        this.products = new ArrayList<>();
        this.products.add(chair);
        this.products.add(table);
        this.sPM.setProducts(products);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetProductsWithNoProducts()
    {
        this.sPM = new SimpleProductManager();
        assertNull(this.sPM.getProducts());
    }
    
    @Test
    public void testGetProducts()
    {
        try
        {
            assertNotNull(this.sPM.getProducts());
            assertEquals(this.sPM.getProducts().size(), PRODUCT_COUNT.intValue());
            Product chair = this.sPM.getProducts().get(0); // Chair
            assertEquals(chair.getDescription(), CHAIR_DESCRIPTION);
            assertEquals(chair.getPrice(), CHAIR_PRICE);
            Product table = this.sPM.getProducts().get(1); // Table
            assertEquals(table.getDescription(), TABLE_DESCRIPTION);
            assertEquals(table.getPrice(), TABLE_PRICE);
        } catch(Exception e)
        {
            fail(this.getClass().getName() + " " + e.getMessage());
        }
    }
    
    @Test
    public void testIncreasePriceWithNullProducts()
    {
        try
        {
            this.sPM = new SimpleProductManager();
            this.sPM.increasePrice(INCREASE_PRICE_PERCENTAGE);
        } catch(NullPointerException nPE)
        {
            fail(this.getClass().getName() + " Product List is null");
        }
    }
    
    @Test
    public void testIncreasePriceWithEmptyList()
    {
        try
        {
            this.sPM.getProducts().clear();
            this.sPM.increasePrice(INCREASE_PRICE_PERCENTAGE);
        } catch(Exception e)
        {
            fail(this.getClass().getName() + " Product List is empty");
        }
    }
    
    @Test
    public void testIncreasePrice()
    {
        Double expectedChairPrice = CHAIR_PRICE*(100 + INCREASE_PRICE_PERCENTAGE)/100;
        Double expectedTablePrice = TABLE_PRICE*(100 + INCREASE_PRICE_PERCENTAGE)/100;
        this.sPM.increasePrice(INCREASE_PRICE_PERCENTAGE);
        Product chair = this.sPM.getProducts().get(0);
        assertEquals(chair.getPrice(), expectedChairPrice);
        Product table = this.sPM.getProducts().get(1);
        assertEquals(table.getPrice(), expectedTablePrice);
    }
}