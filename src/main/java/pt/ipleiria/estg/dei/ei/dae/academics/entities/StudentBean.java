package pt.ipleiria.estg.dei.ei.dae.academics.entities;

import jakarta.ejb.Stateless;
import jakarta.persistence.PersistenceContext;

@Stateless
public class StudentBean {
    @PersistenceContext
    private EntityManager entityManager;
    public void create( /* . . . */ ) {
        var student = new Student( /* . . . */ );
        entityManager.persist(student);
    }
}
