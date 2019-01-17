//has_a relationship

//add private data int value to Speed class
//add getter to Speed class
//call getter function from van1


public class Van extends Vehicle {
   private Speed sp;
   
   Van() {
       sp = new Speed();
   }
   public Speed getSp() {return sp;}
   public void setSp(Speed s) {sp=s;}
   
   public static void main(String args[]) {
      System.out.println(args[0]);
       Van van1= new Van();
       System.out.println("Van's speed: "+van1.getSp().getValue());
   }
} 