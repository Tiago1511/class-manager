package eapli.base.persistence.impl.inmemory;


import eapli.base.coursemanagement.domain.Course;
import eapli.base.requestManagement.domain.EnrollmentRequest;
import eapli.base.requestManagement.domain.EnrollmentRequestID;
import eapli.base.requestManagement.repositories.EnrollmentRequestRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryEnrollmentRequestsRepository extends InMemoryDomainRepository<EnrollmentRequest, EnrollmentRequestID> implements EnrollmentRequestRepository {
    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<EnrollmentRequest> pendingRequests() {
        return match(e -> e.status().isPending());
    }

    @Override
    public Iterable<EnrollmentRequest> acceptedRequests() {
        return match(e -> e.status().isAccepted());
    }

    @Override
    public Iterable<EnrollmentRequest> rejectedRequests() {
        return match(e -> e.status().isRejected());
    }

}


