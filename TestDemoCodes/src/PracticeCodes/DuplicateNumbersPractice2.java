package PracticeCodes;

import java.util.*;

public class DuplicateNumbersPractice2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers you want to enter ");
		int enteredSize = s.nextInt();
		int[] arr = new int[enteredSize];
		for(int i=0; i<enteredSize; i++) {
			System.out.println("Enter a number ");
			int userNumber = s.nextInt();
			arr[i] = userNumber;
		}

		HashMap<Integer,Integer> hm = new HashMap();
		for(int i : arr) {
			Integer count = hm.get(i);
			if(count == null) {
				hm.put(i, 1);
			}
			else
				hm.put(i, ++count);
		}
		
		Set s2 = hm.entrySet();
		Iterator itr = s2.iterator();
		while(itr.hasNext()) {
			Map.Entry val = (Map.Entry) itr.next();
			int value = (int) val.getValue();
			if(value>1) {
				System.out.println(val.getKey()+" = "+val.getValue());
			}
		}
	}

}
