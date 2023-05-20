package programming_java;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sort_find_index_dyanamic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int [] arr={2,5,3,2,1};
		Arrays.sort(arr);
		int no=sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println(Arrays.binarySearch(arr, no));
	}

}
