/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dj.vs.producer;


public class DjVsProducer {

    
    public static void main(String[] args) {
       
        System.out.println("*************************");
        DJ Turntablelist =new DJ();
        Turntablelist.Display();
        
        Producer Composer = new Producer("Culoe De Song ", "Soulistic Music ", "Trevor October", "Essential of Deep house");
        Composer.Display();
        System.out.println("*************************");
        
    }
}
