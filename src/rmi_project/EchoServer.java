

package rmi_project;

import java.rmi.Naming;
import java.rmi.registry.Registry;
//Le lancement des serveurs doit ^etre precede par la mise en place d'un registre RMI. Le but d'un registre RMI est
//d'offrir un annuaire des objets serveurs disponibles en associant, a chaque objet serveur, un nom.
public class EchoServer {
        public synchronized static void main(String[] args) {
                try {
                    
                    // Création du rmiregistry 
                        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);//1099 is the port number
                
                        
                 
		        Thread thread = new Thread(r.toString());
		        thread.start();
                        // create and publish Hello server object
                       r.rebind("Hello", new Affichage(" Confirmation de Résérvation  "));
                       r.rebind("Hello", new Affichage(" Lancer votre Résérvation ")); 
                        
                       
                       
                       
                        System.out.println("Server RMI est Connecté ...");
                        
                        
                } catch (Exception e) {
                        System.out.println("Server not connected: " + e);
                }
        }
}