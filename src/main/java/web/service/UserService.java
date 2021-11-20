package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User readUser(long id);

    void createUser(User user);

    void editUser(long id, User updatedUser);

    void deleteUser(long id);
}
