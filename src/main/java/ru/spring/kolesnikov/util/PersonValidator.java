package ru.spring.kolesnikov.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.spring.kolesnikov.dao.PersonDAO;
import ru.spring.kolesnikov.models.Person;

@Component
public class PersonValidator implements Validator {

    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;
        Person personInDB = personDAO.index().stream().filter(p -> p.getFullName()
                .equals(person.getFullName())).findAny().orElse(null);
        if (personInDB != null && person.getPersonId() != personInDB.getPersonId()) {
            errors.rejectValue("name", "", "This name is already taken");
        }
    }
}
