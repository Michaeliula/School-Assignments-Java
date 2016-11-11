/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.Month;
       
/**
 *
 * @author user Michael Iula
 */
public class ClockPanel1 extends JPanel {

    public void paintComponent(Graphics pen){
        //allows width of lines to be set
        Graphics2D g2Dpen= (Graphics2D) pen;
        
        //gets current time
        LocalDateTime a = LocalDateTime.now();
        
        //gets hour, minute and second
        int hour = a.getHour();
        int minute = a.getMinute();
        int second = a.getSecond();
        
        //finds the angle for each hand
        double secondAngle = (second * ((2*Math.PI)/60));
        double minuteAngle = (minute + second/60) * ((2*Math.PI)/60);
        double hourAngle = (hour + minute/ (60 + second)/ (60 * 60)) * ((2*Math.PI)/12);
        
        
        
        
        //length of hands
        int hourLength = 72;
        int minuteLength = 90;
        int secondLength = 108;
        
        //end point of hour hand
        double hourXEnd = 220 + hourLength * Math.sin(hourAngle);
        double hourYEnd = 215 - hourLength * Math.cos(hourAngle);
        
        //end point of the minute hand
        double minuteXEnd = 220 + minuteLength * Math.sin(minuteAngle);
        double minuteYEnd = 215 - minuteLength * Math.cos(minuteAngle);
        
        //end point of the second hand
        double secondXEnd = 220 + secondLength * Math.sin(secondAngle);
        double secondYEnd = 215 - secondLength * Math.cos(secondAngle);
        
        
        
        
        // Draws a circle
        pen.setColor(Color.white);
        pen.drawOval(100, 100, 250, 250);
        
        //Draw Clock hands
        
        //draws minute hand
        g2Dpen.setStroke(new BasicStroke(3));
        pen.setColor(Color.green);
        pen.drawLine(220,215,(int)minuteXEnd,(int)minuteYEnd);
        //draws second hand
        g2Dpen.setStroke(new BasicStroke(1));
        pen.setColor(Color.red);
        pen.drawLine(220,215,(int)secondXEnd,(int)secondYEnd);
        //draws hour hand
        g2Dpen.setStroke(new BasicStroke(5));
        pen.setColor(Color.blue);
        pen.drawLine(220,215,(int)hourXEnd,(int)hourYEnd);
        
        
        // Draws the digital time
        pen.setColor(Color.white);
        pen.drawString(hour + ":" + minute + ":"+ second, 205, 400);
        
        // Draws numbers
        Font myFont = new Font("Baskerville", Font.PLAIN, 15);
        pen.setFont(myFont);
        pen.setColor(Color.white);
        pen.drawString("12", 220, 115);
        pen.drawString("3", 337, 215);
        pen.drawString("6", 224, 340);
        pen.drawString("9", 108, 215);
        

        
        
                
    }
}

    

