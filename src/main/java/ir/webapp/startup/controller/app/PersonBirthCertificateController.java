package ir.webapp.startup.controller.app;

import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.PersonBirthCertificate;
import ir.webapp.startup.model.service.PersonBirthCertificateService;
import java.sql.Date;
import java.time.LocalDate;

public class PersonBirthCertificateController {

    private static PersonBirthCertificateController personBirthCertificateController = new PersonBirthCertificateController();

    private PersonBirthCertificateController() {

    }

    public static PersonBirthCertificateController getPersonBirthCertificateController() {
        return personBirthCertificateController;
    }

    public static PersonBirthCertificate save(Person person,
                                              String description,
                                              String locationIssuing,
                                              String identityNumber,
                                              LocalDate birthDate) {
        try {
            PersonBirthCertificate personBirthCertificate = new
                    PersonBirthCertificate(person,description, locationIssuing, identityNumber, Date.valueOf(birthDate));
            return PersonBirthCertificateService.getBirthCertificate().save(personBirthCertificate);
        } catch (Exception e) {
            return null;
        }
    }
}
