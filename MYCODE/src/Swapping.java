import java.util.Scanner;

public class Swapping {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int ele=0,j;
		    int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            for (int l=0;l<a.length-2;l++)
            {
              
            	 int temp = a[l];
                  a[l] = a[l+2];
                  a[l+2] = temp;
            
           }
            for(int ll =0; ll<a.length;ll++)
            {
            	System.out.print(a[ll]+" ");
            }
            
		}
}
}
