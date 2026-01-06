package eapli.base.persistence.impl.jpa;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.ClassManagement.domain.Class;
import eapli.base.ClassManagement.domain.ClassExtra;
import eapli.base.Application;
import eapli.base.ClassManagement.domain.ClassRec;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Status;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;
import java.util.List;

public class JpaClassRepository extends JpaAutoTxRepository<Class, Integer, Integer> implements ClassRepository {

    //private final ClassRepository classRepository = PersistenceContext.repositories().classes();


    public JpaClassRepository ( final TransactionalContext autoTx) {
        super(autoTx, "code");
    }

    public JpaClassRepository(final String puname) {
        super(puname, Application.settings().extendedPersistenceProperties(), "code");
    }

    @Override
    public Iterable<Class> allClasses() {
        final Query query = entityManager().createQuery("SELECT c FROM Class c",
                Class.class);
        return query.getResultList();
    }

    @Override
    public List<Class> checkClass(ClassExtra classExtra) {
        final Query query = entityManager().createQuery("SELECT c FROM Class c WHERE c.startingDate = :DATE AND ((c.startingTime <= :ENDTIME AND c.endingTime > :STARTTIME) OR (c.startingTime < :ENDTIME AND c.endingTime >= :STARTTIME)) AND c.teacherLecturing = :TEACHER",
                Class.class);
        query.setParameter("DATE", classExtra.startingDate());
        query.setParameter("STARTTIME", classExtra.getStartingTime());
        query.setParameter("ENDTIME", classExtra.getEndingTime());
        query.setParameter("TEACHER", classExtra.getTeacherLecturing());
        List<Class> resultList = query.getResultList();
        return resultList;
    }

 /*   @Override
    public void createRecClass(ClassRec classRec) {

    }
/*
    @Override
    public void createRecClass(ClassRec classRec){
        Calendar auxDate = classRec.startingDate();
        auxDate.add(Calendar.DAY_OF_MONTH, 7);
        while (auxDate.before(classRec.finishingDate())){
            ClassRec auxClass = new ClassRec(classRec.getCourse(), classRec.getCode(), classRec.getDescription(), classRec.getTeacherLecturing(), auxDate, classRec.finishingDate(), classRec.getDuration(), classRec.getStartingTime(), classRec.getDayOfWeek(), classRec.getEndingTime());
            ClassRepository.save(auxClass);
            auxDate.add(Calendar.DAY_OF_MONTH, 7);
        }
        ClassRec auxClass = new ClassRec(classRec.getCourse(), classRec.getCode(), classRec.getDescription(), classRec.getTeacherLecturing(), classRec.finishingDate(), classRec.finishingDate(), classRec.getDuration(), classRec.getStartingTime(), classRec.getDayOfWeek(), classRec.getEndingTime());
        classRepository.save(auxClass);
    }
/*
   @Override
    public <S extends Class> S save(S entity) {
        return null;
    }
    /*
    @Override
    public Optional<Class> ofIdentity(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delete(Class entity) {

    }

    @Override
    public void deleteOfIdentity(Integer entityId) {

    }

    @Override
    public Class lockItUp(Class entity) {
        return null;
    }

    @Override
    public Optional<Class> lockOfIdentity(Integer id) {
        return Optional.empty();
    }*/
}
