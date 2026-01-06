package eapli.base.app.teacher.console.presentation;

import eapli.base.Application;
import eapli.base.app.backoffice.console.presentation.boards.ArchiveBoardUI;
import eapli.base.app.backoffice.console.presentation.exam.AddQuestionUI;
import eapli.base.app.teacher.console.exam.AutomaticExamRealizationUI;
import eapli.base.app.teacher.console.exam.ExamCreationUI;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.app.teacher.console.presentation.boards.TeacherBoardUI;
import eapli.base.app.teacher.console.presentation.boards.TeacherShareBoardUI;
import eapli.base.app.teacher.console.presentation.classes.ScheduleClassUI;
import eapli.base.app.teacher.console.presentation.classes.ScheduleExtraClassUI;
import eapli.base.app.teacher.console.presentation.classes.UpdateClassUI;
import eapli.base.app.teacher.console.presentation.grades.ViewGradesUI;
import eapli.base.app.teacher.console.presentation.meetings.AcceptRejectMeetingTeacherUI;
import eapli.base.app.teacher.console.presentation.meetings.CancelMeetingTeacherUI;
import eapli.base.app.teacher.console.presentation.meetings.ListMeetingsTecaherUIActionUI;
import eapli.base.app.teacher.console.presentation.meetings.RegisterMeetingTeacherUI;
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

public class MainMenu extends AbstractUI {

    private static final String SEPARATOR_LABEL = "--------------";

    private static final int EXIT_OPTION = 0;

    private static final String RETURN_LABEL = "Return ";

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int TEACHER_OPTION = 7;

    private static final int CLASS_OPTION = 2;

    private static final int MEETINGS_OPTION = 3;

    private static final int RECHARGE_USER_CARD_OPTION = 1;

    //CLASSES
    private static final int SCHEDULE_REC_CLASS_OPTION = 1;
    private static final int SCHEDULE_EXTRA_CLASS_OPTION = 2;
    private static final int UPDATE_CLASS = 3;

    private static final int EXAM_MENU = 4;



    //MEETING

    private static final int SCHEDULE_MEETING_OPTION = 1;
    private static final int CREATE_MEETING_OPTION = 1;
    private static final int LIST_MEETING_OPTION = 2;
    private static final int CANCEL_MEETING_OPTION = 3;
    private static final int ACEPT_REJECT_MEETING_OPTION = 4;

    private static final int BOARDS_OPTION= 5;

    private static final int GRADES_MENU = 6;



    //TEACHER MENU
    private static final int CREATE_EXAM = 1;
    private static final int ADD_QUESTION = 2;

    private static final int AUTOMATIC_EXAM_REALIZATION_OPTION = 3;

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

        final Menu myUserMenu = new MyUserMenu(BaseRoles.TEACHER);
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        final Menu classMenu = buildClassMenu();
        mainMenu.addSubMenu(CLASS_OPTION, classMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.TEACHER)) {
            //final Menu teacherMenu = buildTeacherMenu();
           // mainMenu.addSubMenu(TEACHER_OPTION, teacherMenu);

            final Menu meetingsMenu = buildMeetingssMenu();
            mainMenu.addSubMenu(MEETINGS_OPTION, meetingsMenu);
        }

        final Menu createBoard = createBoardMenu();
        mainMenu.addSubMenu(BOARDS_OPTION,createBoard);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        final Menu examMenu = buildExamMenu();
        mainMenu.addSubMenu(EXAM_MENU,examMenu);

        final Menu gradeMenu = viewGradesMenu();
        mainMenu.addSubMenu(GRADES_MENU,gradeMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }



        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    private Menu buildTeacherMenu() {
        final Menu OptionMenu = new Menu("Teacher  >");

        OptionMenu.addItem(EXIT_OPTION, "Return", Actions.SUCCESS);

        return OptionMenu;
    }

    private Menu buildExamMenu(){
        final Menu menu=  new Menu("Exams >");

        menu.addItem(CREATE_EXAM,"Create Normal Exam",new ExamCreationUI()::show);
        menu.addItem(ADD_QUESTION,"Add Exam Question",new AddQuestionUI()::show);
        menu.addItem(AUTOMATIC_EXAM_REALIZATION_OPTION,"Do Automatic Exam",new AutomaticExamRealizationUI()::show);

        return menu;
    }

    private Menu viewGradesMenu(){
        final Menu menu=  new Menu("Grades >");

        menu.addItem(1,"View Grades",new ViewGradesUI());

        return menu;
    }
    private Menu buildClassMenu() {
        final Menu menu = new Menu("Classes >");
        menu.addItem(SCHEDULE_REC_CLASS_OPTION, "Schedule Recurrent Class", new ScheduleClassUI()::show);
        menu.addItem(SCHEDULE_EXTRA_CLASS_OPTION, "Schedule Extra Class", new ScheduleExtraClassUI()::show);
        menu.addItem(UPDATE_CLASS, "Update Class", new UpdateClassUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }

    private Menu buildMeetingssMenu() {
        final  Menu menu = new Menu("Meetings >");

        menu.addItem(CREATE_MEETING_OPTION, "Create Meeting", new RegisterMeetingTeacherUI()::show);
        menu.addItem(LIST_MEETING_OPTION, "List Meetings", new ListMeetingsTecaherUIActionUI()::show);
        menu.addItem(CANCEL_MEETING_OPTION, "Cancel Meeting", new CancelMeetingTeacherUI()::show);
        menu.addItem(ACEPT_REJECT_MEETING_OPTION, "Accept/Reject Meeting", new AcceptRejectMeetingTeacherUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu createBoardMenu(){
        final Menu boardMenu = new Menu("Boards >");

        boardMenu.addItem(1,"Create Board",new TeacherBoardUI());
        boardMenu.addItem(2,"Share Board",new TeacherShareBoardUI());
        boardMenu.addItem(3,"Archive Board", new ArchiveBoardUI()::show);



        return boardMenu;
    }
}
