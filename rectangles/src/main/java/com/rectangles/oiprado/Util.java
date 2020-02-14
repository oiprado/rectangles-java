/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rectangles.oiprado;

/**
 *
 * @author oiprado
 */
public class Util {

    public static boolean isOverlap(Rectangle a, Rectangle b) {

        if (a.getUl().getX() > b.getLr().getX() || b.getUl().getX() > a.getLr().getX()) {
            return false;
        }

        if (a.getUl().getY() < b.getLr().getY() || b.getUl().getY() < a.getLr().getY()) {
            return false;
        }

        return true;
    }
}
