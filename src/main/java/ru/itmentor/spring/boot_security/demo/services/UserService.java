package ru.itmentor.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import ru.itmentor.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    @Transactional(readOnly = true)
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void update(Long id, User user);
    void deleteById(Long id);

}
