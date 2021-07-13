package com.codegym;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Manage {
    List<PhoneBook> list = ReadWriteFileCSV.readFile("src/PhoneBook.csv");
    static Scanner sc = new Scanner(System.in);
    static Validate validate = new Validate();

    public Manage() throws IOException {
    }

    public void show() {
        for (PhoneBook s : list) {
            s.display();
        }
    }

    public void addPhone() {
        String phone = getPhone();
        String phoneGroup = getPhoneGroup();
        String name = getName();
        String gender = getGender();
        String address = getAddress();
        String date = getDate();
        String email = getEmail();

        list.add(new PhoneBook(phone, phoneGroup, name, gender, address, date, email));
//        ReadWriteFileCSV.writeFile("src/PhoneBook.csv", list);
    }

    public void updatePhone(String phoneNum) {
        int check = -1;
        for (PhoneBook s : list) {
            if (s.getPhoneNumber().equals(phoneNum)) {
                String phoneGroup = getPhoneGroup();
                String name = getName();
                String gender = getGender();
                String address = getAddress();
                String date = getDate();
                String email = getEmail();

                s.setPhoneGroup(phoneGroup);
                s.setName(name);
                s.setGender(gender);
                s.setAddress(address);
                s.setDateOfBirth(date);
                s.setEmail(email);
                check = 1;
            }
        }
        if (check == -1) {
            System.err.println("Không tìm thấy số trong danh bạ!");
        }
//        ReadWriteFileCSV.writeFile("src/PhoneBook.csv", list);
    }

    public void deletePhone() throws IOException {
        System.out.println("Nhập số điện thoại cần xóa: ");
        String phone = sc.nextLine();
        int check = -1;
        for (PhoneBook s : list) {
            if (s.getPhoneNumber().equals(phone)) {
                list.remove(s);
                check = 1;
            }
        }
        if (check == -1) {
            System.err.println("Không tìm thấy số trong danh bạ!");
        }
        ReadWriteFileCSV.writeFile("src/PhoneBook.csv", list);
    }

    public void findByName(String name) {
        int check = -1;
        for (PhoneBook s : list) {
            if (s.getName().contains(name)) {
                s.display();
                check = 1;
            }
        }
        if (check == -1) {
            System.err.println("Không tìm thấy tên tương đối trong danh bạ!");
        }
    }

    public void read() throws IOException {
        list = ReadWriteFileCSV.readFile("src/PhoneBook.csv");
    }

    public void write() throws IOException {
        ReadWriteFileCSV.writeFile("src/PhoneBook.csv", list);
    }


    private String getEmail() {
        while (true) {
            System.out.println("Nhập địa chỉ email: (VD:abc@gmail.com)");
            String emailNV = sc.nextLine();
            boolean exist = false;
            boolean isValid = validate.validateEmail(emailNV);
            if (!isValid) {
                System.err.println("Định dạng email không hợp lệ. Vui lòng nhập lại!");
                exist = true;
            }
            if (!exist) {
                return emailNV;
            }
        }
    }

    private String getDate() {
        while (true) {
            System.out.println("Nhập ngày sinh: ");
            String date = sc.nextLine();
            boolean exist = false;
            if (date.equals("")) {
                System.err.println("Trường không được bỏ trống!!");
                exist = true;
            }
            if (!exist) {
                return date;
            }
        }
    }

    private String getAddress() {
        while (true) {
            System.out.println("Nhập địa chỉ: ");
            String address = sc.nextLine();
            boolean exist = false;
            if (address.equals("")) {
                System.err.println("Trường không được bỏ trống!!");
                exist = true;
            }
            if (!exist) {
                return address;
            }
        }
    }

    private String getGender() {
        while (true) {
            System.out.println("Nhập giới tính: ");
            String gender = sc.nextLine();
            boolean exist = false;
            if (gender.equals("")) {
                System.err.println("Trường không được bỏ trống!!");
                exist = true;
            }
            if (!exist) {
                return gender;
            }
        }
    }

    private String getName() {
        while (true) {
            System.out.println("Nhập họ tên: ");
            String name = sc.nextLine();
            boolean exist = false;
            if (name.equals("")) {
                System.err.println("Trường không được bỏ trống!!");
                exist = true;
            }
            if (!exist) {
                return name;
            }
        }
    }

    private String getPhoneGroup() {
        while (true) {
            System.out.println("Nhập nhóm danh bạ: ");
            String phoneGroup = sc.nextLine();
            boolean exist = false;
            if (phoneGroup.equals("")) {
                System.err.println("Trường không được bỏ trống!!");
                exist = true;
            }
            if (!exist) {
                return phoneGroup;
            }
        }
    }

    private String getPhone() {
        while (true) {
            System.out.println("Nhập số điện thoại (9 số hoặc 10 số): ");
            String sdtNV = sc.nextLine();
            boolean exist = false;
            boolean isValid = validate.validatePhone(sdtNV);
            if (!isValid) {
                System.err.println("Số điện thoại không hợp lệ. Vui lòng nhập lại!\n" +
                        "Số điện thoại phải là số và bắt đầu bằng 0!!");
                exist = true;
            }
            if (!exist) {
                return sdtNV;
            }
        }
    }
}
