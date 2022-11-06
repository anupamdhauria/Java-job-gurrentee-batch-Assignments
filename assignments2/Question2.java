//WAP to sort an array using Quick Sort Algorithm.
package assignment2;

public class Question2 {
	
	
	private static int partition(int[] arr, int start, int end) {
		
		int pivot=arr[start];
		int cnt=0;
		for(int i=start+1;i<=end;i++)
		{
			if(arr[i]<pivot) {
				cnt++;
			}
		}
		
		int pivotIndex=start+cnt;
		//swap pivot value with actual index
		int temp=arr[start];
		arr[start]=arr[pivotIndex];
		arr[pivotIndex]=temp;
		
		int i=start,j=end;
		while(i<pivotIndex && j>pivotIndex) {
			
			//check  left value is less than pivot
			while(arr[i]<pivot)
			{
				i++;
			}
			
			//check right value is greater than pivot
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<pivotIndex && j>pivotIndex) {
				//swap if any condition is not satisfied either left value is greater or right value is lesser
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
	
	
	private static void quickSort(int arr[],int start,int end) {
		if(start>=end) {
			return;
		}
		//partition Index 
		int partitionIndex=partition(arr,start,end);
		//left call
		quickSort(arr,start,partitionIndex-1);
		//right call
		quickSort(arr,partitionIndex+1,end);
	}



	public static void main(String[] args) {
		
		int[] arr= {10,9,30,4,25,46,22,6};
		int lengthOfArray=arr.length;
		System.out.println("Before Sorting.......");
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		quickSort(arr,0,lengthOfArray-1);
		System.out.println("After Sorting.......");
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
	}

}
