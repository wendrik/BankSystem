package com.example;

import java.util.ArrayList;

public class BankService {
    private final ArrayList<UserBank> user;

    BankService(ArrayList<UserBank> user) {
        this.user = user;
    }

    public UserBank getUserById(int inputId){
        if (inputId <= 0){
            return null;
        }
        for (UserBank i : user){
            if (i.getId() == inputId){
                return i;
            }
        }
        return null;
    }

    public boolean existsUserById(int inputId){
        return getUserById(inputId) != null;
    }

    public boolean withdraw(int id, Double amount){
        for (UserBank i : user){
            if (i.getId() == id){
               return i.withdraw(amount);
            }

        }
        return false;
    }


    public boolean deposit(int id, Double replenishment){
        for (UserBank i : user){
            if (i.getId() == id){
                return i.deposit(replenishment);
            }
        }
        return false;
    }


}
