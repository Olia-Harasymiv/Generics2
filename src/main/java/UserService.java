package main.java;


import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class UserService {

    public void showAllAccounts(List<main.java.User> users) {
        System.out.println("There are all users accounts");
        for (main.java.User user : users) {
            System.out.println(user.getUserName());
            List<Account<?>> accounts = user.getAccountList();
            for (Account<?> account : accounts){
                System.out.println("\t " + account);
            }
        }
    }

    public Double showTax(@NotNull User user, double price) {
        Double totalSum = 0.0;
        Double tax;
        for (Account<?> account:  user.getAccountList()) {
            totalSum = totalSum + account.getSum();
        }
        tax = totalSum*0.05;
        return tax;
    }
}
