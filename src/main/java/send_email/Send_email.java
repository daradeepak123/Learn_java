package send_email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.*;


public class Send_email {
	public static Session session;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String to = "daradeepak123@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "daradeepak123@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "localhost";

	      try {
	      // Get system properties
	      Properties properties = System.getProperties();
	      
	      properties.setProperty("mail.smtp.host", host);
	      
	       session = Session.getDefaultInstance(properties);
		
	      MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));
	         

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");

	      }
	      catch(MessagingException mex)
	      {
	    	  mex.printStackTrace();
	      }
		

	}


}
