package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.requestManagement.domain.ERStatus;
import eapli.base.requestManagement.domain.EnrollmentRequest;
import eapli.base.requestManagement.domain.EnrollmentRequestID;
import eapli.base.requestManagement.repositories.EnrollmentRequestRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;
import java.util.Optional;

public class JpaEnrollmentRequestsRepository extends JpaAutoTxRepository<EnrollmentRequest,EnrollmentRequestID,EnrollmentRequestID>implements EnrollmentRequestRepository {
    public JpaEnrollmentRequestsRepository(final TransactionalContext txCtx) {
        super(txCtx, "id");
    }

    public JpaEnrollmentRequestsRepository(final String puname) {
        super(puname, Application.settings().extendedPersistenceProperties(), "id");
    }

    @Override
    public Iterable<EnrollmentRequest> pendingRequests() {
        final Query query = entityManager().createQuery("SELECT c FROM EnrollmentRequest c WHERE c.status = :PENDING",
                EnrollmentRequest.class);
        query.setParameter("PENDING", ERStatus.PENDING);
        return query.getResultList();
    }

    @Override
    public Iterable<EnrollmentRequest> acceptedRequests() {
        final Query query = entityManager().createQuery("SELECT c FROM EnrollmentRequest c WHERE c.status = :ACCEPTED",
                EnrollmentRequest.class);
        query.setParameter("ACCEPTED", ERStatus.ACCEPTED);
        return query.getResultList();
    }

    @Override
    public Iterable<EnrollmentRequest> rejectedRequests() {
        final Query query = entityManager().createQuery("SELECT c FROM EnrollmentRequest c WHERE c.status = :REJECTED",
                EnrollmentRequest.class);
        query.setParameter("REJECTED", ERStatus.REJECTED);
        return query.getResultList();
    }
    }

