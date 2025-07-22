package service;

import entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.PersonRepo;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPersons() {
        return this.personRepo.findAll();
    }
}
