package eapli.base.examManagement.domain.automaticExamDomain;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class Question implements AggregateRoot<Long> {

    @Version
    private Long version;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(updatable = false,nullable = false)
    private Long id;

    @Column(name="type")
    private String type;

    @Column(columnDefinition = "LONGTEXT")
    private String questionContent;

    @Column(columnDefinition = "LONGTEXT")
    private String Answer;

//    public Question(String type, String questionContent, String answer) {
//        this.type = type;
//        this.questionContent= questionContent;
//        this.Answer= answer;
//    }

    public Question(String questionContent) {
        this.questionContent = questionContent;
    }

    public Question(String type, String questionContent, String answer) {
        this.type = type;
        this.questionContent = questionContent;
        Answer = answer;
    }

    protected Question() {

    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Long identity() {
        return null;
    }

    @Override
    public String toString() {
        return "Question{" +
                "type='" + type + '\'' +
                ", questionContent='" + questionContent + '\'' +
                ", Answer='" + Answer + '\'' +
                '}';
    }
}
