/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SattvaQ1
 */
public class TestSMS {
    public static void main(String[] args) {
        // hard coding 
        String phn="9490045530";
        
        String msg="We r 4m SattvaQ";
        
     msg.SendMail   sm = new msg.SendMail();
    /// sm.sendsms(msg,phn);
        System.out.println("MS sent");
     String tomail="shamini.hasini514@gmail.com";
     
     String subject="test message from java class";
     String userid="sattvaq@gmail.com";
     String msgemail="Click on the followlin glink to actioave";
     String link="<a href='http://localhost:8080/vita/activateAccount.jsp?email="+userid+"'>Activate YOu Account</a>";
              msgemail=msgemail+ "   <br>"+link;
     sm.sendMail(tomail,subject,msgemail);
     
        System.out.println("ya msg sent");
    }
    
}
