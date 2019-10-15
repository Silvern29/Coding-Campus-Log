package at.redlinghaus;

public class Calculator {
    public int getSmallestNum(int[] array) {
        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
            }
        }
        return smallestNum;
    }

    public double avgNum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public int sumNums(int num1, int num2) {
        return num1 + num2;
    }
}
