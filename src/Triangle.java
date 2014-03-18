/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashery
 */


//This is the the subclass that extends to the parent class Shape


import javax.swing.*;

public class Triangle extends Shape{
    String name = "Triangle";
    double base = 0.0;
    double height = 0.0;
    double area = 0.0;
    public Triangle() {
        super();
    }
   
    public void setBase(double value) {
        base = value;
    }
    public void setHeight(double value){
        height = value;
    }
    public double getBase() {
        return base;
    }
    public double getHeight(){
        return height;
    }
   
    public void computeArea() {
        area = 0.5 * (base * height);       
    }
   
    public double getArea() {
        return area;
    }
   
    public void display() {
        JOptionPane.showMessageDialog(null,"The shape is: " + name
                                         + "\nThe total area of the triangle at the base of " +  base
                                         + "\nand the height of " + height     
                                         + "\nis: " + area + "\n"  );
       
    }
}