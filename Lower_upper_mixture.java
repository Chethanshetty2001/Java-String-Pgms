package String_programming;

public class Lower_upper_mixture {
	public static void main(String[] args) {
		String str="KEERTHI@199";
		String Ans="";
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='A')&& (ch<='Z'))
			{
				int x=(int) ch;
				Ans=Ans+(char)(x+32);
				
			}
			else{
				Ans=Ans+ch;
				System.out.println(Ans);
			}
			
		}
	}

}
