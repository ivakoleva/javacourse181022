package bg.clearcode.homeworkbozhidar.dayOne;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(final Person person1, final Person person2) {
        final int nameCompare = compareByName(person1.getName(), person2.getName());
        if (nameCompare == 0) {
            final int ageCompare = compareByAge(person1.getAge(), person2.getAge());
            if (ageCompare == 0) {
                return compareByHashCode(person1.hashCode(), person2.hashCode());
            } else {
                return ageCompare;
            }
        } else {
            return nameCompare;
        }
    }

    private int compareByName(String name1, String name2) {
        return name1.compareTo(name2);
    }

    private int compareByAge(int age1, int age2) {
        return Integer.compare(age1,age2);
    }

    private int compareByHashCode(int hashcode1, int hashcode2) {
        return Integer.compare(hashcode1,hashcode2);
    }
}
