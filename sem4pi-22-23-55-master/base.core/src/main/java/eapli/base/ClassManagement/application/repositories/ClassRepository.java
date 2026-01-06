package eapli.base.ClassManagement.application.repositories;

import eapli.base.ClassManagement.domain.Class;
import eapli.base.ClassManagement.domain.ClassExtra;
import eapli.base.ClassManagement.domain.ClassRec;
import eapli.base.coursemanagement.domain.Course;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;

public interface ClassRepository extends DomainRepository<Integer,Class>, LockableDomainRepository<Integer,Class> {

    Iterable<Class> allClasses();



    Iterable<Class> checkClass(ClassExtra classExtra);
/*
    void createRecClass(ClassRec classRec);*/
}

