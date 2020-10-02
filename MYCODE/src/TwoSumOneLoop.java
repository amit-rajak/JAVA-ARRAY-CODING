
public class TwoSumOneLoop {
	public int [] twoSumArrayFunc(int a[], int n) 
	{   
		
		int size=a.length;
		int [] result=new int[size];
		
		int [] m=new int[size];
	  
	   for(int i=0;i<a.length;i++)
	   {
		   
		 int value= n-a[i];
		   
	   }
	return result;
	  
	   }
	public static void main(String arg[])
	{ 
		
		TwoSumOneLoop m = new TwoSumOneLoop();
		
		int nums[]={2, 7, 11, 15};
		//int a;
		
		int target=26;
		
		
		int result[]=m.twoSumArrayFunc(nums,target);
		//int result1[]=m.twoSumArrayFunc(nums,target);
		for(int i=0;i<result.length;i++)
		{
			//a=result1[i];
			System.out.print(result[i]+" ");
		}
	}


}
