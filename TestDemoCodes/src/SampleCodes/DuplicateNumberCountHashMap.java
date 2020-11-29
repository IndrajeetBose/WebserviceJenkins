package SampleCodes;

import java.util.*;

public class DuplicateNumberCountHashMap {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		System.out.println("How many numbes you want to enter: ");
		int arrSize = s.nextInt();
		int[] arr = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			System.out.println("Enter number: ");
			int enteredNumber = s.nextInt();
			arr[i] = enteredNumber;
		}

		// Find Duplicates with count
		HashMap<Integer, Integer> hm = new HashMap();
		for (int i : arr) {
			Integer count = hm.get(i);
			if (count == null)
				hm.put(i, 1);
			else
				hm.put(i, ++count);
		}

		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry val = (Map.Entry) itr.next();
			int value = (int) val.getValue();
			if (value > 1) {
				System.out.println(val.getKey() + "=" + val.getValue());
			}

		}
	}

}
