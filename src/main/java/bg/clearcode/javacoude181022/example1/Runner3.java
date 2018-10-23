package bg.clearcode.javacoude181022.example1;

import bg.clearcode.javacoude181022.Person;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner3 {
    public static void main(String[] args) {
        //final Runnable runnable = () -> System.out.println("runned.");

        final Person person = new Person();
        System.out.println(StateEntityAdvisingUtils.isIdentificationCodeValid.test(person));
    }
}

