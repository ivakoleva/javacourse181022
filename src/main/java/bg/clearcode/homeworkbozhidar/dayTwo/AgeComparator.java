package bg.clearcode.homeworkbozhidar.dayTwo;

import java.util.Comparator;

public class AgeComparator implements Comparator<Ageable> {

    @Override
    public int compare(final Ageable o1,final Ageable o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
