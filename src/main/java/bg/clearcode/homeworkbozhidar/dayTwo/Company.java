package bg.clearcode.homeworkbozhidar.dayTwo;

public class Company implements Ageable {

    private int age;

    @Override
    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
