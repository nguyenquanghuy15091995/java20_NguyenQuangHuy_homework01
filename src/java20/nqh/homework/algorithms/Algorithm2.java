package java20.nqh.homework.algorithms;

public class Algorithm2 {
    private String getUnitBinary(int dec) {
        if (dec % 2 == 0) {
            return "0";
        } else {
            return "1";
        }
    }

    public void convertDecimalToBinary(int dec) {
        String result = "";
        int decTemp = dec;
        do {
            result = this.getUnitBinary(decTemp) + result;
            decTemp /= 2;

        } while (decTemp / 2 != 0);
        result = this.getUnitBinary(decTemp) + result;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Algorithm2 al2 = new Algorithm2();
        al2.convertDecimalToBinary(47);
    }
}
