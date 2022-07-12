package com.hr.corp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporationTest {


    private Corporation myCompany;

    @Before
    public void setUp() throws Exception {
        myCompany = new Corporation("MyCompany", 100000);
    }

    @Test
    public void computeMonthlyTaxToPay() {
        double monthlyTaxToPay = myCompany.computeMonthlyTaxToPay();
        Assert.assertEquals(10000, monthlyTaxToPay, .001);
    }
}