package ir.webapp.startup.model.service;

import ir.webapp.startup.model.entity.PersonSocialMedia;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;
import java.util.List;

public class PersonSocialMediaService extends ServiceImpl<PersonSocialMedia, Long> {

    private static final PersonSocialMediaService personSocialMediaService = new PersonSocialMediaService();

    private PersonSocialMediaService() {
    }

    public static PersonSocialMediaService getSocialMediaService() {
        return personSocialMediaService;
    }

    @Override
    public PersonSocialMedia save(PersonSocialMedia personSocialMedia) throws Exception {
        try (CRUDRepository<PersonSocialMedia, Long> repository = new CRUDRepository<>()) {
            return repository.insert(personSocialMedia);
        }
    }

    @Override
    public PersonSocialMedia edit(PersonSocialMedia personSocialMedia) throws Exception {
        try (CRUDRepository<PersonSocialMedia, Long> repository = new CRUDRepository<>()) {
            return repository.update(personSocialMedia);
        }
    }

    @Override
    public PersonSocialMedia remove(Long id) throws Exception {
        try (CRUDRepository<PersonSocialMedia, Long> repository = new CRUDRepository<>()) {
            return repository.delete(PersonSocialMedia.class, id);
        }
    }

    @Override
    public List<PersonSocialMedia> findAll() throws Exception {
        try (CRUDRepository<PersonSocialMedia, Long> repository = new CRUDRepository<>()) {
            return repository.selectAll(PersonSocialMedia.class);

        }
    }

    @Override
    public PersonSocialMedia findById(Long id) throws Exception {
        try (CRUDRepository<PersonSocialMedia, Long> repository = new CRUDRepository<>()) {
            return repository.selectById(PersonSocialMedia.class, id);
        }
    }
}
