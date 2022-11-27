package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scanner.nextLine();
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        String[] arrStr = str.split("");
        System.out.println("Character at index " + " " + index + ": " + arrStr[index]);
        System.out.println("String have abcdef: " + str.contains("abcdef"));
    }
}
