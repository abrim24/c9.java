import java.util.Hashtable;
import java.util.Enumeration;

//visual of hash function java.util.Hashtable uses: 
//https://stackoverflow.com/questions/9364134/what-hashing-function-does-java-use-to-implement-hashtable-class

public class HashtableExample {
 
 public static void main(String[] args) {
 
   Enumeration names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = 
              new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Key1","Chaitanya");
   hashtable.put("Key2","Ajeet");
   hashtable.put("Key3","Peter");
   hashtable.put("Key4","Ricky");
   hashtable.put("Key5","Mona");
 
    
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
   System.out.println("\n\n"+hashtable.get("Key1"));
   
 }
}