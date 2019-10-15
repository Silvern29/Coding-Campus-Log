package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();

        stringList.add("Kartoffelsalat");
        stringList.add("mit");
        stringList.add("Mayonnaise");

        for (String el : stringList) {
            System.out.print(el + " ");
        }
    }
}
