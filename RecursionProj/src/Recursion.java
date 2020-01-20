/*
 * Rosnel Leyva and Tory Hansen 
 * 
 */

import java.util.ArrayList;

import acm.program.*;

public class recursionset extends ConsoleProgram {

	// serial ID
	private static final long serialVersionUID = 1L;


	// Problem 1
	private String ReverseString(String str) {
		if (str.length() == 1) {
			return str;
		}
		return (ReverseString(str.substring(1)) + str.substring(0, 1));
	}

	// Problem 2
	private int SumOfDigits(int x) {

		if (x < 10) {
			return x;
		} else {
			 return((x%10) + (SumOfDigits(x/10)));
		}
	}

	// problem 3
	private void printInBinary(int number) {
		if (number < 2) {
			print(number);
		} else {
			printInBinary(number/2);
			print(number % 2);
		}
	}

	// problem 4
	private int GCD(int x, int y) {
		if (x % y == 0) {
			return y;
		} else {
			return GCD(y, x%y);
		}

	}
	
	//problem 6 
	
	 private static void towersHanoi(int n, String one , String two, String three) {
	        if (n == 0) {
	        	return;
	        } else if((n > 0)) { 
	        towersHanoi(n-1, one, two, three);
	        System.out.print(" Move one disk from pole " + one + " to pole " + two); 
	        towersHanoi(n-1, three, one, two);
	        }
	    }

	// problem 5
//	private boolean Solvable(int start, ArrayList<Integer> squares) {
//		if (squares.get(start) < squares.get(start)) {
//			return true;
//		} else {
//			start++;
//			Solvable(start, squares);
//		}
//		return false;
//	}

	// testing problem outputs
	public void run() { 
		
		//Uncomment to test output 
		
		//println(ReverseString("string"));
		//println(SumOfDigits(15704));
		//printInBinary(35);
		//println(GCD(1000, 999));
		// println(Solvable(0, squares));
		towersHanoi(3,"1","2","3");
	}

	//private ArrayList<Integer> squares = new ArrayList<Integer>();
}
