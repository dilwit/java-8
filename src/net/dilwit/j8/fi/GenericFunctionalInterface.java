package net.dilwit.j8.fi;

@FunctionalInterface
public interface GenericFunctionalInterface<F, T> {

	T add(F one, F two);
	
}
