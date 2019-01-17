//1. break into separate files
//2. add private data and constructor to Reptile
//3. add getter/setter to reptile

public class Dog extends Mammal {
   private String tailLength;
   public Dog() {
      super("blue");
      tailLength = "short";
      System.out.println("Dog constructor tailLength: " + tailLength);
   }
   public static void main(String args[]) {
      //Notice the default Dog constructor is called
      //which calls the one-arg mammal constructor, which calls
      //the Animal default constructor.  Notice the change in output
      //when the Mammal default constructor is called vs the one-arg.
      
      //Animal a = new Animal();
      //Mammal m = new Mammal();
      Dog d = new Dog();
      //Reptile r = new Reptile();

      /*
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
      System.out.println(r.getBloodType());
      */
   }
}