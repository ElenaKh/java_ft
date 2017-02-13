package ru.stqa.pft.sandbox;

/**
 * Created by Elena on 2/12/2017.
 */
public class Primes {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i = i + 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
