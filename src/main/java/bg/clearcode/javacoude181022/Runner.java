package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner extends Runner1 {
    public static final String TEST_CONSTANT = "asd";

    enum Gender {
        MALE,
        FEMALE
    }

    /*Gender gender = Gender.FEMALE;
    InputStream inputStream;

    {
        try {
            inputStream = new FileInputStream("filename");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    *//*public Runner() {
        super(1);
    }*//*

    public Runner(final Runner runner) {
        super(runner);
        this.inputStream = runner.inputStream;
    }

    public static void main(final String[] args) {
        final TestClass testClass1 = new TestClass();
        System.out.println("classVariable: " + TestClass.classVariable);

        //System.gc();

        *//*
        testClass1.field = 4;
        TestClass.classVariable = 4;

        final TestClass testClass2 = new TestClass();
        testClass2.field = 3;
        TestClass.classVariable = 3;
*//*
        //System.out.println("someone triggered getField()");
        //System.out.println(testClass1.field);
  *//*      System.out.println(testClass2.field);
        System.out.println(TestClass.classVariable);
*//*

        *//*System.out.println(testClass.field);
        testClass.test("asd");

        int[] chars = {0, 1};
        System.out.println(chars.toString());*//*


        *//*char[] charsClassic = new char[2];
        *//**//*for(int i = 0; i < charsClassic.length; i++) {
            System.out.println(charsClassic[i]);
            System.out.println(charsClassic[i] == '\u0000');
        }*//**//*
        charsClassic = new char[3];

        charsClassic[0] = (char) 0;
        charsClassic[1] = 'b';

        System.out.println(charsClassic);

        String test = null;

        char[] chars = {'a', 'b'};*//*



        *//*System.out.println(value);*//*
        // 00000001 >> 10000000
        // 00000010 >> 00000001

        // 0001
        // 0011
        // OR
        // 0011

        *//*System.out.println(value++ > 0 && value++ > 0);
        System.out.println(value);

        System.out.println(value > 0 ? value : false);
        if(value > 0) {
            System.out.println(value);
        } else {
            System.out.println(false);
        }*//*

        *//*int value = 1;
        int value1 = 0;
        System.out.println(value1 += value += 1);

        value = value + 1;
        value1 = value1 + value;
        System.out.println(value1);

        String valueString = "asd";
        valueString = valueString + "a";
        String valueStringAsd = "asd";
*//*
        *//*System.out.println((int) 'a');

        System.out.println(false);*//*
    }

    @Override
    void test(String value) {
        super.test(value);
    }

    static void testStatic() {
        System.out.println(classVariable);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception ignored) {
            }
        }
    }*/
}
