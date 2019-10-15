package at.redlinghaus;

import java.util.Arrays;

public class CountingSort {
    public int[] countingSorting(int[] sort) {
        int maxConfirmed = sort[0];
        for(int i = 0; i < sort.length; i++) {
            if(sort[i] > maxConfirmed) {
                maxConfirmed = sort[i];
            }
        }

        int[] countArr = new int[maxConfirmed+1];
        for (int i = 0; i < sort.length; i++) {
            countArr[sort[i]]++;
        }
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i-1];
        }

        int[] finalArr = new int[sort.length];
        for (int i = sort.length - 1; i >= 0; i--){
            finalArr[countArr[sort[i]]-1] = sort[i];
            countArr[sort[i]]--;
        }
        return finalArr;
    }
}
