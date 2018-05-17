package net.dilwit.j8.fi.oop.pay;

import net.dilwit.j8.fi.pay.PaymentGateway;

public class PayByCreditCard implements PaymentGateway {

	@Override
	public void pay() {
		System.out.println("Paid by cheque (OOP way)");
	}	

}
