package bg.clearcode.javacoude181022.homeworks.thuesday.models;

public class Company extends StateEntity {

    public Company(String name, String idNumber, int age) {
        super(name, idNumber, age);
    }

    public String getName() {
        return super.name;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public int getAge() {
        return super.age;
    }
}
