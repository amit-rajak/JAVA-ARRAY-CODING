import java.util.Scanner;
public class defangIPaddr {
	

	
		public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);
			String s=sc.nextLine();
		    StringBuffer sentence= new StringBuffer();

		    for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '.')
					sentence.append("[.]");
				else
					sentence.append(s.charAt(i));
			}
			String org=sentence.toString();
			System.out.println(org);
	    }
		}
				 
			
		

	



