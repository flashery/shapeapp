/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashery
 */
//This is now the main class of our program
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ShapeUI extends JFrame implements WindowListener {

    //instantiate the class
    
    Shape shape = new Shape();
    Rectangle rect = new Rectangle();
    Square sq = new Square();
    
    //instantiate the ShapeCanvas class
 
    ShapeMenu shapemenu = new ShapeMenu();
    ShapeCanvas shapecanvas = new ShapeCanvas();
    
    JPanel title = new JPanel();
    JLabel titleLabel = new JLabel("Shape Application", JLabel.CENTER);
    
    Font f = new Font("SansSerif", Font.BOLD, 20);
    
    //Contructor
    
    public ShapeUI() {

        init();

    }

    private void init() {

        //initialize components attribute
  
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(900, 700);
     
        title.setVisible(true);
        title.setBounds(0, 0, 900, 50);
        title.setBackground(new Color(242, 233, 45));
        
        titleLabel.setFont(f);
        titleLabel.setForeground(Color.red);
        
        //Adding Label on the title canvas
        
        title.add(titleLabel);
        
        //setting layout of the frame

        this.getContentPane().setLayout(null);

        //adding the component onto a frame
      
        this.getContentPane().add(title);
        this.getContentPane().add(shapemenu);
        
        addListener();

    }
    
    private void addListener() {

        this.addWindowListener(this);

    }
    
    
    
    /***************************************************************************
     *********************** THE MAIN METHOD OF OUR APP ************************
     ***************************************************************************/
    
    public static void main(String[] args) {

        ShapeUI su = new ShapeUI();

    }


   
    
    //Overriding Methods
    @Override
    public void windowClosing(WindowEvent ae) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent ae) {
        
    }

    @Override
    public void windowClosed(WindowEvent ae) {
    }

    @Override
    public void windowDeiconified(WindowEvent ae) {
    }

    @Override
    public void windowIconified(WindowEvent ae) {
    }

    @Override
    public void windowDeactivated(WindowEvent ae) {
    }

    @Override
    public void windowActivated(WindowEvent ae) {
       
    }
}