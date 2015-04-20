/*
 * Description: This program manages the bank account methods.
 * You can change the password and view the bank account balance.
 */

import java.util.Scanner;


public class BankAccount {

	private int _balance = 0;
	private String _password = "secret";
	Scanner _kbd;
	
	public void showBalance() {
	// Description: prints the current balance
		System.out.println("The balance is " + getBalance());
	}
	
	public boolean checkPassword() {
	// Description: checks the password and returns true if it correct or false if it is incorrect
		_kbd = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String guess = _kbd.nextLine();
		if (guess.equals(_password)){
			System.out.println("Password Correct");
			return true;
		}else{
			System.out.println("Password Incorrect");
			return false;
		}
	}

	public int getBalance() {
	// Description: returns the balance (so that it can be accessed by an external class
		return _balance;
	}

	public void setBalance(int _balance) {
	// Description: checks for a correct password and sets the instance _balance equal to _balance
	// if the password is correct
		if(checkPassword()) {
			this._balance = _balance;
		}
	}
	
	public void changePassword() {
	// Description: checks for a correct password and allows the user to set a new password if the
	// password is correct
		if(checkPassword()) {
			_kbd = new Scanner(System.in);
			System.out.print("Enter a new password: ");
			_password = _kbd.nextLine();
		}
	}
	
	public void closeScanner() {
	// Description: closes the Scanner for the program when called
		_kbd.close();
	}

}
