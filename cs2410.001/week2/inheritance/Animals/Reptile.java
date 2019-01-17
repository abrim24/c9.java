class Reptile extends Animal {
    private String bloodType;
    public Reptile() {
        bloodType = "cold";
    }
    public Reptile(String bt) {
        bloodType = bt;
    }
    public String getBloodType() {return bloodType;}
    public void setBloodType(String bt) {bloodType = bt;}
}