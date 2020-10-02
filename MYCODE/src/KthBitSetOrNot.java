
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class KthBitSetOrNot{
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int num,kth;
		while(t-->0) {
		    num = sc.nextInt();
		    kth = sc.nextInt();
		    if ((num & (1 >> (kth - 1))) == 1) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No"); 
		    
		    
		}
	}
}


