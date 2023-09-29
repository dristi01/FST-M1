package Actvity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGAnnotationsExample {

    @BeforeTest
    public void setupBeforeTest() {
        System.out.println("BeforeTest: Setting up before the test suite");
        // Perform setup actions here
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1");
        // Test logic for method 1
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
        // Test logic for method 2
    }

    @AfterTest
    public void cleanupAfterTest() {
        System.out.println("AfterTest: Cleaning up after the test suite");
        // Perform cleanup actions here
    }
}

