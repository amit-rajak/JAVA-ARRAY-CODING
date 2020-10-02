import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveVowel {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		Character vowels[]={'A','E','I','O','U','a','e','i','o','u'};
		List<Character> al=Arrays.asList(vowels);
		String s=sc.nextLine();
	    StringBuffer sentence= new StringBuffer(s);

		System.out.println(sentence);
		for(int i=0;i<sentence.length();i++)
		{
		   if(al.contains(sentence.charAt(i)))
		   {
			   sentence.replace(i,i+1, "");
			   i--;
		   }
			   
		}
		String Remove=sentence.toString();
		System.out.println(Remove);

	}
	

}
