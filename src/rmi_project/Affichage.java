package rmi_project;
import java.rmi.*;
import java.rmi.server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Affichage extends UnicastRemoteObject
           implements AfficheInterface {
           private String message;
           public Affichage(String msg) throws RemoteException {
                     message = msg;
           }
           public String say() throws RemoteException {
           return message;
}
 void affichage ()
{
  
        DefaultTableModel affichage = null;
        String asql = "select * from chambre ";
        
      String[] titres = {" Chambre "," Diponibilité ","Nom"};
String[] collone = new String[7];
affichage = new DefaultTableModel(null,titres);

  Connection cn = null;
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation","root","");
            // create new statement
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(asql);

while  (rs.next())
{
collone[0] = rs.getString("chambre") ;
collone[1] = rs.getString("dispo") ;
collone[2] = rs.getString("Nom") ;
affichage.addRow(collone);
}  

      } catch (SQLException ex) {
            Logger.getLogger(HotelInterface.class.getName()).log(Level.SEVERE, null, ex);
        }

}

void miseajour (String a,String b) 
{
  //cnct a la bdd 
 String url = "jdbc:mysql://localhost:3306/reservation"; 
		            Connection conn;
        try {
            conn = DriverManager.getConnection(url,"root","");
      
				      Statement st = (Statement) conn.createStatement(); 
                                       
		            st.executeUpdate("INSERT INTO user " + 
		                "VALUES (null,'"+a+"', '"+b+"')");
                           st.executeUpdate("UPDATE `reservation`.`chambre` SET `dispo` = 'nondisponible' , `Nom` = '"+a+"' WHERE `chambre`.`chambre` = '"+b+"'");
                              
        
          } catch (SQLException ex) {
            Logger.getLogger(HotelInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
          

}          


}