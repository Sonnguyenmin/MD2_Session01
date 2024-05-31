package Bai03_Perimeter_Area;

import java.util.Scanner;

public class perimeter_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo các biến chiều dài , chiều rộng, chu vi và diện tích của hình chữ nhật. Trong đó chiều dài và chiều rộng cho người dùng nhập vào.
        int length ;
        int width;
        System.out.println("Mời bạn nhập chiều rộng:");
        length = scanner.nextInt();
        System.out.println("Mời bạn nhập chiều dài:");
        width = scanner.nextInt();
        int perimeter = (length + width) * 2;
        System.out.println("Chu vi hình chữ  nhật là " + perimeter);
        int area = length * width;
        System.out.println("Diện tích chữ nhật là: " + area);

    }
}
