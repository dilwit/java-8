package net.dilwit.j8.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Streammm {

    public static void createNewStream() {

        System.out.println("createNewStream");
        Stream.of("Alex", "Mark", "Julian", "Andrew").forEach(n -> System.out.println(n.toUpperCase()));

        System.out.println("createNewStream - From array");
        Stream.of(new String [] {"Alex", "Mark", "Julian", "Andrew"}).forEach(n -> System.out.println(n.toUpperCase()));

        System.out.println("createNewStream - From List");
        Arrays.asList("Alex", "Mark", "Julian", "Andrew").stream().map(n -> n.toUpperCase()).forEach(System.out::println);

        System.out.println("createNewStream - Auto Generator");
        Stream.generate(() -> new Random()).limit(10).map(r -> r.nextInt()).forEach(System.out::println);
    }
}
