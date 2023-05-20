package programming_java;

public class Reverse_sentance {
	public static void main(String[] args) {
		String str="My name is Keerthi";
		String [] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
