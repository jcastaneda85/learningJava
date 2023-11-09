// java
// some changes and stuff foo

import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What do you want to say to the world?");

        String input = scnr.nextLine();

        System.out.println(input + " World!");
    }
}