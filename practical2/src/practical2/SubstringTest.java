package practical2;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubstringTest {

    @Test
    public void testSubstringMatch() {
        String mainString = "The quick brown fox jumps over the lazy dog";
        String subString1 = "quick";
        String subString2 = "slow";
        
        // Test for a match
        assertTrue(mainString.contains(subString1));
        assertEquals(4, mainString.indexOf(subString1));
        
        // Test for a mismatch
        assertFalse(mainString.contains(subString2));
        assertEquals(-1, mainString.indexOf(subString2));
    }
    
    @Test
    public void testEmptyString() {
        String mainString = "";
        String subString = "test";
        
        // Test for an empty main string
        assertFalse(mainString.contains(subString));
        assertEquals(-1, mainString.indexOf(subString));
        
        // Test for an empty substring
        assertTrue(mainString.contains(""));
        assertEquals(0, mainString.indexOf(""));
    }
    
    @Test
    public void testSubstringOverlap() {
        String mainString = "banana";
        String subString = "ana";
        
        // Test for overlapping substrings
        assertTrue(mainString.contains(subString));
        assertEquals(1, mainString.indexOf(subString));
        
        // Test for non-overlapping substrings
        assertFalse(mainString.contains("and"));
        assertEquals(-1, mainString.indexOf("and"));
    }
    
    @Test
    public void testUnicode() {
        String mainString = "こんにちは";
        String subString = "にち";
        
        // Test with Unicode characters
        assertTrue(mainString.contains(subString));
        assertEquals(1, mainString.indexOf(subString));
    }
}

