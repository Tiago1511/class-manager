package eapli.base.app.backoffice.console.presentation.course;


import eapli.base.Application;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;


public class OpenCloseCourseUI extends AbstractUI {

    private static final int EXIT_OPTION = 0;

    private static final int OPEN_COURSE_OPTION = 1;

    private static final int CLOSE_COURSE_OPTION = 2;

    private static final String RETURN_LABEL = "Return ";

    @Override
    protected boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return renderer.render();
        /*Menu menu = new Menu("Open/Close Course");

        menu.addItem(OPEN_COURSE_OPTION, "Open Course", new OpenCourseUI()::show);
        menu.addItem(CLOSE_COURSE_OPTION, "Close Course", new CloseCourseUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return m;*/
    }

    private Menu buildMainMenu() {
        final Menu menu = new Menu("Open/Close Course >");

        menu.addItem(OPEN_COURSE_OPTION, "Open Course", new OpenCourseUI()::show);
        menu.addItem(CLOSE_COURSE_OPTION, "Close Course", new CloseCourseUI()::show);
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);
        return menu;
    }


    @Override
    public String headline() {
        return "Open/Close Course";
    }
}
