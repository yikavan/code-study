package c1;

// 有一个已经排好序的数组。现输入一个数，要求
// 按原来的规律将它插入数组中。
import java.util.Random;//产生随机数的类
import java.util.Scanner;// 用于输入的类
class arraymanage {
    // 数组管理的类
    public int[] generate_random_arr_of_size(int n) {
        // 随机生成含n个数的数组，
        int[] arr = new int[n];
        int i;
        Random random = new Random();
        for (i = 0; i < n; ++i) {
            arr[i] = random.nextInt(84);
        }
        return arr;
    }

    public void insert(int[] arr, int n) {
        // 遍历插入，如果比最大的大就不插入
        // 如果能插入 就插入,并挤掉最后一个
        int i;
        int flag = 0;
        for (i = 0; i < arr.length - 1; ++i) {
            if (i == 0 && n <= arr[0]) {
                break;
            }
            flag++;
            if (n >= arr[i] && n <= arr[i + 1]) {
                break;
            }
        }
        for (i = arr.length - 1; i > flag; --i) {
            arr[i] = arr[i - 1];
        }
        if (flag < arr.length - 1) {
            arr[flag] = n;
        } else if (n >= arr[flag - 1] && n <= arr[flag]) {
            arr[flag] = n;
        } else {
            System.out.println("输入数字大过数组中所有数字,不能插入");
        }

    }

    public void sort_as_Ascendin(int[] arr) {
        // 升序排序
        int i, j, temp;
        for (i = 0; i < arr.length - 1; ++i) {
            for (j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void move_arr_of(int[] arr, int m) {
        // 第六题用
        // 使数组前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
        int i;
        int[] temp_arr = new int[arr.length];
        for (i = 0; i < arr.length; ++i) {
            temp_arr[(i + m) % arr.length] = arr[i];
        }
        for (i = 0; i < arr.length; ++i) {
            arr[i] = temp_arr[i];
        }
    }

    public int maxat(int[] arr) {
        // 第七题用
        // 返回数组中最大的第一个数的下标
        int i;
        int temp = arr[0], result = 0;
        for (i = 1; i < arr.length; ++i) {
            if (temp < arr[i]) {
                temp = arr[i];
                result = i;
            }
        }
        return result;
    }

    public int minat(int[] arr) {
        // 第七题用
        // 返回数组中最小的第一个数的下标
        int i;
        int temp = arr[0], result = 0;
        for (i = 1; i < arr.length; ++i) {
            if (temp > arr[i]) {
                temp = arr[i];
                result = i;
            }
        }
        return result;
    }

    public void printarray(int[] arr) {
        // 从头到尾输出数组并回车
        int i;
        for (i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}

public class c1_5 {

    public static void main(String[] args) {
        int[] arr;
        int temp;
        arraymanage ss = new arraymanage();// 数组管理

        arr = ss.generate_random_arr_of_size(15);
        System.out.print("原数组:");
        ss.printarray(arr);

        ss.sort_as_Ascendin(arr);
        System.out.print("升序排序后的原数组:");
        ss.printarray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要插入的整形数字：");
        temp = sc.nextInt();
        ss.insert(arr, temp);

        System.out.print("插入后的数组:");
        ss.printarray(arr);

        sc.close();
    }

}