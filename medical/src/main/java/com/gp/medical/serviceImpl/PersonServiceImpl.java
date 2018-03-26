package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Person;
import com.gp.medical.entity.User;
import com.gp.medical.repository.PersonRepository;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.PersonService;
import com.gp.medical.tool.Switch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/9 0009.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private UserRepository userRepository;

    @Value("${image_path}")
    private String path;

    @Value("${limitNum}")
    private int limitNum;

    @Override
    public void savePerson(Person person, Long userId) {
        person.setUser(userRepository.findOne(userId));
        personRepository.save(person);
    }

    @Override
    public List<Person> minePersonByPage(Long userId,String page) {
        List<Person> personList = new ArrayList<>();
        for(Person person : personRepository.minePersonByPage(userId,Integer.valueOf(page),limitNum)){
            personList.add(Switch.switchPerson(person));
        }
        return personList;
    }

    @Override
    public List<Person> allPerson() {
        List<Person> alPersonList = new ArrayList<>();
        for(Person alPerson : personRepository.allPerson()){
            alPersonList.add(Switch.switchPerson(alPerson));
        }
        return alPersonList;
    }

    @Override
    public Person getPersonById(Long id) {
        return Switch.switchPerson(personRepository.findOne(id));
    }

    @Override
    public String uploadImage(MultipartFile file) {
        String imageName = ""+file.hashCode()+".jpg";
        File targetFile = new File(path,imageName);
        try {
            file.transferTo(targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageName;
    }

    @Override
    public List<Person> latestPerson() {
        List<Person> personList = new ArrayList<>();
        List<Person> personInDatabase = personRepository.latestPerson();
        for(Person person : personInDatabase){
            personList.add(Switch.switchPerson(person));
        }
        return personList;
    }

    @Override
    public Long getPersonCount() {
        return personRepository.count();
    }

    @Override
    public int getMinePersonCount(Long userId) {
        return personRepository.getPersonByUserId(userId).size();
    }

    @Override
    public List<Person> getPersonByPage(String page) {
        List<Person> personInDatabase = personRepository.getPersonByPage(limitNum,(Integer.valueOf(page)-1) * limitNum);
        List<Person> personList = new ArrayList<>();
        for(Person person : personInDatabase){
            personList.add(Switch.switchPerson(person));
        }
        return personList;
    }

    @Override
    public Boolean hasCollect(Long userId, Long personId) {
        List<User> userList = personRepository.findOne(personId).getUserList();
        List<Long> userIdList = new ArrayList<>();
        for(User user : userList){
            userIdList.add(user.getId());
        }
        if(userIdList.contains(userId)){
            return true;
        }else{
            return false;
        }
    }
}
