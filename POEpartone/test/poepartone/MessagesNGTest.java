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
public class MessagesNGTest {
    
    public MessagesNGTest() {
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
     * Test of main method, of class Messages.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Messages.main(args);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of sendingMessages method, of class Messages.
     */
    @Test
    public void testSendingMessages() {
        System.out.println("sendingMessages");
        Messages instance = new Messages();
        instance.sendingMessages();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of returnTotalMessages method, of class Messages.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        Messages instance = new Messages();
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of createMessageHash method, of class Messages.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageID = "";
        int messageNumber = 0;
        String messageText = "";
        Messages instance = new Messages();
        String expResult = "";
        String result = instance.createMessageHash(messageID, messageNumber, messageText);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
           }

    /**
     * Test of generateMessageID method, of class Messages.
     */
    @Test
    public void testGenerateMessageID() {
        System.out.println("generateMessageID");
        Messages instance = new Messages();
        String expResult = "";
        String result = instance.generateMessageID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Messages.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String cellphone = "";
        Messages instance = new Messages();
        String expResult = "";
        String result = instance.checkRecipientCell(cellphone);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of SentMessage method, of class Messages.
     */
    @Test
    public void testSentMessage() {
        System.out.println("SentMessage");
        Messages instance = new Messages();
        String expResult = "";
        String result = instance.SentMessage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of printMessages method, of class Messages.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Messages instance = new Messages();
        String expResult = "";
        String result = instance.printMessages();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of messageManagementMenu method, of class Messages.
     */
    @Test
    public void testMessageManagementMenu() {
        System.out.println("messageManagementMenu");
        Messages instance = new Messages();
        instance.messageManagementMenu();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of findLongestMessage method, of class Messages.
     */
    @Test
    public void testFindLongestMessage() {
        System.out.println("findLongestMessage");
        Messages instance = new Messages();
        instance.findLongestMessage();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of searchMessageByHashId method, of class Messages.
     */
    @Test
    public void testSearchMessageByHashId() {
        System.out.println("searchMessageByHashId");
        Messages instance = new Messages();
        instance.searchMessageByHashId();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of displayFullReport method, of class Messages.
     */
    @Test
    public void testDisplayFullReport() {
        System.out.println("displayFullReport");
        Messages instance = new Messages();
        instance.displayFullReport();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of deleteMessageByHash method, of class Messages.
     */
    @Test
    public void testDeleteMessageByHash() {
        System.out.println("deleteMessageByHash");
        Messages instance = new Messages();
        instance.deleteMessageByHash();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of showAllStoredMessages method, of class Messages.
     */
    @Test
    public void testShowAllStoredMessages() {
        System.out.println("showAllStoredMessages");
        Messages instance = new Messages();
        instance.showAllStoredMessages();
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of showDisregardedMessages method, of class Messages.
     */
    @Test
    public void testShowDisregardedMessages() {
        System.out.println("showDisregardedMessages");
        Messages instance = new Messages();
        instance.showDisregardedMessages();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sendingMessage method, of class Messages.
     */
    @Test
    public void testSendingMessage() {
        System.out.println("sendingMessage");
        Messages instance = new Messages();
        instance.sendingMessage();
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
