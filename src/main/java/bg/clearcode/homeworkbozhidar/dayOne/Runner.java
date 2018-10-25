package bg.clearcode.homeworkbozhidar.dayOne;

public class Runner {

    public static void main(String[] args) {
        PersonComparator comparator = new PersonComparator();

        Person personOne = new Person("Pesho", 123);
        Person personTwo = new Person("Pesho", 123);
        Person personThree = new Person("Ivan", 123);
        Person personFour = new Person("Pesho", 4);

        final Person[] people = new Person[4];
        people[0] = personOne;
        people[1] = personTwo;
        people[2] = personThree;
        people[3] = personFour;

        Person comparatorPerson;
        Person toBeCompared;

        for (int i = 0; i < people.length; i++) {
            for (int k = 0; k < people.length; k++) {
                comparatorPerson = people[i];
                toBeCompared = people[k];
                System.out.println(comparator.compare(comparatorPerson, toBeCompared));
            }
        }
    }
}
