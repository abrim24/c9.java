public class Python extends Snake {
    private String length;
    
    public Python(String sp, boolean ven, String len) {
        super(sp,ven);
        length = len;
    }
    
    public String getLength() {return length;}
}