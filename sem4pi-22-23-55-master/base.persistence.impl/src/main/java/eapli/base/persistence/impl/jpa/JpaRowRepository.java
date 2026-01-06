package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.boardManagement.domain.Rows;
import eapli.base.boardManagement.repositories.RowRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaRowRepository extends JpaAutoTxRepository<Rows, Long, Long> implements RowRepository {

    public JpaRowRepository ( final TransactionalContext autoTx) {
        super(autoTx, "idRow");
    }

    public JpaRowRepository(final String puname) {
        super(puname, Application.settings().extendedPersistenceProperties(), "idRow");
    }

}
