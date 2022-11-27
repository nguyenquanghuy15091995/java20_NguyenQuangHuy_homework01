package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm10 {
    public void sumOfPrimeNumber() {
        int count, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int max = scanner.nextInt();
        for (int number = 1; number <= max; number++) {
            count = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && number != 1) {
                sum = sum + number;
            }
        }

        System.out.println("The Sum of Prime Numbers is: " + sum);
    }

    public static void main(String[] args) {
        Algorithm10 al10 = new Algorithm10();
        al10.sumOfPrimeNumber();
    }
}
