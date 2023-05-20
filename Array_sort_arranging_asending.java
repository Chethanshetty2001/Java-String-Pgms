package programming_java;

import java.util.Arrays;

public class Array_sort_arranging_asending {
	public static void main(String[] args) {
		int [] arr={1,5,4,3,2};
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--)
			System.out.println(arr[i]);
	}

}
