/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jasnoor
 */
public class PasswordValidatorTest 
{
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class PasswordValidator.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordValidator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLength Good test");
        String pass = "jasnoor";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLength Bad test case");
        String pass = "jas";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLength Boundary");
        String pass = " ";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    /**
     * Test of checkUpper method, of class PasswordValidator.
     */
    @Test
    public void testCheckUpperGood() {
        System.out.println("checkUpper Good");
        String pass = "abcgeFds";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    public void testCheckUpperBad() {
        System.out.println("checkUpper Bad");
        String pass = " ";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    public void testCheckUpperBoundary() {
        System.out.println("checkUpper Boundary");
        String pass = " ";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of checkSpecial method, of class PasswordValidator.
     */
    @Test
    public void testCheckSpecialGood() {
        System.out.println("checkSpecial Good");
        String pass = "abcde#dc";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckSpecialBad() {
        System.out.println("checkSpecial Bad");
        String pass = "abchdegu";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckSpecialBoundary() {
        System.out.println("checkSpecial Boundary");
        String pass = " ";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
   
}
