package web.service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUserList();

    User getUserById(Long id);

    void updateUser(User user);

    void removeUser(Long id);
}
