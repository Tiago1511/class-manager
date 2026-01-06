package eapli.base.ClassManagement.application;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.ClassManagement.domain.ClassExtra;
import eapli.base.ClassManagement.domain.ClassExtraBuilder;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.time.LocalTime;
import java.util.Calendar;

public class ExtraClassCreatorController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final String STATUS = Status.PROGRESS.toString();

    private final CourseRepository courseRepository = PersistenceContext.repositories().courses();

    private final ClassRepository classRepository = PersistenceContext.repositories().classes();


    public ClassExtra classExtraCreator(Course course, String description, Teacher teacherLecturing, Calendar calStarting, int hour, int min, int endingHour, int endingMin) {
        LocalTime startingTime = LocalTime.of(hour,min);
        LocalTime endingTime = LocalTime.of(endingHour,endingMin);
        return classExtraCreator(course, description, teacherLecturing, calStarting, startingTime, endingTime);
    }
    public ClassExtra classExtraCreator(final Course course, final String description, final Teacher teacherLecturing, final Calendar startingDate, LocalTime time, LocalTime endingTime){
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER, BaseRoles.TEACHER);
        final var newClass = new ClassExtraBuilder().course(course).description(description).teacher(teacherLecturing).stratingDate(startingDate).startingTime(time).endingTime(endingTime).build();


        if (newClass == null) {
            return null;
        }
        return classRepository.save(newClass);
    }

    public Iterable<Course> course() {
        return courseRepository.openCourses();
    }
}
