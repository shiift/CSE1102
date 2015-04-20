/*
 * Lab 08: Cards
 * CSE1102 Spring 2013
 * William S. Dickson
 * 4/03/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: Create a deck of cards, shuffle it and deal it
 */

import java.util.Arrays;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
	// creates the deck of cards, shuffles it, and deals the cards to the players
		Card[] deck = new Card[52];
		for(int i = 0;i<deck.length;i++){	
			deck[i] = new Card(i);
		}
		shuffle(deck);
		Card[][] activeCards = deal(deck,4,4);
		for(Card[] hand : activeCards){
			System.out.println(Arrays.toString(hand));
		}
	}
	
	public static void shuffle(Card[] deck){
	// shuffle the deck of cards
		Random r = new Random();
		for(int i = 0;i<deck.length;i++){
			int swapCard = r.nextInt(52);
			Card temp = deck[i];
			deck[i] = deck[swapCard];
			deck[swapCard] = temp;
		}
	}
	
	public static Card[][] deal(Card[] deck, int hands, int cardsPerHand){
	// deal the cards to the 'table' (activeCards)
		Card[][] activeCards = new Card[hands][cardsPerHand];
		int count = 0;
		for(int i = 0;i<cardsPerHand;i++){
			for(int n = 0;n<hands;n++){
				activeCards[n][i] = deck[count];
				count++;
			}
		}
		return activeCards;
	}

}
