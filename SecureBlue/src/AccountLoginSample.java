 
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TheThoetha
 */
public class AccountLoginSample extends javax.swing.JFrame {

    /**
     * Creates new form TestLogin
     */
    public AccountLoginSample() {

        initComponents();

        //change location in final
        loginButton.requestFocus();
        this.setLocationRelativeTo(null);
                    
   ImageIcon ICON = new ImageIcon(AccountLoginSample.class.getResource("/ICON.png"));
   
   this.setIconImage(ICON.getImage());

    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginDetailsPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        changeLoginLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        accountCreationRecoveryPanel = new javax.swing.JPanel();
        createAccountButton = new javax.swing.JButton();
        recoverAccountButton = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        logoImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecureBlue | Account Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("accountLoginFrame"); // NOI18N
        setResizable(false);

        loginDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Details"));
        loginDetailsPanel.setName(""); // NOI18N

        usernameLabel.setText("Username: ");

        passwordLabel.setText("Password: ");

        usernameField.setText("Enter Username"); // NOI18N
        usernameField.setToolTipText("");
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
        });

        passwordField.setText("Enter Password");
        passwordField.setToolTipText("");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });

        changeLoginLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        changeLoginLabel.setForeground(new java.awt.Color(43, 85, 166));
        changeLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeLoginLabel.setText("<HTML><U>Click Here To Login Using A Bluetooth Device <U><HTML>");
        changeLoginLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        changeLoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeLoginLabelMouseClicked(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginDetailsPanelLayout = new javax.swing.GroupLayout(loginDetailsPanel);
        loginDetailsPanel.setLayout(loginDetailsPanelLayout);
        loginDetailsPanelLayout.setHorizontalGroup(
            loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changeLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginDetailsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginDetailsPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginDetailsPanelLayout.createSequentialGroup()
                        .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        loginDetailsPanelLayout.setVerticalGroup(
            loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDetailsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(loginButton)
                .addGap(10, 10, 10)
                .addComponent(changeLoginLabel)
                .addGap(10, 10, 10))
        );

        accountCreationRecoveryPanel.setBackground(new java.awt.Color(255, 255, 255));
        accountCreationRecoveryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Account Creation / Recovery"));

        createAccountButton.setText("Create Account");
        createAccountButton.setFocusPainted(false);
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        recoverAccountButton.setText("Recover Account");
        recoverAccountButton.setFocusPainted(false);
        recoverAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountCreationRecoveryPanelLayout = new javax.swing.GroupLayout(accountCreationRecoveryPanel);
        accountCreationRecoveryPanel.setLayout(accountCreationRecoveryPanelLayout);
        accountCreationRecoveryPanelLayout.setHorizontalGroup(
            accountCreationRecoveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountCreationRecoveryPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recoverAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        accountCreationRecoveryPanelLayout.setVerticalGroup(
            accountCreationRecoveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountCreationRecoveryPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(accountCreationRecoveryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccountButton)
                    .addComponent(recoverAccountButton))
                .addGap(6, 6, 6))
        );

        logoPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N
        logoImage.setName("logoImage"); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logoImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logoImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(accountCreationRecoveryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginDetailsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(loginDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(accountCreationRecoveryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        getContentPane().setBackground(Color.WHITE);
        loginButton.requestFocus();

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
        passwordField.setFocusable(false);
        passwordField.setFocusable(true);
        loginButton.doClick();

    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:       
        System.out.println("LOGIN");

        //check if it is in the database
        
        
        if (usernameField.getText().contentEquals("Enter Username")){
           
            this.dispose();
        }
        else {
            //no password entered
          //  if (){
                
            //}
            //no username entered
           // else if (){
           //     
           // }
           // //wrong username / password entered
           // else if (){
                
           // }
            //
           // else{
                
           // }           
           // usernameField.requestFocus();
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
        passwordField.requestFocusInWindow();
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
        CreateAccountSample cA = new CreateAccountSample();
        cA.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        // TODO add your handling code here:

        if (usernameFocusCount == 0) {
            usernameField.setText(null);
            usernameFocusCount = 1;
        }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        if (passwordFocusCount == 0) {
            passwordField.setText(null);
            passwordFocusCount = 1;
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void changeLoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLoginLabelMouseClicked
        // TODO add your handling code here:
        
        this.dispose();
        
        System.out.println("CHANGE");

    }//GEN-LAST:event_changeLoginLabelMouseClicked

    private void recoverAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverAccountButtonActionPerformed
        // TODO add your handling code here:
       
        this.dispose();

    }//GEN-LAST:event_recoverAccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AccountLoginSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountLoginSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountLoginSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountLoginSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountLoginSample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountCreationRecoveryPanel;
    private javax.swing.JLabel changeLoginLabel;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginDetailsPanel;
    private javax.swing.JLabel logoImage;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton recoverAccountButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
    int usernameFocusCount = 0;
    int passwordFocusCount = 0;

}
