import java.io.File;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");

        var configFile = new File("sandbox/build.gradle");
        System.out.println(configFile.getAbsolutePath());
        System.out.println(configFile.exists());

        System.out.println(new File("").getAbsolutePath());
    }
}
