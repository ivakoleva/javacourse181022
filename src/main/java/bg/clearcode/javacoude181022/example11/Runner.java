package bg.clearcode.javacoude181022.example11;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 25.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(String[] args) {
        final Path path =
                Paths.get("." + File.separator  +
                        File.separator + "homework.mdasdasd");
        System.out.println("path: " + path.toString());

        final Path pathNormalized = path.normalize();
        System.out.println("path normalized: " + pathNormalized.toString());


        //path.
        //Files.
    }
}
