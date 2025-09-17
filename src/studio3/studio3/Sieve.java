package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        System.out.print("Check sieve up to: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int p = 2; p <= n; p++) {
            System.out.println("Checking " + p);
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    System.out.println("Not Prime: " + i);
                    isPrime[i] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                count++;
        }

        int[] primes = new int[count];
        int index = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                primes[index++] = i;
        }

        System.out.println(Arrays.toString(primes).replace("[", "").replace("]", ""));
    }
}
