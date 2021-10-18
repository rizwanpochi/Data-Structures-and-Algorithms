package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter any number");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isArmsrtrong(n);
        System.out.println(ans);


    }

    static boolean isArmsrtrong(int n) {
        int orignal;
        orignal = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum =  sum + rem*rem*rem;

        }
        return sum == orignal;
    }
}