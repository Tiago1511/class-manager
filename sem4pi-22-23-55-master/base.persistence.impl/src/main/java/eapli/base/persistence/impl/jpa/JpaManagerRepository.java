package eapli.base.persistence.impl.jpa;

import eapli.base.managerManagement.domain.Manager;
import eapli.base.managerManagement.repositories.ManagerRepository;

import eapli.framework.domain.model.AggregateRoot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaManagerRepository  extends BasepaRepositoryBase<Manager,String,String> implements ManagerRepository{

    JpaManagerRepository() {
        super("email");
    }


    @Override
    public Optional<Manager> findByEmail(String email) {
        final Map<String, Object> params = new HashMap<>();
        params.put("email",email);
        return matchOne("e.email=:email",email);
    }
}
