public class Test {
  public static void main(String[] args) {
    new B();
  }
}

class A {
  int i = 5;
  
  public A() {
    System.out.println("i from A is " + i);
  }
  
  public void setI(int i) {
    this.i = 3 * i;
  }
}

class B extends A {
  public B() {
    setI(10);
    // System.out.println("i from B is " + i);
  }
  
  @Override
  public void setI(int i) {
    this.i = 4 * i;
  }
}