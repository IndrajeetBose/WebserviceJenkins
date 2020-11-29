package SampleCodes;

import java.util.*;

public class StringBufferSort {
	public static void main (String[] args) {
		ArrayList al = new ArrayList();
		al.add(new StringBuffer("D"));
		al.add(new StringBuffer("K"));
		al.add(new StringBuffer("T"));
		al.add(new StringBuffer("R"));
		al.add(new StringBuffer("U"));
		al.add(new StringBuffer("P"));
		al.add(new StringBuffer("Q"));
		
		TreeSet ts = new TreeSet(new MyComparator6());
		ts.addAll(al);
		System.out.println(ts);
	}

}

class MyComparator6 implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2= o2.toString();
		return s2.compareTo(s1);
	}
}
