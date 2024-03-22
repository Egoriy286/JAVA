import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferStrategy;

public class Game extends JFrame implements Runnable{
    public Game() throws HeadlessException{
        Thread thread = new Thread();
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON1) {
                    System.out.println(e.getX() + "," + e.getY());
                    x = (e.getX()-left)/sizeX;
                    y = (e.getY()-top)/sizeY;
                }else if(e.getButton()==MouseEvent.BUTTON3){

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
        setVisible(true);
    }
    int col=12;
    int row=10;
    int left = 100;
    int top = 100;
    int sizeX = 50;
    int sizeY = 50;
    private int x;
    private int y;
    int fy=-400;
    int fx=-200;
    boolean isWork = true;
    public static void main(String[] args) {
        Game2 game = new Game2();
        game.setDefaultCloseOperation(2);
        game.setBounds(10,10,1200,800);

    }

    @Override
    public void paint(Graphics g) {
        this.createBufferStrategy(2);
        BufferStrategy bs = this.getBufferStrategy();

        super.paint(g);
        Graphics2D g2 = (Graphics2D) bs.getDrawGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.red);

        g.setColor(Color.red);
        for (int _i = 0; _i < col+1; _i++) {
            g.drawLine(left+_i*sizeX, top, left+_i*sizeX, left+row*sizeY);
        }
        g.setColor(Color.blue);
        for (int _i = 0; _i < row+1; _i++) {
            g.drawLine(left, top+_i*sizeY, left+col*sizeY, top+_i*sizeY);
        }
        g.setColor(Color.yellow);
        g.fillOval(x*sizeX,y*sizeX,sizeX,sizeY);
        g.setColor(Color.red);
        g.fillOval(90,90,sizeX,sizeY);

        double px = -400;
        double py = -200;
        for(int i=1; i<800; i++){
            px++;
            py=px*px/200;
            g.fillRect((int)px+400, (int)py+200, 2, 2);

        }
        bs.show();
    }


    public void run(){
        while(true){
            //System.out.println("работаем");
            fx++;
            fy = fx*fx/200;
            //g.fillOval((int)fx+400, (int)fy+200, 2, 2);

            repaint();
            try {
                Thread.sleep(20);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}