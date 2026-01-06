package eapli.base.examManagement.domain.automaticExamDomain;


import eapli.framework.domain.model.DomainFactory;

import java.util.Set;

public class AutomaticExamBuilder implements DomainFactory<AutomaticExam> {

    private AutomaticExam theAutomaticExam;

    private String code;

    private String name;

    private Integer totalMarks;

    private Integer passingMarks;

    private String duration;

    private Set<Section> sections;


    private AutomaticExam buildOrThrow() {
        if (theAutomaticExam != null) {
            return theAutomaticExam;
        }
        if (code != null && name != null){
            return theAutomaticExam = new AutomaticExam(code,name);
        }
        if (code != null && name != null && totalMarks != null && passingMarks!= null && duration!=null && !sections.isEmpty()){
            return theAutomaticExam = new AutomaticExam(code,name,totalMarks,passingMarks,duration,sections);
        }
        else {
            throw new IllegalStateException();
        }
    }

    public AutomaticExamBuilder code(String code){
        this.code= code;
        return this;
    }

    public AutomaticExamBuilder name(String name){
        this.name=name;
        return this;
    }

    public AutomaticExamBuilder totalMarks(Integer totalMarks){
        this.totalMarks=totalMarks;
        return  this;
    }

    public AutomaticExamBuilder passingMarks(Integer passingMarks){
        this.passingMarks=passingMarks;
        return this;
    }

    public AutomaticExamBuilder duration(String duration){
        this.duration=duration;
        return this;
    }

    public AutomaticExamBuilder sections(Set<Section> sections){
        this.sections=sections;
        return this;
    }


    @Override
    public AutomaticExam build() {
        final AutomaticExam automaticExam = buildOrThrow();

        theAutomaticExam = null;

        return automaticExam;
    }
}
