package bg.clearcode.javacoude181022.homeworktsvetan;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {
    public static final int MIN_NAME_LENGTH = 3;
    public static final int MAX_NAME_LENGTH = 10;
    public static final int CHARSET_FROM_INCLUSIVE = 97;
    public static final int CHARSET_TO_EXCLUSIVE = 123;
    public static final Random RANDOM = new Random();

    public static final Supplier<String> namesGenerator = () -> {
        final StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(MIN_NAME_LENGTH, MAX_NAME_LENGTH + 1).forEach(i ->
                stringBuilder.append(
                        (char) (RANDOM.nextInt((CHARSET_TO_EXCLUSIVE - CHARSET_FROM_INCLUSIVE) + 1) + CHARSET_FROM_INCLUSIVE)));
        return stringBuilder.toString();
    };

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        generateStateEntity(Organization.class);
        generateStateEntity(Organization.class);

        /*Stream.generate(() -> {
            // implement a supplier of stateEntity & initialize a collection
        }).limit(10);*/

        final Organization clearCode = new Organization("ClearCode", "Ltd.", "11.09.1990");
        final Organization newHorizons = new Organization("New Horizons", "Ltd.", "11.09.1980");

        final Person ivan = new Person("Ivan", "Ivanov", "01.02.1980");
        final Person maria = new Person("Maria", "Georgieva", "21.07.1994");

        final List<StateEntity> stateEntities = new ArrayList<>();
        stateEntities.add(clearCode);
        stateEntities.add(newHorizons);
        stateEntities.add(ivan);
        stateEntities.add(maria);

        System.out.println(maria.getAge());
    }

    public static <T extends StateEntity> T generateStateEntity(final Class<T> stateEntityClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final T stateEntity = stateEntityClass.getDeclaredConstructor().newInstance();

        final Field[] fields = stateEntityClass.getFields();
        final List<Field> stringFields = Arrays
                .stream(fields)
                .filter(field -> String.class.equals(field.getType())) // TODO: maybe CharSequence ?
                .collect(Collectors.toList());
        for (Field field : stringFields) {
            field.set(stateEntity, namesGenerator.get());
        }
        // TODO: Integer, review Number super class & implement

        return stateEntity;
    }
}
