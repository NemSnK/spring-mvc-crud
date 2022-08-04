package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService{
    private final UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) { this.userDao = userDao; }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public User getUserById(Long id) { return userDao.getUserById(id); }

    @Transactional
    @Override
    public void updateUser(User user) { userDao.updateUser(user); }

    @Transactional
    @Override
    public void removeUser(Long id) { userDao.removeUser(id); }
}
