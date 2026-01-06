package eapli.base.examManagement.domain.NormalExamDomain;

import eapli.base.coursemanagement.domain.Course;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Exam implements AggregateRoot<Long> {
    @Version
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(updatable = false,nullable = false)
    private Long id;

    @Column(name="title", nullable=false)
    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String examContent;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "course_title", referencedColumnName = "title"),
            @JoinColumn(name = "course_code", referencedColumnName = "code")
    })
    private Course course;

    //@Temporal(TemporalType.DATE)
    //private Calendar examDate;


    protected Exam(){
        // for ORM only
    }


    public Exam(String title,String examContent, Course course) {
        this.title=title;
        this.examContent = examContent;
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public String getExamContent() {
        return examContent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Calendar getExamDate() {
        return null;
    }


    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Long identity() {
        return this.id;
    }


}