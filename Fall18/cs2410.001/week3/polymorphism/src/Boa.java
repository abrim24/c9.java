public class Boa extends Snake {
    private boolean givesLiveBirth;
    
    public Boa(String sp, boolean ven, boolean glb) {
        super(sp, ven);
        givesLiveBirth = glb;
        
    }
    public boolean getGivesLiveBirth() {return givesLiveBirth;}
}