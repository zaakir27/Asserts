/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdd;

import config.AppConfig;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import service.TestDrivenTests;
import org.testng.annotations.Test;
import service.TestDrivenTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author Zaakir
 */
public class TDDTests {
    public static TestDrivenTests Service;
    public TDDTests() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /**
     *
     */
    
    @Test
    public void add(){
        Assert.assertEquals(Service.add(2, 5), 7);
        
       
    }
    
    @Test
    public void rString(){
        Assert.assertEquals(Service.rString(), "hello");
    }
    
    @Test
    public void bool(){
        Assert.assertEquals(Service.rbooll(), false);
    }

    @Test
    public void asserttrue(){
        Assert.assertTrue(Service.asserttrue(), "incorrect");
    }
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Service = (TestDrivenTests)ctx.getBean("tt");
       
       
        
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
