package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm6 {
    public void getReversedString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str);
        strBuilder.reverse();
        System.out.print("A reversed string is: " + strBuilder);
    }

    public static void main(String[] args) {
        Algorithm6 al6 = new Algorithm6();
        al6.getReversedString();
    }
}
