package PracticeCodes;

import java.util.*;

public class CharCountPractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String enteredString = s.nextLine();
		String copyString = enteredString.replace("\s", "");
		char[] arr = copyString.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap();
		for(char i : arr) {
			Integer count = hm.get(i);
			if(count == null)
				hm.put(i, 1);
			else
				hm.put(i, ++count);
		}
		
		Set s2 = hm.entrySet();
		Iterator itr = s2.iterator();
		while(itr.hasNext()) {
			Map.Entry value = (Map.Entry) itr.next();
			System.out.println(value.getKey()+" = "+value.getValue());
		}
	}

}
