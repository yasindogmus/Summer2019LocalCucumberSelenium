package com.vytrack.step_definations;

import com.vytrack.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from before scenario");

    }
    @After
    public void tearDown(){
        System.out.println("This is coming from after scenario\n");
     //   Driver.closeDriver();
    }

    @After
    public void tearDownSalesManager(){
        System.out.println("This is coming from after scenario for sales manager\n");
    }
}
