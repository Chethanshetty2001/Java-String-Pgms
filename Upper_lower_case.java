package String_programming;

public class Upper_lower_case {
	public static void main(String[] args) {
		String str="KEERTHI";
		String Ans="";
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			int x=(int) ch;
			ch=(char)(x+32);
			Ans=Ans+ch;
		}
		System.out.println(Ans);
	}

}
