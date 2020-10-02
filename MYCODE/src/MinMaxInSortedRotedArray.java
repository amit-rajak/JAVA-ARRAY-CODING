
public class MinMaxInSortedRotedArray 
{
	public static void main(String[] args) 
	{
    int arr[]={5, 6, 1, 2, 3, 4};
     System.out.println(findMinimumElementRotatedSortedArray(arr,0, arr.length-1));
     System.out.println(findMaximumElementRotatedSortedArray(arr,0, arr.length-1));
	
	}
	 public static int findMinimumElementRotatedSortedArray(int arr[],int low,int high)
	 {
		 int mid;
		 while(low<high)
		 {
			 mid=low+(high-low)/2;
			 if(arr[mid]>arr[high])
			 {
				 low=mid+1;
				 
			 }
			 else
			 {
				 high=mid;
			 }
		 }
		 return arr[low];
		 
		 
		
	 
}
	 public static int findMaximumElementRotatedSortedArray(int arr[],int low,int high)
	 {
		 int mid;
		 while(low<high)
		 {
			 mid=low+(high-low)/2;
			 if(arr[mid]>arr[high])
			 {
				 
				 high=mid;
				 
			 }
			 else
			 {
				 high=mid-1;
				
			 }
		 }
		 return arr[high];
}
}
