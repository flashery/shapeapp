/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashery
 */

//This is the Parent class

import java.awt.*;

public class Shape{
    
   static String name;
   static Color fillColor;
   static Color lineColor;
   static int xLoc, yLoc;
   
    public void setName(String value){
        name = value;
    }
    public String getName(){
        return name;
    }
    public void setFillColor(Color value) {
        fillColor = value;
    }
   
    public Color getFillColor() {
        return fillColor;
    }
   
    public void setLineColor(Color value) {
        lineColor = value;
    }
   
    public Color getLineColor() {
        return lineColor;
    }
   
    public void setX(int value) {
        xLoc = value;
    }
   
    public int getX() {
        return xLoc;
    }
   
    public void setY(int value) {
        yLoc = value;
    }
   
    public int getY() {
        return yLoc;
    }

}