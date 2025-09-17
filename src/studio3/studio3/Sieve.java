package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int p = 2;
        for (int i = 2 * p; i <= n; i = i + p) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
