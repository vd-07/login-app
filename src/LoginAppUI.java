import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vd
 */
public class LoginAppUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginAppUI
     */
    public LoginAppUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpFrame = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        loginFrame = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        dashboard = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        signUpFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        signUpFrame.setMinimumSize(new java.awt.Dimension(500, 400));

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Name");

        jButton3.setText("Sign Up!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signUpFrameLayout = new javax.swing.GroupLayout(signUpFrame.getContentPane());
        signUpFrame.getContentPane().setLayout(signUpFrameLayout);
        signUpFrameLayout.setHorizontalGroup(
            signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        signUpFrameLayout.setVerticalGroup(
            signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(signUpFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(40, 40, 40))
        );

        loginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setMinimumSize(new java.awt.Dimension(500, 400));

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginFrameLayout = new javax.swing.GroupLayout(loginFrame.getContentPane());
        loginFrame.getContentPane().setLayout(loginFrameLayout);
        loginFrameLayout.setHorizontalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFrameLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(jPasswordField2)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        loginFrameLayout.setVerticalGroup(
            loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFrameLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(loginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton4)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        dashboard.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        dashboard.setMinimumSize(new java.awt.Dimension(500, 400));

        jLabel7.setText("Hello");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard.getContentPane());
        dashboard.getContentPane().setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel7)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel7)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to the Simple Login App");

        jButton1.setText("Sign Up!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // this means current object which is the landing page
        this.dispose();
        
        signUpFrame.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        loginFrame.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        // Extract values from the fields
        
        String username = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        String name = jTextField2.getText();
        
        // Send these three values to the database
        
        try {
            // create a connection
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Test?" + "user=root&password=12345678");
            
            // prepare the query
            System.out.println("vd");
            String sql = "INSERT INTO User VALUES(?, ?, ?);";
            
            PreparedStatement pStmt = con.prepareStatement(sql);
            
            pStmt.setString(1, username);
            
            pStmt.setString(2, password);
            
            pStmt.setString(3, name);
            
            // insert into the table
            
            pStmt.executeUpdate();
            
            // give the success message
            
            JOptionPane.showMessageDialog(null, "Congrats! Account created successfully");
            
            signUpFrame.dispose();
            
            this.setVisible(true);
        } 
        catch(Exception e) {
            
            // throw error
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        // extract credentials
        
        String username = jTextField3.getText();
        
        String password = new String(jPasswordField2.getPassword());
        
        try {
            // establish connection
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Test?" + "user=root&password=12345678");
            
            String sql = "SELECT Password FROM User WHERE Username = ?;";
            
            PreparedStatement pStmt = con.prepareStatement(sql);
            
            pStmt.setString(1, username);
            
            ResultSet rs = pStmt.executeQuery();
            
            // Validate the given credentials
            
            System.out.println("vd");
            
            if(rs.next()) {
                
                String actualPassword = rs.getString("Password");
                
                if(password.equals(actualPassword)) {
                    // matched
                    
                    loginFrame.dispose();
                    
                    dashboard.setVisible(true);
                    
                    JOptionPane.showMessageDialog(null, "Logged in!");
                    
                } else {
                    // wrong password
                    
                    JOptionPane.showMessageDialog(null, "Incorrect Password! Please try again!");
                    
                }
            } else {
                
                // user does not exist
                
                JOptionPane.showMessageDialog(null, "Username does not exist. Please try again!");
                
            }
            
            
        }
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAppUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame dashboard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JFrame loginFrame;
    private javax.swing.JFrame signUpFrame;
    // End of variables declaration//GEN-END:variables
}
