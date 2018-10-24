package bg.clearcode.javacoude181022.homeworks.thuesday.models;

public class Person extends StateEntity {

    public Person(String name, String egn, int age) {
        super(name, egn, age);
    }

    public String getName() {
        return super.name;
    }

    public String getEgn() {
        return super.idNumber;
    }

    public int getAge() {
        return super.age;
    }
}
