package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        /*ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Bananas");
        shoppingList.add("Bread");
        shoppingList.add("Milk");

        System.out.println(shoppingList.size());
        System.out.println(Arrays.toString(shoppingList.toArray()));
        System.out.println(shoppingList);

        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.indexOf("Milk"));

        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("Bread");
        removeList.add("Milk");

        shoppingList.removeAll(removeList);

        shoppingList.add("Milk");
        System.out.println(shoppingList);

        shoppingList.remove(1);
        System.out.println(shoppingList);

        shoppingList.add(1, "Apples");
        System.out.println(shoppingList);

        System.out.println(shoppingList.contains("Apples"));*/

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Green");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Black");


        System.out.println(colors);
        colors.add("Red");
        colors.add("Red");

        System.out.println("The Red color is on " +
                colors.indexOf("Red")+ " position");
        colors.remove("Orange");

        System.out.println("The Red color is on " +
                colors.indexOf("Red")+ " position");

        System.out.println(colors);

    }
}
