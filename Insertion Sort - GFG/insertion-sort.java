//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
//   static void insert(int arr[],int i)
//   {
//       // Your code here
//   }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      for(int i=1;i<n;i++){
          int j=i;
          while(j>0){
              if(arr[j-1]>arr[j]) swap(arr,j,j-1);
              j--;
          }
      }
  }
  
  public void swap(int[] arr,int i1,int i2){
      int temp=arr[i1];
      arr[i1]=arr[i2];
      arr[i2]=temp;
  }
  
  
}