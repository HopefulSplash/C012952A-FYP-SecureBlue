
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TheThoetha
 */
public class EmailThread implements Runnable {

    static Thread emailThread;
    boolean messageSent = false;

    public static Thread getEmailThread() {
        return emailThread;
    }

    public static void setEmailThread(Thread emailThread) {
        EmailThread.emailThread = emailThread;
    }

    public JDialog getContactWindow() {
        return contactWindow;
    }

    public void setContactWindow(JDialog contactWindow) {
        this.contactWindow = contactWindow;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageE() {
        return messageE;
    }

    public void setMessageE(String messageE) {
        this.messageE = messageE;
    }
    private static JDialog contactWindow;
    String username;
    String email;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    String subject;
    String messageE;
    String topic;
    JButton b1;

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    public boolean isMessageSent() {
        return messageSent;
    }

    @Override
    public void run() {

        final String username1 = "securebluecontactus@gmail.com";
        final String password = "Password123$";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username1, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("securebluecontactus@gmail.com", topic));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("SecureBlueEncryptionSoftware@gmail.com"));
            message.setSubject("SecureBlue Sutie | " + username);
            message.setText("\nUsername: " + username
                    + "\nEmail Address: " + email
                    + "\nSubject: " + subject
                    + "\nMessage: " + messageE
            );

            Transport.send(message);
            messageSent = true;

            
        } catch (AddressException ex) {
            Logger.getLogger(EmailThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException | UnsupportedEncodingException ex) {
            Logger.getLogger(EmailThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        sentMessagePopup(contactWindow);
    }

    private void sentMessagePopup(JDialog j1) {   
        
        
        if (messageSent) {
            
             b1.setText("Send");
             b1.setEnabled(true);
             
            ImageIcon icon = new ImageIcon(getClass().getResource("graphic_About/graphic_Contact/email_go.png"));

            JOptionPane.showMessageDialog(j1,
                    "Your message has been sent",
                    "SecureBlue | Message Sent",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon);

        } else {
            
            b1.setText("Send");
            b1.setEnabled(true);
            
            ImageIcon icon = new ImageIcon(getClass().getResource("graphic_About/graphic_Contact/email_error.png"));

            JOptionPane.showMessageDialog(j1,
                    "Your message has not been sent"
                            + "Please See User Guide For Assistance",
                    "SecureBlue | Message Error",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon);

        }

    }

}
