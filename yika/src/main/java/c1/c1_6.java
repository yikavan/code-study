package c1;
// 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数。
import c1.arraymanage;//在c1_5.java中定义的arraymanage类
import java.util.Scanner;// 用于输入的类

public class c1_6 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        arraymanage arrmng = new arraymanage();

        System.out.print("请输入要生成几个整数:");
        n = sc.nextInt();

        int[] arr = arrmng.generate_random_arr_of_size(n);

        System.out.println("产生的数组为:");
        arrmng.printarray(arr);

        System.out.print("请输入要移动的位数m:");
        m = sc.nextInt();
        arrmng.move_arr_of(arr, m);
        System.out.println("移动后的数组为:");
        arrmng.printarray(arr);

        sc.close();
    }
}