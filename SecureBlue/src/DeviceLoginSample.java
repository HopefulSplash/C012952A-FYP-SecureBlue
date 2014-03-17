
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
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
public class DeviceLoginSample extends javax.swing.JFrame {

    /**
     * Creates new form TestLogin
     */
    public DeviceLoginSample() {

        initComponents();
        scanDevies();
        //change location in final
        loginButton.requestFocus();
        jComboBox1.setFocusable(false);
        this.setLocationRelativeTo(null);
      System.out.println(this.getSize());
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
        passwordField = new javax.swing.JPasswordField();
        changeLoginLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        accountCreationRecoveryPanel = new javax.swing.JPanel();
        createAccountButton = new javax.swing.JButton();
        recoverAccountButton = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        logoImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SecureBlue | Device Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(346, 337));
        setMinimumSize(new java.awt.Dimension(346, 337));
        setName("accountLoginFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(346, 337));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        loginDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Details"));
        loginDetailsPanel.setName(""); // NOI18N

        usernameLabel.setText("Device:");

        passwordLabel.setText("Passcode: ");

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

        jComboBox1.setMaximumRowCount(20);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Scanning...", "Refresh Scan" }));
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setName(""); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginDetailsPanelLayout = new javax.swing.GroupLayout(loginDetailsPanel);
        loginDetailsPanel.setLayout(loginDetailsPanelLayout);
        loginDetailsPanelLayout.setHorizontalGroup(
            loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginDetailsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginDetailsPanelLayout.createSequentialGroup()
                        .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
            .addComponent(changeLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginDetailsPanelLayout.setVerticalGroup(
            loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginDetailsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(loginDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(loginButton)
                .addGap(10, 10, 10)
                .addComponent(changeLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(6, 6, 6)
                .addComponent(recoverAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 78, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accountCreationRecoveryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        MainWindowSample mWSameple = new MainWindowSample();
        mWSameple.setVisible(true);
        this.dispose();

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

    }//GEN-LAST:event_loginButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
        CreateAccountSample cASameple = new CreateAccountSample();
        cASameple.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        if (passwordFocusCount == 0) {
            passwordField.setText(null);
            passwordFocusCount = 1;
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void changeLoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLoginLabelMouseClicked
        // TODO add your handling code here:
        AccountLoginSample dLSameple = new AccountLoginSample();
        dLSameple.setVisible(true);
        this.dispose();

        System.out.println("CHANGE");

    }//GEN-LAST:event_changeLoginLabelMouseClicked

    private void recoverAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverAccountButtonActionPerformed
        // TODO add your handling code here:
        RecoverAccountSample rASameple = new RecoverAccountSample();
        rASameple.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_recoverAccountButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        JComboBox combo = (JComboBox) evt.getSource();
        if (combo.getSelectedItem().equals("Refresh Scan")) {
            jComboBox1.removeAllItems();
            jComboBox1.insertItemAt("Scanning...", 0);
            jComboBox1.insertItemAt("Refresh Scan", 1);
            scanDevies();
            jComboBox1.setSelectedIndex(0);
   
            

        } else {

        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

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
                new DeviceLoginSample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountCreationRecoveryPanel;
    private javax.swing.JLabel changeLoginLabel;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginDetailsPanel;
    private javax.swing.JLabel logoImage;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton recoverAccountButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
    int usernameFocusCount = 0;
    int passwordFocusCount = 0;

    BluetoothThread bluetooth = new BluetoothThread();
    Thread BluetoothThread1;

    private void scanDevies() {

        jComboBox1.setEnabled(false);

        bluetooth.setJ1(jComboBox1);

        BluetoothThread1 = new Thread(bluetooth);
        BluetoothThread1.start();

    }

}
