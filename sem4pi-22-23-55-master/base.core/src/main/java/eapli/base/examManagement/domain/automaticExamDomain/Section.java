package eapli.base.examManagement.domain.automaticExamDomain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Section implements AggregateRoot<String> {
    @Id
    private String id;


    @Column
    private String name;

    @Column
    private Integer sectionMarks;

    @OneToMany (cascade = CascadeType.ALL)
    private Set<Question> questionBlock;

    protected Section(){};

    public Section(String id, String name, Integer sectionMarks, Set<Question> questionBlock) {
        this.id = id;
        this.name = name;
        this.sectionMarks = sectionMarks;
        this.questionBlock = questionBlock;
    }

    public Section(String name, Integer sectionMarks, Set<Question> questionBlock) {
        this.name = name;
        this.sectionMarks = sectionMarks;
        this.questionBlock = questionBlock;
    }


    @Override
    public boolean sameAs(Object other) {

        if(!(other instanceof Section)){
            return false;
        }

        if (this == other) {
            return true;
        }

        Section section= (Section) other;

        return identity().equals(section.identity()) && name.equals(section.name) && sectionMarks.equals(section.sectionMarks);
    }

    @Override
    public String identity() {
        return this.id;
    }
}
