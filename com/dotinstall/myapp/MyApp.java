package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;

public class MyApp {
    public static void main(String[] args) {
        User tom = new User("Tom");
        // System.out.println(tom.name);
        tom.sayHi();

        AdminUser bob = new AdminUser("Bob");
        // System.out.println(bob.name);
        bob.sayHi();
        bob.sayHello();
    }
}
