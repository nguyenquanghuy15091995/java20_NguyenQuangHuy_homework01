package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm13 {
    public double[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();

        double[] arr = new double[length];

        for (int i = 0; i < length; i += 1) {
            System.out.print("Enter number: ");
            arr[i] = scanner.nextDouble();
        }

        return arr;
    }

    public void average(double[] arr) {
        double sum = 0;
        for (double item :
                arr) {
            sum += item;
        }
        System.out.println("a. Average: " + (sum / arr.length));
    }

    public void execute(double[] arr) {
        double max = 0;
        double min = 0;
        double negMax = 0;
        double negMin = 0;
        double posMax = 0;
        double posMin = 0;
        String odd = "";
        String even = "";
        for (int i = 0; i < arr.length; i += 1) {
            double item = arr[i];
            String itemTemp = i == 0 ? "" + item : ", " + item;
            if(item % 2 == 0) {
                even += itemTemp;
            } else {
                odd += itemTemp;
            }

            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
            if (item < 0) {
                if (item > negMax) {
                    negMax = item;
                }
                if (item < negMin) {
                    negMin = item;
                }
            } else {
                if (item > posMax) {
                    posMax = item;
                }
                if (item < posMin) {
                    posMin = item;
                }
            }
        }
        System.out.println("b. Min: " + min + " Max: " + max);
        System.out.println("c. Negative Min: " + negMin + " Negative Max: " + negMax);
        System.out.println("d. Positive Min: " + posMin + " Positive Max: " + posMax);
        System.out.println("e. Even: " + even + " Odd: " + odd);
    }

    public double[] insertByIndex(double[] arr, double newValue, int idx) {
        double[] newArr = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i += 1) {
            if (i == idx) {
                newArr[i] = newValue;
                newArr[i + 1] = arr[i];
            } else if (i < idx) {
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        return newArr;
    }

    public double[] deleteByIndex(double[] arr, int idx) {
        double[] newArr = new double[arr.length - 1];
        for (int i = 0; i < arr.length; i += 1) {
            if (i == idx) {
                continue;
            } else if (i < idx) {
                newArr[i] = arr[i];
            } else {
                newArr[i - 1] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Algorithm13 al13 = new Algorithm13();
        double[] arr = al13.createArray();
        al13.average(arr);
        al13.execute(arr);
        System.out.println("f. Insert value 3 at index 2");
        arr = al13.insertByIndex(arr, 3, 2);
        System.out.print("Inserted: ");
        for (double item:
             arr) {
            System.out.print((int)item + " ");
        }
        System.out.println();
        System.out.println("g. Delete value 2 at index 1");
        arr = al13.deleteByIndex(arr, 1);
        for (double item:
                arr) {
            System.out.print((int)item + " ");
        }
    }
}
