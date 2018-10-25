package bg.clearcode.homeworkbozhidar.dayThree;

import java.time.LocalDateTime;

public class Person extends StateEntityImpl {
    private String egn;
    @Deprecated
    private int age;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDateTime birthDay) {
        super.issueDate(birthDay);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    @Override
    public String getIdentificationCode() {
        assert this.egn != null;
        return egn;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }
}