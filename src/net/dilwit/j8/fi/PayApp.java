package net.dilwit.j8.fi;

import net.dilwit.j8.fi.oop.pay.PayByCheque;
import net.dilwit.j8.fi.oop.pay.PayByCreditCard;
import net.dilwit.j8.fi.pay.PaymentGateway;

public class PayApp {

	public static void main(String[] args) {		
		System.out.println("=== In OOP style ===");
		payInOOPStyle();
		System.out.println("=== In Lambda style ===");
		payInFunctionalStyle();
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
