package com.campusdual.collections;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> instruments = new Stack<>();

        instruments.push("Guitar");
        instruments.push("Piano");
        instruments.push("Drums");
        instruments.push("Violin");

        String removedItem = instruments.pop();
        System.out.println("Removed intrument: " + removedItem);

        String peekedItem = instruments.pop();
        System.out.println("Removed intrument: " + peekedItem);
    }
}
