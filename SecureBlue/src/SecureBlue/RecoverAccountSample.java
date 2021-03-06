package SecureBlue;



import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheThoetha
 */
public class RecoverAccountSample extends javax.swing.JFrame {

    /**
     * Creates new form RecoverAccountSample
     */
    public RecoverAccountSample() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        recoverUsernamePanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        emailAddressLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailAddressField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        recoverPasswordPanel = new javax.swing.JPanel();
        quesionComboBox1 = new javax.swing.JComboBox();
        asnwerFiled1 = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        questionLabel2 = new javax.swing.JLabel();
        quesionLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        answerField2 = new javax.swing.JTextField();
        quesionComboBox2 = new javax.swing.JComboBox();
        recoverPasswordButton = new javax.swing.JButton();
        answerLabel1 = new javax.swing.JLabel();
        answerLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SecureBlue | Account Recovery");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("accountRecoveryFrame"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        recoverUsernamePanel.setBackground(new java.awt.Color(255, 255, 255));
        recoverUsernamePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Recover Username"));

        jButton1.setText("Recover Username");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        emailAddressLabel.setText("Email Address");

        passwordLabel.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recoverUsernamePanelLayout = new javax.swing.GroupLayout(recoverUsernamePanel);
        recoverUsernamePanel.setLayout(recoverUsernamePanelLayout);
        recoverUsernamePanelLayout.setHorizontalGroup(
            recoverUsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recoverUsernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recoverUsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailAddressField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addContainerGap())
        );
        recoverUsernamePanelLayout.setVerticalGroup(
            recoverUsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recoverUsernamePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(emailAddressLabel)
                .addGap(10, 10, 10)
                .addComponent(emailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(passwordLabel)
                .addGap(10, 10, 10)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        recoverPasswordPanel.setBackground(new java.awt.Color(255, 255, 255));
        recoverPasswordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Recover Password"));

        quesionComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select A Question", "What is the name of a college you applied to but didn't attend?", "What was your childhood nickname? ", "In what city did you meet your spouse/significant other?", "What is the name of your favorite childhood friend? ", "What street did you live on in third grade?", "What is your oldest sibling’s birthday month and year?", "What is the middle name of your oldest child?", "What is your oldest sibling's middle name?", "What school did you attend for sixth grade?", "What the name of your first pet?" }));

        questionLabel2.setText("Account Recovery Question 2");

        quesionLabel1.setText("Account Recovery Question 1");

        usernameLabel.setText("Username");

        quesionComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select A Question", "What was the name of your first stuffed animal?", "In what city or town did your mother and father meet? ", "Where were you when you had your first kiss? ", "What is the first name of the boy or girl that you first kissed?", "What was the last name of your third grade teacher?", "In what city does your nearest sibling live? ", "What is your oldest brother’s birthday month and year? ", "What is your maternal grandmother's maiden name?", "In what city or town was your first job?", "What is the name of the place your wedding reception was held?" }));
        quesionComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quesionComboBox2ActionPerformed(evt);
            }
        });

        recoverPasswordButton.setText("Recover Password");
        recoverPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverPasswordButtonActionPerformed(evt);
            }
        });

        answerLabel1.setText("Answer");

        answerLabel2.setText("Answer");

        javax.swing.GroupLayout recoverPasswordPanelLayout = new javax.swing.GroupLayout(recoverPasswordPanel);
        recoverPasswordPanel.setLayout(recoverPasswordPanelLayout);
        recoverPasswordPanelLayout.setHorizontalGroup(
            recoverPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recoverPasswordPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(recoverPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField)
                    .addComponent(quesionComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answerField2)
                    .addComponent(recoverPasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asnwerFiled1)
                    .addComponent(quesionComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answerLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(questionLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answerLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quesionLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        recoverPasswordPanelLayout.setVerticalGroup(
            recoverPasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recoverPasswordPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(usernameLabel)
                .addGap(10, 10, 10)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(quesionLabel1)
                .addGap(10, 10, 10)
                .addComponent(quesionComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(answerLabel1)
                .addGap(10, 10, 10)
                .addComponent(asnwerFiled1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(questionLabel2)
                .addGap(10, 10, 10)
                .addComponent(quesionComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(answerLabel2)
                .addGap(10, 10, 10)
                .addComponent(answerField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(recoverPasswordButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(recoverUsernamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recoverPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(recoverUsernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(recoverPasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getContentPane().setBackground(Color.WHITE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        // hadle the errors /// pop out message etc 
        
        
   final String username = "SecureBlueEncryptionSoftware@gmail.com";
		final String password = "Password123$";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("SecureBlueEncryptionSoftware@gmail.com", "SecureBlue Support"));
                       	message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse("Harry.Clewlow.1993@live.com"));
			message.setSubject("SecureBlue Account | Username Recovery");
			message.setText("Dear PAUL Crawler,"
				+ "\n\n No spam to my email, please!"
                                + "DO NOT REPLY TO THIS EMAIL"
                                + "");
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException ex) {
            Logger.getLogger(RecoverAccountSample.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void recoverPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverPasswordButtonActionPerformed
        // TODO add your handling code here:
         final String username = "SecureBlueEncryptionSoftware@gmail.com";
		final String password = "Password123$";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("SecureBlueEncryptionSoftware@gmail.com", "SecureBlue Support"));
                       	message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse("Harry.Clewlow.1993@live.com"));
			message.setSubject("SecureBlue Account | Username Recovery");
			message.setText("Dear PAUL Crawler,"
				+ "\n\n No spam to my email, please!"
                                + "DO NOT REPLY TO THIS EMAIL"
                                + "");
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException ex) {
            Logger.getLogger(RecoverAccountSample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_recoverPasswordButtonActionPerformed

    private void quesionComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quesionComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quesionComboBox2ActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
                new AccountLoginSample().setVisible(true);

    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecoverAccountSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverAccountSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverAccountSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverAccountSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverAccountSample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField2;
    private javax.swing.JLabel answerLabel1;
    private javax.swing.JLabel answerLabel2;
    private javax.swing.JTextField asnwerFiled1;
    private javax.swing.JTextField emailAddressField;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox quesionComboBox1;
    private javax.swing.JComboBox quesionComboBox2;
    private javax.swing.JLabel quesionLabel1;
    private javax.swing.JLabel questionLabel2;
    private javax.swing.JButton recoverPasswordButton;
    private javax.swing.JPanel recoverPasswordPanel;
    private javax.swing.JPanel recoverUsernamePanel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
