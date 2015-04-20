/*
 * Calculator
 * CSE1102 Project 3, Spring 2013
 * William Dickson
 * 2/6/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: This program runs a calculator that takes an
 * accumulator value (starting at zero) and adds, subtracts, multiplies
 * and divides the number according to the user's input.
 */

import java.util.Scanner;


public class Calculator{

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// create a Scanner object named sc
		Scanner sc = new Scanner(System.in);
		boolean contin = true;
		double accumulator = 0.0;
		double input;
		while(contin){
			System.out.printf("Accumulator = ");
			System.out.println(accumulator);
			System.out.println("Please choose one of the following options:");
			System.out.println("0) Exit");
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Square root");
			System.out.println("6) Clear");
			int choice;
			System.out.printf("What is your choice? ");
			choice = sc.nextInt();
			if(choice == 0){
				contin = false;
			}else if(choice == 1){
				// do addition
				System.out.printf("Enter a number: ");
				input = sc.nextFloat();
				accumulator += input;
			}else if(choice == 2){
				// do subtraction
				System.out.printf("Enter a number: ");
				input = sc.nextFloat();
				accumulator = accumulator - input;
			}else if(choice == 3){
				// do multiplication
				System.out.printf("Enter a number: ");
				input = sc.nextFloat();
				accumulator = accumulator * input;
			}else if(choice == 4){
				// do division
				System.out.printf("Enter a number: ");
				input = sc.nextFloat();
				accumulator = accumulator / input;
			}else if(choice == 5){
				// do square root
				accumulator = Math.sqrt(accumulator);
			}else if(choice == 6){
				// clear
				accumulator = 0;
			}else{
				System.out.println("Illegal Operation: " + choice);
			}
		}
		sc.close();
	}

}
