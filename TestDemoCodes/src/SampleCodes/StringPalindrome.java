package SampleCodes;

import java.util.*;

public class StringPalindrome {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String enteredString = s.next();
		String palindrome = "";
		for(int i=enteredString.length()-1; i>=0; i--) {
			palindrome += enteredString.charAt(i);
		}
		System.out.println(palindrome);
		if (palindrome.equals(enteredString)) {
			System.out.println("Entered String is palindrome");
		}
		else
			System.out.println("Entered String is not palindrome");
	}

}
