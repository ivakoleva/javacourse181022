package bg.clearcode.javacoude181022.example9;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 25.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    public static void main(String[] args) {
        //Double doubleValue = Double.valueOf(1.0);

        final BigDecimal bigDecimal = new BigDecimal(10);
        // 1.
        final BigDecimal bigDecimal1 = bigDecimal.divide(new BigDecimal(9), 2, RoundingMode.CEILING);



        double i = 10 / 9;


        System.out.println();
    }
}
