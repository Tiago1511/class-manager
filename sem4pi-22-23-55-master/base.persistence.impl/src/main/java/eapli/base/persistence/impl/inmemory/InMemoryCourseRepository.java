package eapli.base.persistence.impl.inmemory;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCourseRepository extends InMemoryDomainRepository<Course, String> implements CourseRepository {
    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<Course> closeCourses() {
        return match(e -> e.status().isClose());
    }

    @Override
    public Iterable<Course> progressCourses() {
        return match(e -> e.status().isProgress());
    }

    @Override
    public Iterable<Course> openCourses() {
        return match(e -> e.status().openCourses());
    }

    @Override
    public Iterable<Course> enrollCourses() {
        return match(e -> e.status().enrollCourses());
    }
}
