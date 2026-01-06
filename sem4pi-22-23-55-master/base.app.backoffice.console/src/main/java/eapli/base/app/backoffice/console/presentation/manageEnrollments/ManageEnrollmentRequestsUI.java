package eapli.base.app.backoffice.console.presentation.manageEnrollments;


import eapli.base.boardManagement.domain.Board;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.requestManagement.application.ManageEnrollmentRequestsController;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
//import eapli.base.requestManagement.application.ManageEnrollmentRequestsController;

import eapli.base.requestManagement.domain.EnrollmentRequest;
import eapli.base.requestManagement.repositories.EnrollmentRequestRepository;
import eapli.framework.actions.Action;

import java.util.Scanner;

public class ManageEnrollmentRequestsUI implements Action {

       ManageEnrollmentRequestsController manageEnrollmentRequestsController = new ManageEnrollmentRequestsController();
       EnrollmentRequestRepository enrollmentRequestRepository = PersistenceContext.repositories().enrollmentRequests();

    @Override
    public boolean execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enrollment Requests");
        Iterable<EnrollmentRequest> enrollmentRequests = enrollmentRequestRepository.pendingRequests();
        int option = 1;
        for (EnrollmentRequest er : enrollmentRequests) {
            System.out.println(option + ". " + er.toString());
            option++;
        }

        System.out.print("Select an option: ");
        int selectedOption = scanner.nextInt();

        // Find the selected manager based on the selectedOption
        EnrollmentRequest selectedrequest = null;
        option = 1;
        for (EnrollmentRequest er : enrollmentRequests) {
            if (option == selectedOption) {
                selectedrequest = er;
                break;
            }
            option++;
        }

        System.out.println("Accept or reject request?");
        System.out.println("1.Accept");
        System.out.println("2.Reject");
        int selection=scanner.nextInt();
        switch (selection){
            case 1:
                manageEnrollmentRequestsController.acceptRequest(selectedrequest);
                break;

            case 2:
                manageEnrollmentRequestsController.rejectRequest(selectedrequest);
                break;
        }

        return false;
    }
}