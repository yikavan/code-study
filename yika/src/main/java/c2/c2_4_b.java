package c2;

class Clock {
    int h, m, s;

    Clock(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void show() {
        System.out.println(h + ":" + m + ":" + s);
    }

}

public class c2_4_b {
    // 我是用题号名的

    public static void main(String[] args) {
        Clock time1=new Clock(1,4,3);
        time1.show();
        Clock time2 = new Clock(2,5,1);
        time2.show();
    }
}