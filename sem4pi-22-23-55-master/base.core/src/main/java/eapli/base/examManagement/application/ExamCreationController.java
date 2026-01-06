package eapli.base.examManagement.application;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.examManagement.automaticFormativeExam.AutomaticFormativeExamLexer;
import eapli.base.examManagement.automaticFormativeExam.AutomaticFormativeExamParser;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticExam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticExamBuilder;
import eapli.base.examManagement.domain.automaticExamDomain.Section;
import eapli.base.examManagement.exam.EvalVisitor;
import eapli.base.examManagement.exam.antlr.createExamLexer;
import eapli.base.examManagement.exam.antlr.createExamParser;
import eapli.base.examManagement.repositories.ExamRepository;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentManagement.domain.StudentEvalVisitor;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.framework.domain.repositories.TransactionalContext;
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
import java.util.Set;

public class ExamCreationController {

    private final ExamRepository examRepository= PersistenceContext.repositories().exams();
    private final TeacherRepository teacherRepository= PersistenceContext.repositories().teachers();


    final AuthorizationService authz = AuthzRegistry.authorizationService();
    final SystemUser systemUser = (authz.session().get().authenticatedUser());

   Teacher teacher = teacherRepository.findBySystemUser(systemUser).iterator().next();



    public Exam createUpdateExam(String title,String examContent, Course course/*, Calendar examDate*/){
        Exam exam = new Exam(title,examContent,course);

        examRepository.save(exam);
        return exam;
    }


    public String evalVisitor(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Path not accepted");
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
        return eval.getExamName();
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



    public Teacher getTeacher() {
        return teacher;
    }

}
