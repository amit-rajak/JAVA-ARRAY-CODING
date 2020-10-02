import java.util.Scanner;

public class FirstSetBit {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
	  
	  int input =sc.nextInt();
	  while(input-->0)
	  {
		  int num =sc.nextInt();
		  System.out.println((int)((Math.log10(num & -num)) / Math.log10(2)) + 1);
	  }
	}

}
