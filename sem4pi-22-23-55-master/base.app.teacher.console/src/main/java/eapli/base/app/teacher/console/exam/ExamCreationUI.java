package eapli.base.app.teacher.console.exam;

import eapli.base.coursemanagement.application.AvailableCoursesController;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.application.ExamCreationController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.*;
import java.util.List;

public class ExamCreationUI extends AbstractUI {

    private ExamCreationController examCreationController = new ExamCreationController();
    private AvailableCoursesController coursesController = new AvailableCoursesController();

    @Override
    protected boolean doShow() {
        Course course = selectCourse();
        File file=null;
        String examName=null;



        //while (!validExam) {

            String path = Console.readLine("Write absolute file path:");
             file = new File(path);

            examName = evalVisitor(file);
        //}

        String examContent= "Vazio";
        try {
            examContent= String.valueOf(new ANTLRInputStream(new FileInputStream(file)));
            examContent = examContent.trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        examCreationController.createUpdateExam(examName,examContent,course);

        return false;
    }

    private Course selectCourse(){
       return examCreationController.selectCourse(courses());
    }

    private List<Course> courses(){
        return (List<Course>) coursesController.findAll();
    }

private String evalVisitor(File file){

    return examCreationController.evalVisitor(file);
}
    @Override
    public String headline() {
        return "Create exam >";
    }
}
