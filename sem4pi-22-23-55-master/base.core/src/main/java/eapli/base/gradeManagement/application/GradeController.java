package eapli.base.gradeManagement.application;

import eapli.base.gradeManagement.domain.Grade;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentManagement.domain.Student;

public class GradeController {

    private final GradeRepository gradeRepository = PersistenceContext.repositories().grades();

    private void addGrade(Grade grade){
        gradeRepository.save(grade);
    }


}
