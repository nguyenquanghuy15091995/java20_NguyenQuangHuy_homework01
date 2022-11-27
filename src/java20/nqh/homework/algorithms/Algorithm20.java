package java20.nqh.homework.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm20 {
    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i += 1) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public void find2Array(int[] arr) {
        List<Integer> odds = new ArrayList<Integer>();
        List<Integer> evens = new ArrayList<Integer>();
        for (int item:
             arr) {
            if(item % 2 == 0) {
                evens.add(item);
            } else {
                odds.add(item);
            }
        }
        System.out.print("Odds: ");
        for (int item:
             odds) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("Evens: ");
        for (int item:
                evens) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        Algorithm20 al20 = new Algorithm20();
        int[] arr = al20.createArray();
        al20.find2Array(arr);
    }
}
