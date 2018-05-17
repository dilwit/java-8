package net.dilwit.j8.fi;

import net.dilwit.j8.fi.supporting.My;

@FunctionalInterface
public interface ConstructorFunctionalInterface {

	My create(String firstName, String lastName);
}
