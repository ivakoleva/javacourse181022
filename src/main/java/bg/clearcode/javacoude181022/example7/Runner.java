package bg.clearcode.javacoude181022.example7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(String[] args) {
        /*assert args.length == 1;

        try {
            if ("a".equals(args[0])) {
                throw new IOException();
            }
            throw new Exception();
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("Exception");
        }

        // < Java SE 7
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("homework.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ignored) {
                }
            }
        }

        // multi-catch
        try {
            if ("a".equals(args[0])) {
                throw new IOException();
            }
            throw new NonValidException();
        } catch (IOException | NonValidException e) {
            e.printStackTrace();
            //System.out.println("a");
        }*/

        // try-with-resources >= Java SE 7
        try (
                final InputStream inputStream1 = new FileInputStream("homework.md");
                //final InputStream inputStream2 = new FileInputStream("homework.md1");
        ) {
            int i;
            while ((i = inputStream1.read()) != -1) { // EOF == -1
                System.out.print((char) i);
            }
            System.out.println("Exiting");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
