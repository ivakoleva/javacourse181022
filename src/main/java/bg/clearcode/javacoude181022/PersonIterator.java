package bg.clearcode.javacoude181022;

import java.util.Iterator;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public class PersonIterator implements Iterator<Person> {
    private final Persons persons;
    private Integer index;

    public PersonIterator(final Persons persons) {
        assert persons != null;
        this.persons = persons;
    }

    @Override
    public boolean hasNext() {
        boolean result;
        try {
            result = persons.get(index == null ? 0 : index + 2) != null;
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    @Override
    public Person next() {
        index = index == null ? 0 : index + 2;
        return persons.get(index);
    }
}
