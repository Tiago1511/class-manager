package eapli.base.coursemanagement.domain;

import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.domain.model.DomainFactory;

import java.util.HashSet;
import java.util.Set;

public class CourseBuilder implements DomainFactory<Course> {

    private Course theCourse;

    //private Teacher headTeacher;

    private String title;

    private String code;

    private String description;

    private Capacity capacity;

    private Status status;

    private Teacher headTeacher;

    private Set<Teacher> teacher = new HashSet<>();

    private Edition edition;
   /* public CourseBuilder withHeadTeacher(final Teacher headTeacher) {
        this.headTeacher = headTeacher;
        return this;
    }*/

    private Course buildOrThrow() {
        if (theCourse != null) {
            return theCourse;
        }
        if (title != null && code != null && description != null && capacity != null && headTeacher != null && !teacher.isEmpty()) {
            theCourse = new Course(title, code, edition, description, capacity, status, headTeacher, teacher);
            return theCourse;
        }
        if (title != null && code != null && description != null && capacity != null && headTeacher != null) {
            theCourse = new Course(title, code, edition, description, capacity, status, headTeacher);
            return theCourse;
        }
        if (title != null && code != null && description != null && capacity != null) {
            theCourse = new Course(title, code, edition, description, capacity, status);
            return theCourse;
        }
        if ( code != null && description != null && capacity != null) {
            theCourse = new Course(title, code,edition, description, capacity, status);
            return theCourse;
        }
        else {
            throw new IllegalStateException();
        }
    }

    public CourseBuilder ofType(final Teacher teacher) {
        headTeacher = teacher;
        return this;
    }

    public CourseBuilder capacity (final Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    public CourseBuilder status (final Status status) {
        this.status = status;
        return this;
    }
    public CourseBuilder title (final String title) {
        this.title = title;
        return this;
    }

    public CourseBuilder code (final String code) {
        this.code = code;
        return this;
    }

    public CourseBuilder description (final String description) {
        this.description = description;
        return this;
    }

    public CourseBuilder teacher (final Set<Teacher> teacher) {
        this.teacher = teacher;
        return this;
    }

    public CourseBuilder edition (final Edition edition) {
        this.edition = edition;
        return this;
    }

   /* public CourseBuilder capacity (final Capacity capacity) {
        buildOrThrow();
        theCourse.changeCapacityInfoTo(capacity);
    	return this;
    }*/
    /*public CourseBuilder status (final Status status) {
        buildOrThrow();
        theCourse.changeStatusInfoTo(status);
    	return this;
    }*/

    @Override
    public Course build() {
        final Course course = buildOrThrow();

        theCourse = null;

        return course;
    }
}
