/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectdb11;

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
public class ConectDB11 {

    /**
     * @param args the command line arguments
     */
    private static Container cnt;
    private static ResultSet rs;
    private static Statement stmt;
    public static void main(String[] args) {
        
        try
        {
        String UserName = "omaralkaseh";
        String PassWord = "123";
        String host = "jdbc:derby://localhost:1527/Employee11";
        Connection con = DriverManager.getConnection( host, UserName, PassWord );
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
         String SQL = "SELECT * FROM OMARALKSEH.WORKORS";
          rs = stmt.executeQuery( SQL );
          while(rs.next())
          {
              int IDColumn = rs.getInt("ID");
              String FirstName  = rs.getString("FIRST_NAME");
              String LastName = rs.getString("LAST_NAME");
              String Job = rs.getString("JOB");
              System.out.println("ID" + "   First Name" + "     Last Name" + "    Job\n" + IDColumn + "\t" + FirstName + "\t" + LastName + "\t" + Job);
          }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
