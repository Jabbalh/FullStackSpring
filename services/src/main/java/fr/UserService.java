package fr;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Nico on 11/02/2016.
 */
public class UserService implements IUserService {

    @Autowired
    private UserRepository userDao;

    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }
}
