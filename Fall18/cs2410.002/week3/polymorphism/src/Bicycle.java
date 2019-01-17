 public class Bicycle {
     private int startCadence;
     private int startSpeed;
     private int startGear;
     
     public Bicycle(int c, int s ,int g) {
         startCadence = c;
         startSpeed =s;
         startGear = g;
     }
     public void printDescription() {
         System.out.println("In Parent: "+startCadence+", "+startSpeed+", "+startGear);
     }
 }