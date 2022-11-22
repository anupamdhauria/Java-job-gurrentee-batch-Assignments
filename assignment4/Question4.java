//WAP to count the number of consonants, vowels, special characters in a String.
package assignment4;

public class Question4 {

	private static boolean checkVowels(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s="Anu^43dh89$#%77D";
		int vowels=0;
		int consonant=0;
		int specialChar=0;
		int numbers=0;
		System.out.println("string is: "+s);
		s=s.toLowerCase();
		System.out.println("================================");
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				if(checkVowels(ch)==true) 
				{
					vowels++;
				}else {
					consonant++;
				}
			}
			else if(ch>='0' && ch<='9') 
			{
				numbers++;
			}
			else
				specialChar++;
			
		}
		
		System.out.println("no of vowels :"+vowels);
		System.out.println("no of consonant: "+consonant);
		System.out.println("no of numbers: "+numbers);
		System.out.println("no of special character: "+specialChar);
		

	}

}
