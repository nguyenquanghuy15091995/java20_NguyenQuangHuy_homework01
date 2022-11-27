package java20.nqh.homework.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm14 {
    public List<Integer> createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < length; i += 1) {
            System.out.print("Enter number: ");
            arr.add(scanner.nextInt());
        }
        return arr;
    }

    public List<Integer> removeDuplicate(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<Integer>();
        for (Integer item:
             arr) {
            if(!newArr.contains(item)) {
                newArr.add(item);
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Algorithm14 al14 = new Algorithm14();
        List<Integer> arr = al14.createArray();
        arr = al14.removeDuplicate(arr);
        System.out.println("Final array: ");
        for (Integer item:
                arr) {
            System.out.print(item + " ");
        }
    }
}
