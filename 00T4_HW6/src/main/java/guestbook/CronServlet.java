
package guestbook;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CronServlet extends HttpServlet {
			
			  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
				    Properties props = new Properties();
				    Session session = Session.getDefaultInstance(props, null);

				    try {
				      Message msg = new MimeMessage(session);
				      msg.setFrom(new InternetAddress("lcherry0521@gmail.com", "Example.com Admin"));
				      msg.addRecipient(Message.RecipientType.TO,
				                       new InternetAddress("chjl@utexas.edu", "Mr. User"));
				      msg.setSubject("Your Example.com account has been activated");
				      msg.setText("This is a test");
				      Transport.send(msg);
				    } catch (AddressException e) {
				      // ...
				    } catch (MessagingException e) {
				      // ...
				    } catch (UnsupportedEncodingException e) {
				      // ...
				    }		
//			Properties props = new Properties();
//			Session session = Session.getDefaultInstance(props, null);
//			try {
//				Message msg = new MimeMessage(session);
//				msg.setFrom(new InternetAddress("lcherry0521@gmail.com", "MyBlog"));
//				msg.addRecipient(Message.RecipientType.TO,
//				                       new InternetAddress("hf0114z@163.com", "Mr. User"));
//				msg.setSubject("Your hf0114z@163.com account has been activated");
//				msg.setText("This is a test");
//				Transport.send(msg);
//			} catch (AddressException e) {
//				      // ...
//			} catch (MessagingException e) {
//				      // ...
//			} catch (UnsupportedEncodingException e) {
//				      // ...
//			}
//				    // [END simple_example]
//			
//		catch (Exception ex) {
//			_logger.info("Cron Job has error");
//			//Log any exceptions in your Cron Job
//		}
}

}