package controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import service.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    public ResponseEntity<?> getAllStudents()
    {
        return ResponseEntity.ok(this.personService.getAllPersons());
    }
}
