package bg.clearcode.homeworkbozhidar.dayThree;

import java.time.LocalDateTime;

public abstract class StateEntityImpl implements StateEntity, Comparable<StateEntity> {

    private LocalDateTime issueDate;

    void issueDate(final LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    int getAge() {
        return LocalDateTime.now().getYear() - issueDate.getYear();
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