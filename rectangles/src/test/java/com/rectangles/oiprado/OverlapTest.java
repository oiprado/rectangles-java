/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rectangles.oiprado;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oiprado
 */
public class OverlapTest {

    public OverlapTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void case1() {

        Rectangle a = new Rectangle(new Point(2, 7), new Point(5, 3));
        Rectangle b = new Rectangle(new Point(4, 8), new Point(8, 2));

        assertTrue(Util.isOverlap(a, b));

    }

    @Test
    public void case2() {
        Rectangle a = new Rectangle(new Point(3, 5), new Point(5, 2));
        Rectangle b = new Rectangle(new Point(1, 6), new Point(4, 1));

        assertTrue(Util.isOverlap(a, b));
    }

    @Test
    public void case3() {
        Rectangle a = new Rectangle(new Point(2, 8), new Point(5, 4));
        Rectangle b = new Rectangle(new Point(2, 5), new Point(6, 1));
        assertTrue(Util.isOverlap(a, b));
    }

    @Test
    public void case4() {
        Rectangle a = new Rectangle(new Point(2, 8), new Point(5, 4));
        Rectangle b = new Rectangle(new Point(2, 5), new Point(6, 1));   
        
        assertTrue(Util.isOverlap(a, b));
    }

    @Test
    public void case5() {
        
        Rectangle a = new Rectangle(new Point(2, 5), new Point(5, 1));
        Rectangle b = new Rectangle(new Point(6, 5), new Point(9, 1));      
        
        assertFalse(Util.isOverlap(a, b));
        
    }

    @Test
    public void case6() {
        Rectangle a = new Rectangle(new Point(5, 5), new Point(7, 1));
        Rectangle b = new Rectangle(new Point(1, 5), new Point(4, 1));
        
        assertFalse(Util.isOverlap(a, b));
    }

    @Test
    public void case7() {
        Rectangle a = new Rectangle(new Point(1, 7), new Point(5, 5));
        Rectangle b = new Rectangle(new Point(1, 3), new Point(5, 1));
        
        assertFalse(Util.isOverlap(a, b));
    }
    
    @Test
    public void case8() {
        Rectangle a = new Rectangle(new Point(1, 3), new Point(5, 1));
        Rectangle b = new Rectangle(new Point(1, 4), new Point(5, 4));
        assertFalse(Util.isOverlap(a, b));
    }
}
