/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting;

import javax.swing.JFrame;

/**
 *
 * @author TREVOR OCTOBER
 */
public class GreetingTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Gui go=new Gui();
    go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    go.setSize(350, 250);
    go.setVisible(true);
    }
}
