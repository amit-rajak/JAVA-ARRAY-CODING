import java.lang.*;
import java.util.Scanner;
import java.io.*;
class FirstNegative {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int ele=0,k,j;
		    int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            k=sc.nextInt();
            boolean flag; 
            for (int l=0;l<(n-k+1);l++)
            {
            	flag =false;
            	for(int inner=0;inner<k;inner++)
            	{
            		if(a[l+inner]<0)
            		{
            			System.out.println(a[l+inner]+" ");
            			flag=true;
            			break;
            		}
            	}
            	if(!flag)
            	{
            		System.out.println(0+" ");
            	}
            	
            }
            
		}
	}
}