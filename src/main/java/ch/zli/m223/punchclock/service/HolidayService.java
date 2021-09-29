package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Holiday;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class HolidayService {
    @Inject
    private EntityManager entityManager;

    public UserService(){

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
    a
}

