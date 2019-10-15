package at.redlinghaus;

import java.util.Arrays;

public class Stack {
    public int stackIndex;
    int[] stack;

    public Stack(int length){
        this.stack = new int[length];
        this.stackIndex = 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackIndex=" + stackIndex +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

    public void push(int value) {
        this.stack[stackIndex] = value;
        stackIndex++;
    }

    public int pop() {
        return this.stack[--stackIndex];
    }

    public int top() {
        return this.stack[stackIndex - 1];
    }

    public boolean isEmpty(){
        return stackIndex - 1 < 0;
    }
}
