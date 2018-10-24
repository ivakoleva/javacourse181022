package bg.clearcode.javacoude181022.homeworks.thuesday.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilityHelperTest {

    @Test
    public void givenEntitiesWithEqualsAgesWhenComparingYThenReturnZero() {

        // GIVEN
        StateEntity person = new Person("John", "23453246", 21);
        StateEntity company = new Company("Some_Company", "124235", 21);

        // WHEN
        UtilityHelper helper = new UtilityHelper();
        int actual = helper.compare(person, company);

        // THEN
        assertEquals(actual, 0);
    }

    @Test
    public void givenEntitiesWithDifferentAgesWhenComparingThenReturnNegativeNumber() {

        // GIVEN
        StateEntity person = new Person("John", "23453246", 21);
        StateEntity company = new Company("Some_Company", "124235", 40);

        // WHEN
        UtilityHelper helper = new UtilityHelper();
        int actual = helper.compare(person, company);

        // THEN
        assertEquals(actual, -1);
    }

    @Test
    public void givenEntitiesWithDifferentAgesWhenComparingThenReturnPositiveNumber() {

        // GIVEN
        StateEntity person = new Person("John", "23453246", 40);
        StateEntity company = new Company("Some_Company", "124235", 21);

        // WHEN
        UtilityHelper helper = new UtilityHelper();
        int actual = helper.compare(person, company);

        // THEN
        assertEquals(actual, 1);
    }

}