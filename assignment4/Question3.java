//WAP to check if “2552” is palindrome or not.
package assignment4;

public class Question3 {

	public static void main(String[] args) {
		
		String s="2552";
		
		int i=0;
		int j=s.length()-1;
		boolean flag=true;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=false;
				break;
			}
			i++;
			j--;
		}
		
		if(flag==true)
			System.out.println(s+ " is palindrome");
		else
			System.out.println(s+" is not palindrome");
	}

}
