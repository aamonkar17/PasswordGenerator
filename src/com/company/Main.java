package com.company;

public class Main {

    public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(3);
        PasswordGenerator pw2 = new PasswordGenerator(5);
        PasswordGenerator pw3 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwgen());
        System.out.println(pw2.pwgen());
        System.out.println(pw3.pwgen());
        PasswordGenerator.pwCount();
    }
}
