/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.web;

import com.mm.springstock.service.SimpleProductManager;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author matse
 */
public class InventoryControllerTest {
    
    public InventoryControllerTest() {
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
     * Test of handleRequest method, of class InventoryController.
     * @throws java.lang.Exception
     */
    @Test
    public void testHandleRequest() throws Exception {
        System.out.println("handleRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        InventoryController controller = new InventoryController();
        controller.setpM(new SimpleProductManager());
        String expResult = "hello";
        ModelAndView modelAndView = controller.handleRequest(request, response);
        assertEquals(expResult, modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        HashMap<String, Object> model = (HashMap<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) model.get("now");
        assertNotNull(nowValue);
    }
    
    @Test
    public void testGetPm()
    {
        System.out.println("getPm");
        InventoryController iC = new InventoryController();
        SimpleProductManager sPM = new SimpleProductManager();
        iC.setpM(sPM);
        assertEquals(iC.getpM(), sPM);
    }
    
    @Test
    public void testSetPm()
    {
        System.out.println("setPm");
        InventoryController iC = new InventoryController();
        SimpleProductManager sPM = new SimpleProductManager();
        iC.setpM(sPM);
        assertEquals(iC.getpM(), sPM);
    }
    
}
