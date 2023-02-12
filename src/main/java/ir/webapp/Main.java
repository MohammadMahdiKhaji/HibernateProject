package ir.webapp;

import ir.webapp.startup.controller.app.UserAccessController;
import ir.webapp.startup.model.entity.enumeration.Classification;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(UserAccessController.getUserAccessController().save("admin", "admin", "admin", "admin", "admin@admin.com", Date.valueOf(LocalDate.now()), "tehran"));
    }
}
