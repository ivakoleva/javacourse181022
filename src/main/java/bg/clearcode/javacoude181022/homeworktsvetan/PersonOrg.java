package bg.clearcode.javacoude181022.homeworktsvetan;

public abstract class PersonOrg implements Comparable<PersonOrg>{

    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(PersonOrg entity) {
        return this.getName().compareTo(entity.getName());
    }
}
