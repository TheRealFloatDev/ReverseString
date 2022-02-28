package de.floatdev.reversestring;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter String to reverse: ");
            System.out.println(new StringBuilder().append(in.nextLine()).reverse().toString());
        }
    }

}
