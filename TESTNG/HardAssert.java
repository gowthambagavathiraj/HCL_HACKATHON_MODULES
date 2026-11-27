package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	 @Test
	    public void testAssertions() {

	        // 1. assertEquals
	        Assert.assertEquals(100, 100);
	        System.out.println("1. assertEquals passed");

	        // 2. assertNotEquals
	        Assert.assertNotEquals(100, 200);
	        System.out.println("2. assertNotEquals passed");

	        // 3. assertTrue
	        Assert.assertTrue(10 > 5);
	        System.out.println("3. assertTrue passed");

	        // 4. assertFalse
	        Assert.assertFalse(10 < 5);
	        System.out.println("4. assertFalse passed");

	        // 5. assertNull
	        String name = null;
	        Assert.assertNull(name);
	        System.out.println("5. assertNull passed");

	        // 6. assertNotNull
	        String city = "Chennai";
	        Assert.assertNotNull(city);
	        System.out.println("6. assertNotNull passed");

	        // 7. assertFail
	        Assert.fail("This is a deliberate failure");

	        System.out.println("This line will not execute");
	    }
}
