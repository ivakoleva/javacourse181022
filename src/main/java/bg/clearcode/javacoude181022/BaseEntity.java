package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public abstract class BaseEntity {
    protected Long id;

    public Long getId() {
        Runner2 runner2 = new Runner2();
        return id;
    }

    public void setId(Long id) throws IndexOutOfBoundsException {
        this.id = id;
    }

    protected abstract void implementFurther();
}
