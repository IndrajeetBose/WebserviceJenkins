package SampleCodes;

import java.util.*;

public class DuplicateNumbers {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int arrayLength = s.nextInt();
		int[] arr = new int[arrayLength];
		
		for(int i=0; i<arrayLength; i++) {
			System.out.println("Enter Number: ");
			int enteredNumber = s.nextInt();
			arr[i] = enteredNumber;
		}
		
		for (int i = 0; i<arr.length 	; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
			
		}
	}

}
