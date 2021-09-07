import java.awt.*;
import java.applet.Applet;
public class CO3Q4 extends Applet
{
	public void paint(Graphics g)
	{
        g.setColor(Color.red);
		g.fillRect(70,100,30,30);
		g.setColor(Color.yellow);
		g.fillRoundRect(20,120,60,30,5,5);
		g.setColor(Color.blue);
		g.fillOval(150,100,30,30);
		g.setColor(Color.green);
		g.fillOval(190,100,30,20);
	}
}
/* <applet code="CO3Q4" width=200 height=200>
 </applet>
*/