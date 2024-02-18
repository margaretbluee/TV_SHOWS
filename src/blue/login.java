/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blue;

import static blue.Menu.dbConnection;
import static blue.Menu.driverClassName;
import static blue.Menu.insertUsers;
import static blue.Menu.passwd;
import static blue.Menu.url;
import static blue.Menu.username;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        USERS_JP0 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        create_button = new javax.swing.JButton();
        user_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        USERS_JP0.setBackground(new java.awt.Color(102, 0, 0));

        jPanel3.setBackground(new java.awt.Color(200, 134, 121));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 425));

        jLabel15.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel15.setText("Login Form");

        jLabel17.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel17.setText("username:");

        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel18.setText("user_id:");

        user_name.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        user_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_name.setCaretColor(new java.awt.Color(153, 153, 153));
        user_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user_name.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });

        login_button.setBackground(new java.awt.Color(255, 204, 255));
        login_button.setFont(new java.awt.Font("Modern No. 20", 0, 16)); // NOI18N
        login_button.setText("LOGIN");
        login_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        create_button.setBackground(new java.awt.Color(255, 204, 255));
        create_button.setFont(new java.awt.Font("Modern No. 20", 0, 16)); // NOI18N
        create_button.setText("SIGN UP");
        create_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        create_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        create_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_buttonActionPerformed(evt);
            }
        });

        user_id.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        user_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_id.setCaretColor(new java.awt.Color(153, 153, 153));
        user_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user_id.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        user_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_idActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("guest");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel21.setText("Συνέχεια ως ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel17))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(create_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {user_id, user_name});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(create_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout USERS_JP0Layout = new javax.swing.GroupLayout(USERS_JP0);
        USERS_JP0.setLayout(USERS_JP0Layout);
        USERS_JP0Layout.setHorizontalGroup(
            USERS_JP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USERS_JP0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        USERS_JP0Layout.setVerticalGroup(
            USERS_JP0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USERS_JP0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(USERS_JP0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(USERS_JP0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Connection getConnection() {
        Connection con;

        try {
            con = DriverManager.getConnection("jdbc:postgresql://dblabs.iee.ihu.gr:5432/it174948", "it174948", "Kwdikos98!");

            return con;
        } catch (SQLException e) {
            return null;
        }
        //   static String driverClassName = "org.postgresql.Driver";
        //   static String url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it164806";
        //   static Connection dbConnection = null;
        //   static String username = "it164806";
        //   static String passwd = "sefzz123.";

    }
    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        Connection con = getConnection();
        PreparedStatement login;
        int id = Integer.valueOf(user_id.getText());

        String name = user_name.getText();

        try {
            con = DriverManager.getConnection("jdbc:postgresql://dblabs.iee.ihu.gr:5432/it174948", "it174948", "Kwdikos98!");

            login = con.prepareStatement("SELECT  user_name ,user_id FROM users WHERE user_name = ?  AND user_id = ?;");

            login.setString(1, name);

            login.setInt(2, id);
            ResultSet result = login.executeQuery();
            if ("user".equals(name) && "1111".equals(id)) {
                JOptionPane.showMessageDialog(null, "WELCOME " + name + "!");

                new Menu().setVisible(true);

                dispose();
            } else if (result.next()) {
                JOptionPane.showMessageDialog(null, "WELCOME " + name + "!");

                new Menu().setVisible(true);
                dispose();
                //System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username/password.");
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(final_reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_login_buttonActionPerformed

    private void create_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_buttonActionPerformed
        insert_users();
        myconnection_insert_users();
        //   JOptionPane.showMessageDialog(null, "Ο λογαριασμός σου δημιουργήθηκε επιτυχώς.");
        //      KANALI_Table.setAutoCreateColumnsFromModel(true);

        //      mylist_rating();
        // TODO add your handling code here:
    }//GEN-LAST:event_create_buttonActionPerformed

    private void user_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
user_name.setText("guest");        // TODO add your handling code here:
user_id.setText("1111");
    }//GEN-LAST:event_jButton1ActionPerformed
    void insert_users() {
        int id = Integer.valueOf(user_id.getText());

        String name = user_name.getText();

        try {
            myconnection_insert_users();
            insertUsers.setInt(1, id);
            insertUsers.setString(2, name);

            insertUsers.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

    void myconnection_insert_users() {
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException ex) {
        }
        try {
            //        statement.executeUpdate("insert into show (show_id, show_title, show_year, show_type, show_skhnotheths) values (13, 'The Office',2003,'Comedy', 13);");

            dbConnection = DriverManager.getConnection(url, username, passwd);
            String insertString = "insert into users(user_id, user_name  ) values  (?, ? )";
            insertUsers = dbConnection.prepareStatement(insertString);
        } catch (SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while (ex != null) {
                JOptionPane.showMessageDialog(null, "Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
    }

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    static String driverClassName = "org.postgresql.Driver";
    static String url = "jdbc:postgresql://dblabs.it.teithe.gr:5432/it174948";
    static Connection dbConnection = null;
    static String username = "it174948";
    static String passwd = "Kwdikos98!";
    static Statement statement = null;
    static PreparedStatement InsertUsers = null;

    static PreparedStatement login = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel USERS_JP0;
    private javax.swing.JButton create_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField user_id;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}