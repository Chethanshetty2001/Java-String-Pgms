package Logical_progarmming;

public class Print_next_4_charcter {
	public static void main(String[] args) {
		String str="Hello";
		int no=4;
		for(int i=0;i<str.length();i++)
		{
			     int x=(int) str.charAt(i)+no;
			          char ch=(char) x;
			          System.out.print(ch);
		}

	}

}
