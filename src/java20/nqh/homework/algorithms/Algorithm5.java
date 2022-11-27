package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm5 {
    public void getDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Point A: ");
        System.out.print("Enter x: ");
        int aX = scanner.nextInt();
        System.out.print("Enter y: ");
        int aY = scanner.nextInt();
        System.out.println("Enter Point B: ");
        System.out.print("Enter x: ");
        int bX = scanner.nextInt();
        System.out.print("Enter y: ");
        int bY = scanner.nextInt();
        double result = Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
        System.out.println("Distance of 2 point is: " + result);
    }

    public static void main(String[] args) {
        Algorithm5 al5 = new Algorithm5();
        al5.getDistance();
    }
}
