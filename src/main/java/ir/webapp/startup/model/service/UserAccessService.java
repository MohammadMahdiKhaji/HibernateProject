package ir.webapp.startup.model.service;

import ir.webapp.startup.model.entity.Person;
import ir.webapp.startup.model.entity.PersonSkill;
import ir.webapp.startup.model.entity.UserAccess;
import ir.webapp.startup.model.repository.CRUDRepository;
import ir.webapp.startup.model.repository.UserDA;
import ir.webapp.startup.model.service.serviceimpl.ServiceImpl;
import java.util.List;

public class UserAccessService extends ServiceImpl<UserAccess,Long> {

    private static UserAccessService userAccessService = new UserAccessService();

    private UserAccessService(){
    }

    public static UserAccessService getUserAccessService() {
        return userAccessService;
    }

    @Override
    public UserAccess save(UserAccess userAccess) throws Exception {
        try(CRUDRepository<UserAccess,Long> repository = new CRUDRepository<>()){
            return repository.insert(userAccess);
        }
    }

    @Override
    public UserAccess edit(UserAccess userAccess) throws Exception {
        try(CRUDRepository<UserAccess,Long> repository = new CRUDRepository<>()){
            return repository.update(userAccess);
        }
    }

    @Override
    public UserAccess remove(Long userAccessId) throws Exception {
        try(CRUDRepository<UserAccess,Long> repository = new CRUDRepository<>()){
            return repository.delete(UserAccess.class, userAccessId);
        }
    }

    @Override
    public List<UserAccess> findAll() throws Exception {
        try (CRUDRepository<UserAccess, Long> repository = new CRUDRepository<>()) {
            return repository.selectAll(UserAccess.class);
        }
    }

    @Override
    public UserAccess findById(Long userAccessId) throws Exception {
        try(CRUDRepository<UserAccess,Long> repository = new CRUDRepository<>()){
            return repository.selectById(UserAccess.class, userAccessId);
        }
    }

    public List<UserAccess> executeQuery(String queryName) throws Exception {
        try(CRUDRepository<UserAccess,Long> repository = new CRUDRepository<>()){
            return repository.executeQuery(queryName);
        }
    }

    public UserAccess addPerson(UserAccess userAccess, Person person) throws Exception {
        try(CRUDRepository<UserAccess, Long> userAccessRepository = new CRUDRepository<>()) {
            userAccess = userAccessRepository.selectById(UserAccess.class, userAccess.getId());
//            userAccess.setPerson(person);
            return userAccessRepository.update(userAccess);
        }
    }

//    public List<PersonSkill> skills(Long id) {
//        CRUDRepository<PersonSkill, Long> personRepository = new CRUDRepository<>();
//        return personRepository.executeQuery("skills");
//    }

    public boolean login(UserAccess userAccess) throws Exception {
        try(UserDA repository = new UserDA()){
            return repository.login(userAccess);
        }
    }

    public Long getId(UserAccess userAccess) throws Exception {
        try(UserDA repository = new UserDA()){
            return repository.getId(userAccess);
        }
    }

    public boolean checkClassification(UserAccess userAccess) throws Exception {
        try(UserDA repository = new UserDA()){
            return repository.checkClassification(userAccess);
        }
    }

    public String getClassification(UserAccess userAccess) throws Exception {
        try(UserDA repository = new UserDA()){
            return repository.getClassification(userAccess);
        }
    }
}
