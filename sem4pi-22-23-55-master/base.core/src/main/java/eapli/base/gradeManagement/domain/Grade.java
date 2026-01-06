package eapli.base.gradeManagement.domain;

import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class Grade implements AggregateRoot<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(updatable = false,nullable = false)
    private Long id;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "exam_title", referencedColumnName = "title"),
           // @JoinColumn(name = "exam_code", referencedColumnName = "code")
            //@Column(columnDefinition = "LONGTEXT")
            //    private String examContent;
            @JoinColumn(name = "exam_content",referencedColumnName = "examContent")
    })
    private Exam exam;

    @Column
    private Integer score;

    @ManyToOne
    private Student student;


    public Grade(Exam exam, Integer score, Student student) {
       this.exam= exam;
        this.score = score;
        this.student = student;
    }

    protected Grade(){}

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Long identity() {
        return id;
    }

    public Integer getScore() {
        return score;
    }

    public Exam getExam() {
        return exam;
    }

    public String examTitle(){
        return exam.getTitle();
    }

    @Override
    public String toString() {
        return String.format("Exam: %s  Score: %d",examTitle(),getScore());
    }
}
