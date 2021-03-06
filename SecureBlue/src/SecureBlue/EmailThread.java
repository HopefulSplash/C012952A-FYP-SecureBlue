package SecureBlue;


import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
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
    private boolean probelmSending = false;

    /**
     *
     * @param messageSent
     */
    public void setMessageSent(boolean messageSent) {
        this.messageSent = messageSent;
    }

    /**
     *
     * @param attachment
     */
    public void setAttachment(boolean attachment) {
        this.attachment = attachment;
    }

    /**
     *
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    boolean messageSent = false;
    boolean attachment = false;
    String filePath;

    /**
     *
     * @return
     */
    public static Thread getEmailThread() {
        return emailThread;
    }

    /**
     *
     * @param emailThread
     */
    public static void setEmailThread(Thread emailThread) {
        EmailThread.emailThread = emailThread;
    }

    /**
     *
     * @return
     */
    public JDialog getContactWindow() {
        return contactWindow;
    }

    /**
     *
     * @param contactWindow
     */
    public void setContactWindow(JDialog contactWindow) {
        this.contactWindow = contactWindow;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getSubject() {
        return subject;
    }

    /**
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     *
     * @return
     */
    public String getMessageE() {
        return messageE;
    }

    /**
     *
     * @param messageE
     */
    public void setMessageE(String messageE) {
        this.messageE = messageE;
    }
    private static JDialog contactWindow;
    String username;
    String email;

    /**
     *
     * @return
     */
    public String getTopic() {
        return topic;
    }

    /**
     *
     * @param topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
    String subject;
    String messageE;

    /**
     *
     * @param b2
     */
    public void setB2(JButton b2) {
        this.b2 = b2;
    }
    String topic;
    JButton b1;
    JButton b2;

    /**
     *
     * @return
     */
    public JButton getB1() {
        return b1;
    }

    /**
     *
     * @param b1
     */
    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    /**
     *
     * @return
     */
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
            Multipart multipart = new MimeMultipart();

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("securebluecontactus@gmail.com", topic));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("SecureBlueEncryptionSoftware@gmail.com"));
            message.setSubject("SecureBlue Sutie | " + username);

            MimeBodyPart messageBodyPart1 = new MimeBodyPart();
            messageBodyPart1.setText("\nUsername: " + username
                    + "\nEmail Address: " + email
                    + "\nSubject: " + subject
                    + "\n" + messageE);

            multipart.addBodyPart(messageBodyPart1);

            if (attachment) {
                MimeBodyPart messageBodyPart = new MimeBodyPart();

                messageBodyPart = new MimeBodyPart();
                String file = filePath;
                String fileName = "User Attachment";
                DataSource source = new FileDataSource(file);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(fileName);
                multipart.addBodyPart(messageBodyPart);

            }
            message.setContent(multipart);

            Transport.send(message);
            messageSent = true;

        } catch (MessagingException | UnsupportedEncodingException ex) {
            Logger.getLogger(EmailThread.class.getName()).log(Level.SEVERE, null, ex);
            probelmSending = true;
            sentMessagePopup(contactWindow);
        }
        sentMessagePopup(contactWindow);
    }

    private void sentMessagePopup(JDialog j1) {

        if (messageSent && !probelmSending) {

            b1.setText("Send");
            b1.setEnabled(true);
            b2.setEnabled(true);

            ImageIcon icon = new ImageIcon(getClass().getResource("graphic_EmailThread/email_go.png"));

            JOptionPane.showMessageDialog(j1,
                    "Your message has been sent",
                    "SecureBlue | Message Sent",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon);

        } else if (!messageSent && !probelmSending) {

            b1.setText("Send");
            b1.setEnabled(true);
            b2.setEnabled(true);

            ImageIcon icon = new ImageIcon(getClass().getResource("graphic_EmailThread/email_error.png"));

            JOptionPane.showMessageDialog(j1,
                    "Your message has not been sent"
                    + "Please See User Guide For Assistance",
                    "SecureBlue | Message Error",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon);

        } else if (probelmSending) {
            b1.setText("Send");
            b1.setEnabled(true);
            b2.setEnabled(true);

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
