// package c4;

// import javax.swing.*;
// import java.awt.*;

// public class c4_3 extends JApplet {
//     private Container cp = getContentPane();

//     private JTextArea editarea = new JTextArea();

//     private JMenuBar mub = new JMenuBar();
//     private JMenu ma = new JMenu("�ļ�(F)");
//     private JMenu mb = new JMenu("�༭(E)");
//     private JMenu mc = new JMenu("����(H)");
//     private JMenuItem ma1 = new JMenuItem("�½�(N)");
//     private JMenuItem ma2 = new JMenuItem("��(O)");
//     private JMenuItem ma3 = new JMenuItem("����(S)");
//     private JMenuItem ma4 = new JMenuItem("����Ϊ(A)");
//     private JMenuItem ma5 = new JMenuItem("�˳�(X)");
//     private JMenuItem mb1 = new JMenuItem("����(U)          CTRL+Z");
//     private JMenuItem mb2 = new JMenuItem("����(T)          CTRL+X");
//     private JMenuItem mb3 = new JMenuItem("����(C)          CTRL+C");
//     private JMenuItem mb4 = new JMenuItem("ճ��(P)          CTRL+V");
//     private JMenuItem mc1 = new JMenuItem("�鿴����(H)");

//     private Box centerbox = Box.createVerticalBox();

//     private JScrollPane scp = new JScrollPane(editarea);

//     @Override
//     public void init() {
//         super.init();
//         setJMenuBar(mub);
//         ma.add(ma1);
//         ma.add(ma2);
//         ma.add(ma3);
//         ma.add(ma4);
//         ma.add(ma5);

//         mb.add(mb1);
//         mb.add(mb2);
//         mb.add(mb3);
//         mb.add(mb4);

//         mc.add(mc1);
//         mub.add(ma);
//         mub.add(mb);
//         mub.add(mc);

// //        centerbox.add(editarea);
//         centerbox.add(scp);//�Գ�������ôд��
//         cp.add(centerbox);

//     }
// }
