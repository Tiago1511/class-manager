package eapli.base.examManagement.application;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.exam.EvalVisitor;
import eapli.base.examManagement.exam.antlr.createExamLexer;
import eapli.base.examManagement.exam.antlr.createExamParser;
import eapli.base.examManagement.repositories.ExamRepository;
import eapli.base.gradeManagement.domain.Grade;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.base.studentManagement.domain.StudentEvalVisitor;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ExamRealizationController {

    private final ExamRepository examRepository= PersistenceContext.repositories().exams();
    private final GradeRepository gradeRepository= PersistenceContext.repositories().grades();

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final SystemUser systemUser = (authz.session().get().authenticatedUser());

    private final StudentRepository studentRepository= PersistenceContext.repositories().students();
    private Student student = studentRepository.findBySystemUser(systemUser).iterator().next();



    public List<Exam> exams(){
        return (List<Exam>) examRepository.findAll();
    }

    public Exam selectExam(){
        //System.out.printf("    ID  Name:\n");

        for (int i = 0; i < exams().size(); i++) {
            System.out.printf("\n%d. %s\n",i+1,exams().get(i).getTitle());
        }

        Integer index = Console.readInteger("Select Exam:")-1;


        while (!(index>=0 && index<exams().size())){
            System.out.println("Invalid index");
            index = Console.readInteger("Select Exam:")-1;
        }

        Exam exam = exams().get(index);
        return exam;
    }
    public boolean saveExamGrade(Grade grade){
        gradeRepository.save(grade);
        if (gradeRepository.contains(grade)) {return true;
        }else return false;
    }

    public void evalVisitor(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        createExamLexer lexer = null;
        try {
            lexer = new createExamLexer(new ANTLRInputStream(fis));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        createExamParser parser = new createExamParser(tokens);
        ParseTree tree = parser.start(); // parse
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }

    public void examRealizationVisitor(File file){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        createExamLexer lexer = null;
        try {
            lexer = new createExamLexer(new ANTLRInputStream(fis));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        createExamParser parser = new createExamParser(tokens);
        ParseTree tree = parser.start(); // parse
        StudentEvalVisitor eval = new StudentEvalVisitor();
        eval.visit(tree);
    }

    public void examRealizationVisitor(String input){
        createExamLexer lexer = null;
        lexer = new createExamLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        createExamParser parser = new createExamParser(tokens);
        ParseTree tree = parser.start(); // parse
        StudentEvalVisitor eval = new StudentEvalVisitor();
        eval.visit(tree);
    }

    public Course selectCourse(List<Course> courseList){

        System.out.printf("   Code   Title\n");

        for (int i = 0; i <courseList.size() ; i++) {
            System.out.printf("\n%d. %s  %s\n",i+1,courseList.get(i).toDTO().code,courseList.get(i).toDTO().title);
        }

        Integer index= Console.readInteger("Select Course:")-1;

        while (!(index>=0 && index<courseList.size())){
            System.out.println("Invalid index");
            index= Console.readInteger("Select Course:")-1;
        }

        Course course = courseList.get(index);
        return course;



    }


    public Integer getScore(){
        StudentEvalVisitor evalVisitor= new StudentEvalVisitor();
        return evalVisitor.getFinalScore();
    }

    public Student getStudent() {
        return student;
    }
}
