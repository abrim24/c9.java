package week10.fri;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Test4 {
          public static void main(String[] args) {
            IntegerProperty d1 = new SimpleIntegerProperty(2);
            IntegerProperty d2 = new SimpleIntegerProperty(4);
            d1.bind(d2);
            System.out.print("d1 is " + d1.getValue()
              + " and d2 is " + d2.getValue());
            d2.setValue(6);
            System.out.println(", d1 is " + d1.getValue()
              + " and d2 is " + d2.getValue());
          }
        }