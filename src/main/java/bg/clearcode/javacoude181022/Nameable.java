package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public interface Nameable {
    String getName();

    void setName(String name);

    default String toString1() {
        return "Nameable";
    }
}
