package c2;

class CClock {
    // 同一个包不能有相同的类
    int h, m, s;

    CClock(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void show() {
        System.out.println(h + ":" + m + ":" + s);
    }

}

public class c2_4_1 {
    // 我是用题号名的

    public static void main(String[] args) {
        CClock time1=new CClock(1,2,3);
        time1.show();
        CClock time2 = new CClock(2,5,1);
        time2.show();
    }
}