class Loops {
    public static void main(String args[]) {
        int n=10;
        int sum;
        for(int i=0; i<n; i++) {
            
            for(int j=0; j<n; j++) {
                
                for(int k=0; k<n; k++) {
                    sum=+k;
                    System.out.println("sum: "+sum);
                }
            }
        }
    }
}