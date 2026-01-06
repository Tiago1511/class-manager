package eapli.base.app.backoffice.console.presentation.course;

import eapli.base.coursemanagement.domain.Course;
import eapli.framework.visitor.Visitor;
public class CoursePrinter implements Visitor<Course> {

    @Override
    public void visit(Course visitee) {
        //imprime o codigo o titulo e o status do curso
        System.out.printf("%-10s%-30s%-10s", visitee.identity(), visitee.title(), visitee.status());

        //System.out.println(  , visitee.code(), visitee.title());

        //System.out.println("%-10s%-30s%-10s%", visitee.identity(), visitee.title(), visitee.status().toString());


    }
}
