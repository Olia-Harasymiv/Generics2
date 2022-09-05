package main;

import java.util.List;

public interface UserService<Account, User> {
    void showAllUsers(List<User> users);
    void showAllAccounts(User user);
    double getTaxAmount(User user);
}
