package String_programming;


public class Lowercase_to_uppercase {
	public static void main(String[] args) {
		String str="boss";
		String Ans="";
		for(int i=0;i<=str.length();i++)
		{
			char ch=str.charAt(i);
			int x=(int) ch;
			ch=(char)(x-32);
			Ans=Ans+ch;
		}
		
		System.out.println(Ans);
		
	}

}
