import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class CO3Q5 extends Applet implements MouseListener, MouseMotionListener
{
    String msg = "";
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent mE)
    {
        msg = "Mouse Clicked";
        repaint();
    }
    public void mouseEntered(MouseEvent mE)
    {
        msg = "Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent mE)
    {
        msg = "Mouse Exited";
        repaint();
    }
    public void mousePressed(MouseEvent mE)
    {
        int x = mE.getX();
        int y = mE.getY();
        showStatus("Mouse Pressed at Coordinate (" + x + "," + y + ")");
        repaint();
    }
    public void mouseReleased(MouseEvent mE)
    {
        int x = mE.getX();
        int y = mE.getY();
        showStatus("Mouse Released at Coordinate (" + x + "," + y + ")");
        repaint();
    }
    public void mouseMoved(MouseEvent mE)
    {
        int x = mE.getX();
        int y = mE.getY();
        showStatus("Currently Mouse is at Coordinate (" + x + "," + y + ")");
        repaint();
    }
    public void mouseDragged(MouseEvent mE)
    {
        int x = mE.getX();
        int y = mE.getY();
        showStatus("Mouse Dragged at Coordinate (" + x + "," + y + ")");
        repaint();
    }
    public void paint(Graphics g)
    {
		g.drawString("Handling Mouse Events",300,200);
        g.drawString(msg,100,100);
    }
}
/*
<applet code = "CO3Q5.java" height ="400" width = "400"></applet>
 */