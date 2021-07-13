package com.codegym;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Manage managePhone = new Manage();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("8. Exit");
            System.out.println("Enter choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.println("Danh sách:");
                    managePhone.show();
                }
                case "2" -> {
                    System.out.println("Thêm mới");
                    managePhone.addPhone();
                }
                case "3" -> {
                    System.out.println("Nhập số điện thoại cần sửa!");
                    String phone = sc.nextLine();
                    managePhone.updatePhone(phone);
                }
                case "4" -> managePhone.deletePhone();

                case "5" -> {
                    System.out.println("Nhập tên cần tìm: ");
                    String name = sc.nextLine();
                    managePhone.findByName(name);
                }
                case "6" -> {
                    System.out.println("Đọc file.....");
                    managePhone.read();
                }
                case "7" -> {
                    System.out.println("Ghi file.....");
                    managePhone.write();
                }
                case "8" -> System.exit(0);
            }
        }
    }
}
