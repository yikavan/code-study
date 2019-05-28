package c1;

// 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
// 每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
import java.util.Scanner;// 用于输入的类

class encryption {
    public static int plus5div10(int n) {
        // 加5除以10留余数，仅限四位
        int result = 0;
        int[] a = new int[4];
        int i = 0;

        while (n != 0) {
            a[i++] = n % 10;
            n /= 10;
        }
        while (i > 0) {
            a[--i] += 5;
            a[i] %= 10;
        }

        for (i = 0; i < 4; ++i) {
            result *= 10;
            result += a[i];
        }
        return result;
    }

}

public class c1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;
        System.out.println("请输入加密数据：");
        data = sc.nextInt();
        data = encryption.plus5div10(data);
        System.out.println("加密后数据为:" + data);
        sc.close();
    }

}