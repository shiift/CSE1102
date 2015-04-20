public class Card {
	private int ident;
	public Card(int ident) {
		// ident is in the range 0 - 51
		this.ident = ident;
	}
	public int value() {
		return ident / 4;
	}
	public int suit() {
		return ident % 4;
	}
	public int compare(Card c) {
		int value1 = ident / 4;
		int value2 = c.ident / 4;
		if(value1 < value2)
			return -1;
		if(value1 == value2)
			return 0;
		return 1;
	}
	public String toString() {
		int value = ident / 4;
		int suit = ident % 4;
		String s = "";
		// 0 1 2 3 4 5 6 7 8 9 10 11 12
		// 2 3 4 5 6 7 8 9 10 J Q K A
		if(value < 9) s += value + 2;
		else if(value == 9) s += "J";
		else if(value == 10) s += "Q";
		else if(value == 11) s += "K";
		else s += "A";
		switch(suit) {
		case 0:
			s += "H";
			break;
		case 1:
			s += "C";
			break;
		case 2:
			s += "D";
			break;
		default:
			s += "S";
		}
		return s;
	}
}