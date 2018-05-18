package net.dilwit.j8.fi.fi;

@FunctionalInterface
public interface GenericFunctionalInterface<F, T> {

	T add(F one, F two);
	
}
