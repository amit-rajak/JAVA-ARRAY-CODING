public class TwoSumArray {
	
	public int[] twoSumArrayFunc(int[] nums, int target) 
	{  
	   int [] result=new int[2];
	   // int i=0;
	  //  int j=0;
	   for(int i=0;i<nums.length;i++)
	   {
		   for(int j=0;j<nums.length;j++)
		   {
		  if(nums[i]+nums[j+1]==target)
		  {
			 result[0]=nums[i];
			 result[1]=nums[j+1];
			 return result;

					 
		  }
		  }
		   
		   
	   }
	   return result;
		
	}
	public static void main(String arg[])
	{ 
		
		TwoSumArray m = new TwoSumArray();
		
		int nums[]={2, 7, 11, 15};
		int a;
		
		int target=17;
		
		
		int result1[]=m.twoSumArrayFunc(nums,target);
		for(int i=0;i<result1.length;i++)
		{
			//a=result1[i];
			System.out.print(result1[i]+" ");
		}
	}

	}



