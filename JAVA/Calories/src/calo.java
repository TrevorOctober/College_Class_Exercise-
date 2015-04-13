import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class calo extends JFrame implements ActionListener{
    JLabel lblcarbo,lblfat,lblproten;
    JTextField txtcarbo,txtfat,txtproten,txtcalories;
    JButton btndisplay;
    JPanel panel,panel2;
    
    int carbo,fat,proten,calories;
    
    public static void main(String[]args){
         new calo();  
        }

    public calo() {
      gui();  
        
    }

    private void gui() {
        JFrame mainwindow=new JFrame();
        mainwindow.setTitle("Calories");
        mainwindow.setSize(400, 200);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblcarbo=new JLabel("Grams of carbohydrate:");
        lblfat=new JLabel("Grams of fat");
        lblproten=new JLabel("Grams of proten");
        
        txtcarbo=new JTextField(5);
        txtfat=new JTextField(5);
        txtproten=new JTextField(5);
        txtcalories=new JTextField(10);
        
        btndisplay=new JButton("Compute Calories");
        
        panel2=new JPanel();
        panel2.setLayout(new GridLayout(2,0));
        panel2.add(btndisplay);
        panel2.add(txtcalories);
        
        panel=new JPanel();
        panel.setLayout(new GridLayout(4,2));
        panel.add(lblcarbo);
        panel.add(txtcarbo);
        panel.add(lblfat);
        panel.add(txtfat);
        panel.add(lblproten);
        panel.add(txtproten);
        panel.add(panel2);
        
        btndisplay.addActionListener(this);
        
        
        mainwindow.add(panel);
        mainwindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        Object src=e.getSource();
        if(btndisplay==src){Display();}
              
    }

    private void Display() {
      carbo=Integer.parseInt(txtcarbo.getText())* 4;
      fat=Integer.parseInt(txtfat.getText())* 9;
      proten=Integer.parseInt(txtproten.getText())* 4;
       
      calories =carbo+fat+proten;
      
    /*  carbo=4*txtcarbo.getText();
      fat=9*txtfat.getText();
      proten=4*txtproten.getText();
      
      calories =carbo+fat+proten*/
       
      txtcalories.setText("The serving contains "+calories+" calories");  
    }
   
    }
