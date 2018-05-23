package app.service.user;

import app.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();

    User findOne(int id);

}
