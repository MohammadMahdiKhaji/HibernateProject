package ir.webapp.startup.controller.app;


import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.PersonEducation;
import ir.webapp.startup.model.entity.enumeration.EducationLevelType;
import ir.webapp.startup.model.service.PersonEducationService;

import java.sql.Date;
import java.time.LocalDate;

public class PersonEducationController {

    private static PersonEducationController personEducationController = new PersonEducationController();

    private PersonEducationController() {

    }

    public static PersonEducationController getPersonEducationController() {
        return personEducationController;
    }

    public static PersonEducation save(Person person, EducationLevelType level, String field, float grade, String university, LocalDate graduationDate) {
        try {
            PersonEducation personEducation = new PersonEducation(person,level, field, grade, university, Date.valueOf(graduationDate));
            return PersonEducationService.getPersonEducationService().save(personEducation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
