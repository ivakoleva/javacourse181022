package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
class Test {
    private static Test instance;

    private Test() {
    }

    public static Test getInstance() {
        if (instance == null) {
            instance = new Test();
        }
        return instance;
    }
}
