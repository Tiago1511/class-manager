package eapli.base.app.backoffice.console.presentation.course;

import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.visitor.Visitor;

public class TeacherPrinter implements Visitor<Teacher> {

    @Override
    public void visit(Teacher visitee) {
        System.out.printf("%-10s%-30s", visitee.acronym(), visitee.taxNumber());
    }
}
