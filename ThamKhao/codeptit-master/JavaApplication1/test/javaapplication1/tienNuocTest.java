/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapplication1;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author thedung
 */
public class tienNuocTest {
    
    public tienNuocTest() {
    }

    /**
     * Test of getSoDau method, of class tienNuoc.
     */
    @Test
    public void testGetSoDau() {
    }

    /**
     * Test of setSoDau method, of class tienNuoc.
     */
    @Test
    public void testSetSoDau() {
    }

    /**
     * Test of getSoCuoi method, of class tienNuoc.
     */
    @Test
    public void testGetSoCuoi() {
    }

    /**
     * Test of setSoCuoi method, of class tienNuoc.
     */
    @Test
    public void testSetSoCuoi() {
    }

    /**
     * Test of tinhTien method, of class tienNuoc.
     */
    @Test
    public void testTinhTien() {
        tienNuoc tn = new tienNuoc(5,10);
        Assert.assertEquals(29865, tn.tinhTien());
        
    }
    
    @Test
    public void tc2(){
        tienNuoc tn1 = new tienNuoc(2,29);
        Assert.assertEquals(190933, tn1.tinhTien());
    }
    
}
