package com.company;

import java.util.ArrayList;

public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Kiro", 22));
        personArrayList.add(new Person("Asen", 44));
        personArrayList.add(new Person("Krasi", 18));

        System.out.println(getAverageAge(personArrayList));

    }

    static double getAverageAge(ArrayList<Person> personArrayList){
        double result = 0;
        for (Person person : personArrayList) {
            result += person.getAge();
        }
        return result / personArrayList.size();
    }
}
