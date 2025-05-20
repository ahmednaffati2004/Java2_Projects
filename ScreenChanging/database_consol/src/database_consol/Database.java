/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_consol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    public static void main(String[] args) {
        String host = "jdbc:derby://localhost:1527/Workers";
        String userName = "omar";
        String password = "12345678";

        Frame_test employeeGui = new Frame_test();

        try {
            Connection con = DriverManager.getConnection(host, userName, password);
            con.setAutoCommit(false); 
            String query = "SELECT * FROM OMAR.WORKERS";
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet result = stmt.executeQuery(query);

            if (result.first()) {
                updateFields(employeeGui, result);
            }

            // Button Actions
            employeeGui.buttonFirst.addActionListener(e -> navigateToFirst(employeeGui, result));
            employeeGui.buttonFollowing.addActionListener(e -> navigateToNext(employeeGui, result));
            employeeGui.buttonPrevious.addActionListener(e -> navigateToPrevious(employeeGui, result));
            employeeGui.buttonTheLast.addActionListener(e -> navigateToLast(employeeGui, result));
            employeeGui.buttonDelete.addActionListener(e -> deleteRecord(employeeGui, result, con));
            employeeGui.buttonSave.addActionListener(e -> saveRecord(employeeGui, result, con));
            employeeGui.buttonNew.addActionListener(e -> clearFields(employeeGui));

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private static void updateFields(Frame_test gui, ResultSet result) {
        try {
            int id = result.getInt("ID");
            String firstName = result.getString("First_Name");
            String lastName = result.getString("Last_First");
            String job = result.getString("Job");

            gui.fieldId.setText(String.valueOf(id));
            gui.fieldFirstName.setText(firstName);
            gui.fieldLastName.setText(lastName);
            gui.fieldJob.setText(job);
        } catch (SQLException ex) {
            Logger.getLogger(Frame_test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void navigateToFirst(Frame_test gui, ResultSet result) {
        try {
            if (result.first()) {
                updateFields(gui, result);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Frame_test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void navigateToNext(Frame_test gui, ResultSet result) {
        try {
            if (result.next()) {
                updateFields(gui, result);
            } else {
                System.out.println("No more records.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Frame_test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void navigateToPrevious(Frame_test gui, ResultSet result) {
        try {
            if (result.previous()) {
                updateFields(gui, result);
            } else {
                System.out.println("No previous records.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Frame_test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void navigateToLast(Frame_test gui, ResultSet result) {
        try {
            if (result.last()) {
                updateFields(gui, result);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Frame_test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void deleteRecord(Frame_test gui, ResultSet result, Connection con) {
        try {
            result.deleteRow();
            con.commit();
            clearFields(gui);
            System.out.println("Record deleted successfully.");
        } catch (SQLException ex) {
            Logger.getLogger(Frame_test.class.getName()).log(Level.SEVERE, "Failed to delete record", ex);
        }
    }

    private static void saveRecord(Frame_test gui, ResultSet result, Connection con) {
        try {
            result.moveToInsertRow();
            result.updateInt("ID", Integer.parseInt(gui.fieldId.getText()));
            result.updateString("First_Name", gui.fieldFirstName.getText());
            result.updateString("Last_First", gui.fieldLastName.getText());
            result.updateString("Job", gui.fieldJob.getText());
            result.insertRow();
            con.commit();
            result.moveToCurrentRow();
            System.out.println("New record added successfully.");
        } catch (SQLException | NumberFormatException ex) {
            Logger.getLogger(Frame_test.class.getName()).log(Level.SEVERE, "Failed to save record", ex);
        }
    }

    private static void clearFields(Frame_test gui) {
        gui.fieldId.setText("");
        gui.fieldFirstName.setText("");
        gui.fieldLastName.setText("");
        gui.fieldJob.setText("");
    }
    
   
}
 
