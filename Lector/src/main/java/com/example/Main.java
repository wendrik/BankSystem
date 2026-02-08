package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<UserBank> user = new ArrayList<>();

        UserBank user1 = new UserBank(1, "Andrey", 100000.0);
        UserBank user2 = new UserBank(2, "Alex", 23502.50);
        UserBank user3 = new UserBank(3, "Moni", 54562.24);
        UserBank user4 = new UserBank(4, "Martin", 42065.12);
        UserBank user5 = new UserBank(5, "Anna", 84582.35);

        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        user.add(user5);

        BankService service = new BankService(user);
        ConsoleUI ui = new ConsoleUI(service);



        ui.start();
    }

}
