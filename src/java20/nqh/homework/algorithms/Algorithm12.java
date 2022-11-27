package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i += 1) {
            for (int j = 0; j <= i; j += 1) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
