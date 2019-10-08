package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        int[] puzzle = {1,3,5,4,2};
        Stack mystack = new Stack(input.length);

        mystack.push(input[0]);
        mystack.push(input[1]);
        mystack.push(input[2]);
        mystack.push(input[3]);

        mystack.pop();

        System.out.println(mystack);
    }
}
