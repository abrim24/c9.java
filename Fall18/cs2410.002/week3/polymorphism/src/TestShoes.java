public class TestShoes {
    public static void main(String args[]) {
        Shoes shoe1;
        shoe1 = new Nike(7,true);
        shoe1.printMsg();
        
        System.out.println("Calling parent method from child: "+((Shoes)shoe1).getSize());
        
        Nike nike1 = new Nike(13,false);
        System.out.println("Calling parent method from child: "+nike1.getSize());
    }
}