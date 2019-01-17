public class Animal {
    private String genus;
    public Animal() {
        genus = "unknown";
        System.out.println("Animal default constructor genus: " + genus);
    }
    public Animal(String g) {
        genus = g;
    }
    public String getGenus() {return genus;}
    public void setGenus(String g) {genus = g;}
    
}