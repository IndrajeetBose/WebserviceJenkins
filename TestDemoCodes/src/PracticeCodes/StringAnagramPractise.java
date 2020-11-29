package PracticeCodes;

import java.util.*;

public class StringAnagramPractise {

	public void validateAnagram(String sentence1, String sentence2) {
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();

		String sentence1Copy = sentence1.replace("\s", "").toLowerCase();
		String sentence2Copy = sentence2.replace("\s", "").toLowerCase();

		for (int i = 0; i < sentence1Copy.length(); i++) {
			al1.add(sentence1Copy.charAt(i));
		}

		for (int i = 0; i < sentence2Copy.length(); i++) {
			al2.add(sentence2Copy.charAt(i));
		}

		if (al1.size() == al2.size()) {
			TreeSet ts1 = new TreeSet(new ComperatorSort());
			TreeSet ts2 = new TreeSet(new ComperatorSort());
			ts1.addAll(al1);
			ts2.addAll(al2);

			if (ts1.equals(ts2)) {
				System.out.println("Anagram String");
			} else
				System.out.println("Not Anagram");
		} else
			System.out.println("Not Anagram");
	}

	public static void main(String[] args) {
		StringAnagramPractise obj = new StringAnagramPractise();

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter First Sentence ");
		String first = s1.nextLine();

		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter Second Sentence ");
		String second = s2.nextLine();

		obj.validateAnagram(first, second);
	}

}

class ComperatorSort implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
