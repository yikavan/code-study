// package c4;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.AdjustmentEvent;
// import java.awt.event.AdjustmentListener;
// import java.awt.event.WindowAdapter;
// import java.awt.event.WindowEvent;

// public class c4_2 extends JApplet {
//     private int r = 0, g = 0, b = 0;
//     private String s, s1 = " red ", s2 = " green ", s3 = " blue ";
//     private JScrollBar sbr, sbg, sbb;
//     private JLabel lb1 = new JLabel("�̶ȣ�"), lb2 = new JLabel(s1 + r + s2 + g + s3 + b), lb3 = new JLabel("��ɫ��");
//     private JLabel lbr = new JLabel("��ɫ"), lbg = new JLabel("��ɫ��"), lbb = new JLabel("��ɫ��");
//     private Container cp = getContentPane();

//     @Override
//     public void init() {
//         super.init();
//         Box baseBox = Box.createVerticalBox();
//         Box box1 = Box.createHorizontalBox();
//         Box box2 = Box.createVerticalBox();

//         lb3.setBackground(new Color(0, 0, 0));
//         lb3.setBorder(BorderFactory.createEtchedBorder());
//         lb3.setOpaque(true);
//         lb3.setMaximumSize(new Dimension(380, 40));

//         box1.add(lb1);
//         box1.add(lb2);
//         box2.add(lb3);

//         baseBox.add(box1);
//         baseBox.add(box2);

//         sbr = new JScrollBar(JScrollBar.HORIZONTAL, 10, 10, 0, 260);
//         sbr.setUnitIncrement(5);
//         sbr.setBlockIncrement(10);
//         sbr.addAdjustmentListener(new Dj());
//         box2.add(lbr);
//         box2.add(sbr);

//         sbg = new JScrollBar(JScrollBar.HORIZONTAL, 10, 10, 0, 260);
//         sbg.setUnitIncrement(5);
//         sbg.setBlockIncrement(10);
//         sbg.addAdjustmentListener(new Dj());
//         box2.add(lbg);
//         box2.add(sbg);

//         sbb = new JScrollBar(JScrollBar.HORIZONTAL, 10, 10, 0, 260);
//         sbb.setUnitIncrement(5);
//         sbb.setBlockIncrement(10);
//         sbb.addAdjustmentListener(new Dj());
//         box2.add(lbb);
//         box2.add(sbb);

//         cp.add(baseBox);

//     }

//     class WinLis extends WindowAdapter {
//         public void windowClosing(WindowEvent e) {
//             System.exit(0);
//         }
//     }

//     class Dj implements AdjustmentListener {

//         @Override
//         public void adjustmentValueChanged(AdjustmentEvent e) {
//             if ((JScrollBar) e.getSource() == sbr) {
//                 r = e.getValue();
//             }
//             if ((JScrollBar) e.getSource() == sbg) {
//                 g = e.getValue();
//             }
//             if ((JScrollBar) e.getSource() == sbb) {
//                 b = e.getValue();
//             }
//             s = s1 + r + "" + s2 + g + "" + s3 + b;
//             lb2.setText(s);
//             lb3.setBackground(new Color(r, g, b));
//             lb3.setForeground(new Color(255 - r, 255 - g, 255 - b));
//         }
//     }
// }
