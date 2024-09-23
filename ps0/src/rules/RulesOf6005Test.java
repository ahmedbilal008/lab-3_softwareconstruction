package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }

    @Test
    public void testNotYourCodeImplementationRequired() {
        assertFalse("Expected false: you must implement your own solution if required",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, false, true));
    }
    
    @Test
    public void testCitedCoursework() {
        assertTrue("Expected true: cited coursework code should be allowed",
                RulesOf6005.mayUseCodeInAssignment(false, false, true, true, false));
    }
}
