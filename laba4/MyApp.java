import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyApp extends JFrame
{
    public void human(Graphics g, int tempx, int tempy,Color color){
        int b=20;
        int r =-20;
        int k =40;
        int l =40;
        int x =-50+tempx;
        int y = 150+tempy;
        g.setColor(Color.BLUE);
        g.drawLine(100+x, 100+y, 80+x, 200+y);  //left hand
        g.drawLine(200+x, 100+y, 220+x, 200+y); //right hand
        g.drawLine(200-b+x, 200+y, 200-b+x, 300+y); 
        g.drawLine(100+b+x, 200+y, 80+b+x, 300+y); 
        g.fillRect(100+x, 100+y, 100, 100);
        g.setColor(color);
        g.fillArc(60+k+x, 60+l+y-100, 100, 100,r,180);
        g.drawLine(45+k+x, 85+l+y-100, 175+k+x, 134+l+y-100);
        g.setColor(new Color(255, 174, 173));
        g.fillArc(60+k+x, 60+l+y-100, 100, 100,180+r,180);
    }
    public void paint(Graphics g)
    {
       
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawString("Разработчик Монастырев Егорий, ПМИ-21",50,100);
        human(g, 150*0, -10*0,Color.red);
        human(g, 150*1, -10*1,Color.green);
        human(g, 150*2, -10*2,Color.blue);
        human(g, 150*3, -10*3,Color.yellow);
        human(g, 150*4, -10*4,Color.cyan);
        
        
        
       
    }

    public static void main(String[] args) {new MyApp();}

    public MyApp()
    {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 600);
        setVisible(true);
        
        
    }
}