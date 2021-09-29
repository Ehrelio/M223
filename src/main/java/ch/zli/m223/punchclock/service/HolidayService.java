package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Holiday;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class HolidayService {
    @Inject
    private EntityManager entityManager;

    HolidayService(){
    }

    @Transactional
    public Holiday createHoliday(Holiday holiday){
        entityManager.persist(holiday);
        return holiday;
    }

    @Transactional
    public void delHolidayObject(Holiday holiday){
        entityManager.remove(holiday);
    }

    @Transactional
    public void delHolidayId(int id){
        Holiday holiday = entityManager.find(Holiday.class, id);
        entityManager.remove(holiday);
    }

    @Transactional
    public Holiday getUser(int id){
        return entityManager.find(Holiday.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Holiday> findAll(){
        var query = entityManager.createQuery("FROM Holiday");
        return query.getResultList();
    }

    @Transactional
    public Holiday updateHoliday(Holiday holiday){
        return entityManager.merge(holiday);
    }
}

