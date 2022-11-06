//WAP to find the duplicates present in an array.
package assignment2;

public class Question1 {

	private static int[] duplicateArray(int[]arr,int lengthOfArray) {
	
		int[] duplicateValue=new int[lengthOfArray-1];
		int k=0;
		int[] freq=new int[100000];
		for(int i=0;i<lengthOfArray;i++) {
			freq[arr[i]]++;
		}
		 for(int i=0;i<freq.length;i++) {
			 if(freq[i]>1) {
				 duplicateValue[k++]=i;	 
			 }
		 }
		
		return duplicateValue;
		
	}
	private static void duplicateValuePrint(int[]arr,int n)
	{
		int[] duplicateValue=duplicateArray(arr,n);
		boolean flag=false;
		for(int i=0;i<duplicateValue.length;i++)
		{
			if(duplicateValue[i]!=0) {
				System.out.println("duplicate value :"+duplicateValue[i]);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No duplicate value present");
		}

	}
	public static void main(String[] args) {
		int[] arr1= {10,20,30,10,25,46,46,20,6,22,6};
		int arr1Size=arr1.length;
		int[] arr2= {4,5,73,67,23};
		int arr2size=arr2.length;
		
		System.out.println("For arr1:");
		duplicateValuePrint(arr1,arr1Size);
		System.out.println();
		System.out.println("For arr2:");
		duplicateValuePrint(arr2,arr2.length);
	}

}
