package net.dilwit.j8;

@FunctionalInterface
public interface GenericFunctionalInterface<F, T> {

	T add(F one, F two);
	
}
