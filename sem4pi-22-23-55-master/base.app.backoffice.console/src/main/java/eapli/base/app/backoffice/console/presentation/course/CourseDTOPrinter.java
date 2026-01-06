package eapli.base.app.backoffice.console.presentation.course;


import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.framework.visitor.Visitor;

public class CourseDTOPrinter implements Visitor<CourseDTO> {
    @Override
    public void visit(final CourseDTO visitee) {
        System.out.printf("%-10s%-30s%-10s", visitee.code, visitee.title, visitee.status);
    }
}
