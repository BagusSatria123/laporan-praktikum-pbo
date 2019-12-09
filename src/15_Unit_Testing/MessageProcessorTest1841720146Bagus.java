/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author ROG SERIES
 */
import org.junit.Assert;
import org.junit.Test;
public class MessageProcessorTest1841720146Bagus {
    MessageProcessor1841720146Bagus Processor;
    public MessageProcessorTest1841720146Bagus(){
        Processor.setSender("Ronaldo");
        Processor.setRecipient("Rafael");
        Processor.setMessage("Whats up bro?");
    }
    @Test
    public void testShowMessage(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo."+"\nThe message as follow : Whats up bro?";
        Assert.assertEquals(expectedResult, Processor.messageFormat());
    }
}
