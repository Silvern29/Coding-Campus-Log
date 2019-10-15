package at.redlinghaus;


import java.util.Arrays;

public class MyArray {
    public int[] newSortArray(int maxNum, int count){
        int[] sort = new int[count];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = (int) Math.floor(Math.random()*maxNum);
        }

        System.out.printf("Unsortiertes Array: | ");
        for (int i = 0; i < sort.length; i++) {
            System.out.printf("%2d  | ", sort[i]);
        }
        System.out.println();
        return sort;
    }

    public void printArray(int[] Arr) {
        System.out.printf("Sortiertes Array:   | ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.printf("%2d  | ", Arr[i]);
        }
        System.out.println();
    }
}
