package main.java;

import main.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        Account<String> accountD1 = new DebitAccount("a", 5000.00);
        Account<String> accountD2 = new DebitAccount("b", 5000.00);
        Account<Integer> accountC1 = new CreditAccount(12, 5000.00);
        List<Account<?>> accountList1 = new ArrayList<>();
        accountList1.add(accountD1);
        accountList1.add(accountD2);
        accountList1.add(accountC1);
        User user1 = new User("Harry Potter", accountList1);

        Account<String> accountD3 = new DebitAccount("c", 6000.00);
        Account<String> accountD4 = new DebitAccount("d", 6000.00);
        Account<Integer> accountC2 = new CreditAccount(13, 6000.00);
        List<Account<?>> accountList2 = new ArrayList<>();
        accountList2.add(accountD3);
        accountList2.add(accountD4);
        accountList2.add(accountC2);
        User user2 = new User("Ron Weasley", accountList2);

        Account<String> accountD5 = new DebitAccount("e", 7000.00);
        Account<String> accountD6 = new DebitAccount("f", 7000.00);
        Account<Integer> accountC3 = new CreditAccount(14, 7000.00);
        List<Account<?>> accountList3 = new ArrayList<>();
        accountList3.add(accountD5);
        accountList3.add(accountD6);
        accountList3.add(accountC3);
        User user3 = new User("Voldemort", accountList3);


        users.add(user1);
        users.add(user2);
        users.add(user3);
        for (User u : users) {
            userServiceImpl.showAllAccounts(u);
        }

        userServiceImpl.showAllUsers(users);
        users.forEach(userServiceImpl::showAllAccounts);

    }
}
