package c4;

import javax.swing.*;
import java.awt.*;

public class c4_4 extends JFrame {

    private JLabel ll = new JLabel("这是一条很长的跑马灯");
    private Container cp = getContentPane();
    c4_4() {
        setMinimumSize(new Dimension(420, 190));
        setContentPane(cp);
        cp.add(ll);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public void repaint() {
        super.repaint();
        int x, y;
        int maxx, maxy;
        x = ll.getX();
        y = ll.getY();
        maxx = getWidth();
        maxy = getHeight();
        if (x - 10 > 0) {
            x -= 10;
        } else {
            x = maxx;
        }
        ll.setLocation(x, y);
    }

    public static void main(String[] args) {
        c4_4 cc = new c4_4();
        int i = 1, j, k;
        while (i > 0) {
            j = 0;
            while (j < 0x7ffffff) {
                j++;
                k = 0;
                while (k < 0x7ffffff) {
                    k++;
                }
            }
            cc.repaint();
        }
    }
}