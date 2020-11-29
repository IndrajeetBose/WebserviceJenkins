package SampleCodes;

import java.util.*;

public class AlphabetCountHashMap {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String enteredSentence = s.nextLine();
		String copySentence = enteredSentence.replace("\s", "");
		char[] arr = copySentence.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap();
		for(char ch : arr) {
			Integer count = hm.get(ch);
			if(count == null)
				hm.put(ch, 1);
			else
				hm.put(ch, ++count);
		}
		
		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry val = (Map.Entry) itr.next();
			System.out.println(val.getKey()+" : "+val.getValue());
		}
	}

}
