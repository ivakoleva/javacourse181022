package bg.clearcode.javacoude181022.exmaple10;

import java.io.Serializable;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 25.10.2018,
 * a significant bit of leva.bg project.
 */
public class Person implements Serializable {
    private String name;
    private Organization organization; //transient

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", organization=" + organization +
                '}';
    }
}
