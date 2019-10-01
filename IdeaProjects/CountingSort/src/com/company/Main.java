package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int maxNum = 1000000000;
        int count = 1000000000;

        int[] start = new int[count];
        for (int i = 0; i < start.length; i++) {
            start[i] = (int) Math.floor(Math.random()*maxNum);
        }
        System.out.println(Arrays.toString(start));

        int maxConfirmed = start[0];
        for(int i = 0; i < start.length; i++) {
            if(start[i] > maxConfirmed) {
                maxConfirmed = start[i];
            }
        }

        int[] countArr = new int[maxConfirmed+1];
        for (int i = 0; i < start.length; i++) {
            countArr[start[i]]++;
        }
        System.out.println(Arrays.toString(countArr));

        for (int i = 1; i < countArr.length; i++) {
             countArr[i] += countArr[i-1];
        }
        System.out.println(Arrays.toString(countArr));

        int[] finalArr = new int[count];
        for (int i = start.length - 1; i >= 0; i--){
            finalArr[countArr[start[i]]-1] = start[i];
            countArr[start[i]]--;
        }
        System.out.println(Arrays.toString(finalArr));
    }
}
