package bg.clearcode.homeworkbozhidar.dayOne;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final int age;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        int result = 14;
        result = 33 * result + name.hashCode();
        result = 33 * result + age;
        result = 33 * result + LocalDate.now().hashCode() * (int)(Math.random()*101);
        return result;
    }
}
