package Bai05_Format;

import java.util.Scanner;

public class format {
    public static void main(String[] args) {
    //Xây dựng một ứng dụng hiển thị nội dung ra màn hình console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ tự:");
        int stt = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời bạn nập họ và tên:");
        String fullName = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời bạn nhập số điện thoại:");
        String phone = scanner.nextLine();
        System.out.println("Mời bạn nhập gmail:");
        String email = scanner.nextLine();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Danh sách sinh viên \t\t\t\t\t\t\t\t\t\t\t\t \n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| STT \t\t\t | Họ và tên \t\t\t | Tuổi \t\t\t | Số điện thoại \t\t\t | Email \t\t\t | \n");
        System.out.println( "| " +stt+ "\t\t\t\t" + "| "+fullName + "\t\t\t" + "| " + age +"\t\t\t" + "| " + phone + "\t" +"| " + email + "\t\t\t | \n");
    }
}