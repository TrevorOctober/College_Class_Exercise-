/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package circletester;

/**
 *
 * @author TREVOR
 */
public class CircleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle cir=new Circle(); 
        System.out.println("The area of a Circle is "+cir.Area()+"\n"
                + "and The perimeter of a circle is "+cir.perimeter());
    }
}
