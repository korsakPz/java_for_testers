package tests;

import manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.nio.file.Paths;
import java.util.Random;

public class TestBase {

    protected static ApplicationManager app;


    @BeforeEach
    public void setUp() {

        if (app == null) {
            app = new ApplicationManager();
        }


        app.init(System.getProperty("browser", "chrome"));


    }

    public static String randomString(int n) {
        var rnd = new Random();
        var result = "";
        for (int i = 0; i < n; i++) {
            result = result + (char)('a'+ rnd.nextInt(26));
        }

         return result;
    }

    public static String randomFile(String dir) {
        File[] files = new File(dir).listFiles(f -> f.isFile() && f.getName().matches(".*\\.(png|jpg|jpeg)"));
        if (files == null || files.length == 0) {
            throw new RuntimeException("No image files found in directory: " + dir);
        }
        return files[new Random().nextInt(files.length)].getAbsolutePath();


    }

}
