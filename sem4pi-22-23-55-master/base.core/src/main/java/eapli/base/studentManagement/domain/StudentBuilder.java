package eapli.base.studentManagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentBuilder implements DomainFactory<Student> {

    private Student theStudent;

    private SystemUser systemUser;

    private MecanographicNumber mecanographicNumber;

    private TaxNumber taxNumber;

    private Date birthday;

    public StudentBuilder systemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public StudentBuilder mecanographicNumber(MecanographicNumber mecanographicNumber) {
        this.mecanographicNumber = mecanographicNumber;
        return this;
    }

    public StudentBuilder taxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    public StudentBuilder birthday(Date birthDate) {
        this.birthday = birthDate;
        return this;
    }


    public StudentBuilder mecanographicNumber(String mecanographicNumber) {
        this.mecanographicNumber = new MecanographicNumber( mecanographicNumber);
        return this;
    }

    public StudentBuilder taxNumber(String taxNumber) {
        this.taxNumber = new TaxNumber(taxNumber);
        return this;
    }

    public StudentBuilder birthday(String birthDate) throws ParseException {
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
        return this;
    }

    public Student buildOrThrow(){
        if (theStudent != null) {
            return theStudent;
        }
        if (systemUser != null && mecanographicNumber != null ) {
            theStudent = new Student(systemUser,mecanographicNumber, taxNumber, birthday);
            return theStudent;
        }
        else {
            throw new IllegalStateException();
        }
    }

    @Override
    public Student build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor

        Student student = buildOrThrow();
        theStudent=null;

        return student;
    }
}
