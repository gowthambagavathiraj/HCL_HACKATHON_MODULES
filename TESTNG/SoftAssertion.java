package Testing;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
    public void testSoftAssertions() {

        SoftAssert soft = new SoftAssert();

        // 1. assertEquals
        soft.assertEquals(100, 100);
        System.out.println("1. assertEquals executed");

        // 2. assertNotEquals
        soft.assertNotEquals(100, 200);
        System.out.println("2. assertNotEquals executed");

        // 3. assertTrue
        soft.assertTrue(10 > 5);
        System.out.println("3. assertTrue executed");

        // 4. assertFalse
        soft.assertFalse(10 < 5);
        System.out.println("4. assertFalse executed");

        // 5. assertNull
        String name = null;
        soft.assertNull(name);
        System.out.println("5. assertNull executed");

        // 6. assertNotNull
        String city = "Chennai";
        soft.assertNotNull(city);
        System.out.println("6. assertNotNull executed");

        // 7. fail
        soft.fail("Intentional failure");
        System.out.println("7. fail executed");

        // 8. assertAll
        soft.assertAll();

        System.out.println("All validations completed");
    }
}
