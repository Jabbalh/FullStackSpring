package fr.auth;

import fr.User;
import fr.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


/**
 * Created by Nico on 11/02/2016.
 */
@Component
public class AuthClientService implements UserDetailsService {

    @Autowired
    private UserRepository userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDao.findByLogin(username);
        System.out.println("nhuet -> " + new BCryptPasswordEncoder().encode("nhuet"));
        System.out.println("gtasset -> " + new BCryptPasswordEncoder().encode("gtasset"));
        if (user != null) return user;

        throw new UsernameNotFoundException("Username not found");
    }
}