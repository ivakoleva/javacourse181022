package bg.clearcode.javacoude181022;

import java.util.Arrays;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public class PersonFactory {
    public static void main(String[] args) {
        /*Person person = getNameableGenerics(Person.class);
        PersonVariation personVariation = getNameableGenerics(PersonVariation.class);*/
        //Person nameable = (Person) PersonFactory.getNameable(Person.class);
        final Class[] nameableClassArray = {Person.class, PersonVariation.class};
        Nameable nameable1 = getNameableChoose(Person.class, PersonVariation.class);
        System.out.println(nameable1 instanceof Person);
        System.out.println(((PersonVariation)nameable1).getClass().isAssignableFrom(Person.class));


        test(1);
    }

    public static String test(final int num, final String... values) {
        Arrays.stream(values).forEach(v -> System.out.println(v));
        return String.join("", values);
    }


    public static Nameable getNameable() {
        return new Person();
    }

    public static <T extends Nameable> T getNameableGenerics(final Class<T> nameableClass) {
        try {
            return nameableClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Nameable getNameable(final Class nameableClass) {
        Nameable nameable = null;
        if(Person.class.equals(nameableClass)) {
            nameable = new Person();

        } else if(PersonVariation.class.equals(nameableClass)) {
            nameable = new PersonVariation();
            ((PersonVariation)nameable).setVariation("Variation");
        }
        if(nameable != null) {
            nameable.setName("Name");
        }
        return nameable;
    }



    public static Nameable getNameableChoose(final Class... namableClassArray) {
         Nameable result = null;
        if(namableClassArray.length > 0) {
            for(Class nameableClass : namableClassArray) {
                if(Person.class.equals(nameableClass)) {
                    result = new Person();
                    result.setName("Name");
                    break;
                }
            }
            for(Class nameableClass : namableClassArray) {
                if(PersonVariation.class.equals(nameableClass)) {
                    result = new PersonVariation();
                    result.setName("Name");
                    ((PersonVariation) result).setVariation("Variation");
                    break;
                }
            }
        }
        return result;
    }
}
