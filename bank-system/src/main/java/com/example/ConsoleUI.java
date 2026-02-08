package com.example;


import java.util.Scanner;

public class ConsoleUI {
    private final BankService service;

    public ConsoleUI(BankService service) {
        this.service = service;
    }

    public void start(){
        Scanner reader = new Scanner(System.in);
        int inputId;
        int choice;
        double purchase ;
        double replenishment;
        while (true){
            System.out.println("Choose userId 1-5");

            if (!reader.hasNextInt()) {
                System.out.println("This is not a number. Try again.");
                reader.next();
                System.out.println("-----------------------------");
                continue;
            }

            inputId = reader.nextInt();

            if (!service.existsUserById(inputId)){
                System.out.println("Not correct ID. Try again.");
                System.out.println("-----------------------------");
            }else{
                break;
            }
        }
        UserBank user = service.getUserById(inputId);
        printUser(user);
        while (true){
            System.out.println("What you wanna do: 1. Take money, 2. Account replenishment, 3. Exit.");

            if (!reader.hasNextInt()){
                System.out.println("This is not a number. Try again.");
                reader.next();
                continue;
            }

            choice = reader.nextInt();

            if (choice != 1 && choice != 2 && choice != 3){
                System.out.println("Not correct action. Please choose again.");
                continue;
            }
            break;
        }


        switch (choice) {
            case 1:
                while (true){
                    System.out.println("How much do you want to take?:");
                    if (!reader.hasNextDouble()){
                        System.out.println("How much do you want to take?:");
                        System.out.println("This is not a number. Try again.");
                        reader.next();
                        System.out.println("-----------------------------");
                        continue;
                    }
                    purchase = reader.nextDouble();
                    if (!service.withdraw(inputId, purchase)) {
                        System.out.println("Not enough money or invalid amount");
                    }
                    break;
                }
                break;
            case 2:
                while (true){
                    System.out.println("Enter replenishment amount:");
                    if (!reader.hasNextDouble()){
                        System.out.println("Enter replenishment amount:");
                        System.out.println("This is not a number. Try again.");
                        reader.next();
                        System.out.println("-----------------------------");
                        continue;
                    }
                    replenishment = reader.nextDouble();
                    service.deposit(inputId, replenishment);
                    break;
                }
                break;
            case 3:
                break;

        }

        printUser(user);

    }

    public void printUser(UserBank user){
        int userId = user.getId();
        String name = user.getName();
        double balanced = user.getBalance();

        System.out.printf("User: %d\nName: %s\nBalance: %.2f\n", userId, name, balanced);
        System.out.println("-----------------------------");
    }
}

