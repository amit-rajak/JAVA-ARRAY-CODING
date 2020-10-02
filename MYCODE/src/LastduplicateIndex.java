import java.util.Scanner;

public class LastduplicateIndex {
	public static void main (String[] args) {
		int a[] = {0, 1, 2, 2, 4, 5, 5, 5, 8}; 
        int n = a.length; 
            for(int loop=n-1;loop>0;loop--)
            {
            	if(a[loop]==a[loop-1])
            	{
            		System.out.print("element is" +" "+ a[loop] +" "+"index is "+ loop);
            		break;
            	
            	}
            	
            }

}
	}
