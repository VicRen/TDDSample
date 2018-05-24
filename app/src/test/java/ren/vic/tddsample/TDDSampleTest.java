package ren.vic.tddsample;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class TDDSampleTest {

    @Test
    public void testInit() {
        TDDSample testObject = new TDDSample();
        assertNotNull(testObject);
    }

    @Test
    public void testIsPalindrome() {
        TDDSample testObject = new TDDSample();
        assertTrue(testObject.isPalindrome("MOM"));
        assertTrue(testObject.isPalindrome("Abccba"));
        assertFalse(testObject.isPalindrome("False"));
    }
}
