package bg.clearcode.javacoude181022.homeworks.thuesday.models;

public abstract class StateEntity {

    String name;
    String idNumber;
    int age;

    StateEntity(String name, String idNumber, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }

    String getIdNumber() {
        return this.idNumber;
    }
}
