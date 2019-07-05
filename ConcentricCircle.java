importjava.awt.*;
importjava.applet.*;

public class ConcentricCircle extends Applet
 {
public void paint(Graphics g){
           Dimension d = getSize();
int x = d.width/2;
int y = d.height/2;
int r1 = (int) ((d.width<d.height) ? 0.4 * d.width : 0.4 * d.height);
g.setColor(Color.red);
g.fillOval(x-r1, y-r1, 2*r1, 2*r1);

int r2 = (int) ((d.width<d.height) ? 0.3 * d.width : 0.3 * d.height);
g.setColor(Color.blue);
g.fillOval(x-r2, y-r2, 2*r2, 2*r2);

int r3 = (int) ((d.width<d.height) ? 0.2 * d.width : 0.2 * d.height);
g.setColor(Color.yellow);
g.fillOval(x-r3, y-r3, 2*r3, 2*r3);

int r4 = (int) ((d.width<d.height) ? 0.1 * d.width : 0.1 * d.height);
g.setColor(Color.green);
g.fillOval(x-r4, y-r4, 2*r4, 2*r4);

g.setColor(Color.red);
g.drawString("Width   = "+d.width,10,10);
g.drawString("Height = "+d.height,10,20);
        }
 }
