package eapli.base.requestManagement.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class EnrollmentRequest implements AggregateRoot<EnrollmentRequestID> {
    private String student;
    @OneToOne
    private Course course;
    @Id
    private EnrollmentRequestID id;

    @Enumerated(EnumType.STRING)
    private ERStatus status;


    protected EnrollmentRequest() {
        // for ORM
    }


    public EnrollmentRequest(String student, Course course) {
        this.student = student;
        this.course = course;
        this.status = ERStatus.PENDING; // Default status is "Pending"
        this.id = generateId(course, student);
    }

    // Generate the ID based on the course and student
    private EnrollmentRequestID generateId(Course course, String student) {
        String courseCode = course.title().substring(0, 3);
        String studentNumber = student.toString().substring(3);

        return  new EnrollmentRequestID(courseCode + studentNumber);
    }

    // Getters and setters for the attributes
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ERStatus status() {
        return status;
    }

    public void setStatus(ERStatus status) {
        this.status = status;
    }

    public EnrollmentRequestID getId() {
        return id;
    }

    public void setId(EnrollmentRequestID id) {
        this.id = id;
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public EnrollmentRequestID identity() {
        return null;
    }

    @Override
    public String toString() {
        return "EnrollmentRequest{" +
                "student='" + student + '\'' +
                ", course=" + course +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}
