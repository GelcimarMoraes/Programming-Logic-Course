
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Main extends Canvas implements Runnable{

    int right = 0, left = 1,top = 2,down = 3;
    int dir = right;

    int x = 0;
    int y = 0;

    int maxDistance = 240;
    boolean chegou = false;

    public Main() {
        this.setPreferredSize(new Dimension(480,480));
    }

    public void update() {
        //1) Identificar a direção:
        if(dir == right) {
            x+=4;
        }else if(dir == left) {
            x-=4;
        } else if (dir == top) {
            y-=4;
        } else if (dir == down) {
            y+=4;
        }
        //2) Mudar a direção:
        if (x+50 >= 480 && y == 0) {
            dir = down;
        } else if (x+50 >= 480 && y+50 >= 480) {
            dir = left;
        } else if (x <= 0 && y+50 >= 480) {
            dir = top;
        } else if (x<=0 && y<=0) {
            dir = right;
        }

    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null)
        {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 480, 480);


        if(dir == right) {
            g.setColor(Color.red);
        }else if(dir == left) {
            g.setColor(Color.YELLOW);
        } else if (dir == top) {
            g.setColor(Color.blue);
        } else if (dir == down) {
            g.setColor(Color.cyan);
        }


        g.fillRect(x, y, 50, 50);
        g.dispose();
        bs.show();

    }


    public static void main(String[] args) {
        Main main = new Main();
        JFrame frame = new JFrame();
        frame.setTitle("Exercicio Logica");
        frame.add(main);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        new Thread(main).start();
    }

    @Override
    public void run() {
        double fps = 60.0;
        while(true) {
            update();
            render();
            try {
                Thread.sleep((int)(1000/fps));
            } catch (InterruptedException e) {}
        }

    }



}