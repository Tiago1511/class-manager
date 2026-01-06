/*
 * Copyright (c) 2013-2023 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.app.backoffice.console.presentation;

import eapli.base.app.backoffice.console.presentation.authz.RegisterUserUI;
//import eapli.base.app.backoffice.console.presentation.classes.ScheduleClassUI;
import eapli.base.app.backoffice.console.presentation.boards.*;
import eapli.base.app.backoffice.console.presentation.course.AddTeacherUI;
import eapli.base.app.backoffice.console.presentation.course.OpenCloseCourseUI;
import eapli.base.app.backoffice.console.presentation.course.OpenCloseEnrollmentsCourseUI;
import eapli.base.app.backoffice.console.presentation.courseviadto.RegisterCourseViasDTOUI;
import eapli.base.app.backoffice.console.presentation.enrollStudents.EnrollStudentsUI;
import eapli.base.app.backoffice.console.presentation.manageEnrollments.ManageEnrollmentRequestsUI;
import eapli.base.app.backoffice.console.presentation.meetings.*;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.Application;
import eapli.base.app.backoffice.console.presentation.authz.AddUserUI;
import eapli.base.app.backoffice.console.presentation.authz.DeactivateUserAction;
import eapli.base.app.backoffice.console.presentation.authz.ListUsersAction;
import eapli.base.app.backoffice.console.presentation.clientuser.AcceptRefuseSignupRequestAction;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.ShowMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

/**
 * TODO split this class in more specialized classes for each menu
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu extends AbstractUI {

    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // USERS
    private static final int ADD_USER_OPTION = 1;
    private static final int LIST_USERS_OPTION = 2;
    private static final int DEACTIVATE_USER_OPTION = 3;
    private static final int REGISTER_USER_OPTION= 4;
    private static final int ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION = 5;
    private static final int MEETING_OPTION= 6;
    private static final int STUDENT_COURSE_OPTION = 7;

    private static final int MEETINGS_OPTION= 9;

   // private static final int CREATE_EXAMS= 69;



    // SETTINGS
    private static final int SET_KITCHEN_ALERT_LIMIT_OPTION = 1;

    // DISH TYPES
    private static final int DISH_TYPE_REGISTER_OPTION = 1;
    private static final int DISH_TYPE_LIST_OPTION = 2;
    private static final int DISH_TYPE_CHANGE_OPTION = 3;
    private static final int DISH_TYPE_ACTIVATE_DEACTIVATE_OPTION = 4;

    // DISHES
    private static final int DISH_REGISTER_OPTION = 5;
    private static final int DISH_LIST_OPTION = 6;
    private static final int DISH_REGISTER_DTO_OPTION = 7;
    private static final int DISH_LIST_DTO_OPTION = 8;
    private static final int DISH_ACTIVATE_DEACTIVATE_OPTION = 9;
    private static final int DISH_CHANGE_OPTION = 10;

    // DISH PROPERTIES
    private static final int CHANGE_DISH_NUTRICIONAL_INFO_OPTION = 1;
    private static final int CHANGE_DISH_PRICE_OPTION = 2;

    // MATERIALS
    private static final int MATERIAL_REGISTER_OPTION = 1;
    private static final int MATERIAL_LIST_OPTION = 2;

    // REPORTING
    private static final int REPORTING_DISHES_PER_DISHTYPE_OPTION = 1;
    private static final int REPORTING_HIGH_CALORIES_DISHES_OPTION = 2;
    private static final int REPORTING_DISHES_PER_CALORIC_CATEGORY_OPTION = 3;

    // MEALS
    private static final int LIST_MEALS_OPTION = 1;
    private static final int MEAL_REGISTER_OPTION = 2;

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int USERS_OPTION = 2;

    private static final int COURSE_OPTION = 3;
    private static final int SETTINGS_OPTION = 4;
    private static final int DISH_OPTION = 5;
    private static final int TRACEABILITY_OPTION = 6;
    private static final int MEALS_OPTION = 7;
    private static final int REPORTING_DISHES_OPTION = 8;


    //COURSE
    private static final int CREATE_COURSE_OPTION = 1;

    private static final int CREATE_COURSE_OPTION_DTO = 1;

    private static final int OPEN_CLOSE_COURSE_OPTION = 2;

    private static final int OPEN_CLOSE_ENROLLMENTS_COURSE_OPTION = 3;

    private static final int ADD_TEACHER_OPTION = 4;

    private static final String SEPARATOR_LABEL = "--------------";

    //CLASSES
    private static final int SCHEDULE_CLASS_OPTION = 1;
    private static final int SCHEDULE_EXTRA_CLASS_OPTION = 2;

    //MEETING

    private static final int SCHEDULE_MEETING_OPTION = 1;
    private static final int CREATE_MEETING_OPTION = 1;
    private static final int LIST_MEETING_OPTION = 2;
    private static final int CANCEL_MEETING_OPTION = 3;
    private static final int ACEPT_REJECT_MEETING_OPTION = 4;


    //ENROLL
    private static final int ENROLL_STUDENTS_OPTION = 1;

    private static final int CREATE_BOARD_OPTION = 8;


    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    public boolean show() {
        drawFormTitle();
        return doShow();
    }

    /**
     * @return true if the user selected the exit option
     */
    @Override
    public boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return renderer.render();
    }

    @Override
    public String headline() {

        return authz.session().map(s -> "Base [ @" + s.authenticatedUser().identity() + " ]")
                .orElse("Base [ ==Anonymous== ]");
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildUsersMenu();
            mainMenu.addSubMenu(USERS_OPTION, usersMenu);

            final Menu reportingCourseMenu = buildCourseMenu();
            mainMenu.addSubMenu(COURSE_OPTION,reportingCourseMenu);

            final Menu settingsMenu = buildAdminSettingsMenu();
            mainMenu.addSubMenu(SETTINGS_OPTION, settingsMenu);

            final Menu meetingsMenu = buildMeetingssMenu();
            mainMenu.addSubMenu(MEETING_OPTION, meetingsMenu);

            final Menu enrollStudentsMenu = buildenrollStudentsMenu();
            mainMenu.addSubMenu(STUDENT_COURSE_OPTION, enrollStudentsMenu);

            final Menu createBoardMenu = createBoardMenu();
            mainMenu.addSubMenu(CREATE_BOARD_OPTION, createBoardMenu);
        }



        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    private Menu buildAdminSettingsMenu() {
        final Menu menu = new Menu("Settings >");

        menu.addItem(SET_KITCHEN_ALERT_LIMIT_OPTION, "Set kitchen alert limit",
                new ShowMessageAction("Not implemented yet"));
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildUsersMenu() {
        final Menu menu = new Menu("Users >");

        menu.addItem(ADD_USER_OPTION, "Add User", new AddUserUI()::show);
        menu.addItem(LIST_USERS_OPTION, "List all Users", new ListUsersAction());
        menu.addItem(DEACTIVATE_USER_OPTION, "Deactivate User", new DeactivateUserAction());
        menu.addItem(REGISTER_USER_OPTION, "Register User",  new RegisterUserUI()::show);
        menu.addItem(ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION, "Accept/Refuse Signup Request",
                new AcceptRefuseSignupRequestAction());
       // menu.addItem(CREATE_EXAMS,"", new CreateExamUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildCourseMenu() {
        final  Menu menu = new Menu("Courses >");

        //create course
        //menu.addItem(CREATE_COURSE_OPTION, "Create Course", new RegisterCourseUI()::show);
        menu.addItem(CREATE_COURSE_OPTION_DTO, "Create Course DTO", new RegisterCourseViasDTOUI()::show);
        menu.addItem(OPEN_CLOSE_COURSE_OPTION, "Open/Close Course", new OpenCloseCourseUI()::show);
        menu.addItem(OPEN_CLOSE_ENROLLMENTS_COURSE_OPTION, "Open/Close Enrollments Course", new OpenCloseEnrollmentsCourseUI()::show);
        menu.addItem(ADD_TEACHER_OPTION, "Add Teacher", new AddTeacherUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }

    /*private Menu buildClassMenu() {
        final Menu menu = new Menu("Classes >");
        menu.addItem(SCHEDULE_CLASS_OPTION, "Schedule Class", new ScheduleClassUI()::show);
    }*/

    private Menu buildMeetingsMenu() {
        final Menu menu = new Menu("Meetings >");

        menu.addItem(SCHEDULE_MEETING_OPTION, "Schedule Meeting", new ScheduleMeetingUI()::show);
        return menu;
    }

    private Menu buildenrollStudentsMenu() {
        final Menu menu = new Menu("Enroll Students >");

        menu.addItem(ENROLL_STUDENTS_OPTION, "Enroll Students", new EnrollStudentsUI()::show);
        menu.addItem(2, "Manage Enrollments Requests", new ManageEnrollmentRequestsUI());
        return menu;
    }


    private Menu createBoardMenu() {
        final Menu menu = new Menu(" Board >");
        menu.addItem(1, "Create Board", new NewBoardUI());
        menu.addItem(2, "Share Board", new ShareBoardUI());
        menu.addItem(3, "Create Post-it", new CreatePostitUI()::show);
        menu.addItem(4, "Update Post-it", new UpdatePostitUI()::show);
        menu.addItem(5, "Undo Changes Post-it", new UndoChangePostitUI()::show);
        menu.addItem(6,"Archive Board", new ArchiveBoardUI()::show);
        return menu;
    }

    private Menu buildMeetingssMenu() {
        final  Menu menu = new Menu("Meetings >");

        menu.addItem(CREATE_MEETING_OPTION, "Create Meeting", new RegisterMeetingUI()::show);
        menu.addItem(LIST_MEETING_OPTION, "List Meetings", new ListMeetingsActionUI()::show);
        menu.addItem(CANCEL_MEETING_OPTION, "Cancel Meeting", new CancelMeetingUI()::show);
        menu.addItem(ACEPT_REJECT_MEETING_OPTION, "Accept/Reject Meeting", new AcceptRejectMeetingUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

}
