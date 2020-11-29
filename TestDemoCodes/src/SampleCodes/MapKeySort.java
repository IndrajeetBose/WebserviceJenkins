package SampleCodes;

import java.util.*;

public class MapKeySort {
	public static void main(String args[]) {
		HashMap hm = new HashMap();
		hm.put("A", 1);
		hm.put("D", 2);
		hm.put("Z", 3);
		hm.put("H", 4);
		hm.put("K", 5);
		hm.put("M", 6);
		
		TreeMap tm = new TreeMap(new MyComparetor5());
		tm.putAll(hm);
		System.out.println(tm);
	}

}

class MyComparetor5 implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = o2.toString();
		
		return -s2.compareTo(s1);
	}
	
}
