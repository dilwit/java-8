package net.dilwit.j8;

import net.dilwit.j8.supporting.My;
import net.dilwit.j8.supporting.MyService;
import net.dilwit.j8.supporting.MyUtil;

public class Application {

	public static void main(String[] args) {
		
		// Simple Functional interface
		// Provide your own logic
		SimpleFunctionalInterface si = new SimpleFunctionalInterface() {
			
			@Override
			public void doSomething() {
				System.out.println("doSomething 1st");
			}
		};
		
		si.doSomething();
		si.doSecondThing();
		si.doThridThing();
		
		// Provide your own logic -> short cut
		SimpleFunctionalInterface si2 = () -> System.out.println("doSomething 2nd");		
		si2.doSomething();
		
		// Pass static method
		SimpleFunctionalInterface si3 = MyUtil::whenIsToday;	
		si3.doSomething();
		
		// Pass instance method
		MyService myService = new MyService();
		SimpleFunctionalInterface si4 = myService::printServiceName;	
		si4.doSomething();
		
		
		// Constructor Functional interface
		// We create a reference to the Person constructor via My::new. The Java compiler automatically chooses the right constructor by matching the signature of ConstructorFunctionalInterface.create.
		ConstructorFunctionalInterface cf = My::new;
		My my = cf.create("My", "Name");
		System.out.println(my.toString());
	}
}
