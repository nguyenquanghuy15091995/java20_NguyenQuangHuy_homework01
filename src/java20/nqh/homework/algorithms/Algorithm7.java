package java20.nqh.homework.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm7 {
    public void getAllDivisors() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int newNumber = scanner.nextInt();
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for(int i = 1; i <= newNumber/2; i += 1) {
            if(newNumber % i == 0) {
                divisors.add(i);
            }
        }
        System.out.print("The divisors is: [");
        for (int i = 0; i < divisors.size(); i += 1) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(divisors.get(i));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Algorithm7 al7 = new Algorithm7();
        al7.getAllDivisors();
    }
}
