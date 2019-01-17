
public class Mammal extends Animal {
    private String hairColor;
    public Mammal() {
        hairColor = "unknown";
        System.out.println("Mammal default constructor hairColor: " + hairColor);
    }
    public Mammal(String hc) {
        hairColor = hc; 
        System.out.println("Mammal one-arg constructor hairColor: " + hairColor);
    
    }
    public String getHairColor() {return hairColor;}
    public void setSetHairColor(String hc) {hairColor = hc;}
    
}