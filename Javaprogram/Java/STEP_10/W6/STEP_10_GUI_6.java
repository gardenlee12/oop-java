import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Mypanel extends JPanel {

    final int UP = 0, Dn = 1, Rt = 2, Lt=3;
    private int x = 200 - 50, y = 200 - 50;

     Mypanel(){
            setBackground(Color.white);
            setPreferredSize(new Dimension(400, 400));
    }
     public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.red);
            g.drawRect(x, y, 50, 50);
    }

    public void move_circle() {
        int ewsn = (int)(Math.random() * 1000) % 4;
        int disp = (int)(Math.random() * 1000) % 30;

        switch(ewsn){
            case UP: y = y; y -= disp; if (y < 0) y = 0;
                break;
            case Dn: y = y; y += disp; if (350-50 < y) y = 350-50;
                break;
            case Rt: x = x; x += disp; if (400-50 < x) x = 400-50;
                break;
            case Lt: x = x; x -= disp; if (x < 0) x = 0;
                break;
        }

        repaint();
    }
}

public class STEP_10_GUI_6
{
    STEP_10_GUI_6() throws InterreputException {
        JFrame frame = new JFrame();
        Mypanel panel = new Mypanel
    }
    
}