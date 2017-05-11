/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsdemo1;

import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author kendrabooker
 */
public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        //they move the green shapes
        g.drawRect(50,20,50,200);  // draw a rectangle
        //changes the size and position of the green circle
        g.fillOval(160,20,100,200); // draw a filled-in oval
        g.setColor(Color.red);
        g.fillRect(650,400,20,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        
        g.setColor(Color.black);
        //after the string are coordinates for where the string will be drawn
        //when two objects overlap the circle sets on top
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    
    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        //the window is 800px wide and 600px tall
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
    
}
