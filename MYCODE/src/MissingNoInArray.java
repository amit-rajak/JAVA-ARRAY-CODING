//Java program to find missing number in an array:

public class MissingNoInArray {
	public static void main(String args[])
	{
		int arr[]={1,2,4,5,6,7,8,9};
		int n=arr.length+1;
		int Total_sum=n*(n+1)/2;
    	int restsum=0;
  for(int i=0;i<arr.length;i++)
  {
	  restsum+=arr[i];
  }
  
     System.out.print(Total_sum-restsum);
  
}

}

