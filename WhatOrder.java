/*Define a generic method called checkOrder() that checks if four items are in ascending, neither, or descending order. The method should return -1 if the items are in ascending order, 0 if the items are unordered, and 1 if the items are in descending order.

The program reads four items from input and outputs if the items are ordered. The items can be different types, including integers, Strings, characters, or doubles.

Ex. If the input is:

bat hat mat sat
63.2 96.5 100.1 123.5
the output is:

Order: -1
Order: -1     z*/




import java.util.Scanner;

public class WhatOrder {
   public static <T extends Comparable<T>>
   int checkOrder(T item1, T item2, T item3, T item4) {
        
        if(item1.compareTo(item2) < 0 && item2.compareTo(item3) < 0 && item3.compareTo(item4) < 0) {
            return -1;
        }
        else if (item1.compareTo(item2) > 0 && item2.compareTo(item3) > 0 && item3.compareTo(item4) > 0) {
            return 1;
        }
        else {
            return 0;
        }
 
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Check order of four strings
      System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next())); 

      // Check order of four doubles
      System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
   }
}
