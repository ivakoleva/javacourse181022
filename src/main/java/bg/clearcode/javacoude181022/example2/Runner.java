package bg.clearcode.javacoude181022.example2;

import bg.clearcode.javacoude181022.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    static final List<String> names = new ArrayList<>(); // Queue
    static {
        names.add("Albena");
        names.add("Bobi");
        names.add("Georgi");
        names.add("Ani");
    }

    /*private static Supplier<Person> personSupplier = () -> {
        final Person person = new Person();
        person.setName(names.poll());
        return person;
    };*/

    public static void main(String[] args) {
        /*final List<Person> personList = new ArrayList<>();
        final int namesCount = names.size();
        for (int i = 0; i < namesCount; i++) {
            personList.add(personSupplier.get());
        }*/

        final List<Person> personList = names.stream().map(name -> {
            final Person person = new Person();
            person.setName(name);
            return person;
        }).collect(Collectors.toList());

        final List<String> personNamesListFiltered = personList
                .stream()
                .filter(person ->
                        person.getName().startsWith("A"))
                //.map(person -> person.getName())
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", personNamesListFiltered));

        IntStream.range(0, 10).forEach(System.out::println);

        System.out.println(personList.stream().allMatch(person -> person.getName().startsWith("A")));

        System.out.println(personList.stream().allMatch(person -> person.getName().startsWith("A")));

        final Optional<Person> personOptional = personList
                .stream()
                .filter(person -> person.getName().startsWith("A"))
                .findFirst();
        System.out.println(personOptional.isPresent() ? personOptional.get().getName() : "no person no name");

        personList
                .stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);
    }
}
