import java.util.HashMap;
import java.util.Scanner;

public class inputMap {

public static void main(String[] args) {
 // TODO Auto-generated method stub

  HashMap <Integer,Integer> hmap = new HashMap<Integer,Integer>();
    Scanner in = new Scanner(System.in);

          for(int i=0;i<3;i++){

            Integer a=in.nextInt();

           Integer b=in.nextInt();
           hmap.put(a, b);

           System.out.println(hmap.put(a,b));


        }

    }


  }