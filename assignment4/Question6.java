//WAP to implement Pangram Checking with least inbuilt methods being used.
package assignment4;

public class Question6 {
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
	
	private static char[] convertStringToChar(String s) {
		int size=s.length();
		char[] ch=new char[size];
		for(int i=0;i<size;i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	private static String convertUpperCase(String s) {
		String res="";
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				res+=(char)(s.charAt(i)-32);
			}else {
				res+=s.charAt(i);
			}
		}
		return res;
	}
	
	private static void printStringArray(char[] s) {
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		boolean flag=true;
		
		String s1="THE QUICK bROWN fOX JuMPS OVER THE LAZY DOG";
		
		//calling replace method
		s1=replaceSpace(s1);
		System.out.println("After calling replaceSpace method");
		System.out.println(s1);
		
		//calling convertUpperCase method
		s1=convertUpperCase(s1);
		System.out.println("After converting lower to uppercase");
		System.out.println(s1);
		//calling for converting String to character Array
		char[] ch=convertStringToChar(s1);
		System.out.println("After calling convertStringToChar method");
		printStringArray(ch);
		
		
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;  
		}
		System.out.println("================================");
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
		System.out.println("It's pangram");
		}

	}

	

}
