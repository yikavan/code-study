// package c4;

// import javax.swing.*;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class c4_1 extends JApplet implements ActionListener {
//     private Container cp = getContentPane();
//     private JButton btn = new JButton("North");
//     private JButton bts = new JButton("��");
//     private JButton btw = new JButton("west");
//     private JButton bte = new JButton("��");
//     private JLabel label1 = new JLabel("ɶҲû��");

//     public void init() {
//         cp.add(btn, BorderLayout.NORTH);
//         cp.add(bts, BorderLayout.SOUTH);
//         cp.add(btw, BorderLayout.WEST);
//         cp.add(bte, BorderLayout.EAST);
//         cp.add(label1, BorderLayout.CENTER);
//         btn.addActionListener(this);
//         bte.addActionListener(this);
//         btw.addActionListener(this);
//         bts.addActionListener(this);
//         label1.setHorizontalAlignment(JLabel.CENTER);

//     }

//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == btn) {
//             label1.setText("�ղŵ����" + btn.getText());
//         } else if (e.getSource() == btw) {
//             label1.setText("�ղŵ����" + btw.getText());
//         } else if (e.getSource() == bts) {
//             label1.setText("�ղŵ����" + bts.getText());
//         } else {
//             label1.setText("�ղŵ����" + bte.getText());
//         }
//     }

// }