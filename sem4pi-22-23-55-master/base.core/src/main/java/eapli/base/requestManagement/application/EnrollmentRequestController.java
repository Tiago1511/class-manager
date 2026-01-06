package eapli.base.requestManagement.application;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.requestManagement.domain.EnrollmentRequest;
import eapli.base.requestManagement.repositories.EnrollmentRequestRepository;
import eapli.base.studentCourseManagment.repository.StudentCourseRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.domain.repositories.TransactionalContext;

public class EnrollmentRequestController {

        private final EnrollmentRequestRepository enrollmentRequestRepository = PersistenceContext.repositories().enrollmentRequests();

        public void registerNewRequest(final String student, final Course course)  {


                EnrollmentRequest enrollmentRequest = new EnrollmentRequest(student, course);
                enrollmentRequestRepository.save(enrollmentRequest);

        }
    }

