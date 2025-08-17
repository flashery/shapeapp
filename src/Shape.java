/**
 * Base Shape class - Parent class for all shapes
 * @author flashery
 */

//This is the Parent class

import java.awt.*;

public class Shape {
    
    protected String name;
    protected Color fillColor;
    protected Color lineColor;
    protected int xLoc, yLoc;
   
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