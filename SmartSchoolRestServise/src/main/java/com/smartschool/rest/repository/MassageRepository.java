package com.smartschool.rest.repository;

import com.smartschool.rest.model.Pisma;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MassageRepository {
    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager entityManager;

    public List<Pisma> getAllMassageForClassByClassId(int id) {
        Query query = entityManager.createQuery("select m.massage_text, m.parent_id from Massage m  where m.class_id = :id");
        query.setParameter("id", id);

        List<Pisma> pismas = query.getResultList();

        return pismas;
    }
    public List<Pisma> getParentMassageByNumber(String num) {
        Query query = entityManager.createQuery("select m.massage_text, m.massage_date, m.massage_time from Massage m inner join StudentParent p  on  m.parent_id = 0 or m.parent_id = p.parent_id  where p.parent_mobnum = :num");
        query.setParameter("num", num);

        List<Pisma> pismas = query.getResultList();

        return pismas;
    }
}
