package SampleCodes;

import java.util.*;

public class ArrayListDescendingScanner {
	
	@SuppressWarnings("rawtypes")
	private ArrayList al;
	@SuppressWarnings("rawtypes")
	private TreeSet ts;
	
	@SuppressWarnings({ "unchecked", "rawtypes", "resource" })
	public void createArrayList() {
		Scanner s = new Scanner(System.in);
		System.out.println("How Many Numbers You Want to Sort");
		int Length = s.nextInt();
		al = new ArrayList(Length);
		for(int i=0; i<Length; i++) {
			System.out.println("Enter Next Number");
			int numbers = s.nextInt();
			al.add(numbers);
		}
		System.out.println("Before Sorting: "+al);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void sortNumbers() {
		ts = new TreeSet(new MyComperator1());
		ts.addAll(al);
		System.out.println("After Sorting: "+ts);
	}
	
	public void secondLargestNumber() {
		Object[] arr = ts.toArray();
		System.out.println("Second Largest Number: " +arr[1]);
	}
	
	public static void main (String[] args) {
		ArrayListDescendingScanner ad = new ArrayListDescendingScanner();
		ad.createArrayList();
		ad.sortNumbers();
		ad.secondLargestNumber();
	}

}

@SuppressWarnings("rawtypes")
class MyComperator1 implements Comparator{
	
	public int compare(Object O1, Object O2) {
		Integer I1 = (Integer)O1;
		Integer I2 = (Integer)O2;
		
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;
	}
	
}
