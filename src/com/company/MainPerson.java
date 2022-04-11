package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Kiro", 20));
        personArrayList.add(new Person("Asen", 25));
        personArrayList.add(new Person("Krasi", 30));
        personArrayList.add(new Person("Tom", 20));

        System.out.println(getAverageAge(personArrayList));

        System.out.println(getYoungestPerson(personArrayList));
        System.out.println(Arrays.toString(getYoungestPersons(personArrayList).toArray()));

    }

    public static ArrayList<Person> getYoungestPersons(Collection<Person> personsList) {
        Person tempPerson = new Person("tempPerson", Integer.MAX_VALUE);
        ArrayList<Person> personArrayList1 = new ArrayList<>();
        for (Person person : personsList) {
            if (person.getAge() <= tempPerson.getAge()) {
                tempPerson = person;
                personArrayList1.add(person);
            }
        }
        return personArrayList1;
    }

    public static Person getYoungestPerson(Collection<Person> personArrayList) {
        Person tempPerson = new Person("tempPerson", Integer.MAX_VALUE);
        for (Person person : personArrayList) {
            if (person.getAge() < tempPerson.getAge()) {
                tempPerson = person;
            }
        }
        return tempPerson;
    }

    public static double getAverageAge(ArrayList<Person> personArrayList) {
        double result = 0;
        for (Person person : personArrayList) {
            result += person.getAge();
        }
        return result / personArrayList.size();
    }
}
