package bg.clearcode.javacoude181022.jpa;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 26.10.2018,
 * a significant bit of leva.bg project.
 */
@Embeddable
public class User {
    @Basic(optional = false)
    private String username;

    @Basic(optional = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
