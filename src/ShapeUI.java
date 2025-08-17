/**
 * Shape Application - Main UI class
 * @author flashery
 */
//This is now the main class of our program
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ShapeUI extends JFrame {

    // Constants for UI dimensions and colors
    private static final int WINDOW_WIDTH = 900;
    private static final int WINDOW_HEIGHT = 700;
    private static final int TITLE_HEIGHT = 50;
    private static final Color TITLE_BACKGROUND_COLOR = new Color(242, 233, 45);
    private static final int FONT_SIZE = 20;

    //instantiate the class
    
    Shape shape = new Shape();
    Rectangle rect = new Rectangle();
    Square sq = new Square();
    
    //instantiate the ShapeCanvas class
 
    ShapeMenu shapemenu = new ShapeMenu();
    ShapeCanvas shapecanvas = new ShapeCanvas();
    
    JPanel title = new JPanel();
    JLabel titleLabel = new JLabel("Shape Application", JLabel.CENTER);
    
    Font f = new Font("SansSerif", Font.BOLD, FONT_SIZE);
    
    //Contructor
    
    public ShapeUI() {

        init();

    }

    private void init() {

        //initialize components attribute
  
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
     
        title.setVisible(true);
        title.setBounds(0, 0, WINDOW_WIDTH, TITLE_HEIGHT);
        title.setBackground(TITLE_BACKGROUND_COLOR);
        
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
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    
    
    /***************************************************************************
     *********************** THE MAIN METHOD OF OUR APP ************************
     ***************************************************************************/
    
    public static void main(String[] args) {

        ShapeUI su = new ShapeUI();

    }
}