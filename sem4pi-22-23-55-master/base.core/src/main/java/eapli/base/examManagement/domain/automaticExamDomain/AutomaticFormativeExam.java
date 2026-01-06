package eapli.base.examManagement.domain.automaticExamDomain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class AutomaticFormativeExam implements AggregateRoot<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(updatable = false,nullable = false)
    private Long id;

    @Column(name="title", nullable=false)
    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String examContent;

    protected AutomaticFormativeExam() {
    }

    public AutomaticFormativeExam(String title, String examContent) {
        this.title = title;
        this.examContent = examContent;
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
