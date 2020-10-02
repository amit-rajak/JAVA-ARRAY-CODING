import java.util.*;
public class HashMapImp {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> m = new HashMap<Character,Integer> ();
		for(int i=0;i<s.length();i++)
		{
		  char c=s.charAt(i);
		  Integer val=m.get(new Character(c));
		  if(val!=null)
		  {
			  m.put(c, new Integer(val+1));
		  }
		  else
		  {
			  m.put(c, 1);
		  }
		  System.out.println(m);
		}
		
	}
}
