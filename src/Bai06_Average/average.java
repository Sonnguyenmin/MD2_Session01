package Bai06_Average;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        //Nhập điểm 3 môn Toán, Văn, Anh.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm Toán: ");
        int toan = scanner.nextInt();
        System.out.println("Mời bạn nhập điểm Văn: ");
        int van = scanner.nextInt();
        System.out.println("Mời bạn nhập điểm Anh: ");
        int anh = scanner.nextInt();
        int average = (toan + van + anh) / 3;
        System.out.println("Điểm trung bình là: " + average);
        if (average < 5) {
            System.out.println("Trượt");
        } else {
            System.out.println("Đậu");
        }
    }
}
