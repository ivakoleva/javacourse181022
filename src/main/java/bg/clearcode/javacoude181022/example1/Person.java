package bg.clearcode.javacoude181022.example1;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Person implements StateEntity {
    private String egn;

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    @Override
    public String getIdentificationCode() {
        return egn;
    }
}
