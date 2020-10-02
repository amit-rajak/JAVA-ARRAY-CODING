import java.util.*;
public class TwoSum {
public int[] twoSumArray(int[] nums, int target) 
{  
   int [] result=new int[2];
   HashMap <Integer,Integer> map=new  HashMap <Integer,Integer>();
   for (int i=0;i<nums.length;i++)
   {
	   int difference =target-nums[i];
	   if (map.containsKey(difference))
	   {
		   result[1]=i;
		   result[0]=map.get(difference);
		   return result;
		   
	   }
	   map.put(nums[i], i);
   }
   return result;
	
}
public static void main(String arg[])
{ 
	
	TwoSum m = new TwoSum();
	
	int nums[]={2, 7, 11, 15};
	int a;
	
	int target=17;
	
	
	int result1[]=m.twoSumArray(nums,target);
	for(int i=0;i<result1.length;i++)
	{
		a=result1[i];
		System.out.print(nums[a]+" ");
	}
}

}
