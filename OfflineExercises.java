package code;

import java.*;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
	String output = "";
	char[] array = input.toCharArray();
	for (int i = 0; i<array.length; i++) {
		output = output + array[i];
		output = output + array[i];
	}
		return output;
	
		
	}
	

	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		String wordBuilder = "";
		String finalWord = "";
		char[] array = input.toCharArray();
		for (int i = 0; i<array.length; i++) {
			wordBuilder = wordBuilder + array[i];
			if (wordBuilder.contains("bread")); {
			wordBuilder = ("");
			}
			if (wordBuilder.contains("jam")) {
			finalWord = finalWord + wordBuilder;
			System.out.println(finalWord);
			}
			if (wordBuilder.contains("xx")) {
			wordBuilder = ("");
			}
			if (wordBuilder.contains("yy")) {
			wordBuilder = ("");
			}
		}
		return finalWord;
		}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		int one = Math.abs(a-b); 
		int two = Math.abs(b-c);
		int three = Math.abs(c-a);
		//One is the middle value of evenly spaced numbers
		if (one == two) { 
			return true;
		}
		//Two is the middle value of evenly spaced numbers
		else if (two == three) {
			return true;
		}
		//Three is the middle value of evenly spaced numbers 
		else if (three == one) {
			return true;
		}
			
		 else {
			return false;
		}
		
	
	}
	

	

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String word = "";
		//Start of word
		for (int i = 0; i<a; i++) { 
			word = word + input.charAt(i);
		}
		//End of word
		for (int i = input.length() - a; i<input.length(); i++) {
			word = word + input.charAt(i);
		}
		return word;	
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {

		String ly = "ly";
		if (input.endsWith(ly)) {
			return true;
		} else {
			return false;
		}
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		String word = "";
		word = word + input.charAt(0);
		for (int i=1; i<input.length(); i++) {
			if (input.charAt(i) != input.charAt(i-1)) {
				word = word + input.charAt(i); 
			}
		}
			
		return word;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		int a = 1;
		if (input == 0) {
		return 0;
		}
		if (input == 1 | input == 2) {
		return 1;
		} else {
			for (int i = 2; i<input; i++);
			a=a+a;
			
		}
		return a;
		
		
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		return -1;
	}

}
