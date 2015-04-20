/*
 * Laser Mirrors
 * CSE1102 Project 06, Spring 2013
 * William Dickson
 * 3/31/2013
 * TA: Samir Elsayed
 * Section: 003L
 * Instructor: Jeffrey A. Meunier
 * Help Received: None
 * Description: This program simulates the firing of a laser through a field of mirrors
 */

import java.util.Scanner;

public class Main {

	private static int _north = 0;
	private static int _east = 1;
	private static int _south = 2;
	private static int _west = 3;
	private static int _fireRow = -1;
	private static String[] _initStrings =
		{
		"...../...\\",
		"..\\.......",
		"......./..",
		"..........",
		"........\\.",
		"..........",
		"..........",
		".....\\../.",
		"..\\....../",
		".........."
		};
	private static char[][] _squares;
	private static Scanner _scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	// initializes the mirror field and fires laser
		initialize();
		show();
		System.out.print("Fire laser from row: ");
		_fireRow = _scan.nextInt();
		fire();
		show();
	}
	
	public static void initialize() {
	// converts the array of strings to a 2D array of characters
		_squares = new char[_initStrings.length][_initStrings[0].length()];
		for(int i = 0; i < _initStrings.length; i++){
			for(int n = 0; n < _initStrings[0].length(); n++){
				_squares[i][n] = _initStrings[i].charAt(n);
			}
		}
	}

	public static void show() {
	// displays the mirror field
		int row = 0;
		while(row < _squares.length){
			if (row != _fireRow){
				System.out.print(row + " ");
			}else{
				System.out.print(row + ">");
			}
			for(char i : _squares[row]){
				System.out.print(i);
			}
			System.out.print("\n");
			row++;
		}
	}
	
	public static void fire(){
	// fires the laser through the mirror field
		int dir = _east;
		int xLoc = 0;
		int yLoc = _fireRow;
		while(xLoc >= 0 && xLoc < _squares.length && yLoc >= 0 && yLoc < _squares[0].length){
			if(_squares[yLoc][xLoc] == '.'){
				if(dir == _north || dir == _south){
					_squares[yLoc][xLoc] = '|';
				}else{
					_squares[yLoc][xLoc] = '-';
				}
			}else if(_squares[yLoc][xLoc] == '/'){
				if(dir == _north){
					dir = _east;
				}else if(dir == _east){
					dir = _north;
				}else if(dir == _south){
					dir = _west;
				}else{
					dir = _south;
				}
			}else if(_squares[yLoc][xLoc] == '\\'){
				if(dir == _north){
					dir = _west;
				}else if(dir == _east){
					dir = _south;
				}else if(dir == _south){
					dir = _east;
				}else{
					dir = _north;
				}
			}else if(_squares[yLoc][xLoc] == '-'){
				if(dir == _north || dir == _south){
					_squares[yLoc][xLoc] = '+';
				}
			}else if(_squares[yLoc][xLoc] == '|'){
				if(dir == _east || dir == _west){
					_squares[yLoc][xLoc] = '+';
				}
			}else{
				System.out.println("\"" + _squares[yLoc][xLoc] + "\" is not a proper character");
				break;
			}
			if(dir == _north){
				yLoc -= 1;
			}else if(dir == _east){
				xLoc += 1;
			}else if(dir == _south){
				yLoc += 1;
			}else{
				xLoc -= 1;
			}
		}
	}

}