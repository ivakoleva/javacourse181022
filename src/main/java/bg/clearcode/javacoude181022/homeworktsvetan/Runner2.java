package bg.clearcode.javacoude181022.homeworktsvetan;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Runner2 {
    public static void main(String[] args) throws IOException {
        final String DIRECTORY = "directory";
        final String SUBDIRECTORY = "subdirectory";
        new File(DIRECTORY + File.separator + SUBDIRECTORY).mkdirs();

        try (final Writer writer = new FileWriter(DIRECTORY + File.separator +"file1")) {
            writer.write("Hello file1!" + System.lineSeparator());
            writer.write("Hello file1 again!");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (final Writer writer = new FileWriter(DIRECTORY + File.separator + SUBDIRECTORY + File.separator +"file2")) {
            writer.write("Hello file2!" + System.lineSeparator());
            writer.write("Hello file2 again!");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<Path> paths = Files.walk(Paths.get(DIRECTORY))) {
            paths.filter(Files::isDirectory)
                    .forEach(System.out::println);
        }

        try {
            File file = new File(DIRECTORY + File.separator +"file1");
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        try {
            //create a temp file
            File temp = File.createTempFile("temporary", ".tmp", new File(DIRECTORY));
            System.out.println("Temp file : " + temp.getAbsolutePath());
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
