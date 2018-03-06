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
    public Long registeredUser(User user) {

        List<Authority> authorityList = new ArrayList<>();
        authorityList.add(authorityRepository.findOne(1L));

        CharSequence nowPass = new String(Base64.decode(user.getPassword().getBytes()));
        user.setPassword(new BCryptPasswordEncoder().encode(nowPass));
        user.setAuthorities(authorityList);

        return userRepository.save(user).getId();
    }
}
