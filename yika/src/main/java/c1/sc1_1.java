package c1;

import java.util.Scanner;

/**
 * sc1_1
 */
public class sc1_1 {
    public static void main(String[] args) {
        float[] a = new float[50], b = new float[50];
        Scanner sc = new Scanner(System.in);
        int p, q;// 分别指向a和b
        int m, n;// 分别是a和b的长度
        int ml = 1, mr, nl = 1, nr;
        int i, temp;
        float re1 = 0, re2 = 0;
        int flag = 1;
        // 输入
        System.out.println("输入m,n:");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("输入a[m]:");
        for (i = 1; i <= m; i++) {
            a[i] = sc.nextFloat();
        }
        System.out.println("输入b[n]:");
        for (i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }
        if (m < n) {
            float[] temparr = a;
            a = b;
            b = temparr;
            temp = m;
            m = n;
            n = temp;
        }
        // 初始化数据
        mr = m;
        nr = n;
        p = (ml + mr + 1) / 2;
        q = (nl + nr + 1) / 2;
        // 当为两个偶数的时候要减掉一个，最好剪掉多的那个
        if (p % 2 == 0 && q % 2 == 0) {
            temp = p >= q ? p-- : q--;
        }
        a[mr + 1] = a[mr];
        b[nr + 1] = b[nr];
        a[0] = a[1];
        b[0] = b[1];
        // 开始判断
        // 找到左半边 (m+n+1)/2 个数中最大的
        // 可以作为左半边最大的数可以是a[p],
        while (flag == 1) {
            if (a[p] <= b[q]) {
                if (a[p] >= b[q - 1]) {
                    // a[p]是左半边最大的
                    re1 = re2 = a[p];
                    break;
                } else {
                    // a[p]<b[q-1]
                    // p往右走 q往左走
                    if (p == mr) {
                        // p 在最右，并且b[q-1]是左半边最大的
                        re1 = re2 = b[q - 1];
                        flag = 2;
                        break;
                    }
                    if (q == nl) {
                        // q在最左边，并且a[p]是左半边最大的
                        re1 = re2 = a[p];
                        flag = 3;
                        break;
                    }
                    temp = mr - (mr + p) / 2;
                    nr = q;
                    q -= temp;
                    ml = p;
                    p += temp;
                }
            } else {
                // a[p] >= b[q]
                if (q == nr) {
                    // a[p] 已经比左半边最大的数大了，因此只能从a[p-1]和b[q]中取大的
                    if (a[p - 1] >= b[q]) {
                        // a[p-1]作为左边最大
                        re1 =re2 = a[p - 1];
                        flag = 4;
                        break;
                    } else {
                        // b[q]作为左边最大
                        re1 =re2= b[q];
                        flag = 5;
                        break;
                    }
                }
                if (b[q] >= a[p - 1]) {
                    // b[q]作为左边最大
                    re1 = re2 = b[q];
                    flag = 6;
                    break;
                }
                // b[q]<a[p-1]
                // q往右走,p向左
                temp = nr - (nr + q) / 2;
                mr = q;
                p -= temp;
                nl = q;
                q += temp;

            }
        }
        if (m % 2 == 0 && n % 2 == 0) {
            re1 = a[p] > b[q - 1] ? a[p] : b[q - 1];
            re2 = a[p + 1] < b[q] ? a[p + 1] : b[q];
        }
        if (m % 2 != 0 && n % 2 != 0) {
            if (flag == 1) {
                // a[p]是左半边最大的
                re2 = a[p + 1] < b[q] ? a[p + 1] : b[q];
            } else if (flag == 2) {
                // p 在最右，并且b[q-1]是左半边最大的
                re2 = a[p] < b[q] ? a[p] : b[q];
            } else if (flag == 3) {
                // q在最左边，并且a[p]是左半边最大的
                re2 = a[p + 1] < b[q] ? a[p + 1] : b[q];
            } else if (flag == 4) {
                // a[p-1]作为左半边最大，b[q]落在左半边
                // 那么右半边最小一定是a[p]
                re2 = a[p];
            } else if (flag == 5) {
                // b[q]作为左边最大,那么右半边最小为a[p]和b[q+1]中小的那个
                re2 = a[p] < b[q + 1] ? a[p] : b[q + 1];
            } else {
                // b[q]作为左边最大,那么右半边最小为a[p]和b[q+1]中小的那个
                re2 = a[p] < b[q + 1] ? a[p] : b[q + 1];
            }

        }
        re1 = (re1 + re2) / 2;
        System.out.println(re1);
        sc.close();
        // test change
    }
}
/*
 * 第一组数据 答案6
 * 
 * 2 9 3 4 1 2 5 6 7 8 9 10 11
 * 
 * 第二组数据 答案6
 * 
 * 9 2 1 2 5 6 7 8 9 10 11 3 4
 * 
 * 第三组数据 答案6
 * 
 * 3 8 3 4 5 1 2 6 7 8 9 10 11
 * 
 * 第四组数据 答案6
 * 
 * 8 3 1 2 6 7 8 9 10 11 3 4 5
 * 
 * 第五组数据 答案6
 * 
 * 7 4 1 2 6 8 9 10 11 3 4 5 7
 * 
 * 第六组数据 答案6
 * 
 * 5 6 1 2 3 4 5 6 7 8 9 10 11
 * 
 * 第七组数据 答案6.5
 * 
 * 6 6 1 2 3 4 5 6 7 8 9 10 11 12
 * 
 * 第七组数据 答案6.5
 * 
 * 6 6 1 2 3 4 5 7 6 8 9 10 11 12
 * 
 * 第八组数据 答案6.5
 * 
 * 6 6 6 8 9 10 11 12 1 2 3 4 5 7
 * 
 * 第九组数据 答案6.5
 * 
 * 6 6 1 2 3 6 8 9 4 5 7 10 11 12
 */