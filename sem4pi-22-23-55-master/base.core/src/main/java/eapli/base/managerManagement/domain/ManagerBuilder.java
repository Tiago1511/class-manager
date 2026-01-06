package eapli.base.managerManagement.domain;

import eapli.base.studentManagement.domain.Student;
import eapli.base.teacherManagement.domain.TeacherBuilder;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManagerBuilder implements DomainFactory<Manager> {
    private Manager theManager;

    private String email;

    private Date birthday;

    private SystemUser systemUser;


    public ManagerBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ManagerBuilder birthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public ManagerBuilder birthday(String birthday) throws ParseException {
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        return this;
    }
    public ManagerBuilder systemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }


    public Manager buildOrThrow(){
        if (theManager != null) {
            return theManager;
        }
        if (systemUser!=null  ) {
            theManager = new Manager(systemUser,birthday);
            return theManager;
        }
        else {
            throw new IllegalStateException();
        }
    }

    @Override
    public Manager build() {
        Manager manager= buildOrThrow();
        theManager=null;

        return manager;
    }
}
