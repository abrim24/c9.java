public class TestSnake {
    public static void main(String args[]) {
        Snake snake1 = new Python("Ball",false,"4 feet");
        System.out.println("species: "+snake1.getSpecies());
        System.out.println("length: "+((Python)snake1).getLength());
        
    }
}