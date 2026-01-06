package eapli.base.app.sharedBoards.console;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(
                "base.app.sharedBoards.console/src/main/resources/application.properties");
        props.load(file);
        return props;

    }
}
