package c1;

// 有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
public class c1_3 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int sum = 0, count = 0;
        for (i = 1; i <= 4; ++i) {
            for (j = 1; j <= 4; ++j) {
                for (k = 1; k <= 4; ++k) {
                    if (i != j && i != k && j != k) {
                        count++;
                        sum = 0;
                        sum += i * 100 + j * 10 + k;
                        System.out.print(sum + " ");
                        if (count % 7 == 0)
                            System.out.println();
                    }
                }
            }
        }
        if (count % 7 != 0)
            System.out.println();
        System.out.println("一共有" + count + "个不同的三位数");
    }

}