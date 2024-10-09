package ie.atu.week4;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person> personList =new ArrayList<>();
    @GetMapping("/getPerson")
    public List<Person> getPersons(){
        return personList;
    }

    @PostMapping("/addPerson")
    public List<Person> addPersons(@Valid @RequestBody Person person){
        personList.add(person);
        return personList;
    }
}
