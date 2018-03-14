package net.dilwit.j8;

@FunctionalInterface
public interface SimpleFunctionalInterface {

	// Can have ONLY ONE abstract method.
	void doSomething();
	
	// Can not have second abstract method, compiler will complain
	//void doOneMoreThing();
	
	// Could have default as it come with implementation.
	default void doSecondThing() {
		System.out.println("Execute doSecondThing()");
	}
	
	default void doThridThing() {
		System.out.println("Execute doThridThing()");
	}
	
	// And you could still override any method from java Object class
	@Override
	public String toString();
	
	@Override
	public boolean equals(Object obj);
	
}
