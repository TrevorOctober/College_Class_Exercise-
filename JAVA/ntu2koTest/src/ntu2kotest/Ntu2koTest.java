/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ntu2kotest;

/**
 *
 * @author TREVOR
 */
public class Ntu2koTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ntu2ko info=new ntu2ko("trevor", 12, 30);
        info.display();
        
        ntu2ko info2=new ntu2ko("ntuthuko", 16/01/1999, 30);
        info2.display();
    }
}
