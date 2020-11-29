package SampleCodes;

import java.util.*;
public class ArrayListDecending {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(54);
		al.add(23);
		al.add(47);
		al.add(67);
		al.add(2);
		al.add(10);
		System.out.println("Before Sorting"+al);
		TreeSet ts = new TreeSet(new MyComperator());
		ts.addAll(al);
		System.out.println("after sorting converting to tree "+ ts);
		Object[] arr = ts.toArray();
		System.out.println("Second highest number "+arr[1]);
	}

}

@SuppressWarnings("rawtypes")
class MyComperator implements Comparator{
	public int compare(Object O1, Object O2) {
		Integer I1 = (Integer)O1;
		Integer I2 = (Integer)O2;
		return I2.compareTo(I1);
	}
	
	
}
