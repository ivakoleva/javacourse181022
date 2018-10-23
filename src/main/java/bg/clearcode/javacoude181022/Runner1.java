package bg.clearcode.javacoude181022;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 22.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*if (1 == 2) {
            System.out.println("if");
        } else if (false) {
            System.out.println("then 1");
        } else if (true) {
            System.out.println("then 2");
        } else {
            System.out.println("else");
        }

        final Runner.Gender gender = Runner.Gender.MALE;
        switch (gender) {
            case MALE:
                System.out.println("Y");
            case FEMALE:
                System.out.println("X");
            default:
                if (gender == null) {
                    System.out.println("null");
                } else {
                    System.out.println("human");
                }
                break;
        }*/


        /*final String testString = "asd";
        switch (testString) {
            case "asd":
                System.out.println("1");
                break;
            case "asd2":
                System.out.println("2");
        }*/

        /*int i = 0;
        do {
            i++;
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        } while (i < 10);*/


        /*int i = 0;
        while(true) {
            if(i++ > 10) {
                break;
            }
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }*/


       /* for(int i = 0; i < 10 ; i++) {

        }*/

       /*int[] iArray = {100, 101, 102};

       int status = 0;

       for ( int i : iArray) {
           System.out.println("position " + status + " " + i);
           status++;
       }

        final int firstDimensionSize = 3;
        final int secondDimensionSize = 4;
        final int[][] multiArray = new int[firstDimensionSize][secondDimensionSize];

        outerFor:
        for (int i = 1; i <= firstDimensionSize; i++) {
            for (int j = 1; j <= secondDimensionSize; j++) {
                if(i - 1 == 1) {
                    continue outerFor;
                }
                multiArray[i - 1][j - 1] =  (i * 100) + (j * 10);
            }
        }
        System.out.println(multiArray);*/

       /*Person person1 = new Person();
       Person person2 = (Person) person1.clone();
       person1.equals(person2)

       for(Person person : new Persons()) {
           System.out.println(person.getName());
       }

       Integer integer1 = new Integer(1);
       Integer integer2 = new Integer(1);

       if(integer1.compareTo(integer2) == 0) {
           System.out.println(true);
       } else {
           System.out.println(false);
       }*/

        /*int[] iArray = {0, 1, 2, 3};
        int[] iArraySubset = new int[2];
        System.arraycopy(iArray, 1, iArraySubset, 0, 2);
        System.out.println(iArray);

        final Person[] personsArray = {new Person(), new Person()};
        Arrays.sort(personsArray);*/

        //final String test = "asd" + "1";
        /*final Person person = new Person();
        person.setName("test0");*/
        //final StringBuilder stringBuilder = new StringBuilder("test");
        //stringBuilder.append(1).append(n).

        /*test(person);
        System.out.println(person.getName());*/

        /*final String test = "test".concat("asd");
        char[] charsArray = test.toCharArray();

        "test" + "asd"


        final StringBuilder stringBuilder = new StringBuilder(test);
        testString(stringBuilder);
        System.out.println(stringBuilder);*/

        final Person.NestedClass nestedClass = new Person.NestedClass();

        final Person.InnerClass innerClass = new Person().new InnerClass();

        //Person person = (Person) baseEntity;

        Test test = Test.getInstance();

    }

    /*public static void test(final Person person) {
        //person = new Person();
        person.setName("test1");
    }*/

    /*public static void testString(final StringBuilder stringBuilder) {
        stringBuilder.append("ASD");
    }*/


}
