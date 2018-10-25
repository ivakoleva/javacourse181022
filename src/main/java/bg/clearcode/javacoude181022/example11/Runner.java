package bg.clearcode.javacoude181022.example11;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 25.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {


    public static void main(String[] args) throws IOException {
        // resources
        /*final ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages");
        final URL url = Runner.class.getClassLoader().getResource("sample.txt");
        System.out.println(url);*/

        /*final Path path =
                Paths.get("." + File.separator +
                        File.separator + "homework.md");
        System.out.println("path: " + path.toString());

        final Path pathNormalized = path.normalize();
        System.out.println("path normalized: " + pathNormalized.toString());
        System.out.println(path.toUri());

        Files.exists(path);

        final File file = pathNormalized.toFile();
        System.out.println(file.isDirectory());
        file.exists();*/

        // file system monitoring & callback on event
        /*final Path directory = Paths.get(".");
        final WatchService watchService = FileSystems.getDefault().newWatchService();
        directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
        try {
            while (true) {
                final WatchKey watchKey = watchService.take();
                for (WatchEvent<?> watchEvent : watchKey.pollEvents()) {
                    final WatchEvent<Path> event = (WatchEvent<Path>) watchEvent;
                    if (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind())) {
                        System.out.println("Creating " + event.context().toString());
                    } else if (StandardWatchEventKinds.ENTRY_DELETE.equals(event.kind())) {
                        System.out.println("Deleting " + event.context().toString());
                    } else {
                        System.out.println("hm?");

                    }
                    return;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        final Set<OpenOption> openOptionsSet = new HashSet<>();
        openOptionsSet.add(StandardOpenOption.WRITE);
        openOptionsSet.add(StandardOpenOption.APPEND);
        openOptionsSet.add(StandardOpenOption.CREATE_NEW);

        final Set<PosixFilePermission> fileAttributes = new HashSet<>();
        fileAttributes.add(PosixFilePermission.OWNER_WRITE);

        try (final FileChannel fileChannel = FileChannel.open(Paths.get("./asd.txt"), openOptionsSet, PosixFilePermissions.asFileAttribute(fileAttributes))) {
            final byte[] buffer = new byte[3];
            buffer[0] = 97;
            buffer[1] = 98;
            buffer[2] = 99;
            fileChannel.write(ByteBuffer.wrap(buffer));
        }
    }
}
