import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.lang.Object;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.*;
import javax.swing.*;

public class RectangleComponent extends JComponent
{
    private ImageIcon image1;
    private JLabel label1;
    public RectangleComponent()
    {
        //setLayout(new FlowLayout());
        //image1 = new ImageIcon(getClass().getResource("birthdayCake.gif"));
        //label1 = new JLabel(image1);
        //add(label1);
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        //creating a text
        int x;
        x = 255;
        for(int i =0; i<800;i+=100)
        {
        	for(int e=0;e<800;e+=100)
        	{
        		if((i/100)%2==0)
        		{
        			g2.fillRect(e, i,100, 100);
        			g2.setColor(Color.BLACK);
        		}
        	}
        }
        

        
   
    }
}