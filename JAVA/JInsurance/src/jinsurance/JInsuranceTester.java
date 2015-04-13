
package jinsurance;

import javax.swing.JFrame;

public class JInsuranceTester {

    public static void main(String[] args) {
    Insurance displayFrame=new Insurance();
    displayFrame.setTitle("JInsurance");
    displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    displayFrame.setSize(350, 200); 
    displayFrame.setVisible(true); 
    }
}
