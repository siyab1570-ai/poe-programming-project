/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package poepartone;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Student
 */
public class messagesNGTest {
    
    public messagesNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of sendingMessage method, of class messages.
     */
    @Test
    public void testSendingMessage() {
        System.out.println("sendingMessage");
        messages instance = new messages();
        instance.sendingMessage();
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of returnTotalMessages method, of class messages.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        messages instance = new messages();
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of generateMessageID method, of class messages.
     */
    @Test
    public void testGenerateMessageID() {
        System.out.println("generateMessageID");
        messages instance = new messages();
        String expResult = "";
        String result = instance.generateMessageID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of checkRecipientCell method, of class messages.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String cellphone = "";
        messages instance = new messages();
        String expResult = "";
        String result = instance.checkRecipientCell(cellphone);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of createMessageHash method, of class messages.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageID = "";
        int messageNumber = 0;
        String messageText = "";
        messages instance = new messages();
        String expResult = "";
        String result = instance.createMessageHash(messageID, messageNumber, messageText);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of SentMessage method, of class messages.
     */
    @Test
    public void testSentMessage() {
        System.out.println("SentMessage");
        messages instance = new messages();
        String expResult = "";
        String result = instance.SentMessage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printMessages method, of class messages.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        messages instance = new messages();
        String expResult = "";
        String result = instance.printMessages();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
