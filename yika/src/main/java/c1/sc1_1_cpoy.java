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
        int l = 0, r = m, mid = (m + n + 1) / 2;
        while (l <= r) {
            int mida = (l + r) / 2;
            int j = mid - mida;
            if (mida < r && B[j - 1] > A[mida]) {
                l = l + 1; // mida is too small
            } else if (mida > l && A[mida - 1] > B[j]) {
                r = r - 1; // mida is too big
            } else { // mida is perfect
                int maxLeft = 0;
                if (mida == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[mida - 1];
                } else {
                    maxLeft = Math.max(A[mida - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (mida == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[mida];
                } else {
                    minRight = Math.min(B[j], A[mida]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}

public class sc1_1_cpoy {
    public static void main(String[] args) {
        int[] a, b;
        int m, n;
        int i;
        Scanner sc = new Scanner(System.in);
        Solution ss = new Solution();
        System.out.println("输入m,n:");
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[m];
        b = new int[n];
        System.out.println("输入a[m]:");
        for (i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("输入b[n]:");
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(ss.findMedianSortedArrays(a, b));
        sc.close();
    }

}