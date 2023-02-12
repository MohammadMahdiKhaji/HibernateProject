
package ir.webapp.startup.model.service;


import ir.webapp.startup.model.common.JPA;
import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.PersonSkill;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.repository.PersonDA;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;
import jakarta.persistence.Query;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonService extends ServiceImpl<Person, Long> {
    private static PersonService personService = new PersonService();

    private PersonService() {
    }

    public static PersonService getPersonService() {
        return personService;
    }

    @Override
    public Person save(Person person) throws Exception {
        try(CRUDRepository<Person, Long> personRepository = new CRUDRepository<>()) {
            return personRepository.insert(person);
        }
    }

    @Override
    public Person edit(Person person) throws Exception {
        return null;
    }

    @Override
    public Person remove(Long aLong) throws Exception {
        return null;
    }

    @Override
    public List<Person> findAll() throws Exception {
        try(CRUDRepository<Person, Long> personRepository = new CRUDRepository<>()) {
            return personRepository.selectAll(Person.class);
        }
    }

    @Override
    public Person findById(Long aLong) throws Exception {
        return null;
    }

//    public Person addSkill(Person person, PersonSkill skill) {
//        CRUDRepository<Person, Long> personRepository = new CRUDRepository<>();
//        person = personRepository.selectById(Person.class, person.getId());
////        person.getSkills().add(skill);
//        return personRepository.update(person);
//    }
//
//    public List<PersonSkill> skills(Long id) {
//        CRUDRepository<PersonSkill, Long> personRepository = new CRUDRepository<>();
//        return personRepository.executeQuery("skills");
//    }

    public Long findByEmail(Person person) throws Exception {
        try(PersonDA repository = new PersonDA()) {
            return repository.findByEmail(person);
        }
    }

    public boolean checkEmail(Person person) throws Exception {
        try(PersonDA repository = new PersonDA()) {
            return repository.checkEmail(person);
        }
    }
}
