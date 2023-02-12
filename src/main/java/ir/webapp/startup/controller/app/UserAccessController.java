package ir.webapp.startup.controller.app;


import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.UserAccess;
import ir.webapp.startup.model.entity.enumeration.Classification;
import ir.webapp.startup.model.repository.UserDA;
import ir.webapp.startup.model.service.UserAccessService;
import java.sql.Date;
import java.util.List;

public class UserAccessController {

    private static UserAccessController userAccessController = new UserAccessController();

    private UserAccessController() {
    }

    public static UserAccessController getUserAccessController() {
        return userAccessController;
    }


    //signup
    public static UserAccess save(String username, String password, String firstname, String lastname, String email, Date birthDate, String city) {
        try {
            return UserAccessService
                        .getUserAccessService()
                            .save(new UserAccess(new Person(firstname, lastname, email, birthDate, city), username, password, Classification.Manager));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


    public static UserAccess signup(String username, String password, String firstname, String lastname) {
        try {
            return UserAccessService.getUserAccessService().save(new UserAccess());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static UserAccess edit(UserAccess userAccess) {
        return null;
    }

    public static UserAccess remove(UserAccess userAccess, Long aLong) {
        return null;
    }

    public static List<UserAccess> findAll(UserAccess userAccess) {
        return null;
    }

    public static UserAccess findById(Long id) {
        try {
            return UserAccessService.getUserAccessService().findById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static List<UserAccess> executeQuery(String string) {
        return null;
    }

    public static UserAccess addPerson(Long userAccessId, String firstname, String lastname, String email, Date birthDate, String city){
        try {
            UserAccess userAccess = new UserAccess();
            userAccess.setId(userAccessId);
            return UserAccessService.getUserAccessService().addPerson(userAccess, new Person(firstname, lastname, email, birthDate, city));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static boolean login(String username, String password) {
        try {
            return UserAccessService
                        .getUserAccessService()
                            .login(new UserAccess(username, password));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static Long getId(String username, String password) {
        try {
            return UserAccessService
                        .getUserAccessService()
                            .getId(new UserAccess(username, password));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static boolean checkClassification(String username, String password) {
        try {
            return UserAccessService
                        .getUserAccessService()
                            .checkClassification(new UserAccess(username, password));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static String getClassification(String username, String password) {
        try {
            return UserAccessService
                    .getUserAccessService()
                        .getClassification(new UserAccess(username, password));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
