/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agecalculator;

/**
 *
 * @author mac
 */
import javax.swing.JOptionPane;

public class AgeCalculator {
//اسم برنامج AgeCalculator لان عمو قدوعة قال لازم ما تمسي برنامج اسم يوضح برنامج هذا شن يدير
    int ageInYears;
    int days;
    int hours;
    int minutes;
    int seconds;

    // استخدمة (Constructor) لان عمو قدوعة هكي طلب
    // كان مطلب عليك شي تقدر تحله في (main) طول
    // او تقدر تسخدم دوال عادي
    public AgeCalculator(int ageInYears) {
        this.ageInYears = ageInYears;
        days = ageInYears * 365;
        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;

        String result = "Your Age is:\n"
                      + "in days: " + days + "\n"
                      + "in hours: " + hours + "\n"
                      + "in minutes: " + minutes + "\n"
                      + "in seconds: " + seconds;

        JOptionPane.showMessageDialog(null, result, "Your Age is:", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter Your age in Years", "Input", JOptionPane.QUESTION_MESSAGE);
        
        if (input != null && !input.isEmpty()) {
            //هذا شرط تحسبنا ان الي بيستعمل برنامج مش بني ادم رسمي و يخلي حقل فاضي !
            try {
                //استعملنا try و catch زي ما قال عمو ابوجليدة انت مبرمج لازم ما تتوقع جميل الاحتمالات تخيل الي بيستعمل برنامج مش بني ادم كيف بدير 🤔
                int age = Integer.parseInt(input);
                new AgeCalculator(age);  // اهني بيستعدي الكونستركتر مش ينفد الي فيه زي ما يبي عمو قدوعة 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            }
        }
    }
}