package at.redlinghaus;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int maxNum = 10; // Größte Zahl im Array +1
        int count = 10; // Größe des Arrays
        int[] start;

        MyArray arr = new MyArray();

        //Calling bubble sort method
        BubbleSort bubble = new BubbleSort();
        System.out.printf("%nBubble Sort%n------------%n");
        start = arr.newSortArray(maxNum, count);
        start = bubble.bubbleSorting(start);
        arr.printArray(start);

        //Calling selection sort method
        SelectionSort select = new SelectionSort();
        System.out.printf("%nSelection Sort%n---------------%n");
        start = arr.newSortArray(maxNum, count);
        start = select.selectionSorting(start);
        arr.printArray(start);

        //Calling counting sort method
        CountingSort countSort = new CountingSort();
        System.out.printf("%nCounting Sort%n--------------%n");
        start = arr.newSortArray(maxNum, count);
        start = countSort.countingSorting(start);
        arr.printArray(start);
    }
}
