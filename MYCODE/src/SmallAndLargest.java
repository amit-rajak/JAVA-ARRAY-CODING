import java.util.Arrays;
import java.util.Scanner;

public class SmallAndLargest {
	
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num =sc.nextInt();
	int arr[]= new int[num];
	
	for(int i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();
	}
	int min=arr[0];
	int max=arr[0];
	for(int j=0;j<num;j++)
	{
		if(arr[j]>max)
		{
			max=arr[j];
			
		}

		else if(arr[j]<min)
		{
			min=arr[j];
			
		}
		
	}
	System.out.println(max);
	System.out.print(min);
	//System.out.println(Arrays.toString(arr));
  }

}
