import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
public class Game2 extends JFrame implements Runnable{
    int col=12;
    int row=10;
    int left = 100;
    int top = 100;
    int sizeX = 50;
    int sizeY = 50;
    int fx = -400;
    int fy = -200;
    boolean isWork = true;
    ArrayList<Unit> units = new ArrayList<>();

    public Game2() throws HeadlessException {
        units.add(new Unit(1, 2));
        units.add(new Unit(3, 4));
        units.add(new Unit(7, 8));
        new Thread(this).start();
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {
                isWork = false;
            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {

            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {

            }
        });
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX()+ ", "+ e.getY());
                int cx = (e.getX()-left)/sizeX;
                int cy = (e.getY()-top)/sizeY;
                if(e.getButton()==MouseEvent.BUTTON1) {
                    for (int i = 0; i<units.size(); i++){
                        Unit u = units.get(i);
                        if (cx == u.getX() && cy == u.getY()){
                            u.setSelected(!u.getSelected());
                        }
                    }
                    
                }else if(e.getButton()==MouseEvent.BUTTON3){
                    for (int i = 0; i<units.size(); i++){
                        Unit u = units.get(i);
                        if (u.getSelected()){
                            u.setX(cx);
                            u.setY(cy);
                        }
                    }
                }
                repaint();

            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Game2 game = new Game2();
        game.setDefaultCloseOperation(2);
        game.setBounds(10,10,1200,800);
        game.setVisible(true);
    }

    @Override
    public void paint(Graphics g0) {
        this.createBufferStrategy(2);
        BufferStrategy bs = this.getBufferStrategy();
        Graphics2D g = (Graphics2D) bs.getDrawGraphics();
        super.paint(g);
        //Graphics2D g = (Graphics2D) g0;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON); //сглаживание
        //g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g.setColor(Color.red);

        g.setColor(Color.red);
        for (int _i = 0; _i < col+1; _i++) {
            g.drawLine(left+_i*sizeX, top, left+_i*sizeX, left+row*sizeY);
        }
        g.setColor(Color.blue);
        for (int _i = 0; _i < row+1; _i++) {
            g.drawLine(left, top+_i*sizeY, left+col*sizeY, top+_i*sizeY);
        }
        for (int i=0; i<units.size(); i++){
            Unit u = units.get(i);
        
            g.setColor(Color.yellow);
            g.fillOval(u.getX()*sizeX+left,u.getY()*sizeY+top,sizeX,sizeY);
            if (u.getSelected()){
                g.setColor(Color.red);
                g.drawOval(u.getX()*sizeX+left,u.getY()*sizeY+top,sizeX,sizeY);
            }
        }
        //g.setColor(Color.green);
        //g.fillOval((int)fx+400,(int)fy+200,sizeX,sizeY);
        //g.setColor(Color.red);
        //double px = -400;
        //double py = -200;
        //for (int i = 0; i < 800; i++) {
        //    px++;
        //    py = px*px/200;
        //    g.fillOval((int)px+400,(int)py+200,2,2);
        //}
        bs.show();///////рисование
    }

    @Override
    public void run() {
        while (isWork) {
            //fx++;
            //fy = fx*fx/400;
            ////System.out.println("работаем");
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
