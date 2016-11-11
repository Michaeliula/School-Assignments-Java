/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author user
 */
public class CSC211Lab04 {
    public static void main(String[] args) {
        //draws frame
        JFrame window = new JFrame();
        //sets window size
        window.setSize(500,500);
        //sets background color
        window.setBackground(Color.black);
        //gives title
        window.setTitle("CSC211 Lab 04");
        //exit program when window closes
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create new panel
        ClockPanel1 myPanel = new ClockPanel1();
        window.add(myPanel);
        window.setVisible(true);
    }
    
}

