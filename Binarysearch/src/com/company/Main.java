package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int c = 0;
        int[] arr = {1, 5, 7, 9, 17, 18, 19, 30, 31};
        int target = 7;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        if (ans == -1) {
            System.out.println("not found");
        }

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;



        }
    }


