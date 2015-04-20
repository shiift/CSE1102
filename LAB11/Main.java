/*
 * Lab 11: Hash Tables
 * CSE1102 Spring 2013
 * William S. Dickson
 * 4/24/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: Create a hash table/linked list manually
 */

public class Main {

	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.add("Henry", 192897235);
		ht.add("y", 200);
		ht.add("z", 300);
		ht.add("q", 400);
		System.out.println("Initial Size:");
		ht.dump();
		ht._increaseTableSize();
		System.out.println("\nIncreased Size:");
		ht.dump();
		System.out.println("\ntoString Printed:\n" + ht);
	}

}
