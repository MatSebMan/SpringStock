/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mm.springstock.web;

import com.mm.springstock.service.ProductManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author matse
 */
public class InventoryController implements Controller 
{
    
    private ProductManager pM;

    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String now = Calendar.getInstance().getTime().toString();
        HashMap<String, Object> model = new HashMap<>();
        model.put("now", now);
        model.put("products", this.pM.getProducts());
        logger.info("Returning hello view with " + now);
        return new ModelAndView("hello", "model", model);
    }

    /**
     * @return the pM
     */
    public ProductManager getpM() {
        return this.pM;
    }

    /**
     * @param pM the pM to set
     */
    public void setpM(ProductManager pM) {
        this.pM = pM;
    }
}
