package eapli.base.ClassManagement.application;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.ClassManagement.domain.Class;
import eapli.base.ClassManagement.domain.ClassBuilder;
import eapli.base.ClassManagement.domain.ClassRec;
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

public class ClassCreatorController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final String STATUS = Status.PROGRESS.toString();

    private final CourseRepository courseRepository = PersistenceContext.repositories().courses();

    private final ClassRepository classRepository = PersistenceContext.repositories().classes();

    public ClassRec classRecCreator(Course course, String description, Teacher teacherLecturing, Calendar calStarting, Calendar calFinishing, int startingHour, int startingMin, int endingHour, int endingMin) {
        LocalTime startingTime = LocalTime.of(startingHour,startingMin);
        LocalTime endingTime = LocalTime.of(endingHour,endingMin);
        return classRecCreator(course, description, teacherLecturing, calStarting, calFinishing, startingTime, endingTime);
    }
    public ClassRec classRecCreator(final Course course, final String description, final Teacher teacherLecturing, final Calendar startingDate, final Calendar finishingDate, LocalTime startingTime, LocalTime endingTime){
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER, BaseRoles.TEACHER);
        final var newClass = new ClassBuilder().course(course).description(description).teacher(teacherLecturing).stratingDate(startingDate).finishingDate(finishingDate).startingTime(startingTime).endingTime(endingTime).build();

        //classRepository.createRecClass(newClass);

        if (newClass == null) {
            return null;
        }
        //return
        return classRepository.save(newClass);
    }

    public Iterable<Course> course() {
        return courseRepository.openCourses();
    }
}
