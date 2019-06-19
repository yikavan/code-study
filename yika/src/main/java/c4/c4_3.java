package c4;

import javax.swing.*;
import java.awt.*;

public class c4_3 extends JApplet {
    private Container cp = getContentPane();

    private JTextArea editarea = new JTextArea();

    private JMenuBar mub = new JMenuBar();
    private JMenu ma = new JMenu("文件(F)");
    private JMenu mb = new JMenu("编辑(E)");
    private JMenu mc = new JMenu("帮助(H)");
    private JMenuItem ma1 = new JMenuItem("新建(N)");
    private JMenuItem ma2 = new JMenuItem("打开(O)");
    private JMenuItem ma3 = new JMenuItem("保存(S)");
    private JMenuItem ma4 = new JMenuItem("另存为(A)");
    private JMenuItem ma5 = new JMenuItem("退出(X)");
    private JMenuItem mb1 = new JMenuItem("撤销(U)          CTRL+Z");
    private JMenuItem mb2 = new JMenuItem("剪切(T)          CTRL+X");
    private JMenuItem mb3 = new JMenuItem("复制(C)          CTRL+C");
    private JMenuItem mb4 = new JMenuItem("粘贴(P)          CTRL+V");
    private JMenuItem mc1 = new JMenuItem("查看帮助(H)");

    private Box centerbox = Box.createVerticalBox();

    private JScrollPane scp = new JScrollPane(editarea);

    @Override
    public void init() {
        super.init();
        setJMenuBar(mub);
        ma.add(ma1);
        ma.add(ma2);
        ma.add(ma3);
        ma.add(ma4);
        ma.add(ma5);

        mb.add(mb1);
        mb.add(mb2);
        mb.add(mb3);
        mb.add(mb4);

        mc.add(mc1);
        mub.add(ma);
        mub.add(mb);
        mub.add(mc);

//        centerbox.add(editarea);
        centerbox.add(scp);//试出来是这么写的
        cp.add(centerbox);

    }
}
