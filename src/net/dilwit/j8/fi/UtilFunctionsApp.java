package net.dilwit.j8.fi;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class UtilFunctionsApp {

	public static void main(String[] args) {		
		biConsumer("hello", 1, (s, i) -> System.out.println(s + i));
		biFunction();
		binaryOperator();
	}

	private static void biConsumer(String text, Integer number, BiConsumer<String, Integer> biConsumer) {
		System.out.println("=== biConsumer ===");
		biConsumer.accept(text, number);
		BiConsumer<String, String> newBiConsumer = (s1, s2) -> System.out.println(s1.concat(s2));
		newBiConsumer.accept("hey", "dee ho");
		newBiConsumer.andThen((s1, s2) -> System.out.println("and then -> " + s1 + " : " + s2)).accept("yo", "gabba");
	}
	
	private static void biFunction() {
		System.out.println("=== biFunction ===");
		BiFunction<Integer, Integer, String> biFunction = (i1, i2) -> {
			Integer result = new Integer(i1 + i2);
			return String.valueOf(result);
		};		
		
		System.out.println(biFunction.apply(2, 3));
		
		BiFunction<DomainModel, DomainModel, String> biFunction2 = (d1, d2) -> d1.getName().concat(d2.getName());
		System.out.println(biFunction2.apply(new DomainModel(1, "A"), new DomainModel(2, "B")));
	}	
	
	private static void binaryOperator() {
		System.out.println("=== binaryOperator ===");
		BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
		System.out.println(binaryOperator.apply("La", "Laa"));
	}
}


class DomainModel {
	
	private int id;
	private String name;
			
	public DomainModel(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	@Override
	public String toString() {
		return getId() + " : " + getName();
	}
}