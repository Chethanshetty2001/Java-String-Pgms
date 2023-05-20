package programming_java;

import java.util.Arrays;

public class Array_find_index {
	public static void main(String[] args) {
		int [] arr={2,3,4,1,5};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			
		}
		System.out.println(Arrays.binarySearch(arr, 2));
	}

}
