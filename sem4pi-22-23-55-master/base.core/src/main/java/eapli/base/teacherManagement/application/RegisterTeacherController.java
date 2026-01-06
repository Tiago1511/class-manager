package eapli.base.teacherManagement.application;

import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.domain.TeacherBuilder;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

import java.text.ParseException;
import java.util.List;

public class RegisterTeacherController {

    private final UserRepository repository = PersistenceContext.repositories().users();
    private final TeacherRepository teacherRepository = PersistenceContext.repositories().teachers();

    public Teacher registerNewTeacher(final SystemUser user, final String acronym, final String taxNumber, final String birthday)  {

        if (user.isActive()){
            Teacher teacher = null;
            try {
                teacher = new TeacherBuilder().systemUser(user).acronym(acronym).taxNumber(taxNumber).birthday(birthday).build();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            teacherRepository.save(teacher);
            return teacher;
        }else {
            throw new IllegalArgumentException("This user is not active");
        }
    }

    public Teacher registerNewTeacher(final SystemUser user, final Acronym acronym, final TaxNumber taxNumber){

        if (user.isActive()){
            Teacher teacher = new TeacherBuilder().systemUser(user).acronym(acronym).taxNumber(taxNumber).build();
            teacherRepository.save(teacher);
            return teacher;
        }else {
            throw new IllegalArgumentException("This user is not active");
        }
    }



    public SystemUser findByEmail(String email){
       throw new UnsupportedOperationException();
    }

    public List<SystemUser> getUsers(){
     return (List<SystemUser>) repository.findAll();
    }
}
