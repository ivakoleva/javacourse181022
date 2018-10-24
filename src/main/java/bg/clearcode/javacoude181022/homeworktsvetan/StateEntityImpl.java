package bg.clearcode.javacoude181022.homeworktsvetan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class StateEntityImpl implements StateEntity, Comparable<StateEntity> {

    private LocalDate issueDate;

    int getAge() { return LocalDate.now().getYear() - issueDate.getYear();}

    void setIssueDate(String issueDateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.issueDate = LocalDate.parse(issueDateStr, formatter);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(final StateEntity entity) {
        return this.getName().compareTo(entity.getName());
    }
}
