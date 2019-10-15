package at.redlinghaus;

public class BubbleSort {
    public int[] bubbleSorting(int[] sort) {
        for (int i = 0; i < sort.length-1; i++) {
            for (int j = i; j < sort.length; j++) {
                if (sort[i] > sort[j]) {
                    int tmp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = tmp;
                }
            }
        }
        return sort;
    }
}
