package eapli.base.coursemanagement.repositories;


import eapli.base.coursemanagement.domain.Course;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;

public interface CourseRepository extends DomainRepository<String, Course>, LockableDomainRepository<String, Course> {


    Iterable<Course> closeCourses();

    Iterable<Course> progressCourses();

    Iterable<Course> openCourses();

    Iterable<Course> enrollCourses();
}
