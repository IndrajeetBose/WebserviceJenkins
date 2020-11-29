package SampleCodes;

import java.util.*;


public class StringAnagramPractice {
	public static void main(String []args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String firstString = s1.nextLine();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter another sentence: ");
		String secondString = s2.nextLine();
		String copyFirstString = firstString.replace("\s", "").toLowerCase();
		String copySecondString = secondString.replace("\s", "").toLowerCase();
		
		ArrayList al1 = new ArrayList();
		for(int i=0; i<copyFirstString.length(); i++) {
			al1.add(copyFirstString.charAt(i));
		}
		
		ArrayList al2 = new ArrayList();
		for(int i=0; i<copySecondString.length(); i++) {
			al2.add(copySecondString.charAt(i));
		}
		
		TreeSet ts1 = new TreeSet();
		ts1.addAll(al1);
		
		TreeSet ts2 = new TreeSet<>();
		ts2.addAll(al2);
		
		System.out.println(ts1);
		System.out.println(ts2);
		
		if(ts1.toString().equals(ts2.toString()))
			System.out.println("Anagram Sentence");
		else
			System.out.println("Not Anagram");
			
	}

}
