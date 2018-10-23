package bg.clearcode.javacoude181022.example1;

import bg.clearcode.javacoude181022.Company;
import bg.clearcode.javacoude181022.Person;
import bg.clearcode.javacoude181022.StateEntity;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
final class StateEntityAdvisingUtils {
    private StateEntityAdvisingUtils() {
    }

    public static final Function<StateEntity, String> stateIdentificationCodeFunction = stateEntity -> {
        if (stateEntity instanceof bg.clearcode.javacoude181022.Person) {
            return ((Person) stateEntity).getEgn();
        }
        if (stateEntity instanceof bg.clearcode.javacoude181022.Company) {
            return ((Company) stateEntity).getEik();
        }
        return null;
    };

    public static final Predicate<StateEntity> isIdentificationCodeValid = stateEntity -> {
        final String stateIdentificationCode = stateIdentificationCodeFunction.apply(stateEntity);
        return stateIdentificationCode != null && !stateIdentificationCode.isEmpty();
    };
}
