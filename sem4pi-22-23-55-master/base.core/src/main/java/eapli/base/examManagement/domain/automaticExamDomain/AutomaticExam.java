package eapli.base.examManagement.domain.automaticExamDomain;

import eapli.framework.domain.model.AggregateRoot;
import javax.persistence.*;
import java.util.Set;

@Entity
public class AutomaticExam implements AggregateRoot<String> {

    @Version
    private Long version;

    @Id
    private String code;

    @Column(nullable = false)
    private String name;

    @Column
    private Integer totalMarks;

    @Column
    private Integer passingMarks;

    @Column
    private String duration;

    @OneToMany (cascade = CascadeType.ALL)
    private Set<Section> sections;

    protected AutomaticExam() {

    }

    public AutomaticExam(String code, String name, Integer totalMarks, Integer passingMarks, String duration, Set<Section> sections) {
        this.code = code;
        this.name = name;
        this.totalMarks = totalMarks;
        this.passingMarks = passingMarks;
        this.duration = duration;
        this.sections = sections;
    }

    public AutomaticExam(String code, String name) {
        this.code = code;
        this.name = name;
    }


    @Override
    public boolean sameAs(Object other) {
        if(!(other instanceof AutomaticExam)){
            return false;
        }

        if (this == other) {
            return true;
        }

        final AutomaticExam automaticExam = (AutomaticExam) other;

        return identity().equals(automaticExam.identity()) && name.equals(automaticExam.name) && duration.equals(automaticExam.duration) && totalMarks.equals(automaticExam.totalMarks) && passingMarks.equals(automaticExam.passingMarks);
    }

    @Override
    public String identity() {
        return this.code;
    }
}
