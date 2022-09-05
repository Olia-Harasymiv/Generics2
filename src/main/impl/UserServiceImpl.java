package main.impl;

import main.UserService;
import main.java.Account;
import main.java.User;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements UserService<Account<?>, User> {

    public void sortByUsername(List<User> users) {
        Collections.sort(users);
    }

    @Override
    public void showAllUsers(List<User> users) {
        for (main.java.User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public void showAllAccounts(User user) {
        System.out.println(user.getUserName());
        List<Account<?>> accounts = user.getAccountList();
        for (Account<?> account : accounts){
            System.out.println("\t " + account);
        }
    }


    @Override
    public double getTaxAmount(User user) {
        return 0;
    }
}
