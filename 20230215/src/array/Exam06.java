package array;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] arr2 = new int[arr1.length*2];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		for(int i=0; i<arr1.length; i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1 = arr2;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		int[] numArr1 = {10, 20, 30, 40, 50};
		int[] numArr2= new int[numArr1.length * 2];
		
		System.arraycopy(numArr1, 2, numArr2, 5, 3);
		System.out.println(Arrays.toString(numArr1));
		System.out.println(Arrays.toString(numArr2));
		
		numArr1 = numArr2;
		System.out.println(Arrays.toString(numArr1));
		System.out.println(Arrays.toString(numArr2));
		
	}

}
