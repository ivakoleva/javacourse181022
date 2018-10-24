package bg.clearcode.homeworkbozhidar.dayTwo;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Runnable {

    public static void main(String[] args) {

        final AgeComparator ageComparator = new AgeComparator();

        final List<? extends Ageable> listPersons = Stream.generate(companySupplier).limit(10).collect(toList());
        final List<? extends Ageable> listCompanies = Stream.generate(personSupplier).limit(10).collect(toList());

        listCompanies.sort(ageComparator);
        listPersons.sort(ageComparator);

        listCompanies.forEach(company -> System.out.println(company.getAge()));
        listPersons.forEach(person -> System.out.println(person.getAge()));
    }

    public static Supplier<Person> personSupplier = () -> {
        try {
            return generateAgeableInstance(Person.class);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    };

    public static Supplier<Company> companySupplier = () -> {
        try {
            return generateAgeableInstance(Company.class);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    };


    public static <T extends Ageable> T generateAgeableInstance(final Class<T> ageableClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final T ageable = ageableClass.getDeclaredConstructor().newInstance();
        ageable.setAge((int) (Math.random() * 100));
        return ageable;
    }
}
