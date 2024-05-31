package bai01;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Mời bạn nhập tên:");
        String name = scanner.nextLine();
        System.out.println("\n Tên của bạn là: " + name);
    }
}
