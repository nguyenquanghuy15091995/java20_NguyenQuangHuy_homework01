package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm4 {
    public void getNumberLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int newNumber = scanner.nextInt();
        String result = "" + newNumber;
        System.out.println("The length of number is: " + result.length());
    }

    public static void main(String[] args) {
        Algorithm4 al4 = new Algorithm4();
        al4.getNumberLength();
    }
}
