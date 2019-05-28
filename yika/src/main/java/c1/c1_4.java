package c1;

// 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
class fab {
    // 斐卜拉切数列类
    static float a_div_b(int n) {
        // 观察发现是类似于斐波那契数列，每一项是f(n)=f(n-1)+f(n-2)
        // 要求的是f(n)/f(n-1)
        // 这里返回的既是每一个f(n)/f(n-1)
        float a = 1;
        float b = 2;
        float temp;
        float sum = 0;
        while (n > 1) {
            temp = b;
            b = b + a;
            a = temp;
            n--;
        }
        sum = b / a;
        return sum;
    }
}

public class c1_4 {
    public static void main(String[] args) {
        int i;
        float sum = 0;
        for (i = 1; i <= 20; ++i) {
            sum += fab.a_div_b(i);
        }
        System.out.println(sum);
    }
}
