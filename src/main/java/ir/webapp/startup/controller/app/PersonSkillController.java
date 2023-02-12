package ir.webapp.startup.controller.app;

import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.PersonSkill;
import ir.webapp.startup.model.entity.enumeration.SkillLevelType;
import ir.webapp.startup.model.service.PersonSkillService;

import java.sql.Date;
import java.time.LocalDate;

public class PersonSkillController {

    private static PersonSkillController personSkillController = new PersonSkillController();

    private PersonSkillController() {

    }

    public static PersonSkillController getPersonSkillController() {
        return personSkillController;
    }

    public static PersonSkill add(Person person, String title , LocalDate certificateDate , String institute , SkillLevelType level){
        try {
            PersonSkill personSkill = new PersonSkill(person, title , Date.valueOf(certificateDate) , institute , level);
            return PersonSkillService.getPersonSkillService().save(personSkill);
        } catch (Exception e) {
            return null;
        }
    }
}
