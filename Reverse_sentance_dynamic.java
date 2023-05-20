package programming_java;

import java.util.Scanner;

public class Reverse_sentance_dynamic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentance");
		String str=sc.nextLine();
		String [] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
