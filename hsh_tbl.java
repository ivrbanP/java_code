import java.util.Hashtable;
import java.util.Random;
import java.math.*;
import java.util.Random;


public class HashTableExample {
   public static void main(String[] args) {
      // Creating a Hashtable object with 10 string members
      Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
      int i = 1;
      Random rand = new Random();
      
      // Adding elements to the Hashtable
      for (i=1; i<=20000000; i++)
      {
        ht.put(i, Math.abs(rand.nextInt()));
      }

      ht.put(3000000, 1016547545);

      
      
      // Accessing elements from the Hashtable
      // System.out.println("The value at key 1 is: " + ht.get(1));
      // System.out.println("The value at key 5 is: " + ht.get(5));

      System.out.println("Ukupno item-a u hash tablici: " + ht.size());
      System.out.println("The value at key 300 is: " + ht.get(300));

      if (ht.containsValue(1016547545) == true) 
      { 
        System.out.println("IMA");
      }  
      else 
      {
        System.out.println("NEMA");
      }
      
      // Removing elements from the Hashtable
      /* ht.remove(3);
      ht.remove(6); */
      
      // Printing the updated Hashtable
     // System.out.println("The updated Hashtable is: " + ht);

   }
}