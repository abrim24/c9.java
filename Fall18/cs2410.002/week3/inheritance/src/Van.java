// IS_A relationship is between Van and Vehicle.  The Van "IS_A" Vehicle because Van inherits from Vehicle.
// HAS_A relationship is between Van and Speed.  The Van class contains a Speed class (line 7).  The Speed class
// is created in the Van class' constructor and any data in the Speed class needs to be first accessed with a 
// getter method which returns the Speed object.

public class Van extends Vehicle {
   private Speed sp;
   
   Van() {
       sp = new Speed();
   }
   
   public Speed getSpeed() {return sp;}
   public void setSpeed(Speed s) {sp=s;}
   
   public static void main(String args[]) {
       Van van1= new Van();
       System.out.println("van speed: "+van1.getSpeed().getTopSpeed());
       
   }
} 