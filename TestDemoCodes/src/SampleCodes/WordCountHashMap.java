package SampleCodes;

import java.util.*;

public class WordCountHashMap {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String enteredString = s.nextLine();
		String[] splitString = enteredString.split(" ");
		
		HashMap<String, Integer> hm = new HashMap();
		for(String word : splitString) {
			Integer count = hm.get(word);
			if(count == null)
				hm.put(word, 1);
			else
				hm.put(word, ++count);
		}
		
		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry val = (Map.Entry)itr.next();
			System.out.println(val.getKey()+"="+val.getValue());
		}
	}

}
