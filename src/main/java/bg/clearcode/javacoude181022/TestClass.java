package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
class TestClass {
    public volatile static int classVariable = 5;

    private String field = "1";

    static {
        classVariable = 6;
        System.out.println(classVariable);
    }

    {
        classVariable = 4;
        System.out.println(classVariable);
        field = "2";
        //System.out.println(field);
    }

    public String getField() {
        System.out.println("someone triggered getField()");
        if(field == null) {
            field = "5";
        }
        return field;
    }

    public void setField(final String field) throws NullPointerException {
        int itest = 1;
        itest = 2;
        System.out.println(itest);
        if(field == null) {
            throw new NullPointerException();
        }
        this.field = field;
    }

    public TestClass() {
    }

    public TestClass(final int i) {
        classVariable = 1;
        System.out.println(classVariable);
        field = "3";
    }

    void test(final String value) {
        System.out.println("test: " + value + field);
    }

    static void testStatic(final String value) {
        System.out.println(classVariable);
    }
}
