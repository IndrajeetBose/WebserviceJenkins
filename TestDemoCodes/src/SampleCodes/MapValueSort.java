package SampleCodes;

import java.util.*;

public class MapValueSort {
	
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "A");
		m.put(2, "C");
		m.put(3, "D");
		m.put(4, "B");
		m.put(5, "F");
		m.put(6, "E");
		Collection c = m.values();
		System.out.println(c);
		Set s = m.entrySet();
		System.out.println(s);
		TreeMap tm = new TreeMap(new MyComparator3());
		tm.putAll(m);
		System.out.println(tm);
		
		/*
		 * Iterator itr = while(itr.hasNext()) { Map.Entry pair = (Map.Entry)itr.next();
		 * System.out.println(pair.getKey() +":"+ pair.getValue()); }
		 */
	}

}

class MyComparator3 implements Comparator{
	public int compare(Object O1, Object O2) {
		Integer s1 = (Integer)O1;
		Integer s2 = (Integer)O2;
		return -s1.compareTo(s2);
	}
}