package bg.clearcode.javacoude181022.example1;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Company implements StateEntity {
    private String eik;

    public String getEik() {
        return eik;
    }

    public void setEik(String eik) {
        this.eik = eik;
    }

    @Override
    public String getIdentificationCode() {
        return eik;
    }
}
