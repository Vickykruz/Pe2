package com.stackroute.pe2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.stackroute.pe2.Palindrome;

public class PalindromeTest {
    private static Palindrome pal;

    @BeforeClass
    public static void setup() {
        pal = new Palindrome();

    }

    @AfterClass
    public static void teardown() {
        pal = null;

    }

    @Test
    public void testCheckPalindrome() {
        int num = 24542;
        assertEquals(24542, pal.palinTest(num));
    }
    @Test
	public void testCheckPalindromeFailure() {
    	int num = 24542;
		assertNotNull("ant",pal.palinTest(num));
				
		assertNotEquals(
				1,pal.palinTest(num));
				
	}

}