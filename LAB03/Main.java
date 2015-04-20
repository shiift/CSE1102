/*
 * Calculator
 * CSE1102 Lab 3, Spring 2013
 * William Dickson
 * 2/13/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: This program changes the password of the bank
 * account and then shows the balance of the bank account.
 */

public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.changePassword();
		ba.showBalance();
		ba.setBalance(ba.getBalance() + 100);
		ba.showBalance();
		ba.closeScanner();
	}

}
