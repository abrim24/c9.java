//1. break into separate files
//2. add private data and constructor to Reptile
//3. add getter/setter to reptile

class Animal {
}

class Mammal extends Animal {
}

class Reptile extends Animal {
    private String bloodtype;
    public Reptile() {
        bloodtype = "cold";
    }
    public String getBloodType() {return bloodtype;}
}

public class Dog extends Mammal {

   public static void main(String args[]) {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();
      Reptile r = new Reptile();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
      System.out.println(r.getBloodType());
   }
}