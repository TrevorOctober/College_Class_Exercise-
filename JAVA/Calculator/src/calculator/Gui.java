
package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gui extends JFrame  {
  JLabel lblNum1=new JLabel("FIRST NUMBER:") ;
  JLabel lblNum2=new JLabel("SECOND NUMBER:");
  JLabel lblAns=new JLabel("ANSWER");
  
  JTextField txtNum1=new JTextField(10);
  JTextField txtNum2=new JTextField(10);
  JTextField txtAns=new JTextField(15);
  
  JButton btnAdd=new JButton("ADD");
  JButton btnMinus=new JButton("MINUS");
  JButton btnTimes=new JButton("TIMES");
  JButton btnDivide=new JButton("DIVIDE");
  
  JPanel myPanel1=new JPanel();
  JPanel myPanel2=new JPanel();
  JPanel myPanel3=new JPanel();
  
  double num1,num2;
  double add,times,divide,minus;
    public Gui(){
        super("CALCULATOR");
        
       myPanel1.setLayout(new BorderLayout());
       myPanel1.add(lblNum1);
       myPanel1.add(txtNum1);
       myPanel1.add(lblNum2);
       myPanel1.add(txtNum2);
       myPanel1.setLayout(new GridLayout(2,2));
       myPanel1.setBackground(Color.orange);
       
       myPanel2.setLayout(new BorderLayout());
       myPanel2.add(btnAdd);
       myPanel2.add(btnMinus);
       myPanel2.add(btnTimes);
       myPanel2.add(btnDivide);
       myPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
       myPanel2.setBackground(Color.BLACK);
       
       myPanel3.setLayout(new BorderLayout());
       myPanel3.add(lblAns);
       myPanel3.add(txtAns);
       myPanel3.setLayout(new FlowLayout(FlowLayout.LEFT));
       myPanel3.setBackground(Color.GRAY);
       
      add(myPanel1, BorderLayout.NORTH);
      add(myPanel2, BorderLayout.CENTER);
      add(myPanel3, BorderLayout.SOUTH);
       
       Handler handle=new Handler();
       btnAdd.addActionListener(handle);
       btnMinus.addActionListener(handle);
       btnTimes.addActionListener(handle);
       btnDivide.addActionListener(handle);
       
    }
    private class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
        
         num1= Double.parseDouble(txtNum1.getText());
         num2= Double.parseDouble(txtNum2.getText());
         
         add=num1+num2;
         minus =num1-num2;
         times=num1*num2;
         divide=num1/num2;
         
         if(e.getSource()==btnAdd)
         txtAns.setText("Your Answer is "+add);
         
         else if (e.getSource()==btnMinus)
        txtAns.setText("Your Answer is "+minus);  
         
         else if (e.getSource()==btnTimes)
         txtAns.setText("Your Answer is "+times);   
         
         else if (e.getSource()==btnDivide)
         txtAns.setText("Your Answer is "+divide);
             
       }
    }
}
