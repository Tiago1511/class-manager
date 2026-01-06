package eapli.base.app.backoffice.console.presentation.authz;

import eapli.base.coursemanagement.application.AvailableCoursesController;

public class AvailableCoursesUI extends AddUserUI{
    AvailableCoursesController coursesController = new AvailableCoursesController();

    @Override
    protected boolean doShow() {
        coursesController.selectCourse();
        return false;
    }

    @Override
    public String headline() {
        return ("Available Courses");
    }


}
