package com.stackroute.pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Pe2Test {
   private static Pe2 pal;

   @BeforeClass
   public static void setup() {
       pal = new Pe2();

   }

   @AfterClass
   public static void teardown() {
       pal = null;

   }

   //@SuppressWarnings("deprecation")
   @Test
   public void testCheckPalindrome() {
       int num = 24542;
       assertEquals(true, pal.reverse(num));
       assertNotNull("failure",pal.reverse(num));
        assertNotEquals(1,pal.reverse(num));
   }    
   
 //@SuppressWarnings("deprecation")
   @Test
   public void testCheckPower() {
       int num = 64;
       assertEquals(true, pal.power(num));
       assertNotNull("failure",pal.power(num));
        assertNotEquals(1,pal.power(num));
                
    }
   
   @Test
    public void test11()
    {
        assertEquals("The factorial of 12 is 479001600", pal.intfact(12));
    }
    @Test
    public void test12()
    {
        assertEquals("The factorial of 2 is 2", pal.intfact(2));
    }
    @Test
    public void test13()
    {
        assertEquals("The factorial of 20 is 2432902008176640000", pal.longFactorial(20));
    }
    @Test
    public void test14()
    {
        assertNotEquals("10",pal.longFactorial(10));
    }

   
   @Test
   public void testCheckEven() {
       int num = 16;
       assertEquals(true, pal.even(num));
       assertNotNull("failure",pal.even(num));
       assertNotEquals(1,pal.even(num));
    }
   
 
   
   
   int[] n= {86,65,98,77};
    @Test
    public void test1()
    {
        assertEquals("The average is 81.50", pal.average(n));
    }
    @Test
    public void test2()
    {
        assertEquals("The minimum is 65", pal.min(n));
    }
    @Test
    public void test3()
    {
        assertEquals("The maximum is 98", pal.max(n));
    }
    @Test
    public void test4()
    {
        assertNotEquals("The minimum is 86",pal.min(n));
    }

    
    

   
        
}