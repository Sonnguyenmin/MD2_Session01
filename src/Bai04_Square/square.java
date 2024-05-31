package Bai04_Square;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edge;
        System.out.println("Mời bạn nhập cạnh: ");
        edge = scanner.nextInt();
        int square = edge * edge;
        System.out.println("Bình phương là " + square);
        int Cube = edge * edge * edge;
        System.out.println("Lập phương là " + Cube);
    }
}
