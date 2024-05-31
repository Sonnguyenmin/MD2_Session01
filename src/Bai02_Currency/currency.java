package Bai02_Currency;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        double usd;
        System.out.println("Nhap gia tri USD: ");
        usd = scanner.nextDouble();
        int vnd = (int)rate * (int)usd;
        System.out.println("Gia tri VND: " + vnd);
    }
}
