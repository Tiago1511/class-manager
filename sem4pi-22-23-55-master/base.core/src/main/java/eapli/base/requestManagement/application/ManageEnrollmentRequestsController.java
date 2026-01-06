package eapli.base.requestManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.requestManagement.domain.ERStatus;
import eapli.base.requestManagement.domain.EnrollmentRequest;
import eapli.base.requestManagement.repositories.EnrollmentRequestRepository;

public class ManageEnrollmentRequestsController {
    EnrollmentRequestRepository enrollmentRequestRepository = PersistenceContext.repositories().enrollmentRequests();

    public void acceptRequest(EnrollmentRequest enrollmentRequest){
        enrollmentRequest.setStatus(ERStatus.ACCEPTED);
        enrollmentRequestRepository.save(enrollmentRequest);

    }

    public void rejectRequest(EnrollmentRequest enrollmentRequest) {

        enrollmentRequest.setStatus(ERStatus.REJECTED);
        enrollmentRequestRepository.save(enrollmentRequest);
    }

}