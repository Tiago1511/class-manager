package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.boardManagement.domain.Column;

import eapli.base.boardManagement.repositories.ColumnRepository;
import eapli.base.boardManagement.repositories.RowRepository;

import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaColumnRepository extends JpaAutoTxRepository<Column, Long, Long> implements ColumnRepository {

    public JpaColumnRepository ( final TransactionalContext autoTx) {
        super(autoTx, "idColumn");
    }

    public JpaColumnRepository(final String puname) {
        super(puname, Application.settings().extendedPersistenceProperties(), "idColumn");
    }

}
