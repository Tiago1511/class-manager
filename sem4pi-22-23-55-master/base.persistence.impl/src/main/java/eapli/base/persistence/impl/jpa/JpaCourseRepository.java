package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;

public class JpaCourseRepository extends JpaAutoTxRepository<Course, String, String> implements CourseRepository {

        public JpaCourseRepository ( final TransactionalContext autoTx) {
            super(autoTx, "code");
        }

        public JpaCourseRepository(final String puname) {
            super(puname, Application.settings().extendedPersistenceProperties(), "code");
        }


    @Override
    public Iterable<Course> closeCourses() {
        final Query query = entityManager().createQuery("SELECT c FROM Course c WHERE c.status = :CLOSE",
                Course.class);
        query.setParameter("CLOSE", Status.CLOSE);
        return query.getResultList();
    }

    @Override
    public Iterable<Course> progressCourses() {
        final Query query = entityManager().createQuery("SELECT c FROM Course c WHERE c.status = :PROGRESS",
                Course.class);
        query.setParameter("PROGRESS", Status.PROGRESS);
        return query.getResultList();
    }

    @Override
    public Iterable<Course> openCourses() {
        final Query query = entityManager().createQuery("SELECT c FROM Course c WHERE c.status = :OPEN",
                Course.class);
        query.setParameter("OPEN", Status.OPEN);
        return query.getResultList();
    }

    @Override
    public Iterable<Course> enrollCourses() {
        final Query query = entityManager().createQuery("SELECT c FROM Course c WHERE c.status = :ENROLL",
                Course.class);
        query.setParameter("ENROLL", Status.ENROLL);
        return query.getResultList();
    }
}
