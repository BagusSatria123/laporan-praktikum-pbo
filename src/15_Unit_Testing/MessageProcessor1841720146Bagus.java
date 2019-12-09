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
public class MessageProcessor1841720146Bagus {
    private String sender, recipient, message; 

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String messageFormat(){
        String message = String.format("Hai %s, you have message from %s.\nThe message as follow : %s",this.recipient, this.sender, this.message);
        return message;
        }
    public void showMessage(){
        System.out.println(messageFormat());
    }
}
