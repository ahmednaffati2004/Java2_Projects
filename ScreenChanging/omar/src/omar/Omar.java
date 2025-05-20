/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omar;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Omar {

    /**
     * @param args the command line arguments
     */

        // TODO code application logic here
          private static Container cnt;
    private static ResultSet rs;
    private static Statement stmt;
    public static void main(String[] args) {
        
        try
        {
        String UserName = "omaralkaseh";
        String PassWord = "123";
        String host = "jdbc:derby://localhost:1527/Employees11";
        Connection con = DriverManager.getConnection( host, UserName, PassWord );
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
         String SQL = "SELECT * FROM OMARALKASEH.WORKORS";
          rs = stmt.executeQuery( SQL );
          int IDColumn;
          String FirstName, LastName, Job;
          while(rs.next())
          {
              IDColumn = rs.getInt("ID");
              FirstName  = rs.getString("First_Name");
              LastName = rs.getString("Last_Name");
              Job = rs.getString("Job");
              System.out.println("ID" + "   First Name" + "     Last Name" + "    Job\n" + IDColumn + "\t" + FirstName + "\t" + LastName + "\t" + Job);
          }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
