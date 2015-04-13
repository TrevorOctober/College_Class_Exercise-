/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thetickets;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Lucky Mbutho
 */
public class TicketFrame  extends JFrame  implements ActionListener{
    
    JLabel title, name, gender, age, cat, dist;
    JTextField txtName, txtAge, txtDist;
    JRadioButton male, female;
    JComboBox  catChoice;
    JButton calc, close;
    JPanel top, centa, bot , genPan;
    ButtonGroup sex;
    
    
    
    public TicketFrame() throws HeadlessException {
         
        title  = new JLabel("TICKET APPLICATION ");
        name  = new JLabel("NAME :");
        age  = new JLabel("AGE :");
        gender  = new JLabel("GENDER :");
        cat  = new JLabel("CATERGORY :");
        dist = new JLabel ("DISTANCE :");
        
        
        
        txtName =new JTextField(10);
        txtAge =new JTextField(10);
        txtDist =new JTextField(10);
        
        sex = new ButtonGroup();
        male = new JRadioButton("Male" , true);
        female = new JRadioButton("Female");
        
        sex.add(male);
        sex.add(female);
        
        String [] choice = {"One","Two","Three"};
        catChoice = new JComboBox(choice);
        
        calc = new JButton ("CALCULATE");
        close = new JButton("CLOSE");
        
        top = new JPanel();
        centa = new JPanel();
        bot = new JPanel();
        genPan = new JPanel();
        
        genPan.add(male);
        genPan.add(female);
        
        top.add(title);
        
        centa.setLayout(new GridLayout(5,2));
        centa.add(name);
        centa.add(txtName);
        centa.add(gender);
        centa.add(genPan);
        centa.add(age);
        centa.add(txtAge);
        centa.add(cat);
        centa.add(catChoice);
        centa.add(dist);
        centa.add(txtDist);
        
        bot.add(calc);
        bot.add(close);
        
        this.setLayout(new BorderLayout());
        this.add(top ,BorderLayout.NORTH );
        this.add(centa ,BorderLayout.CENTER );
        this.add(bot ,BorderLayout.SOUTH );
        
        close.addActionListener(this);
        calc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String sex = "";
         double price = 0;
         double distance = Double.parseDouble(txtDist.getText());
         int age = Integer.parseInt(txtAge.getText());
        
        if (catChoice.getSelectedIndex()==0)
            price = (price + 10 ) *distance;
        
        else if (catChoice.getSelectedIndex()==1)
            price = (price + 15 ) *distance;
        else
            price = (price + 20 ) *distance;
        
         if (male.isSelected())
            sex = "MALE";
         else{
            sex = "FEMALE";
            price = price / 2;
         }
         if (age <15)
             price = 0;
         
        if (e.getSource() == close)
            System.exit(1);
        
        if (e.getSource() == calc)
            
         JOptionPane.showMessageDialog(this, "DEAR MY "+txtName.getText()+", you are "+sex
                                         +" aged " +txtAge.getText()+". You chose ticket category "+
                                                 catChoice.getSelectedItem()+ "So you will pay R"+ price);
        
        
    }
    
    
    
    
    
    
    
    
    
}
