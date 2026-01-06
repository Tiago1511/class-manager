package eapli.base.examManagement.domain.automaticExamDomain;

import javax.persistence.*;

@Entity
public class Answer {
    @Version
    private Long version;

    @Id
    private String answerString;

    @Column
    private Boolean trueAnswer;

    protected Answer(){}

    public Answer(String answerString, Boolean trueAnswer) {
        this.answerString = answerString;
        this.trueAnswer = trueAnswer;
    }

}
