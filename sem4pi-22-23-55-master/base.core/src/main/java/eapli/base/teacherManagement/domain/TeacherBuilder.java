package eapli.base.teacherManagement.domain;

import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TeacherBuilder implements DomainFactory<Teacher> {

    private Teacher theTeacher;
    private SystemUser systemUser;
    private TaxNumber taxNumber;
    private Acronym acronym;

    private Date birthDate;



    public TeacherBuilder systemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public TeacherBuilder taxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    public TeacherBuilder taxNumber(String taxNumber) {
        this.taxNumber = new TaxNumber( taxNumber);
        return this;
    }

    public TeacherBuilder acronym(Acronym acronym) {
        this.acronym = acronym;
        return this;
    }

    public TeacherBuilder acronym(String acronym) {
        this.acronym = new Acronym(acronym);
        return this;
    }

    public TeacherBuilder birthday(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }


    public TeacherBuilder birthday(String birthDate) throws ParseException {
        this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
        return this;
    }

    public Teacher buildOrThrow(){
        if (theTeacher != null) {
            return theTeacher;
        }
        if (systemUser != null && acronym != null) {
            theTeacher = new Teacher(systemUser,acronym, taxNumber,birthDate);
            return theTeacher;
        }
        else {
            throw new IllegalStateException();
        }
    }

    @Override
    public Teacher build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor

         Teacher teacher = buildOrThrow();
         theTeacher=null;

         return teacher;
    }
}
