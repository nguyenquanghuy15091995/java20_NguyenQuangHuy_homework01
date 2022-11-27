package java20.nqh.homework.algorithms;

public class Algorithm3 {
    public void getJavaInfo() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + Runtime.version());
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }

    public static void main(String[] args) {
        Algorithm3 al3 = new Algorithm3();
        al3.getJavaInfo();
    }
}
