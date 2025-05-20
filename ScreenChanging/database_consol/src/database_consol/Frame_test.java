
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_consol;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lolki
 */
public class Frame_test {
    public JFrame frame;
    public JLabel idLabel, firstNameLabel, lastNameLabel, jobLabel;
    public JTextField fieldId, fieldFirstName, fieldLastName, fieldJob;
    public JButton buttonFirst, buttonFollowing, buttonPrevious, buttonDelete, buttonTheLast, buttonNew, buttonSave;
    
    public Frame_test() {
        
        initializeComponents();
        addComponentsToFrame();
        setFrameProperties();
    }
    

    private void initializeComponents() {
        frame = new JFrame();
        
        idLabel = new JLabel("ID");
        firstNameLabel = new JLabel("FIRST NAME");
        lastNameLabel = new JLabel("LAST NAME");
        jobLabel = new JLabel("JOB");
        
        idLabel.setBounds(50, 50, 100, 30);
        firstNameLabel.setBounds(50, 100, 100, 30);
        lastNameLabel.setBounds(50, 150, 100, 30);
        jobLabel.setBounds(50, 200, 100, 30);
        
        fieldId = new JTextField();
        fieldFirstName = new JTextField();
        fieldLastName = new JTextField();
        fieldJob = new JTextField();
        
        fieldId.setBounds(200, 50, 200, 30);
        fieldFirstName.setBounds(200, 100, 200, 30);
        fieldLastName.setBounds(200, 150, 200, 30);
        fieldJob.setBounds(200, 200, 200, 30);
        
        buttonFirst = new JButton("First");
        buttonFollowing = new JButton("Following");
        buttonPrevious = new JButton("Previous");
        buttonDelete = new JButton("Delete");
        buttonTheLast = new JButton("The Last");
        buttonNew = new JButton("New");
        buttonSave = new JButton("Save");
        
        buttonFirst.setBounds(50, 300, 100, 30);
        buttonFollowing.setBounds(160, 300, 100, 30);
        buttonPrevious.setBounds(270, 300, 100, 30);
        buttonDelete.setBounds(380, 300, 100, 30);
        buttonTheLast.setBounds(490, 300, 100, 30);
        buttonNew.setBounds(50, 350, 100, 30);
        buttonSave.setBounds(160, 350, 100, 30);
    }

    private void addComponentsToFrame() {
        frame.setLayout(null);
        frame.add(idLabel);
        frame.add(firstNameLabel);
        frame.add(lastNameLabel);
        frame.add(jobLabel);
        
        frame.add(fieldId);
        frame.add(fieldFirstName);
        frame.add(fieldLastName);
        frame.add(fieldJob);
        
        frame.add(buttonFirst);
        frame.add(buttonFollowing);
        frame.add(buttonPrevious);
        frame.add(buttonDelete);
        frame.add(buttonTheLast);
        frame.add(buttonNew);
        frame.add(buttonSave);
    }

    private void setFrameProperties() {
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
//    
//       String host = "jdbc:derby://localhost:1527/Workers",
//                username = "omara",
//                password = "12345678";
//        try
//        {
//            Connection con = DriverManager.getConnection( host, username, password );
//            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//            String sql = "SELECT * FROM OMAR.WORKERS";
//            ResultSet rs = stmt.executeQuery(sql);
//            String database = "", FName = "", WorkPlace = "", City = "";
//            int OffedID = 0;
//            while(rs.next()) {
//
//                OffedID = rs.getInt("ID");
//                database = rs.getString("Farst_Name");
//                FName = rs.getString("Last_Name");
//                WorkPlace = rs.getString("Job");
//                //City = rs.getString("City");
//                String p = OffedID + " " + database + " " + FName + " " + WorkPlace;
//                System.out.println(p);
//            }
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e.getMessage());
//        }
}
