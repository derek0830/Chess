
import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.awt.Frame;
import javax.swing.JFrame;

import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Graphics;
public class testingFile2 
{
    public static void main(String[] args)
    {
        RectangleComponent gui = new RectangleComponent();
        //gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        //gui.pack();
        JFrame x = new JFrame();
        x.setSize(800, 800);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);
        String y = ("derekChen");
        x.setTitle(y);
        RectangleComponent component = new RectangleComponent();
        x.add(component);
        //x.createImage(100, 100);
        //String c = y;
        //System.out.println(c);

    }

}

