package bg.clearcode.javacoude181022.example3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class Runner {
    static Map<Integer, Map<Double, String>> map;

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        // raw
        /*final List list = new ArrayList<>();
        list.add("asd");
        list.add(1);
        System.out.println(list);

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        integerList = modifyList(integerList);
        //integerList.add("asd");
        integerList.stream()
                .map(value -> {
                    //assert value instanceof Integer;
                    return value + 1;
                }).collect(Collectors.toList());*/


        final Identifier<String> stringIdentifier = new Identifier<>("asd", String.class);
        final String stringValue = stringIdentifier.copyEntity();

        final Long longValue = stringIdentifier.copyObject(1l);
        final Double doubleValue = stringIdentifier.<Double>copyObject1(1d);

        final Identifier<Integer> integerIdentifier = new Identifier<>(1, Integer.class);
        Integer integerValue = integerIdentifier.copyEntity();

        //final ArrayList<Object> list = new ArrayList<String>();
        //Object o = "asd";
    }

    public static List<Integer> modifyList(final List<Integer> integerList) {
        final List integerListReference = new ArrayList(integerList);
        integerListReference.add(new Object());
        return integerListReference;
    }

    public void testWildcard(final List<?> list) {
        testGenericType(list);
    }

    private <T> void testGenericType(final List<T> list) {
        list.set(0, list.get(0));
    }
}
