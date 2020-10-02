
public class MergeSorteArray 
{
	
    public int [] MergeArray(int arr1[],int arr2[],int arr3 [])
    {  
    	int lengtharr1=arr1.length;
    	int lengtharr2=arr2.length;
    	//int arr3[] = new int[lengtharr1+lengtharr2];
    	int i=0,j=0,k=0;
    	while(i<lengtharr1&&j<lengtharr2)
    	{
    		if(arr1[i]<arr2[j])
    		{
    			arr3[k++]=arr1[i++];
    		}
    		else
    		{
    			arr3[k++]=arr2[j++];
    		}
    	}
    	while(i<lengtharr1)
    	{
    		arr3[k++]=arr1[i++];
    	}
    	while(j<lengtharr2)
    	{
    		arr3[k++]=arr2[j++];
    	}
    	return arr3;
    	
    	
    }
    
    
    
    public static void main(String arg[])
    { 
    	
    	MergeSorteArray m = new MergeSorteArray();
    	int arr1[]={-1,1,2,3,5};
    	int arr2[]={-2,2,6,7,8,9};
    	int lengtharr1=arr1.length;
    	int lengtharr2=arr2.length;
    	int tsize=lengtharr1+lengtharr2;
    	int arr3[]=new int[tsize];
    	m.MergeArray(arr1,arr2,arr3);
    	for(int i=0;i<tsize;i++)
    	{
    		System.out.print(arr3[i]+",");
    	}
    }
 }
