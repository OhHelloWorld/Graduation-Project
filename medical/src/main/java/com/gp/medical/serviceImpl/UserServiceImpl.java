package com.gp.medical.serviceImpl;

import com.gp.medical.entity.User;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
@Service
public class UserServiceImpl implements UserDetailsService,UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }

    @Override
    public void removeUser(Long id) {
        userRepository.delete(id);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        String password  = user.getPassword().split(" ")[1];
        CharSequence nowPass = new String(Base64.decode(password.getBytes())).split(":")[1];
        System.out.println(nowPass);
        user.setPassword(new BCryptPasswordEncoder().encode(nowPass));
        userRepository.save(user);
    }
}
