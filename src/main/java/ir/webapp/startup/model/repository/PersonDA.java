package ir.webapp.startup.model.repository;

import ir.webapp.startup.model.common.JPA;
import ir.webapp.startup.model.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class PersonDA implements AutoCloseable {
    private EntityManager entityManager;

    public Long findByEmail(Person person) {
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createQuery("select oo.userAccess.id from personEntity oo where oo.email = :email");
        query.setParameter("email", person.getEmail());
        return (Long) query.getSingleResult();
    }

    public boolean checkEmail(Person person) {
        entityManager = JPA.getJpa().getEntityManager();
        Query query = entityManager.createQuery("select 1 from personEntity oo where oo.email = :email");
        query.setParameter("email", person.getEmail());
        return query.getSingleResult().equals("1");
    }

    public void close() throws Exception {
        entityManager.close();
    }
}
