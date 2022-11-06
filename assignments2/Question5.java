//WAP to sort an array using Selection Sort Algorithm.
package assignment2;

public class Question5 {
	
	private static void selectionSort(int arr[],int n) {
		//logic of selection sort
				//find minimum value and fixed in  index
		for(int i=0;i<=n;i++)
		{
			int minValueIndex=i;
			for(int j=i;j<=n;j++)
			{
				if(arr[minValueIndex]>arr[j])
				{
						minValueIndex=j;
				}
			}
			//swap min value with actual sorted index		
			int temp=arr[i];
			arr[i]=arr[minValueIndex];
			arr[minValueIndex]=temp;
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
		selectionSort(arr,lengthOfArray-1);
		System.out.println("After Sorting.......");
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}

	}
}
