package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm11 {
    public double log2(int x) {
        return Math.log(x) / Math.log(2);
    }

    public void getCorrectNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        double limit = this.log2(n);
        double floorTemp = Math.floor(limit);
        if (limit == floorTemp) {
            System.out.println("The correct number is: " + (int) (floorTemp));
        } else {
            System.out.println("The correct number is: " + (int) (floorTemp - 1));
        }
    }

    public static void main(String[] args) {
        Algorithm11 al11 = new Algorithm11();
        al11.getCorrectNumber();
    }
}
