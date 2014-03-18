/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashery
 */

import javax.swing.*;
import java.awt.*;

public class ShapeCanvas extends JPanel{
          
    Shape shape = new Shape();
    Rectangle rect = new Rectangle();
    Square sq = new Square();
    String name;
    static Color fillColor;
    static Color lineColor;
    static int xLoc, yLoc;
    static int height, width;
    static int rectArea;
    static int size;
    static int sqArea;

    public ShapeCanvas() {


        this.setBounds(200, 0, 690, 620);
        this.setBackground(new Color(151, 199, 112));
        this.setBorder(BorderFactory.createLoweredBevelBorder());
        sq.setDefault();

    }

    private void getShapeAttr() {

        name = shape.getName();
        fillColor = shape.getFillColor();
        lineColor = shape.getLineColor();
        xLoc = shape.getX();
        yLoc = shape.getY();
        height = rect.getH();
        width = rect.getW();
        size = sq.getS();
 
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        getShapeAttr();
        if (name.equals("Rectangle")) {

            g.drawString("You have selected " + name + "!", 21, 21);
            g.setColor(fillColor);
            g.fillRect(xLoc, yLoc, width, height);
            g.setColor(lineColor);
            g.drawRect(xLoc, yLoc, width, height);
            repaint();

        } else if (name.equals("Square")) {

            g.drawString("You have selected " + name + "!", 21, 21);
            g.setColor(fillColor);
            g.fillRect(xLoc, yLoc, size, size);
            g.setColor(lineColor);
            g.drawRect(xLoc, yLoc, size, size);
            repaint();



        } else {

            g.drawString("No Shape Selected!", 21, 21);
            repaint();

        }

    }
}
