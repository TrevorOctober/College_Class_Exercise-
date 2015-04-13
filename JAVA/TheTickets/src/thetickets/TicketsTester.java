/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thetickets;

import javax.swing.JFrame;

/**
 *
 * @author Lucky Mbutho
 */
public class TicketsTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TicketFrame myframe = new TicketFrame();
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setSize(300, 250);
        myframe.setVisible(true);
        
    }
}
