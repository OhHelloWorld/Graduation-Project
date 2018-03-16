package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Person;
import com.gp.medical.repository.PersonRepository;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final String path = "F://image";

    @Override
    public void savePerson(Person person, Long userId) {
        person.setUser(userRepository.findOne(userId));
        personRepository.save(person);
    }

    @Override
    public List<Person> minePerson(Long userId) {
        return personRepository.minePerson(userId);
    }

    @Override
    public List<Person> allPerson() {
        List<Person> alPersonList = new ArrayList<>();
        for(Person alPerson : personRepository.allPerson()){
            alPersonList.add(switchAlPerson(alPerson));
        }
        return alPersonList;
    }

    @Override
    public Person getPersonById(Long id) {
        return switchAlPerson(personRepository.findOne(id));
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

    /**
     * 转换entity格式使程序不会陷入死循环
     * @param personInDatabase
     * @return
     */
    private Person switchAlPerson(Person personInDatabase){
        Person newPerson = new Person();
        newPerson.setName(personInDatabase.getName());
        newPerson.setId(personInDatabase.getId());
        newPerson.setAddress(personInDatabase.getAddress());
        newPerson.setAge(personInDatabase.getAge());
        newPerson.setBmi(personInDatabase.getBmi());
        newPerson.setCulture(personInDatabase.getCulture());
        newPerson.setFileName(personInDatabase.getFileName());
        newPerson.setGender(personInDatabase.getGender());
        newPerson.setHeight(personInDatabase.getHeight());
        newPerson.setNation(personInDatabase.getNation());
        newPerson.setPhone(personInDatabase.getPhone());
        newPerson.setWeight(personInDatabase.getWeight());
        return newPerson;
    }

}
