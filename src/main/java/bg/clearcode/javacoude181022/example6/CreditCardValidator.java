package bg.clearcode.javacoude181022.example6;

import bg.clearcode.javacoude181022.example6.exception.LuhnNonValidException;
import bg.clearcode.javacoude181022.example6.exception.NonValidException;

import java.util.function.Predicate;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class CreditCardValidator implements Validator<CreditCard> {
    public static final String CHARSET = "abc"; // todo: elaborate

    public static final Predicate<String> isCreditCardNumberCharsetValid = number -> {
        assert number != null;
        assert !number.isEmpty();
        return number.chars().boxed().anyMatch(c ->
                !CHARSET.contains(String.valueOf(c)));
    };

    @Override
    public void validate(final CreditCard creditCard) throws NonValidException {
        final String number = creditCard.getNumber();
        if (number == null || number.isEmpty() || isCreditCardNumberCharsetValid.negate().test(number)) {
            throw new NonValidException("Credit card number [" + number + "] does not comply with our charset allowed [" + CHARSET + "]");
        }

        checkWithExternalService(creditCard);
        try {
            checkStateAdministrationList(creditCard);
        } catch (Exception e) {
            final NonValidException nonValidException =  new NonValidException("Credit card non-valid, reason [" + e.getMessage() + "] ", e);
            //nonValidException.addSuppressed();
            throw nonValidException;
        }
    }

    private static void checkWithExternalService(final CreditCard creditCard) throws LuhnNonValidException {
        // TODO: implement
        //throw new LuhnNonValidException();
    }

    private static void checkStateAdministrationList(final CreditCard creditCard) throws Exception {
        // TODO: implement
        throw new Exception("because of reasons");
    }
}
