package bg.clearcode.javacoude181022.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva, ClearCode Ltd. on 23.10.2018,
 * a significant bit of leva.bg project.
 */
public class WildcardClass<T extends SuperClass> {
    public List<T> listOfSerializables = new ArrayList<>();

    public void test() {
        //listOfSerializables.add((T) new SuperClass());
        listOfSerializables.add((T) new ExtendingSuperClass());
    }

    public static void main(String[] args) {
        final WildcardClass<ExtendingSuperClass> wildcardClass = new WildcardClass<>();
        //wildcardClass.listOfSerializables.add(new SuperClass());
        wildcardClass.listOfSerializables.add(new ExtendingSuperClass());
    }


}
