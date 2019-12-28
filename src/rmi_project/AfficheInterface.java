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
import java.rmi.*;
public interface AfficheInterface extends Remote {
        public String say() throws RemoteException;
}
