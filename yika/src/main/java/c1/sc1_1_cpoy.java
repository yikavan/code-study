package c1;

import java.util.Scanner;

class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) { // to ensure m<=n
            int[] temp = A;
            A = B;
            B = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j - 1] > A[i]) {
                iMin = iMin + 1; // i is too small
            } else if (i > iMin && A[i - 1] > B[j]) {
                iMax = iMax - 1; // i is too big
            } else { // i is perfect
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}

public class sc1_1_cpoy {
    public static void main(String[] args) {
            int[] a = new int[5], b = new int[3];
            int m,n;
            int i;
            Scanner sc = new Scanner(System.in);
            Solution ss = new Solution();
            System.out.println("输入m,n:");
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println("输入a[m]:");
            for (i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("输入b[n]:");
            for (i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(ss.findMedianSortedArrays(a,b));
            sc.close();
    }

}