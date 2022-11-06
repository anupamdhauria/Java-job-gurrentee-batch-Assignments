//WAP to check whether an array is a subset of another array.
package assignment2;

public class Question6 {

	private static boolean binarySearch(int arr[],int start,int end,int searchValue) {
		if(start<=end)
		{
		
			int mid=(start+end)/2;
			if(arr[mid]==searchValue) {
				return true;
			}
			if(arr[mid]>searchValue) {
			return binarySearch(arr,start,mid-1,searchValue);}
			else {
				return binarySearch(arr,mid+1,end,searchValue);
			}
		}
		return false;
		
	}
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
	
	private static void checkSubset(int[] mainArr, int[] a, int n,int lengthOfArray) 
	{
		int cnt=0;
		
		//pass value that present in main array or not
		for(int i=0;i<n;i++) 
		{
			boolean result=binarySearch(mainArr,0,lengthOfArray-1,a[i]);
			if(result==true) {
				cnt++;
			}
		}
		if(cnt==n) {
			System.out.println("arr[] is subset of  mainArray[] ");
		}
		else {
			System.out.println("arr[] is not subset of  mainArray[] ");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		//main Array
		int[] mainArr= {10,9,30,4,25,46,22,6};
		int lengthOfArray=mainArr.length;
		
		//sort array bcz of binary Search
		selectionSort(mainArr,lengthOfArray-1);

		
		//check array for subset or not
		int[]arr1= {4,6,46};
		int[]arr2= {4,7,3};
		
		//size 
		int arr1Size=arr1.length;
		int arr2Size=arr2.length;
		
		
		//check subset or not
		System.out.println("for arr1.....");
		checkSubset(mainArr,arr1,arr1Size,lengthOfArray);
		System.out.println("for arr2.......");
		checkSubset(mainArr,arr2,arr2Size,lengthOfArray);
		
		
		
	}


}
