package bg.clearcode.javacoude181022;

import java.util.Iterator;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public class Persons  { //extends Runner implements Iterable<Person>, Comparable {
    private final static int MAX_SIZE = 11;
    private final Person[] personArray = new Person[MAX_SIZE];

    public Persons() {
        for (int i = 0; i < MAX_SIZE; i = i + 2) {
            personArray[i] = new Person();
            personArray[i].setName("PersonName" + i);
        }
    }

    public Person get(final int index) {
        return personArray[index];
    }

    /**
     * @return
     * @deprecated
     */
    public int size() {
        return personArray.length;
    }

    //@Override
    public Iterator<Person> iterator() {
        return new PersonIterator(this);
    }
}
