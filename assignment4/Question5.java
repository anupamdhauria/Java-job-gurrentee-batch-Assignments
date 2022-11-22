//WAP to implement Anagram Checking least inbuilt methods being used.
package assignment4;

public class Question5 {
	
	private static String replaceSpace(String s) 
	{
		String res="";
		String temp="";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch==' ') {
				res+=temp;
				temp="";
			}else {
			temp+=ch;
			}
		}
		res+=temp;
		return res;
		
	}
	private static String convertLowerCase(String s) {
		String res="";
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				res+=(char)(s.charAt(i)+32);
			}else {
				res+=s.charAt(i);
			}
		}
		return res;
	}

	private static char[] convertStringChar(String s) {
		int size=s.length();
		char[] ch=new char[size];
		for(int i=0;i<size;i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	
	private static void bubbleSort(char[] s) {
		int n=s.length;
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			char temp;
			for(int j=1;j<n-i;j++)
			{
				if(s[j-1]>s[j])
				{
					temp=s[j];
					s[j]=s[j-1];
					s[j-1]=temp;
					flag=false;
				}
			}
			if(flag==true)
				break;
		}
	}
	
	private static void printStringArray(char[] s) {
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		String s1="a gentle Man";
		String s2="eleg ant Man";
		
		//calling replce method
		s1=replaceSpace(s1);
		s2=replaceSpace(s2);
		
		System.out.println("After Replace Method call");
		System.out.println(s1);
		System.out.println(s2);
		
		//calling lowercase function
		s1=convertLowerCase(s1);
		s2=convertLowerCase(s2);
		
		System.out.println("After converting in Lowercase");
		System.out.println(s1);
		System.out.println(s2);
		
		//calling method to convert string to character array
		char[] ch1=convertStringChar(s1);
		char[] ch2=convertStringChar(s2);
		System.out.println("before sorting");
		printStringArray(ch1);
		printStringArray(ch2);
		
		//calling bubble sort
		bubbleSort(ch1);
		bubbleSort(ch2);
		System.out.println("after sorting");
		printStringArray(ch1);
		printStringArray(ch2);
		
		boolean isAnagram=true;
		if(ch1.length!=ch2.length) {
			isAnagram=false;
		}
		else {
			for(int i=0,j=0;i<ch1.length;i++,j++) {
				if(ch1[i]!=ch2[j])
				{
					isAnagram=false;
					break;
				}
			}
		}
		
		System.out.println("====================================");
		if(isAnagram==true)
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("It's not Anagram");
		}
		

	}

}
