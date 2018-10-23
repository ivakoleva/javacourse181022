package bg.clearcode.javacoude181022.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(String[] args) {
        final Person person = new Person();
        person.setEgn("egn");

        final Company company = new Company();
        company.setEik("eik");

        final List<StateEntityAdvisor> advisors = new ArrayList<>();
        advisors.add(new StateEntityAdvisor<>(person));
        advisors.add(new StateEntityAdvisor<>(company));

        advisors.stream().forEach(advisor -> {
            try {
                advisor.validateIdentificationCode();
                System.out.println("state entity identification code valid");
            } catch (NonValidIdentificationCodeException e) {
                //e.printStackTrace();
                System.out.println("state entity identification code non-valid");
            }
        });
    }

}
