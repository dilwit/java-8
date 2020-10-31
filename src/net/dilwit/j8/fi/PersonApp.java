package net.dilwit.j8.fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import net.dilwit.j8.fi.person.Person;

public class PersonApp {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Daniel", "Hardman"));
        list.add(new Person("Jessica", "Pearson"));
        list.add(new Person("Harvey", "Sepctre"));
        list.add(new Person("Levis", "Litt"));
        list.add(new Person("Jeff", "Maloon"));

        System.out.println("=== In OOP style ===");
        sortInOOPStyle(list);
        printInOOPStyle(list);
        printWithConditionInOOPStyle(list);

        System.out.println("=== In Lambda style ===");
        sortInLambdaStyle(list);
        printInLambdaStyle(list);
        printWithConditionInLambdaStyle(list);
        print(list, (p) -> p.getFirstName().startsWith("J"), (p) -> System.out.println(p.getFirstName()));
        print(list, (p) -> true, (p) -> System.out.println(p.getLastName()));
    }

    private static void print(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
        list.forEach((p) -> {
            if (predicate.test(p))
                consumer.accept(p);
        });
    }

    private static void printWithConditionInLambdaStyle(List<Person> list) {
        list.forEach((p) -> {
            if (p.getFirstName().startsWith("J"))
                System.out.println(p.getFirstName());
        });
    }

    private static void sortInLambdaStyle(List<Person> list) {
        Collections.sort(list, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
    }

    private static void printInLambdaStyle(List<Person> list) {
        list.forEach((p) -> System.out.println(p.getFirstName()));
    }

    private static void printWithConditionInOOPStyle(List<Person> list) {
        // Print only name starting with 'J'
        for (Person p : list) {
            if (p.getFirstName().startsWith("J"))
                System.out.println(p.getFirstName() + " : " + p.getLastName());
        }
    }

    private static void printInOOPStyle(List<Person> list) {
        // Print list
        for (Person p : list)
            System.out.println(p.getFirstName() + " : " + p.getLastName());
    }

    private static void sortInOOPStyle(List<Person> list) {
        // Sort list by first name, asc
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }
}
