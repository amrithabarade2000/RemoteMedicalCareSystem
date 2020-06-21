
import java.sql.*;
import javax.swing.JOptionPane;

public class DoctorLogin extends javax.swing.JFrame {

    String DName = new String();
    String DPass = new String();
    FormUtil FUtil = new FormUtil();

    public DoctorLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TF_Uname1 = new javax.swing.JTextField();
        LogFormButton = new javax.swing.JButton();
        UnameLabel = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        TF_Pass1 = new javax.swing.JPasswordField();
        LogFormTitle = new javax.swing.JLabel();
        RegFormButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TF_Uname1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TF_Uname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Uname1ActionPerformed(evt);
            }
        });

        LogFormButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogFormButton.setText("Login");
        LogFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogFormButtonActionPerformed(evt);
            }
        });

        UnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UnameLabel.setText("Name :");

        PassLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PassLabel.setText("Password :");

        TF_Pass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TF_Pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Pass1ActionPerformed(evt);
            }
        });

        LogFormTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LogFormTitle.setText("Enter doctor details");

        RegFormButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegFormButton3.setText("Back");
        RegFormButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegFormButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(LogFormTitle)
                        .addContainerGap(137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(PassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_Uname1)
                            .addComponent(TF_Pass1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGap(65, 65, 65))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegFormButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(LogFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(LogFormTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TF_Uname1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogFormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegFormButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogFormButtonActionPerformed
        // TODO add your handling code here:
        DName = TF_Uname1.getText();
        DPass = String.valueOf(TF_Pass1.getPassword());

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/she_db", "user1", "xxxx");
            String query = ("SELECT * FROM she_db.doctor WHERE `dname` =? AND `password` =?");

            ps = con.prepareStatement(query);
            ps.setString(1, DName);
            ps.setString(2, DPass);
            rs = ps.executeQuery();

            if (rs.next()) {
                FUtil.sendDocData(DName,DPass);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_LogFormButtonActionPerformed

    private void TF_Uname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Uname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Uname1ActionPerformed

    private void TF_Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_Pass1ActionPerformed

    private void RegFormButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFormButton3ActionPerformed
        // TODO add your handling code here:
        FrontPage FP = new FrontPage();
        FP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegFormButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new DoctorLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogFormButton;
    private javax.swing.JLabel LogFormTitle;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JButton RegFormButton3;
    private javax.swing.JPasswordField TF_Pass1;
    private javax.swing.JTextField TF_Uname1;
    private javax.swing.JLabel UnameLabel;
    // End of variables declaration//GEN-END:variables
}
