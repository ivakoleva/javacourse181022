package bg.clearcode.javacoude181022.example3;

import bg.clearcode.javacoude181022.example1.Person;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Identifier<T extends Serializable> { // <T extends Serializable, Iterable>
    private Object entity;
    private Class<T> entityClass;

    public Identifier(final Object entity, final Class<T> entityClass) {
        this.entity = entity;
        this.entityClass = entityClass;
    }

    public T copyEntity() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        return entityClass.getDeclaredConstructor().newInstance();
    }

    public <U> U copyObject(final U value) {
        // TODO: implement
        return null;
    }

    public <U> U copyObject1(final U value) {
        // TODO: implement
        return null;
    }

    public static List<Class<?>> test() {
        final List<Class<?>> list = new ArrayList<>();
        list.add(getRandomClass());
        return list;
    }

    // TODO: implement
    public static Class<?> getRandomClass() {
        return Person.class;
    }

    public static <T extends Serializable> void testGeneric(final List<T> list) {
        list.add((T) "asd");
    }

    public static List<?> testWildcard(final List<?> list) {
        return new ArrayList<>(list);
    }
}
