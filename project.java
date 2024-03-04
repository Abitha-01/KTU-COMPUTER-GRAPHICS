// abitha udayan
// generate image using java and show two transformations
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
class MyCanvas extends JComponent {
	private int width;
	private int height;
	public MyCanvas(int w,int h){
	width=w;
	height=h;
	}
  protected void paintComponent(Graphics g){   
    Graphics2D g2d = (Graphics2D) g; 
    RenderingHints rh =new RenderingHints(
    RenderingHints.KEY_ANTIALIASING,
    RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHints(rh);
	//rotation
    AffineTransform reset =g2d.getTransform(); 
		Rectangle2D.Double r=new Rectangle2D.Double(0,0,1200,900);
		g2d.setColor(new Color(201,149,237));
        g2d.fill(r);
		Rectangle2D.Double r1=new Rectangle2D.Double(200,200,200,200);
		g2d.setColor(Color.BLACK);
		g2d.fill(r1);	
		g2d.setColor(Color.GREEN);
	//translation
	Rectangle2D.Double t1=new Rectangle2D.Double(500,500,100,100);
		g2d.setColor(Color.YELLOW);
		g2d.fill(t1);
		g2d.translate(80,0);
		g2d.setColor(Color.BLACK);
		g2d.fill(t1);
		g2d.translate(80,0);
		g2d.setColor(Color.WHITE);
		g2d.fill(t1);
             
}		
}
public class project{
  public static void main(String[] args) {
    int w =1200;
	int h=900;
	JFrame f=new JFrame();
	MyCanvas dc =new MyCanvas(w,h);
	f.setSize(w,h);
	f.setTitle("IMAGE GENERATED USING JAVA2D");
	f.add(dc);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
  }
}
