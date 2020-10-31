package net.dilwit.j8.foreach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEach {

    private static List<String> nameList;
    private static Map<String, String> nameAgeMap = new HashMap();

    static {
        nameList = Arrays.asList("Alex", "Brian", "Charles", "Andrew");
        nameAgeMap.put("Alex", "15");
        nameAgeMap.put("Brian", "21");
        nameAgeMap.put("Charles", "32");
        nameAgeMap.put("Andrew", "5");
    }

    public static void forEachSimple() {
        System.out.println("forEachSimple - List");
        nameList.forEach(l -> System.out.println(l));

        System.out.println("forEachSimple - Map");
        nameAgeMap.forEach((k,v) -> System.out.println(k + v));
    }

    public static void forEachWithProvidedConsumer() {
        System.out.println("forEachWithProvidedConsumer - List");
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        nameList.forEach(consumer);

        System.out.println("forEachWithProvidedConsumer - Map");
        BiConsumer<String, String> biConsumer = (n, a) -> System.out.println(n.toUpperCase() + a);
        nameAgeMap.forEach(biConsumer);
    }

    public static void forEachWithStream() {
        // forEach is terminal operations so that data can not be streamed for further processing

        System.out.println("forEachWithStream - List");
        nameList.stream().filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n.toUpperCase()));

        System.out.println("forEachWithStream - Map");
        nameAgeMap.entrySet().stream().filter(e -> e.getKey().startsWith("A")).forEach(e -> System.out.println(e.getKey() + e.getValue()));
    }
}
