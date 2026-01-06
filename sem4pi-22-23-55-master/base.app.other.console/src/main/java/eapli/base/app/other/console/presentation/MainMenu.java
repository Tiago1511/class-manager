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
package eapli.base.app.other.console.presentation;

import eapli.base.Application;
import eapli.base.app.backoffice.console.presentation.boards.ArchiveBoardUI;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.app.other.console.presentation.boards.ShareBoardStudentUI;
import eapli.base.app.other.console.presentation.boards.StudentBoardUI;
import eapli.base.app.other.console.presentation.exam.AutomaticExamRealizationUI;
import eapli.base.app.other.console.presentation.exam.ExamRealizationUI;
import eapli.base.app.other.console.presentation.grades.StudentGradesUI;
import eapli.base.app.other.console.presentation.meetings.AcceptRejectMeetingStudentUI;
import eapli.base.app.other.console.presentation.meetings.CancelMeetingStudentUI;
import eapli.base.app.other.console.presentation.meetings.ListMeetingsActionStudentUI;
import eapli.base.app.other.console.presentation.meetings.RegisterMeetingStudentUI;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
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

    private static final String SEPARATOR_LABEL = "--------------";

    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;

    private static final int STUDENT_COURSES_OPTION = 2;

    private static final int MEETINGS_OPTION= 3;

    private static final int EXAM_OPTION = 4;


    
    // Available Courses

    private static final int AVAILABLE_COURSES_OPTION = 1;

    // Meetings
    private static final int CREATE_MEETING_OPTION = 1;
    private static final int LIST_MEETING_OPTION = 2;
    private static final int CANCEL_MEETING_OPTION = 3;
    private static final int ACEPT_REJECT_MEETING_OPTION = 4;

    private static final int BOARDS_OPTION = 5;

    // Exams

    private static final int EXAM_REALIZATION_OPTION=1;
    private static final int AUTOMATIC_EXAM_REALIZATION_OPTION = 2;

    private static final int STUDENT_GRADES=3;

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final Menu menu;
    private final MenuRenderer renderer;

    public MainMenu() {
        menu = buildMainMenu();
        renderer = getRenderer(menu);
    }

    private MenuRenderer getRenderer(final Menu menu) {
        final MenuRenderer theRenderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            theRenderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            theRenderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return theRenderer;
    }

    @Override
    public boolean doShow() {
        return renderer.render();
    }

    @Override
    public boolean show() {
        drawFormTitle();
        return doShow();
    }

    @Override
    public String headline() {

        return authz.session().map(s -> "Base [ @" + s.authenticatedUser().identity() + " ]")
                .orElse("Base [ ==Anonymous== ]");
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        final Menu myUserMenu = new MyUserMenu(BaseRoles.STUDENT);
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        mainMenu.addSubMenu(STUDENT_COURSES_OPTION, availableCoursesMenu());

        final Menu meetingsMenu = buildMeetingssMenu();
        mainMenu.addSubMenu(MEETINGS_OPTION, meetingsMenu);

        mainMenu.addSubMenu(EXAM_OPTION, examMenu());

        final Menu createBoard = createBoardMenu();
        mainMenu.addSubMenu(BOARDS_OPTION,createBoard);


        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    
    private Menu availableCoursesMenu(){
        final Menu courseMenu = new Menu("Enroll in a Course >");
        
        courseMenu.addItem(AVAILABLE_COURSES_OPTION,"Available Courses",new EnrollmentRequestAction());
        courseMenu.addItem(EXIT_OPTION,"Return",Actions.SUCCESS);

        return courseMenu;
    }

    private Menu createBoardMenu(){
        final Menu boardMenu = new Menu("Boards >");

        boardMenu.addItem(1,"Create Board",new StudentBoardUI());
        boardMenu.addItem(2,"Share Board",new ShareBoardStudentUI());
        boardMenu.addItem(3,"Archive Board", new ArchiveBoardUI()::show);

        return boardMenu;
    }

    private Menu examMenu(){
        final Menu examMenu = new Menu("Exam menu >");

        examMenu.addItem(EXAM_REALIZATION_OPTION,"Do Exam",new ExamRealizationUI()::show);
        examMenu.addItem(AUTOMATIC_EXAM_REALIZATION_OPTION,"Do Automatic Exam",new AutomaticExamRealizationUI()::show);
        examMenu.addItem(STUDENT_GRADES,"View My Grades", new StudentGradesUI()::show);

        examMenu.addItem(EXIT_OPTION,"Return",Actions.SUCCESS);

        return examMenu;
    }

    private Menu buildMeetingssMenu() {
        final  Menu menu = new Menu("Meetings >");

        menu.addItem(CREATE_MEETING_OPTION, "Create Meeting", new RegisterMeetingStudentUI()::show);
        menu.addItem(LIST_MEETING_OPTION, "List Meetings", new ListMeetingsActionStudentUI()::show);
        menu.addItem(CANCEL_MEETING_OPTION, "Cancel Meeting", new CancelMeetingStudentUI()::show);
        menu.addItem(ACEPT_REJECT_MEETING_OPTION, "Accept/Reject Meeting", new AcceptRejectMeetingStudentUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
}
