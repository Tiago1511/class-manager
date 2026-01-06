package eapli.base.persistence.impl.inmemory;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.ClassManagement.domain.Class;
import eapli.base.ClassManagement.domain.ClassExtra;
import eapli.base.ClassManagement.domain.ClassRec;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryClassRepository extends InMemoryDomainRepository<Class, Integer> implements ClassRepository {
    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<Class> allClasses() {
        return null;
    }

    @Override
    public Iterable<Class> checkClass(ClassExtra classExtra) {
        return null;
    }
/*
    @Override
    public void createRecClass(ClassRec classRec) {

    }*/
}
