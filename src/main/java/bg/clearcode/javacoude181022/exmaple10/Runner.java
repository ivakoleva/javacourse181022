package bg.clearcode.javacoude181022.exmaple10;

import java.io.IOException;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 25.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public Runner() {
    }

    public static void main(String[] args) throws IOException {
        /*try(final InputStream inputStream = new FileInputStream("homework.md")) {
            int i;
            int k = 0;
            while((i = inputStream.read()) != -1) {
                System.out.println((byte)i);
                k++;
            }
            System.out.println();
            System.out.println(k);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // copy file
        /*try(final InputStream inputStream = new FileInputStream("homework.md");
            final OutputStream outputStream = new FileOutputStream("homework.md.copy")) {
            byte[] buffer = new byte[5];
            while(inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // object serialization & deserialization
        /*final Person person = new Person();
        person.setName("Alexander");
        final Organization organization = new Organization();
        organization.setStaffCount(10);
        person.setOrganization(organization);
        try (final ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person"))) {
            outputStream.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Person person1 = null;
        try (final ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person"))) {
            person1 = (Person) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(person1);*/

        /*try (final Reader reader = new FileReader("homework.md")) {
            int i;
            int k = 0;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
                k++;
            }
            System.out.println(k);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // flush usage
        /*try (final Writer writer = new FileWriter("homework.md.copy1")) {
            writer.write("Hello Alexander!" + System.lineSeparator());
            writer.write("Hello Alexander!");
            writer.flush();

            try (final Reader reader = new FileReader("homework.md.copy1")) {
                System.out.println("print start");
                int i;
                while ((i = reader.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println("print end");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // FilterWriter
        /*class MethodInvocationCountFilterWriter extends FilterWriter {
            int writeCount;
            int flushCount;
            boolean closed;

            public int getWriteCount() {
                return writeCount;
            }

            public int getFlushCount() {
                return flushCount;
            }

            public boolean isClosed() {
                return closed;
            }

            *//**
         * Create a new filtered writer.
         *
         * @param out a Writer object to provide the underlying stream.
         * @throws NullPointerException if <code>out</code> is <code>null</code>
         *//*
            protected MethodInvocationCountFilterWriter(final Writer out) {
                super(out);
            }

            @Override
            public void write(int c) throws IOException {
                super.write(c);
                writeCount += 1;
            }

            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                super.write(cbuf, off, len);
                writeCount += 1;
            }

            @Override
            public void write(String str, int off, int len) throws IOException {
                super.write(str, off, len);
                writeCount += 1;
            }

            @Override
            public void flush() throws IOException {
                super.flush();
                flushCount += 1;
            }

            @Override
            public void close() throws IOException {
                super.close();
                closed = true;
            }
        }

        try (final MethodInvocationCountFilterWriter writer = new MethodInvocationCountFilterWriter(new FileWriter("homework.md.copy2"))) {
            doSomethingUsingWriter(writer);

            System.out.println(writer);
            System.out.println("MethodInvocationCountFilterWriter: writes count " + writer.getWriteCount());
            System.out.println("MethodInvocationCountFilterWriter: flush count " + writer.getFlushCount());
            System.out.println("MethodInvocationCountFilterWriter: closed " + writer.isClosed());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // BufferedInputStream, custom size
        /*try(final BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("homework.md"), 80)) {
            int i;
            while((i = inputStream.read()) != -1) {
                //Math.max(8192, fileSize);
                System.out.println(inputStream.available());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // Piped
        /*PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader(pipedWriter);

        try {
            final Thread dataGeneratorThread = new Thread(new DataGenerator(pipedWriter));
            final Thread dataPrinterThread = new Thread(new DataPrinter(pipedReader));
            dataGeneratorThread.start();
            Thread.sleep(1000);
            dataPrinterThread.start();

            try {
                dataPrinterThread.join();
                dataGeneratorThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (pipedReader != null) {
            try {
                pipedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (pipedWriter != null) {
            try {
                pipedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        // formatting sample
        //System.out.printf("Hello %s, have a great day!", "asd");

        // reading from standard input
        /*final Reader reader = new InputStreamReader(System.in);
        char c = (char) reader.read();
        System.out.println();
        System.out.println(c);*/

        // Scanner
        /*final Scanner scanner = new Scanner(System.in);
        //System.out.println(scanner.next());
        //System.out.println(scanner.nextLine());

        final Person person = new Person();
        System.out.println("Insert new Person name:");
        person.setName(scanner.next());

        System.out.println(person);*/

        /*final LineNumberReader reader = new LineNumberReader(new InputStreamReader(System.in));
        System.out.println("Insert 2 lines:");
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println("Lines inserted: " + reader.getLineNumber());*/

        /*try (final PushbackReader pushbackReader = new PushbackReader(new InputStreamReader(System.in))) {
            System.out.println("Inert 2 chars on new line:");
            System.out.println((char)pushbackReader.read());
            System.out.println((char)pushbackReader.read());

            int i = 0;
            pushbackReader.unread(i);
            System.out.println("Last char inserted: " + i);
            System.out.println();
        }*/

    }

    // FilterWriter
    /*public static void doSomethingUsingWriter(final Writer writer) throws IOException {
        writer.write(Sc"Hello Alexander!" + System.lineSeparator());
        writer.write("Hello Alexander!");
        writer.flush();
    }*/
}

// Piped
/*class DataPrinter implements Runnable {
    final Reader reader;

    public DataPrinter(Reader reader) {
        this.reader = reader;
    }

    @Override
    public void run() {
        final BufferedReader bufferedReader = new BufferedReader(reader);
        int i;
        int k = 0;
        System.out.println("start printing reader head");
        try {
            while ((i = bufferedReader.read()) != -1 && k < 10) {
                System.out.println("printing char " + k);
                System.out.println((char) i);
                k++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end printing reader head");
    }
}

class DataGenerator implements Runnable {
    final Writer writer;

    public DataGenerator(final Writer writer) {
        this.writer = writer;
    }

    @Override
    public void run() {
        final BufferedWriter bufferedWriter = new BufferedWriter(writer);
        System.out.println("start generating data");
        IntStream.range(0, 10).forEach(i -> {
            try {
                bufferedWriter.write(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        try {
            bufferedWriter.write(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end generating data");
    }
}*/

