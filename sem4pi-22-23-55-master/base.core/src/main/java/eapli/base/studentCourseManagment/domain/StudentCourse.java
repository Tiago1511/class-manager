package eapli.base.studentCourseManagment.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.domain.model.AggregateRoot;
import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

    @Entity
    public class StudentCourse implements AggregateRoot<Long> {

        @Id
        @GeneratedValue
        private Long id;

        @ManyToOne
        private Student student;

        @ManyToOne
        private Course course;

        public StudentCourse(Student student, Course course) {
            this.student = student;
            this.course = course;
        }

        protected StudentCourse() {

        }

        public Student getStudent() {
            return student;
        }

        public Course getCourse() {
            return course;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        @Override
        public boolean sameAs(Object other) {
            return false;
        }

        @Override
        public Long identity() {
            return null;
        }
    }
