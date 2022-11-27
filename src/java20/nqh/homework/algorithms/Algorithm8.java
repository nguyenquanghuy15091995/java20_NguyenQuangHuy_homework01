package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm8 {
    public void capitalizeString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i += 1) {
            String[] letters = arr[i].split("");
            if(letters.length > 0) {
                letters[0] = letters[0].toUpperCase();
            }

            arr[i] = String.join("", letters);
        }

        str = String.join(" ", arr);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Algorithm8 al8 = new Algorithm8();
        al8.capitalizeString();
    }
}
