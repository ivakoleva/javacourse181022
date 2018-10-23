package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public class PersonReadOnly extends BaseEntity {
    private Person person;

    public PersonReadOnly(final Person person) {
        this.person = person;
    }

    public String getName() {
        return person.getName();
    }

    @Override
    public boolean equals(Object o) {
        return person.equals(o);
    }

    @Override
    public int hashCode() {
        return person.hashCode();
    }

    @Override
    public String toString() {
        return person.toString();
    }

    public void implementFurther() {
        person.implementFurther();
    }

    public Long getId() {
        return person.getId();
    }

    public String toString1() {
        return person.toString1();
    }
}
