package bg.clearcode.javacoude181022.example4;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    static <T extends Collection<?>> void printCollection(T collection) {
        assert collection != null;
        System.out.println();
        System.out.println("-- start print collection--");
        collection.forEach(System.out::println);
        System.out.println("-- end print collection--");
        System.out.println("-- collection size: " + collection.size() + "--");
    }

    ;

    public static void main(String[] args) {
        final Collection<Integer> collection = new HashSet<>(); // 2
        collection.add(1);
        collection.add(2);

        /*final Iterator<Integer> collectionIterator = collection.iterator();
        while (collectionIterator.hasNext()) {
            // collectionIterator.next();
            final Integer element = collectionIterator.next();
            System.out.println(element);
            if (element % 2 != 0) {
                collectionIterator.remove();
            }
        }
        printCollection(collection);*/

        // ConcurrentModificationException
        /*for(Integer element: collection) {
            System.out.println(element);
            if (element % 2 != 0) {
                collection.remove(element);
            }
        }*/

        /*final Object[] arrayObjects = collection.toArray();
        Arrays.stream(arrayObjects).forEach(object -> System.out.println(((Integer) object) + 1));

        final Integer[] integerArray = collection.toArray(new Integer[0]);
        Arrays.stream(integerArray).forEach(integer -> System.out.println(integer + 1));*/

        /*final Collection<Integer> collection1 = new HashSet<>(collection); // 3
        collection1.add(3);*/

        /*System.out.println(collection.containsAll(collection1));
        System.out.println(collection1.containsAll(collection));*/

       /* final Collection<Integer> collection2 = new HashSet<>(); // 2
        collection2.addAll(collection);

        collection1.retainAll(collection);
        printCollection(collection1);

        collection1.clear();
        printCollection(collection1);*/

       /*final List<Integer> list = new ArrayList<>(collection);
       final ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            final Integer element = listIterator.next();
            System.out.println(element);
            if (element % 2 != 0) {
                listIterator.set(element * 10);
            }
        }
        printCollection(list);*/

        /*final Set<Element> set = new HashSet<>();
        set.add(new Element());
        set.add(new Element());
        printCollection(set);*/

        final Map<Integer, String> map = new HashMap<>();
        IntStream.range(0, 10).forEach(i -> map.put(i, "value" + String.valueOf(i)));

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        //map.keySet()
        //final Collection<String> values = map.values();


        map.getOrDefault(1, "no such value");
    }
}

class Element {
    @Override
    public String toString() {
        return getClassName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Element element = (Element) o;
        return getClassName().equals(element.getClassName());
    }

    @Override
    public int hashCode() {
        return getClassName().hashCode();
    }

    private String getClassName() {
        return getClass().getCanonicalName();
    }
}
