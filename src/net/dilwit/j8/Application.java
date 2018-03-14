package net.dilwit.j8;

public class Application {

	public static void main(String[] args) {
		
		// Functional interface
		// Long way
		SimpleFunctionalInterface si = new SimpleFunctionalInterface() {
			
			@Override
			public void doSomething() {
				System.out.println("doSomething 1st");
			}
		};
		
		si.doSomething();
		si.doSecondThing();
		si.doThridThing();
		
		// Easy way
		SimpleFunctionalInterface si2 = () -> System.out.println("doSomething 2nd");
		
		si2.doSomething();
		si2.doSecondThing();
		si2.doThridThing();
	}

}
