package bg.clearcode.javacoude181022.example6;

import bg.clearcode.javacoude181022.example6.exception.NonValidException;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(final String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Runner <creditCardNumber>");
            System.exit(0);
        }
       /* Integer creditCardNumber;
        try {
            creditCardNumber = Integer.parseInt(args[0]);

        } catch (NumberFormatException ignored) {
            creditCardNumber = null;
        }
        assert creditCardNumber != null;*/

        final CreditCard creditCard = new CreditCard();
        creditCard.setNumber(args[0]);

        try {
            (new CreditCardValidator()).validate(creditCard);
        } catch (NonValidException e) {
            e.printStackTrace();
        }
        System.out.println("Credit card valid!");
    }
}
