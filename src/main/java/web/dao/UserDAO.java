package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User readUser(long id);

    void createUser(User user);

    void editUser(long id, User updatedUser);

    void deleteUser(long id);
}
