//WAP to sort an array using Bubble Sort Algorithm.
package assignment2;

public class Question3 {


	private static void bubbleSort(int[] arr, int n) {
		boolean flag=false;
		for(int i=0;i<n;i++) 
		{
			
			for(int j=1;j<=n-i;j++) 
			{
				//previous element is greater than next element then swap
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					flag=true;
				}
			}
			if(flag==false)
				break;
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {10,9,30,4,25,46,22,6};
		int lengthOfArray=arr.length;
		System.out.println("Before Sorting.......");
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		bubbleSort(arr,lengthOfArray-1);
		System.out.println("After Sorting.......");
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}

	}


}
