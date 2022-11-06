//WAP to sort an array using Merge Sort Algorithm.
package assignment2;

public class Question4 {
	
	private static void merge(int arr[],int start,int end,int mid) {
		int leftSize=mid-start+1;
		int rightSize=end-mid;
		int[] left=new int[leftSize];
		int[] right=new int[rightSize];
		//fill left part value
		for(int i=0;i<leftSize;i++) 
		{
			left[i]=arr[start+i];
		}
		//fill right part value
		for(int j=0;j<rightSize;j++) 
		{
			right[j]=arr[mid+j+1];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<leftSize && j<rightSize) {
			if(left[i]<right[j]) {
				arr[k]=left[i];
				i++;
				k++;
			}
			
			else {
				arr[k++]=right[j++];
			}
		}
		
		
		//if left part is left out
		
		while(i<leftSize) {
			arr[k++]=left[i++];
		}
		
		//if right part is left out
		
		while(j<rightSize) {
			arr[k++]=right[j++];
		}
	}
	private static void mergeSort(int arr[],int start,int end) {
		if(start>=end) {
			return;
		}
		//find mid index
		int midIndex=(start+end)/2;
		//left call
		mergeSort(arr,start,midIndex);
		//right call
		mergeSort(arr,midIndex+1,end);
		//merge value sorted way in return time
		merge(arr,start,end,midIndex);
	}
	public static void main(String[] args) {
		int[] arr= {10,9,30,4,25,46,22,6};
		int lengthOfArray=arr.length;
		System.out.println("Before Sorting.......");
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		mergeSort(arr,0,lengthOfArray-1);
		System.out.println("After Sorting.......");
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}

	}

}
