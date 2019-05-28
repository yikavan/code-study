package c1;

import java.util.Scanner;

public class sc1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temps = new String();
        int mxpos = 0, mxrng = 0;
        int i, j;
        temps = sc.nextLine();
        char[] arr = new char[temps.length() * 2 + 1];
        arr[arr.length - 1] = ' ';
        // 在字符与字符之间填充空格，以避免讨论奇偶数的情况
        for (i = 0; i < temps.length(); ++i) {
            arr[2 * i + 1] = temps.charAt(i);
            arr[2 * i] = ' ';
        }
        for (i = 0; i < arr.length; ++i) {
            for (j = 0; i - j >= 0 && i + j < arr.length; ++j) {
                if (arr[i - j] != arr[i + j]) {
                    break;
                }
            }
            if (j > mxrng) {
                mxrng = j;
                mxpos = i;
            }
        }
        mxrng--;//比实际的情况多一位为了下面输出方便，就先自减一位
        System.out.println("结果是:");
        for (i = mxpos - mxrng; i <= mxpos + mxrng; ++i) {
            if (i % 2 == 1) {
                // 偶数位是被填进去的字符，因此输出奇数位
                System.out.print(arr[i]);
            }
        }
        sc.close();
    }
}