package net.dilwit.j8.oop;

public class PayByCheque implements PaymentGateway {

	@Override
	public void pay() {
		System.out.println("Paid by credit card (OOP way)");
	}	

}
