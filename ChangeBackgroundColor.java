/*Java Program to Change Background Color of Applet*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ChangeBackgroundColor extends Applet implements KeyListener
{
    //Function to initialize the applet
    public void init()
    {
	setBackground(Color.white);
	addKeyListener(this);
    }
    //Function to change background color of applet
    public void keyPressed(KeyEvent e)
    {
	if(e.getKeyCode()==KeyEvent.VK_CONTROL)
	{
  	    int R = (int)(Math.random()*100) % 255;
	    int G = (int)(Math.random()*100) % 255;
	    int B = (int)(Math.random()*100) % 255;
	    Color mycolor = new Color(R,G,B);
	    this.setBackground(mycolor);
	}
    }
    //Empty function
    public void keyReleased(KeyEvent e)
    {
    }
    //Empty function
    public void keyTyped(KeyEvent e)
    {
    }
}
/*
<applet code=Change_Background.class width=400 height=400>
</applet>
*/