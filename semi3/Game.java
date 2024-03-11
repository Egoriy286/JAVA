import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;

public class Game extends JFrame implements Runnable{
    
    private int x;
    private int y;
    int fx = 400;
    int fy = 200;
    int col=12;
    int row=10;
    int left = 100;
    int top = 100;
    int sizeX = 50;
    int sizeY = 50;
    boolean isWork =true;
    public Game() throws HeadlessException{
        new Thread( this).start();
        this.setDefaultCloseOperation(2);
        this.setBounds(10,10,1200,800);
        addMouseListener(new MouseListener() {
            @Override
                public void mouseClicked(MouseEvent e) {
                    
                    
                    if(e.getButton()==MouseEvent.BUTTON1) {
                        System.out.println(e.getX() + "," + e.getY());
                        x = e.getX() / sizeX*sizeX;
                        y =  e.getY() / sizeY*sizeY;
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
    
        this.setVisible(true);
    }
    public static void main(String[] args){
        Game game = new Game();
        game.setDefaultCloseOperation(2);
        game.setBounds(10,10,1200,800);
        game.setVisible(true);
        game.run();
    }

    @Override
    public void paint(Graphics g0) {
        this.createBufferStrategy(2);
        BufferStrategy bs = this.getBufferStrategy();
        Graphics2D g =(Graphics2D) bs.getDrawGraphics();
        super.paint(g);
        //Graphics2D g = (Graphics2D) g0;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.red);
        int col=12;
        int row=10;
        int left = 100;
        int top = 100;
        int sizeX = 50;
        int sizeY = 50;
        g.setColor(Color.red);
        for (int _i = 0; _i < col+1; _i++) {
            g.drawLine(left+_i*sizeX, top, left+_i*sizeX, left+row*sizeY);

        }
        g.setColor(Color.blue);
        for (int _i = 0; _i < row+1; _i++) {
            g.drawLine(left, top+_i*sizeY, left+col*sizeY, top+_i*sizeY);
        }
        g.setColor(Color.yellow);
        g.fillOval(x,y,sizeX,sizeY);
        g.setColor(Color.green);
        int valx = 400;
        int valy = 350;
        g.fillOval(valx-fx,(int)fy,sizeX,sizeY);
        g.setColor(Color.blue);
        
        int y1 = valy;
        int x1 = valx;
        int x2 = valx;
        int mash=100;
        for (int i=0; i<1000; i++)
        {
            //g.drawLine(x1, y1, valx-i, valy-(i*i)/mash);
            //g.drawLine(x2, y1, valx+i, valy-(i*i)/mash);
            g.fillOval( valx-i, valy+(i*i)/mash, 3, 3);
            g.fillOval( valx+i, valy+(i*i)/mash, 3, 3);
            //y1 = valy-(i*i)/mash;
            //x1 = valx-i;
            //x2 = valx+i;
        }
        bs.show();
    }

    @Override
    public void run(){
        while(true){
            System.out.println("work");
            fx++;
            fy=fy-(fx*fx)/100;
            repaint();
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException e){
                throw new RuntimeException();
            }
        }
        
    }
}
