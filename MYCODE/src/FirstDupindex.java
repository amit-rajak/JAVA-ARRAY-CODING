
public class FirstDupindex {
	public static void main (String[] args) {
		int a[] = {0, 1, 2, 2, 4, 5, 5, 5, 8}; 
        int n = a.length; 
            for(int loop=0;loop<n;loop++)
            {
            	if(a[loop]==a[loop+1])
            	{
            		System.out.print("element is" +" "+ a[loop] +" "+"index is "+ loop);
            		break;
            	
            	}
            	
            }

}

}
