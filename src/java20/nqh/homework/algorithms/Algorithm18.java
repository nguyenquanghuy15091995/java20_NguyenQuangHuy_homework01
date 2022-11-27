package java20.nqh.homework.algorithms;

public class Algorithm18 {
    public static void main(String[] args) {
        double moneyStart = 50000;
        double moneyDes = 100000;
        double percentagePerYear = 0.012;
        int yearToGetMoney = 0;
        do {
            moneyStart += moneyStart * percentagePerYear;
            yearToGetMoney += 1;
        } while (moneyStart < moneyDes);
        System.out.println("The year to get money: " + yearToGetMoney + " years");
    }
}
