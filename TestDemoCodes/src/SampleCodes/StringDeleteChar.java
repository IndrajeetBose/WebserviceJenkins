package SampleCodes;

import java.util.*;

public class StringDeleteChar {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String enteredString = s.next();
		StringBuilder sb = new StringBuilder(enteredString);
		System.out.println("Enter index to be deleted ");
		int x = s.nextInt();
		sb.deleteCharAt(x);
		System.out.println("Entered String "+enteredString);
		System.out.println("String after deletion "+sb);
	}

}
