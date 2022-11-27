package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm19 {
    public void simpleEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Has a lot of result.");
            } else {
                System.out.println("No result.");
            }
        } else {
            System.out.println("The result of Simple Equation is: " + (((-1) * b) / a));
        }
    }

    public void quadraticEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("No result!");
            } else {
                System.out.println("Has one result: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // delta
        double delta = b * b - 4 * a * c;
        double x1;
        double x2;
        if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Has 2 result: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Has 1 result: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("No result!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Simple Equation");
        System.out.println("2. Quadratic Equation");
        System.out.print("Choose: ");
        int choice = scanner.nextInt();

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        Algorithm19 al19 = new Algorithm19();
        if (choice == 1) {
            al19.simpleEquation(a, b);
        } else {
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();
            al19.quadraticEquation(a, b, c);
        }
    }
}
