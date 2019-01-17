public class Dog extends Mammal {

   public static void main(String args[]) {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
      System.out.println("mammal furr color: "+m.getFurrColor());
      System.out.println("dog furr color: "+d.getFurrColor());
      
   }
   
}