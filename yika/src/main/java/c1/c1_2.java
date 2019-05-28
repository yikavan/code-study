package c1;
// 编写一个Java程序在屏幕上输出1！+2！+3！+……+10！的和。
class cal {
    static int fac(int n) {
        int sum = 1;
        while (n > 1) {
            sum *= n;
            n--;
        }
        return sum;
    }
}
public class c1_2 {
    public static void main(String[] args) {
        int sum;
        int i;
        sum = 0;
        for (i = 1; i <= 10; ++i) {
            sum += cal.fac(i);
        }
        System.out.println("the result is " + sum);
    }
}