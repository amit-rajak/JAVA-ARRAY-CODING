import java.util.HashMap;
public class FrequencyCount {
   public static void main(String[] args) {
      String str = "GEEKSFORGEEKS";
 
      HashMap<Character,Integer> hMap = new HashMap<>();
      for(int i= 0 ; i< str.length() ; i++) {
    	  Character c=str.charAt(i);
      /*   if(hMap.containsKey(c)) {
            int count = hMap.get(c);
            hMap.put(c,count+1);
         }*/// else 
        // {
            hMap.put(c,i);
         //}
      }
      System.out.println(hMap);
   }
}
 