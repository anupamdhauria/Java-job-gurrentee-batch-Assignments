//WAP to find if String contains all unique characters.
package assignment4;

import java.util.Arrays;

public class Question7 {

	
	public static void main(String[] args) {
		String s="Anupam$*#1247";
		System.out.println("String is: "+s);
		int[] freq=new int[26];
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		
		boolean isUnique=true;
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i-1]==ch[i])
			{
				isUnique=false;
				break;
			}
		}
		
		if(isUnique==true) {
			System.out.println("String has all unique character");
		}else {
			System.out.println("String has duplicate character");
		}

	}

}
