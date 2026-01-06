package eapli.base.requestManagement.repositories;

import eapli.base.requestManagement.domain.EnrollmentRequest;
import eapli.base.requestManagement.domain.EnrollmentRequestID;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;

import java.util.Optional;

public interface EnrollmentRequestRepository extends  DomainRepository<EnrollmentRequestID, EnrollmentRequest>, LockableDomainRepository<EnrollmentRequestID,EnrollmentRequest> {

    Iterable<EnrollmentRequest> pendingRequests();

    Iterable<EnrollmentRequest> acceptedRequests();

    Iterable<EnrollmentRequest> rejectedRequests();
}