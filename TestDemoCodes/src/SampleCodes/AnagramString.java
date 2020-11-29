package SampleCodes;

import java.util.*;

public class AnagramString {

	public static void anagramCheck(String s1, String s2) {

		String copyS1 = s1.replace("\s", "").toLowerCase();
		String copyS2 = s2.replace("\s", "").toLowerCase();

		System.out.println(copyS1.length());
		System.out.println(copyS2.length());
		int first = copyS1.length();
		int second = copyS2.length();

		if (first == second) {
			ArrayList al = new ArrayList();
			for (int i = 0; i < copyS1.length(); i++) {
				al.add(copyS1.charAt(i));
			}

			ArrayList al2 = new ArrayList();
			for (int i = 0; i < copyS2.length(); i++) {
				al2.add(copyS2.charAt(i));
			}

			TreeSet ts1 = new TreeSet(new MyComparator7());
			ts1.addAll(al);

			TreeSet ts2 = new TreeSet(new MyComparator7());
			ts2.addAll(al2);

			System.out.println(ts1);
			System.out.println(ts2);

			if (ts1.toString().equals(ts2.toString())) {
				System.out.println("Its an Anagram Sentence");

			}
		}
		else
			System.out.println("Not Anagram");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s1 = s.nextLine();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Another Sentence: ");
		String s2 = sc.nextLine();

		anagramCheck(s1, s2);
	}

}

class MyComparator7 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
