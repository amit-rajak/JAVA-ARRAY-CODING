//1-- brut force
//math.min and max 
// stream - return Arrays.stream(arr).min().getAsInt(); 


///Program to find largest element in an array
public class LargestElementInArray 
{
	public static void main (String args[])
	{
		int arr[] = {0, 1, 2, 2, 4, 5, 5, 5, 8}; 
		int smallest = arr[0];
		 int largest = arr[0];
		 
		 for(int i=1; i< arr.length; i++)
		 {
		 if(arr[i] > largest)
		 largest = arr[i];
		 else if (arr[i] < smallest)
		 smallest = arr[i];
		 
		 }
		 System.out.println("Smallest Number is : " + smallest);
		 System.out.println("Largest Number is : " + largest); 
		 }
		
}
















/////16,19,21,25,3,5,8,10