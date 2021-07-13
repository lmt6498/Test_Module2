package com.codegym;

public class PhoneBook{
    private String phoneNumber;
    private String phoneGroup;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;

    public PhoneBook() {

    }

    public PhoneBook(String phoneNumber, String phoneGroup, String name, String gender, String address, String dateOfBird, String email) {
        this.phoneNumber = phoneNumber;
        this.phoneGroup = phoneGroup;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBird;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneGroup() {
        return phoneGroup;
    }

    public void setPhoneGroup(String phoneGroup) {
        this.phoneGroup = phoneGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", phoneGroup='" + phoneGroup + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBird='" + dateOfBirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void display() {
        System.out.println("PhoneBook: " +
                "Số điện thoại= " + phoneNumber +
                ", Nhóm= " + phoneGroup +
                ", Tên= " + name +
                ", Giới tính= " + gender +
                ", Địa chỉ= " + address +
                ", Ngày sinh= " + dateOfBirth +
                ", Email= " + email);
    }

    public String writes() {
        return phoneNumber + "," + phoneGroup + "," + name + "," + gender + "," + address + "," + dateOfBirth + "," + email;
    }
}
