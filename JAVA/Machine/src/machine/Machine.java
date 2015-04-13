/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author TREVOR OCTOBER
 */
public class Machine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        byte [] arr = {2,3,6};
        InetAddress addr=InetAddress.getByAddress("TREVOROCTOBER", arr);
        System.out.println("This host info is: "+addr);
    }
}
