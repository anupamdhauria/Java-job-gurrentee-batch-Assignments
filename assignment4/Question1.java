//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
package assignment4;

public class Question1 {

	public static void main(String[] args) {
		
		String str="anupamdhauria";
		System.out.println("Original String: "+str);
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		
			if(temp.indexOf(ch)<0)
			{
				temp+=ch;
			}
		}
		
		str=temp;
		System.out.println("After Removing Duplicate: "+str);

	}

}
