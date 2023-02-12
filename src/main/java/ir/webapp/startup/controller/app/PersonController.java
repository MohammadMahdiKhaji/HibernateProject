package ir.webapp.startup.controller.app;


import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.UserAccess;
import ir.webapp.startup.model.repository.PersonDA;
import ir.webapp.startup.model.service.PersonService;
import org.apache.commons.lang3.RandomStringUtils;

import java.sql.Date;
import java.util.List;

public class PersonController {

    private static PersonController personController = new PersonController();

    private PersonController() {

    }

    public static PersonController getPersonController() {
        return personController;
    }

    public static Person save(String firstname, String lastname, String email, Date birthDate, String city) {
        try {
            Person person = new Person(firstname, lastname, email, birthDate, city);
            return PersonService.getPersonService().save(person);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static List<Person> findAll() {
        try {
            return PersonService.getPersonService().findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public static String resetPassword(String email) {
        try {
            if(checkEmail(email)){
                UserAccess userAccess = UserAccessController.findById(findByEmail(email));
                String randomPassword = RandomStringUtils.randomAlphanumeric(10);
                userAccess.setPassword(randomPassword);
                UserAccessController.edit(userAccess);
                return randomPassword;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }

    public static Long findByEmail(String email) throws Exception {
        try {
            return PersonService.getPersonService().findByEmail(new Person(email));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static boolean checkEmail(String email) throws Exception {
        try {
            return PersonService.getPersonService().checkEmail(new Person(email));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
