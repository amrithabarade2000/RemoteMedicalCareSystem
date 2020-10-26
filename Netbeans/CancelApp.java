//CancelApp.java allows the user to cancel an appointment by selecting the booked appointment from the appointment table and deleting the record
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CancelApp extends javax.swing.JFrame {

    int id1;
    FormUtil FUtil = new FormUtil();

    public CancelApp() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        //JTextField to enter the PatientID
        pid = new javax.swing.JTextField();
        getApp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppT = new javax.swing.JTable();
        delc = new javax.swing.JButton();
        //JButton to select register
        RegFormButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Appointment Cancellation");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Your ID : ");

        pid.setEditable(false);
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });

        getApp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getApp.setForeground(new java.awt.Color(51, 51, 51));
        getApp.setText("View all Appointments");
        getApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAppActionPerformed(evt);
            }
        });

        AppT.setBorder(new javax.swing.border.MatteBorder(null));
        AppT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AppT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor", "Type", "Date", "Slot"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AppT);

        delc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delc.setText("Cancel Selected Appointment");
        delc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delcActionPerformed(evt);
            }
        });

        RegFormButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(delc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(getApp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegFormButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(getApp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegFormButton3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void getAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAppActionPerformed

        try {
            Connection con = null;
            //Establish the database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Database name = she_db, username = "user1", password = "xxxx"
            con = DriverManager.getConnection("jdbc:mysql://localhost/she_db", "user1", "xxxx");
            ResultSet rs;
            PreparedStatement pst;
            
            //Query to select the DoctorID, Speciality, Appointment Date and slot from the appointment table with the given PatientID
            String sql = "select d_id,speciality,date_of_app,slot from she_db.appointment where `p_id`=?";
            //PreparedStatement pst executes the query
            pst = con.prepareStatement(sql);
            pst.setInt(1, id1);
            //ResultSet rs stores the result when the query is executed
            rs = pst.executeQuery();
            int d;
            String t;
            Date dat;
            String s;

            DefaultTableModel model = (DefaultTableModel) AppT.getModel();
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }

            while (rs.next()) {
                d = rs.getInt("d_id");
                t = rs.getString("speciality");
                dat = rs.getDate("date_of_app");
                s = rs.getString("slot");
                model.addRow(new Object[]{d, t, dat, s});
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_getAppActionPerformed

    private void delcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delcActionPerformed
        // TODO add your handling code here:
        int row = AppT.getSelectedRow();
        //Get the PatientID
        int p = Integer.parseInt(pid.getText());
        int d = (int) AppT.getModel().getValueAt(row, 0);
        Date dt = (Date) AppT.getModel().getValueAt(row, 2);
        System.out.println("success");
        try {
            Connection con = null;
            //Establish the database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Database name = she_db, username = "user1", password = "xxxx"
            con = DriverManager.getConnection("jdbc:mysql://localhost/she_db", "user1", "xxxx");
            PreparedStatement pst;
            //Query to delete the record from the appointment table with the given PatientID, DoctorID and Appointment Date
            String sql = "delete from she_db.appointment where `p_id`=? and `d_id`=? and `date_of_app`=?";
            //PreparedStatement pst executes the query
            pst = con.prepareStatement(sql);
            pst.setInt(1, p);
            pst.setInt(2, d);
            pst.setDate(3, dt);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successful Appointment Cancellation");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_delcActionPerformed

    private void RegFormButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFormButton3ActionPerformed
        // TODO add your handling code here:
        FUtil.sendData(id1);
        this.setVisible(false);
    }//GEN-LAST:event_RegFormButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CancelApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CancelApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppT;
    private javax.swing.JButton RegFormButton3;
    private javax.swing.JButton delc;
    private javax.swing.JButton getApp;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField pid;
    // End of variables declaration//GEN-END:variables
}
