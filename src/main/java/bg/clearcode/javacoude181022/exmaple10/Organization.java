package bg.clearcode.javacoude181022.exmaple10;

import java.io.Serializable;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 25.10.2018,
 * a significant bit of leva.bg project.
 */
public class Organization implements Serializable {
    private Integer staffCount;

    public Integer getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(Integer staffCount) {
        this.staffCount = staffCount;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "staffCount=" + staffCount +
                '}';
    }
}
