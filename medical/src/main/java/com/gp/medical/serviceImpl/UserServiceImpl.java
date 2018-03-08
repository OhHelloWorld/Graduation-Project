package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Authority;
import com.gp.medical.entity.User;
import com.gp.medical.repository.AuthorityRepository;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
@Service
public class UserServiceImpl implements UserDetailsService,UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }

    @Override
    public Long registeredUser(User user) {

        List<Authority> authorityList = new ArrayList<>();
        authorityList.add(authorityRepository.findOne(1L));

        String nowPass = new String(Base64.decode(user.getPassword().getBytes()));
        user.setPassword(encoder.encode(nowPass));
        user.setAuthorities(authorityList);

        return userRepository.save(user).getId();
    }

    @Override
    public User login(User user) {
        String password = new String(Base64.decode(user.getPassword().getBytes()));
        User userInDatabase = userRepository.findByUsername(user.getUsername());
        if(encoder.matches(password,userInDatabase.getPassword())){
            return userInDatabase;
        }else{
            return null;
        }
    }
}
