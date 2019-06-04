package c2;

class Print {
    void output(int x) {
        if (x == 1) {
            for (int i = 0; i <= 25; ++i) {
                System.out.print((char) ('A' + i) + "\t");
            }
        }
        if (x == 2) {
            for (int i = 0; i <= 25; ++i) {
                System.out.print((char) ('a' + i) + "\t");
            }
        }
    }
}

public class c2_6 {

    public static void main(String[] args) {
        Print pr = new Print();
        pr.output(1);
        System.out.println();
        pr.output(2);
    }
}