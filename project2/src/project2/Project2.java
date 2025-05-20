/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import javax.swing.JOptionPane;

/**
 *
 * @author manf2
 */
public class Project2 {

    public static void main(String[] args) {
        String s1 = "1 for Class A:\n2 for Class B:\n3 For Class C";
        String s2 = "ادخل الفئة الخاصة بك";
        String s3 = "ادخل المرتب الاساسي";
        String s4 = "ادخل الساعات الاضافية";

        JOptionPane.showMessageDialog(null, s1, "حساب مرتب موظف", 1);

        String input1 = JOptionPane.showInputDialog(null, s2, "Input", 3);
        String salary = JOptionPane.showInputDialog(null, s3, "", 3);
        
        int castingSalary = Integer.parseInt(salary);
        
        String extraHours = JOptionPane.showInputDialog(null, s4, "", 3);
        int castingExtraHours = Integer.parseInt(extraHours);
        
        double output = 0;
        String invild = "";
        switch (castingSalary) {
            case 1700:
                output = (1700 + (0.40 * 1700) + 9 * 45) * (1 - 0.07932) ; // 0
                break;
            case 2100:
                output = (2100 + (0.55 * 2100) + 5 * 65) * (1 - 0.07932);
                break;
            case 2500:
                output = (2500 + (0.70 * 2500) + 3 * 70) * (1 - 0.07932);
                break;
            default:
                output = -1.0;
                invild = "invild input !!";
        }
        JOptionPane.showMessageDialog(null, output + " "+ invild , "المرتب", 0);
        System.exit(0);
    }

}
