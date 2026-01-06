package eapli.base.examManagement.application;

import eapli.base.examManagement.domain.automaticExamDomain.AutomaticFormativeExam;
import eapli.base.examManagement.domain.automaticExamDomain.Question;
import eapli.base.examManagement.repositories.AutomaticFormativeExamRepository;
import eapli.base.examManagement.repositories.QuestionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.io.util.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AutomaticExamCreationController {
    QuestionRepository questionRepository= PersistenceContext.repositories().question();

    AutomaticFormativeExamRepository examRepository = PersistenceContext.repositories().automaticExam();

    ArrayList<Question> questionList= new ArrayList<>();


    public String selectType(){
        System.out.println("Select question type");
        System.out.println("1. Multiple Question");
        System.out.println("2. True or False");
        System.out.println("3. Text Question");
        System.out.println("0. Exit");

        Integer option= Console.readInteger("");

        if (option==1){
            return "Escolha Multipla";
        } else  if (option==2){
            return "Verdadeiro ou Falso";
        }else if(option==3){
            return "Resposta Curta";
        }else return "Exit";

    }


    public void singleQuestionSelection(String questionType){

       /* for (int i = 0; i < questionsByType(questionType).size(); i++) {

            Question question=questionsByType(questionType).get(i);

            System.out.println(String.format("%d. %s \n",i+1,question.getQuestionContent()));

        }
        */

        if (!questionsByType(questionType).isEmpty()) {
            Integer idx = randomIndex(questionsByType(questionType));

            Question question = questionsByType(questionType).get(idx);

            if (!questionList.contains(question)) {
                questionList.add(questionsByType(questionType).get(idx));
            }else System.out.println("Question already inserted");

        }else System.out.println("No questions found.");


    }

    public Integer randomIndex(List list){
        Random random = new Random();
        return random.nextInt(list.size());
    }

    public List<Question> questionsByType(String questionType){
        return (List<Question>) questionRepository.questionsByType(questionType);
    }

    public String questionSelection(){
        String type = selectType();
        while (!type.equals("Exit")){
            singleQuestionSelection(type);
            type = selectType();
        }


        printQuestionList(questionList);

        return questionList.toString();
    }

    public void printQuestionList(List<Question> questions){
        for (int i = 0; i < questions.size(); i++) {

            String question = String.format("%d. %s\n",i+1,questions.get(i).getQuestionContent());

            System.out.println(question);
        }
    }

    public boolean saveExam(AutomaticFormativeExam exam){
         examRepository.save(exam);

         if (!examRepository.contains(exam)) return false;

         return true;
    }

    public void setQuestionList() {
        this.questionList = new ArrayList<>();
    }
}
