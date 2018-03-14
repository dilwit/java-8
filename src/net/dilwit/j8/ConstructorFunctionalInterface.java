package net.dilwit.j8;

import net.dilwit.j8.supporting.My;

@FunctionalInterface
public interface ConstructorFunctionalInterface {

	My create(String firstName, String lastName);
}
