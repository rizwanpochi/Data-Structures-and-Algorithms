package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter any number");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
            if (i * i > n) {
                return true;
            }


        }
        return false;
    }
}