
package rmi_project;

import java.rmi.*;
import java.rmi.server.*;
import java.sql.Connection;//Elle représente une connexion à une base de données.
import java.sql.DriverManager;//Elle prend en charge le chargement des pilotes et
//permet de créer de nouvelles connexions à des bases de données. 
//Elle tient à jour, la liste principale des pilotes JDBC recensés du système. 
import java.sql.ResultSet;//Cette classe symbolise un ensemble de résultats dans la base de données et autorise l'accès aux 
//résultats d'une requête rangée par rangée. Pendant le traitement de la requête, un 
//ResultSet conserve un pointeur vers la rangée manipulée. L'application se déplace séquentiellement dans l'ensemble des résultats. 

import java.sql.SQLException;
import java.sql.Statement;// C'est une classe que l'application emploie pour transmettre des instructions
//à la base, elle représente une requête SQL. 
//La fermeture d'un Statement engendre la fermeture automatique des tous les ResultSet associés. 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class ImplementInterface extends UnicastRemoteObject
           implements AfficheInterface {
           private String message;
           public ImplementInterface(String msg) throws RemoteException {
                     message = msg;
           }
           public String say() throws RemoteException {
           return message;
}
}