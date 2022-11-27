package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm9 {
    public void checkTwoNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = scanner.nextInt();
        while (firstNum < 10 || firstNum > 99) {
            System.out.println("Invalid number!");
            System.out.print("Enter the first number: ");
            firstNum = scanner.nextInt();
        }
        ;
        System.out.print("Enter the second number: ");
        int secondNum = scanner.nextInt();
        while (secondNum < 10 || secondNum > 99) {
            System.out.println("Invalid number!");
            System.out.print("Enter the second number: ");
            secondNum = scanner.nextInt();
        }
        ;

        String[] firstArr = ("" + firstNum).split("");
        String secondStr = "" + secondNum;
        boolean isContain = false;
        for (String item :
                firstArr) {
            if (secondStr.contains(item)) {
                isContain = true;
            }
        }

        System.out.println("Result: " + isContain);
    }

    public static void main(String[] args) {
        Algorithm9 al9 = new Algorithm9();
        al9.checkTwoNumber();
    }
}
