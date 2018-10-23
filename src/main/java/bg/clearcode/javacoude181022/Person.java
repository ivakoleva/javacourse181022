package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public class Person extends BaseEntity implements Nameable {
    private static int testStaticInt = 1;
    private String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        final Person personClone = new Person();
        personClone.name = this.name;
        return personClone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void implementFurther() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getId() {
        return super.getId() + 1;
    }

    private Long getIdSuper() {
        return super.getId();
    }

    private void test() {
        System.out.println();
        toString1();
    }

    static class NestedClass {
        public NestedClass() {
            testStaticInt++;
        }
    }

     class InnerClass {
        private Long id;

        public InnerClass() {
            id = getId();
            id = getIdSuper();
            System.out.println(name);
        }
    }

    class InnerClass2 extends InnerClass {

    }
}
