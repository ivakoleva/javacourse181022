package bg.clearcode.javacoude181022.example5;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 24.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner1 {
    private static List<Integer> DATA = IntStream.range(0, 9).boxed().collect(Collectors.toList());

    public static void main(final String[] args) {
        /*System.out.println("modifying collection at read-write mode: ");
        DATA.add(100);
        System.out.println("modifying collection at read-only mode: ");
        getDataReadOnly().add(200);*/

        /*final List rawList = DATA;
        rawList.add("asd");
        System.out.println("altering list successful");

        DATA = Collections.checkedList(DATA, Integer.class);

        final List rawList1 = DATA;
        rawList1.add("asd"); // ClassCastException
        System.out.println("altering list successful (non-reachable statement)");*/

        //final List<?> list = Collections.emptyList();

        //final Set<Integer> set = Collections.singleton(1);
        //set.add(1); <- UnsupportedOperationException

        //final List<Object> objects = Collections.nCopies(100, new Object());

        //final Comparator<Integer> reverseOrderComparator = Collections.reverseOrder();

        System.out.println();

    }

    public static List<Integer> getDataReadOnly() {
        return Collections.unmodifiableList(DATA);
    }
}
