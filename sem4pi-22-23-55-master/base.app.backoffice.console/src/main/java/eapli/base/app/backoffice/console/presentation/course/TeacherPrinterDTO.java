package eapli.base.app.backoffice.console.presentation.course;

import eapli.base.teacherManagement.dto.TeacherDTO;
import eapli.framework.visitor.Visitor;

public class TeacherPrinterDTO implements Visitor<TeacherDTO> {

    @Override
    public void visit(TeacherDTO visitee) {
        System.out.printf("%-10s%-30s", visitee.acronym, visitee.taxNumber);
    }
}
