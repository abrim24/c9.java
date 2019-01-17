public class Nike extends Shoes {
    private boolean hasSwoosh;
    public Nike(float s, boolean hs) {
        super(s);
        hasSwoosh = hs;
    }
    
    public boolean getHasSwoosh() {return hasSwoosh;}
    public void setHasSwoosh(boolean hs) {hasSwoosh = hs;}
    
    public void printMsg() {
        System.out.println("I love Nike!!!!");
    }
}