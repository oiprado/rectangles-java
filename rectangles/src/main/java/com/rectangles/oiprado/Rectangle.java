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
public class Rectangle {

    private Point ul;

    private Point lr;

    public Rectangle() {
    }

    public Rectangle(Point ul, Point lr) {
        this.ul = ul;
        this.lr = lr;
    }

    public Point getUl() {
        return ul;
    }

    public void setUl(Point ul) {
        this.ul = ul;
    }

    public Point getLr() {
        return lr;
    }

    public void setLr(Point lr) {
        this.lr = lr;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "ul=" + ul + ", lr=" + lr + '}';
    }
    
}
