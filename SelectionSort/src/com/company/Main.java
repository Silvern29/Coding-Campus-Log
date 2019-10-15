package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int maxNum = 10;
        int count = 10;

        int[] start = new int[count];
        for (int i = 0; i < start.length; i++) {
            start[i] = (int) Math.floor(Math.random()*maxNum);
        }
        System.out.println(Arrays.toString(start));

        int minIndex = Integer.MAX_VALUE;
        for(int j = 0; j < start.length; j++) {
            minIndex = j;
            for (int i = j+1; i < start.length; i++) {
                if(start[i] < start[minIndex]) {
                    minIndex = i;
                }
            }
            int tmp = start[j];
            start[j] = start[minIndex];
            start[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(start));
    }
}

