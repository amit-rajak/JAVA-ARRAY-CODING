

	//Initial Template for Java
	import java.util.*;
	import java.lang.*;
	import java.io.*;
	import java.math.BigInteger;
	class positionOfrigthmostSetBit{
	    
	    // Function to get rightmost set bit
	    public static int getRightMostSetBit(int n) {
	        if(n==0)
	            return 0;
	        
	        return (int)(Math.log(n & -n)/Math.log(2.0)) + 1; //finding the rightmost set bit of a number
	    }
	    
	    //Position this line where user code will be pasted.
	    
		public static void main(String[] args) throws NumberFormatException, IOException {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			int m,n;
			while(t-->0) {
			    m = sc.nextInt();
			    n = sc.nextInt();
			    System.out.println(posOfRightMostDiffBit(m, n));
			}
		}
	
	
	public static int posOfRightMostDiffBit(int m, int n) {
        
	    int s=m^n;
	   return getRightMostSetBit(s);
	    
	    
	        
	}
}