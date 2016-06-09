/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author matse
 */
public class HelloControllerTest {
    
    public HelloControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of handleRequest method, of class HelloController.
     */
    @org.junit.Test
    public void testHandleRequest() throws Exception {
        System.out.println("handleRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        HelloController instance = new HelloController();
        String expResult = "hello";
        ModelAndView result = instance.handleRequest(request, response);
        assertEquals(expResult, result.getViewName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
