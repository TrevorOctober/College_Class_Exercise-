/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package machine2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author TREVOR OCTOBER
 */
public class Machine2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
       
        try{
          //  Scanner kb=new Scanner(System.in);
        //    System.out.println("Please enter the host to search for, from the network...");
          //  String host=kb.next();
       InetAddress OtherAddr=InetAddress.getByName("TREVOROCTOBER");
       // InetAddress [] OtherAddr=InetAddress.getAllByName(host);
        System.out.println("Other host info is: "+OtherAddr);
        }
        catch(UnknownHostException ux){
            System.out.println("Oops, something wrong with network \n"
                    +"or the destination host...");
        }
    }
}
