package eapli.base.app.sharedBoards.console.boards;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CreateBoard implements Runnable{
    @Override
    public void run() {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("http://localhost:63342/Departamento-de-Engenharia-Informatica/base.app.sharedBoards.console/eapli/base/app/sharedBoards/console/boards/board.html?_ijt=u82fcnbe91c4muf0317omg0jq5"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Thread has finished execution");
    }
}
