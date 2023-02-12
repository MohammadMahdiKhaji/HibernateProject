package ir.webapp.startup.controller.app;

import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.PersonSocialMedia;
import ir.webapp.startup.model.entity.enumeration.SocialMediaType;
import ir.webapp.startup.model.service.PersonSocialMediaService;
public class PersonSocialMediaController {

    private static PersonSocialMediaController personSocialMediaController = new PersonSocialMediaController();

    private PersonSocialMediaController() {

    }

    public static PersonSocialMediaController getPersonSocialMediaController() {
        return personSocialMediaController;
    }

    public static PersonSocialMedia add(Person person , SocialMediaType socialMedia, String mediaAddress) {
        try {
            PersonSocialMedia personSocialMedia = new PersonSocialMedia(person, socialMedia, mediaAddress);
            return PersonSocialMediaService.getSocialMediaService().save(personSocialMedia);
        } catch (Exception e) {
            return null;
        }
    }
}
