/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author mac
 */
import javax.swing.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon(Main.class.getResource("/backgroundMoon.jpg"));
        



        if (icon.getImageLoadStatus() != java.awt.MediaTracker.COMPLETE) {
            System.out.println("didn't load");
            
        }

        JOptionPane.showMessageDialog(null, icon, "نافذة بصورة", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}