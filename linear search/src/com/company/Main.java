package com.company;

import jdk.dynalink.beans.StaticClass;

public class Main {

    public static void main(String[] args) {

        int[] nums = {12, 43, 1, 85, 29, 92, 34, 11};
        int target = 34;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target)
                return index;


        }
        return -1;
    }

}

