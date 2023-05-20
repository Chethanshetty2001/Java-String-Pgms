package String_programming;

import java.util.Scanner;

public class Print_special_character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String str=sc.nextLine();
		int count=0;
		for(int i=0; i<str.length();i++)
		{
			char ch= str.charAt(i);
			if((ch!='A' && ch!='Z')|| (ch!='a' && ch!='z' )||(ch!='0' && ch!='9') )
			{
				count ++;
			}
		}
		System.out.println(count);
	}

}
