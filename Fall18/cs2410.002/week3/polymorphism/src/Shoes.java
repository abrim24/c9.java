public class Shoes {
    private float size;
    public Shoes(float s) {
        size = s;
    }
    
    public float getSize() {return size;}
    public void setSize(int s) {size=s;}
    
    public void printMsg() {
        System.out.println("Parent class: I love shoes!!!!");
    }
}