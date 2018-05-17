package net.dilwit.j8.fi;

import net.dilwit.j8.fi.oop.pay.PayByCheque;
import net.dilwit.j8.fi.oop.pay.PayByCreditCard;
import net.dilwit.j8.fi.pay.PaymentGateway;
import net.dilwit.j8.fi.supporting.My;
import net.dilwit.j8.fi.supporting.MyService;
import net.dilwit.j8.fi.supporting.MyUtil;

public class FunctionalInterfaceApp {

	public static void main(String[] args) {
		
		payInOOPStyle();
		payInFunctionalStyle();
		otherFunctionalTryOuts();
	}

	private static void otherFunctionalTryOuts() {
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

	private static void payInFunctionalStyle() {
		PaymentGateway pg = () -> System.out.println("Pay by credit card (Functional way)");
		pg.pay();
		
		
		pg = () -> System.out.println("Pay by cheque (Functional way)");
		pg.pay();
		
		pg = () -> System.out.println("Pay by pay pal (Functional way)");
		payInFunctionalStyle(pg);
		
		payInFunctionalStyle(() -> System.out.println("Pay by amex (Functional way)")); 
		
		Runnable thread = () -> System.out.println("Run by thread (Functional way)");
		thread.run();
	}
	
	private static void payInFunctionalStyle(PaymentGateway pg) {
		pg.pay();
	}

	private static void payInOOPStyle() {
		PaymentGateway pg = new PayByCreditCard();
		pg.pay();
		
		pg = new PayByCheque();
		pg.pay();
		
		pg = new PaymentGateway() {

			@Override
			public void pay() {
				System.out.println("Pay by debit card (OOP way)");
			}
			
		};
		
		pg.pay();
		
		Runnable thread = new Runnable() {

			@Override
			public void run() {
				System.out.println("Run by thread (OOP way)");
			}
			
		};
		
		thread.run();
	}
}
