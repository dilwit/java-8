package net.dilwit.j8.fi.oop.pay;

import net.dilwit.j8.fi.pay.PaymentGateway;

public class PayByCheque implements PaymentGateway {

	@Override
	public void pay() {
		System.out.println("Paid by credit card (OOP way)");
	}	

}
