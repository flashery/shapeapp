
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flashery
 */

public class ColorChoserFrame extends JFrame implements ActionListener, ChangeListener{

    //Instantiate a class
    
    ShapeCanvas shapecanvas = new ShapeCanvas();
    Shape shape = new Shape();
    Square sq = new Square();
    Rectangle rect = new Rectangle();
    
    //Instantiate JColorChoser class
    String changeColorOf [] = {"Fill Color", "Border Color"};
    
    JComboBox cmbChangeColorOf = new JComboBox(changeColorOf);
    
    JColorChooser jcc = new JColorChooser();
    
    JPanel panelColor = new JPanel();
    JPanel panelFillColor = new JPanel();
    JPanel panelLineColor = new JPanel();
    
    JLabel lblChangeColorOf = new JLabel();
    
    JButton btnOK = new JButton();
    JButton btnCancel = new JButton();
    
    public ColorChoserFrame(){
        init();
    }
    
    private void init(){
        this.setSize(600,600);
        this.getContentPane().setLayout(null);
        this.setResizable(false);
        
        //Setting Frame location center on the screen
        
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        int frmW = this.getSize().width;
        int frmH = this.getSize().height;
        int frmlocX   = (dm.width - frmW) / 2;
        int frmlocY   = (dm.height - frmH) / 2;
        this.setLocation(frmlocX , frmlocY);
        
        cmbChangeColorOf.setBounds(5, 100, 150, 30);
        
        lblChangeColorOf.setBounds(5, 70, 150, 30);
        lblChangeColorOf.setText("Change color of:");
        
        panelFillColor.setBounds(5, 150, 150, 30);
        panelLineColor.setBounds(5, 190, 150, 30);
        
        btnOK.setBounds(150, 450, 100, 30);
        btnOK.addActionListener(this);
        btnOK.setText("OK");
        
        btnCancel.setBounds(270, 450, 100, 30);
        btnCancel.addActionListener(this);
        btnCancel.setText("Cancel");
        
        jcc.setBounds(170, 10, 400, 400);
        jcc.getSelectionModel().addChangeListener(this);   
        
        panelColor.setLayout(null);
        panelColor.setBounds(5, 5, 585, 560);
        panelColor.setBorder(BorderFactory.createLineBorder(Color.yellow));
        
        //adding component onto a Frame
        
        panelColor.add(panelFillColor);
        panelColor.add(panelLineColor);
        panelColor.add(cmbChangeColorOf);
        panelColor.add( lblChangeColorOf);
        panelColor.add(btnOK);
        panelColor.add(btnCancel);
        panelColor.add(jcc);
        
        //adding component onto a Frame
        
        this.getContentPane().add(panelColor);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnOK ){
            this.setVisible(false);
            this.dispose();
        }else if(e.getSource() == btnCancel){
            sq.setDefault();
            rect.setDefault();
            this.setVisible(false);
            this.dispose();
              
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
            if(cmbChangeColorOf.getSelectedItem() == "Fill Color"){
                
                shape.setFillColor(jcc.getColor());
                panelFillColor.setBackground(shape.getFillColor());
                
            }else if(cmbChangeColorOf.getSelectedItem() == "Border Color"){
                
                shape.setLineColor(jcc.getColor());
                panelLineColor.setBackground(shape.getLineColor());
                

            }
            
            shapecanvas.setBackground(jcc.getColor());
            repaint();
            
    }
    
}
