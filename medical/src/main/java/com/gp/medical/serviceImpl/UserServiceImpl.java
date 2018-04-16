package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Authority;
import com.gp.medical.entity.Document;
import com.gp.medical.entity.Person;
import com.gp.medical.entity.User;
import com.gp.medical.repository.AuthorityRepository;
import com.gp.medical.repository.DocumentRepository;
import com.gp.medical.repository.PersonRepository;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.UserService;
import com.gp.medical.tool.Switch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @Value("${limitNum}")
    private int limitNum;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }

    @Override
    public Integer registeredUser(User user) {

        //权限设置
        List<Authority> authorityList = new ArrayList<>();
        authorityList.add(authorityRepository.findOne(1));

        //收藏列表初始化
        List<Person> collectionPersons = new ArrayList<>();

        String nowPass = new String(Base64.decode(user.getPassword().getBytes()));
        user.setPassword(encoder.encode(nowPass));
        user.setAuthorities(authorityList);
        user.setPersonCollections(collectionPersons);

        return userRepository.save(user).getId();
    }

    @Override
    public User login(User user) {
        String password = new String(Base64.decode(user.getPassword().getBytes()));
        User userInDatabase = userRepository.findByUsername(user.getUsername());
        if(userInDatabase != null){
            if(encoder.matches(password,userInDatabase.getPassword())){
                return Switch.switchUser(userInDatabase);
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    @Override
    public void collectionPerson(Integer userId,Integer personId) {
        User user = userRepository.findOne(userId);
        user.getPersonCollections().add(personRepository.findOne(personId));
        userRepository.save(user);
    }

    @Override
    public void uncollectPerson(Integer userId, Integer personId) {
        User user = userRepository.findOne(userId);
        user.getPersonCollections().remove(personRepository.findOne(personId));
        userRepository.save(user);
    }

    @Override
    public void uncollectDoc(Integer userId,Integer docId){
        User user = userRepository.findOne(userId);
        user.getDocCollections().remove(documentRepository.findOne(docId));
        userRepository.save(user);
    }

    @Override
    public void collectionDoc(Integer userId,Integer docId){
        User user = userRepository.findOne(userId);
        user.getDocCollections().add(documentRepository.findOne(docId));
        userRepository.save(user);
    }

    @Override
    public List<Person> pageCollections(Integer userId,int page){
        User user = userRepository.findOne(userId);
        List<Person> collectionsInDatabase =  user.getPersonCollections();
        List<Person> collections = new ArrayList<>();
        for(int i = (page - 1) * limitNum + 1; i<=limitNum * page && i <= collectionsInDatabase.size();i++){
            collections.add(Switch.switchPerson(collectionsInDatabase.get(i-1)));
        }
        return collections;
    }

    @Override
    public List<Document> pageDocCollections(Integer userId,int page){
        User user = userRepository.findOne(userId);
        List<Document> collectionsInDatabase = user.getDocCollections();
        List<Document> collections = new ArrayList<>();
        for(int i = (page - 1) * limitNum + 1;i<=limitNum * page && i <= collectionsInDatabase.size();i++){
            collections.add(Switch.switchDoc(collectionsInDatabase.get(i - 1)));
        }
        return collections;
    }

    @Override
    public int getCollectionCount(Integer userId) {
        User user = userRepository.findOne(userId);
        if(user.getPersonCollections() != null) {
            return user.getPersonCollections().size();
        }else{
            return 0;
        }
    }

    @Override
    public int getDocCollectionCount(Integer userId) {
        User user = userRepository.findOne(userId);
        if(user.getDocCollections() != null){
            return user.getDocCollections().size();
        }else{
            return 0;
        }
    }


}
