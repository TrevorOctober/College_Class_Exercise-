/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author TREVOR
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
Scanner kb=new Scanner(System.in);
int FB = 0;
        
System.out.println("What are you doing right now...?");
FB=kb.nextInt();

switch(FB) {
case 1:
System.out.println("FB + TV");
 
break;
case 2:
System.out.println("FB + MP3");

break;
case 3:
System.out.println("FB + School");

break;
case 4:
System.out.println("FB + Home work");

break;
case 5:
System.out.println("FB + Work"); 

break;
case 6:
System.out.println("Only FB & Lying in bed");

break;
case 7:
System.out.println("FB + Other....?");
    }
}
}
