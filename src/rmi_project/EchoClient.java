/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rmi_project;

/**
 *
 * @author pc
 */
import java.rmi.Naming;
public class EchoClient {
        public static void main(String[] argv) {
                try {
                        AfficheInterface hello = (AfficheInterface) Naming.lookup("//localhost/Hello");
                        System.out.println(hello.say());
                } catch (Exception e) {
                        System.out.println("HelloClient exception: " + e);
                }
        }
}