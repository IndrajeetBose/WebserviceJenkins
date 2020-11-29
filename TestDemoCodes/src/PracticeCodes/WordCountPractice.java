package PracticeCodes;

import java.util.*;

public class WordCountPractice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String enteredSentence = s.nextLine().toLowerCase();
		String[] arr = enteredSentence.split(" ");

		HashMap<String, Integer> hm = new HashMap();
		for (String word : arr) {
			Integer count = hm.get(word);
			if (count == null)
				hm.put(word, 1);
			else
				hm.put(word, ++count);
		}

		Set s2 = hm.entrySet();
		Iterator itr = s2.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> val = (Map.Entry) itr.next();
			int value = (int) val.getValue();
			if (value > 1) {
				System.out.println(val.getKey()+":"+val.getValue());
			}
		}
	}

}
