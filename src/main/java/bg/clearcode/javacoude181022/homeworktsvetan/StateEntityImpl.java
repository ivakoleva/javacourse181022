package bg.clearcode.javacoude181022.homeworktsvetan;

public abstract class StateEntityImpl implements StateEntity, Comparable<StateEntity> {
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(final StateEntity entity) {
        return this.getName().compareTo(entity.getName());
    }
}
