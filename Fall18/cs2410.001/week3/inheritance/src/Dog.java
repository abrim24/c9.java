//break into separate files
//add private data and constructor to Reptile
//add getter/setter to reptile

public class Dog extends Mammal {

   public static void main(String args[]) {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
      
      Reptile r = new Reptile();
      System.out.println("blood type: "+r.getBloodType());
      
   }
}