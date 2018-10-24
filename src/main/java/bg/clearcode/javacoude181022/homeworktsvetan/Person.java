package bg.clearcode.javacoude181022.homeworktsvetan;

import java.time.LocalDate;

public class Person extends StateEntityImpl {
    private String egn;
    @Deprecated
    private int age;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        super.setIssueDate(dateOfBirth);
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
        return egn;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }
}
