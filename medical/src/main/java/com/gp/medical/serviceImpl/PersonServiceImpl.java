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
import java.math.BigInteger;
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
    public void savePerson(Person person, Integer userId) {
        person.setUser(userRepository.findOne(userId));
        personRepository.save(person);
    }

    @Override
    public List<Person> minePersonByPage(Integer userId,String page) {
        List<Person> personList = new ArrayList<>();
        for(Person person : personRepository.minePersonByPage(userId,(Integer.valueOf(page)-1)*limitNum,limitNum)){
            personList.add(Switch.switchPerson(person));
        }
        return personList;
    }

    @Override
    public List<Person> allPerson() {
        List<Person> personList = new ArrayList<>();
        for(Person person : personRepository.allPerson()){
            personList.add(Switch.switchPerson(person));
        }
        return personList;
    }

    @Override
    public Person getPersonById(Integer id) {
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
    public Integer getPersonCount(String gender, String age) {

        if("不限".equals(gender) && "不限".equals(age)){
            return Math.toIntExact(personRepository.count());
        }else if("不限".equals(gender) && !"不限".equals(age)){
            String[] ageArray = age.split("-");
            return personRepository.getAgeConditionPersonCount(Integer.valueOf(ageArray[0]),Integer.valueOf(ageArray[1]));
        }else if(!"不限".equals(gender) && "不限".equals(age)){
            return personRepository.getGenderConditionPersonCount(gender);
        }else{
            String[] ageArray = age.split("-");
            return personRepository.getGenderAndAgeConditionPersonCount(gender,Integer.valueOf(ageArray[0]),Integer.valueOf(ageArray[1]));
        }
    }

    @Override
    public int getMinePersonCount(Integer userId) {
        return personRepository.getPersonByUserId(userId).size();
    }

    @Override
    public List<Person> getPersonByPage(String page,String gender,String age) {

        List<Person> personInDatabase = null;
        List<Person> personList = new ArrayList<>();
        int offset = (Integer.valueOf(page)-1) * limitNum;

        if("不限".equals(gender) && "不限".equals(age)){
            personInDatabase =  personRepository.getPersonByPage(limitNum,offset);
        }else if("不限".equals(gender) && !"不限".equals(age)){
            String[] ageArray = age.split("-");
            personInDatabase = personRepository.getPersonByPageAndAge(limitNum,offset,Integer.valueOf(ageArray[0]),Integer.valueOf(ageArray[1]));
        }else if(!"不限".equals(gender) && "不限".equals(age)){
            personInDatabase = personRepository.getPersonByPageAndGender(limitNum,offset,gender);
        }else{
            String[] ageArray = age.split("-");
            personInDatabase = personRepository.getPersonByPageAndGenderAndAge(limitNum,offset,gender,Integer.valueOf(ageArray[0]),Integer.valueOf(ageArray[1]));
        }
        for(Person person : personInDatabase){
            personList.add(Switch.switchPerson(person));
        }
        return personList;
    }

    @Override
    public Boolean hasCollect(Integer userId, Integer personId) {
        List<User> userList = personRepository.findOne(personId).getUserList();
        List<Integer> userIdList = new ArrayList<>();
        for(User user : userList){
            userIdList.add(user.getId());
        }
        if(userIdList.contains(userId)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void updatePerson(Person person) {
        Person oldObj = personRepository.findOne(person.getId());
        oldObj.setAddress(person.getAddress());
        oldObj.setAge(person.getAge());
        oldObj.setBmi(person.getBmi());
        oldObj.setCulture(person.getCulture());
        oldObj.setFileName(person.getFileName());
        oldObj.setGender(person.getGender());
        oldObj.setHeight(person.getHeight());
        oldObj.setName(person.getName());
        oldObj.setNation(person.getNation());
        oldObj.setPhone(person.getPhone());
        oldObj.setWeight(person.getWeight());
        personRepository.save(oldObj);
    }

    @Override
    public List<Person> getSearchPerson(String name) {
        List<Person> personList = new ArrayList<>();
        List<Person> personInDataBaseList = personRepository.getSearchPerson(name);
        if(!personInDataBaseList.isEmpty()){
            for(Person person : personInDataBaseList){
                personList.add(Switch.switchPerson(person));
            }
        }
        return personList;
    }

    @Override
    public List<Integer> getAgeChartData() {
        List<BigInteger> ageChartDataInDatabase =  personRepository.getAgeChartData();
        List<Integer> ageChartData = new ArrayList<>();
        for(BigInteger ageCount : ageChartDataInDatabase){
            ageChartData.add(Integer.valueOf(""+ageCount));
        }
        return ageChartData;
    }

    @Override
    public List<Integer> getGenderChartData() {
        List<BigInteger> genderChartDataInDatabase = personRepository.getGenderChartData();
        List<Integer> genderChartData = new ArrayList<>();
        for(BigInteger genderCount: genderChartDataInDatabase){
            genderChartData.add(Integer.valueOf(""+genderCount));
        }
        return genderChartData;
    }
}
