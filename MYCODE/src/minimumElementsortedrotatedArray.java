
public class minimumElementsortedrotatedArray {

	public static void main(String[] args)
	{
		int arr[]={16,19,21,25,3,5,8,10};
		 
      int min=arr[0];
      int max=arr[0];
      int elemenet = 0;
		for(int i=1; i<=arr.length-1 ;i++)
		{
		  if(arr[i]<min)
		  {
			min=arr[i];
		  }
		  if(arr[i]>max)
		  {
			max=arr[i];
		  }
		  
		  
		  
		}
	System.out.println(min);
	System.out.println(max);

	

	}

}
