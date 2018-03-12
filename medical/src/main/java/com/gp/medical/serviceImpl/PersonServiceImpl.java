package com.gp.medical.serviceImpl;

import com.gp.medical.entity.Person;
import com.gp.medical.repository.PersonRepository;
import com.gp.medical.repository.UserRepository;
import com.gp.medical.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 转换entity格式使程序不会陷入死循环
     * @param PersonInDatabase
     * @return
     */
    private Person switchAlPerson(Person PersonInDatabase){
        Person newPerson = new Person();
        newPerson.setName(PersonInDatabase.getName());
        newPerson.setId(PersonInDatabase.getId());
        return newPerson;
    }

}
