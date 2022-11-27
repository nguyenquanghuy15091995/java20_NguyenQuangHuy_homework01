package java20.nqh.homework.algorithms;

import java.util.Scanner;

public class Algorithm21 {
   public String kangaroo(int x1, int v1, int x2, int v2){
        if ((v1 <= v2)) {
            return "NO";
        } else {
            for (int i = 0; i < v1 * x2; i++) {
                if (x1 + (v1*i) == x2 + (v2 * i)){
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int v1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int v2 = Integer.parseInt(input[3]);
        Algorithm21 al21 = new Algorithm21();
        System.out.println(al21.kangaroo(x1, v1, x2, v2));
    }


}
