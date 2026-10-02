/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {

    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited public code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }

    @Test
    public void testOthersCourseWorkNotAllowed() {
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
    }

    @Test
    public void testPublicCodeWithoutCitationNotAllowed() {
        assertFalse(RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
    }
}