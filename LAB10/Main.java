/*
 * Lab 10: Linked Lists
 * CSE1102 Spring 2013
 * William S. Dickson
 * 4/17/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: Create a Linked List and allow for adding, checking if the list contains values, and getting specific values from positions
 */

public class Main {

	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("apple", null);
		Node<String> n2 = new Node<String>("banana", n1);
		Node<String> n3 = new Node<String>("orange", n2);
		System.out.println(n1);
		System.out.println(n1.length());
		System.out.println(n2);
		System.out.println(n2.length());
		System.out.println(n3);
		System.out.println(n3.length());
		n3.append("pear");
		System.out.println(n3);
		System.out.println(n3.length());
		System.out.println(n3.contains("apple"));
		System.out.println(n3.contains("pear"));
		System.out.println(n3.contains("papaya"));
		System.out.println(n3.get(0));
		System.out.println(n3.get(3));
		System.out.println(n3.get(4));
	}

}
