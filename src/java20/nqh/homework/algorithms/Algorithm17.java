package java20.nqh.homework.algorithms;

import java.util.Random;
import java.util.Scanner;

public class Algorithm17 {
    public static void main(String[] args) {
        Random randI = new Random();
        int myRandInt = randI.nextInt(1000);
        myRandInt = myRandInt+1;
        System.out.println("The random number is: " + myRandInt);

        Scanner scanner = new Scanner(System.in);
        int theNumber = 0;
        do {
            System.out.print("Enter the number: ");
            theNumber = scanner.nextInt();
            if(theNumber > myRandInt) {
                System.out.println("Your number is greater then computer");
            } else if (theNumber < myRandInt) {
                System.out.println("Your number is less then computer");
            } else {
                System.out.println("Bingo!");
            }
        } while(theNumber != myRandInt);
    }
}
