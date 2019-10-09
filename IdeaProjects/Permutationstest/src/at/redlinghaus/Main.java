package at.redlinghaus;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] puzzle = {1, 3, 5, 4, 2};
        Stack mystack = new Stack(arr.length);

        int j = 0;
        boolean isEqual = false;
        for (int i = 0; i < arr.length; i++) {
            mystack.push(arr[i]);
            isEqual = mystack.top() == puzzle[j];
            while (isEqual) {
                arr[j] = mystack.pop();
                j++;
                if (j < 5) {
                    isEqual = !mystack.isEmpty() && mystack.top() == puzzle[j];
                } else {
                    isEqual = false;
                }
            }
        }

        if(mystack.isEmpty()){
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println(Arrays.toString(arr));
            System.out.println("is not possible!");
        }
    }
}
