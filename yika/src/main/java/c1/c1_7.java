package c1;

// 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
import c1.arraymanage;//在c1_5.java中定义的arraymanage类
import java.util.Scanner;// 用于输入的类

public class c1_7 {
    public static void main(String[] args) {
        int i, n, maxn, minn, temp1, temp2, temp3, temp4;
        int[] arr;
        arraymanage arrmng = new arraymanage();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数组大小:");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("请输入数组:");
        for (i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        // 直接进行赋值,以避免不能对如同1,2,3,4,5这样的数组进行交换
        maxn = arrmng.maxat(arr);
        minn = arrmng.minat(arr);
        temp1 = arr[0];
        temp2 = arr[n - 1];
        temp3 = arr[maxn];
        temp4 = arr[minn];
        arr[0] = temp3;
        arr[maxn] = temp1;
        arr[n - 1] = temp4;
        arr[minn] = temp2;

        arrmng.printarray(arr);
        sc.close();
    }
}