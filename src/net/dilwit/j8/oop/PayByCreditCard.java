package net.dilwit.j8.oop;

public class PayByCreditCard implements PaymentGateway {

	@Override
	public void pay() {
		System.out.println("Paid by cheque (OOP way)");
	}	

}
