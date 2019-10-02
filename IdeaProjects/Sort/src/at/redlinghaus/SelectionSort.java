package at.redlinghaus;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSorting(int[] sort) {
        int minIndex = Integer.MAX_VALUE;
        for(int j = 0; j < sort.length; j++) {
            minIndex = j;
            for (int i = j+1; i < sort.length; i++) {
                if(sort[i] < sort[minIndex]) {
                    minIndex = i;
                }
            }
            int tmp = sort[j];
            sort[j] = sort[minIndex];
            sort[minIndex] = tmp;
        }
        return sort;
    }
}
