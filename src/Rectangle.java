/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashery
 */
import java.awt.*;

public class Rectangle extends Shape {

    static int lenght, width;
    static int area;
    
    public Rectangle() {
        super();
    }

    public void setH(int value) {
        lenght = value;
    }

    public void setW(int value) {
        width = value;
    }

    public int getH() {
        return lenght;
    }

    public int getW() {
        return width;
    }

    public void computeArea() {
        area = lenght * width;
    }

    public int getArea() {
        return area;
    }
    
    public void setDefault() {

        this.setFillColor(Color.blue);
        this.setLineColor(Color.blue);
        this.setName("Rectangle");
        this.setH(100);
        this.setW(200);
        this.setX(50);
        this.setY(50);

    }

}