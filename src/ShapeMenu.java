/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashery
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ShapeMenu extends JPanel implements ActionListener, ChangeListener, MouseMotionListener, MouseListener {

    //instantiate class
    ColorChoserFrame ccf = new ColorChoserFrame();
    Shape shape = new Shape();
    Rectangle rect = new Rectangle();
    Square sq = new Square();
    ShapeCanvas shapecanvas = new ShapeCanvas();
    final int CURRENT_X = shape.getX();
    final int CURRENT_Y = shape.getY();
    final int CURRENT_S = sq.getS();
    final int CURRENT_H = rect.getW();
    final int CURRENT_W = rect.getH();
    final int OFFSET = 1;
    //Gettting the size of the screen
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    //instantiate class components
    String[] strShape = {"Square", "Rectangle"};//initialize value to be put on the ComboBox
    JComboBox cmbShape = new JComboBox(strShape);
    JSpinner xLocSpinner;
    JSpinner yLocSpinner;
    JSpinner sizeSpinner;
    JButton btnOK = new JButton();
    JButton btnCancel = new JButton();
    JButton btnColorFrame = new JButton();
    JLabel cmbShapeLbl = new JLabel();
    JLabel xLocSpinnerLbl = new JLabel();
    JLabel yLocSpinnerLbl = new JLabel();
    JLabel xLbl = new JLabel();
    JLabel yLbl = new JLabel();
    JLabel lLbl = new JLabel();
    JLabel wLbl = new JLabel();
    JLabel sLbl = new JLabel();
    JPanel drawPanel = new JPanel();
    Canvas fillColor = new Canvas();
    Canvas lineColor = new Canvas();

    public ShapeMenu() {
        init();
    }

    private void init() {

        //initializing components

        //initializing our Frame

        this.setBackground(new Color(151, 199, 112));
        this.setBounds(0, 50, 900, 650);

        //initializing our ComboBox and its Label

        cmbShapeLbl.setBounds(5, 20, 180, 30);
        cmbShapeLbl.setText("Select Shape");

        cmbShape.setBounds(5, 50, 180, 30);
        cmbShape.addActionListener(this);

        //initializing our buttons

        btnColorFrame.setBounds(5, 100, 180, 100);
        btnColorFrame.addActionListener(this);
        btnColorFrame.setFont(new Font("Arial", Font.BOLD, 30));
        btnColorFrame.setText("Color");

        //initialize JSpinner

        SpinnerModel xLocModel = new SpinnerNumberModel(0, 0, 680, 1);

        xLocSpinner = new JSpinner(xLocModel);

        SpinnerModel yLocModel = new SpinnerNumberModel(0, 0, 610, 1);

        yLocSpinner = new JSpinner(yLocModel);

        SpinnerModel sizeModel = new SpinnerNumberModel(0, 0, 680, 1);

        sizeSpinner = new JSpinner(sizeModel);

        xLocSpinnerLbl.setBounds(5, 230, 100, 20);
        xLocSpinnerLbl.setText("X Coordinate:");

        xLocSpinner.setToolTipText("Max number is 680");
        xLocSpinner.setValue(shape.getX());
        xLocSpinner.setBounds(5, 250, 50, 20);
        xLocSpinner.addChangeListener(this);

        yLocSpinnerLbl.setBounds(100, 230, 100, 20);
        yLocSpinnerLbl.setText("Y Coordinate:");

        yLocSpinner.setToolTipText("Max number is 610");
        yLocSpinner.setValue(shape.getY());
        yLocSpinner.setBounds(100, 250, 50, 20);
        yLocSpinner.addChangeListener(this);

        sizeSpinner.setToolTipText("Max number is 680");
        sizeSpinner.setValue(shape.getY());
        sizeSpinner.setBounds(100, 250, 50, 20);
        sizeSpinner.addChangeListener(this);        

        //Initialize our labels

        xLbl.setBounds(10, 300, 100, 10);
        xLbl.setText("X-Pos:    " + Integer.toString(rect.getW()));
        xLbl.setForeground(Color.red);

        yLbl.setBounds(10, 320, 100, 10);
        yLbl.setText("Y-Pos:    " + Integer.toString(rect.getW()));
        yLbl.setForeground(Color.red);

        lLbl.setBounds(10, 340, 100, 10);
        lLbl.setText("Height:   " + Integer.toString(rect.getH()));
        lLbl.setForeground(Color.red);

        wLbl.setBounds(10, 360, 100, 10);
        wLbl.setText("Width:    " + Integer.toString(rect.getW()));
        wLbl.setForeground(Color.red);

        sLbl.setBounds(10, 380, 100, 10);
        sLbl.setText("Size:       " + Integer.toString(shape.getX()));
        sLbl.setForeground(Color.red);

        fillColor.setBounds(100, 300, 50, 10);
        fillColor.setBackground(shape.getFillColor());
        
        lineColor.setBounds(100, 320, 50, 10);
        lineColor.setBackground(shape.getLineColor());

        btnOK.setBounds(5, 500, 180, 50);
        btnOK.addActionListener(this);
        btnOK.setText("Update");


        drawPanel.setBounds(200, 50, 690, 620);
        drawPanel.setBorder(BorderFactory.createLoweredBevelBorder());

        //Setting Layout

        this.setLayout(null);

        //Adding components

        this.add(cmbShapeLbl);
        this.add(cmbShape);

        this.add(xLocSpinnerLbl);
        this.add(yLocSpinnerLbl);
        this.add(xLocSpinner);
        this.add(yLocSpinner);

        this.add(xLbl);
        this.add(yLbl);
        this.add(lLbl);
        this.add(wLbl);
        this.add(sLbl);

        this.add(fillColor);
        this.add(lineColor);

        this.add(btnColorFrame);
        this.add(btnCancel);
        this.add(btnOK);

        this.add(shapecanvas);

        //Panel's visibility

        this.setVisible(true);

        //Mouse Action Event Listener
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnColorFrame) {

            ccf.setVisible(true);

        } else if (e.getSource() == btnOK) {

            updateShape();
            xLbl.setText("X-Pos:    " + Integer.toString(rect.getW()));
            yLbl.setText("Y-Pos:    " + Integer.toString(rect.getW()));
            lLbl.setText("Height:   " + Integer.toString(rect.getH()));
            wLbl.setText("Width:    " + Integer.toString(rect.getW()));
            sLbl.setText("Size:       " + Integer.toString(shape.getX()));
            fillColor.setBackground(shape.getFillColor());
            lineColor.setBackground(shape.getLineColor());


        } else if (e.getSource() == cmbShape) {

            shape.setName(cmbShape.getSelectedItem().toString());
            updateShape();

        }
        shapecanvas.revalidate();
        repaint();
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        int x = ((Integer) xLocSpinner.getValue()).intValue();
        int y = ((Integer) yLocSpinner.getValue()).intValue();

        if (e.getSource() == xLocSpinner || e.getSource() == yLocSpinner) {

            shapecanvas.revalidate();
            moveShape(x, y);

        }
    }

    private void updateShape() {


        shape.setX(((Integer) xLocSpinner.getValue()).intValue());
        shape.setY(((Integer) yLocSpinner.getValue()).intValue());

        if (cmbShape.getSelectedItem().toString().equals("Rectangle")) {

            rect.setW(((Integer) xLocSpinner.getValue()).intValue());
            rect.setH(((Integer) yLocSpinner.getValue()).intValue());



        } else if (cmbShape.getSelectedItem().toString().equals("Square")) {

            sq.setS(((Integer) xLocSpinner.getValue()).intValue());

        }
        shapecanvas.revalidate();
        repaint();
    }

    public void moveShape(int x, int y) {

        String name = shape.getName();


        if (name.equals("Rectangle")) {

            if (CURRENT_X != x || CURRENT_Y != y) {
                // The square is moving, repaint background 
                // over the old square location. 

                repaint(CURRENT_X, CURRENT_Y, CURRENT_H + OFFSET, CURRENT_W + OFFSET);

                //Update coordinates

                shape.setX(x);
                shape.setY(y);

                // Repaint the square at the new location.

                repaint(shape.getX(), shape.getY(), rect.getW() + OFFSET, rect.getH() + OFFSET);
            }

        } else if (name.equals("Square")) {

            if (CURRENT_X != x || CURRENT_Y != y) {
                // The square is moving, repaint background 
                // over the old square location. 

                repaint(CURRENT_X, CURRENT_Y, CURRENT_H + OFFSET, CURRENT_W + OFFSET);

                //Update coordinates

                shape.setX(x);
                shape.setY(y);

                // Repaint the square at the new location.

                repaint(shape.getX(), shape.getY(), rect.getW() + OFFSET, rect.getH() + OFFSET);

            }

        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        moveShape(e.getX() - 200, e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        moveShape(e.getX() - 200, e.getY());

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        xLocSpinner.setValue(e.getX() - 200);
        yLocSpinner.setValue(e.getY());

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
