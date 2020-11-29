package PracticeCodes;

import java.util.*;

public class DuplicateNumbersPractice {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many number you want to enter:");
		int enteredLength = s.nextInt();
		int[] arr = new int[enteredLength];
		for (int i = 0; i < enteredLength; i++) {
			System.out.println("Enter number");
			int enteredNumber = s.nextInt();
			arr[i] = enteredNumber;
		}

		HashMap<Integer, Integer> hm = new HashMap();
		for (int i : arr) {
			Integer count = hm.get(i);
			if (count == null) {
				hm.put(i, 1);
			} else
				hm.put(i, ++count);
		}

		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry val = (Map.Entry) itr.next();
			int value = (int)val.getValue();
			if(value>1)
				System.out.println(val.getKey()+" = "+val.getValue());
		}
	}

}
