package main.java;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class User implements Comparable<User> {
    private String userName;
    private List<Account<?>> accountList;

    public User(String userName, List<Account<?>> accountList) {
        this.userName = userName;
        this.accountList = accountList;
    }

    public String getUserName() {
        return userName;
    }

    public List<Account<?>> getAccountList() {
        return accountList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", accountList=" + accountList +
                '}';
    }

    @Override
    public int compareTo(@NotNull User userToCompareWith) {
        return this.getUserName().compareTo(userToCompareWith.getUserName());
    }
}
