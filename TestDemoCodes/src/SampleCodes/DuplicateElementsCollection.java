package SampleCodes;

import java.util.*;

public class DuplicateElementsCollection {
	
	public static void main(String args[]) {
		
		//Using HashSet with time complexity O(n)
		String[] arr = new String[6];
		arr = new String[]{"java", "python", "c", "ruby", "c","java"};
		/*Since HashSet does not include duplicate values so it will
		return null if we try to add a duplicate value as return type os add(Object o) is boolean*/
		HashSet hs = new HashSet();
		for(String name : arr) {
			if(hs.add(name) == false)
				System.out.println("Duplicate Element is: " + name);
		}
		
		HashMap <String, Integer> hm = new HashMap();
		for(String name : arr) {
			Integer count = hm.get(name);
			if(count == null) {
				hm.put(name, 1);
			}
			else
				hm.put(name, ++count);
		}
		
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry val = (Map.Entry) itr.next();
			int value = (int) val.getValue();
			if(value>1) {
				System.out.println(val.getKey()+":"+val.getValue());
			}
		}
	}
	

}
