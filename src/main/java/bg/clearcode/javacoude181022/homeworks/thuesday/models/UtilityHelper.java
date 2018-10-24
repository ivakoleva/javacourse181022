package bg.clearcode.javacoude181022.homeworks.thuesday.models;

import java.util.Comparator;

public final class UtilityHelper implements Comparator<StateEntity> {

    @Override
    public int compare(StateEntity o1, StateEntity o2) {

        if (o1.age > o2.age) {
            return 1;
        }

        if (o1.age < o2.age) {
            return -1;
        }

        return 0;
    }
}
