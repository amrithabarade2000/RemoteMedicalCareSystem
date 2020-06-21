public class FrontPage extends javax.swing.JFrame {

    public FrontPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginTitle = new javax.swing.JLabel();
        DonorPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        RegButton = new javax.swing.JButton();
        DonorField = new javax.swing.JLabel();
        SearchButton1 = new javax.swing.JButton();
        DonorPanel1 = new javax.swing.JPanel();
        LoginButton1 = new javax.swing.JButton();
        DonorField1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LoginTitle.setText("Appointment Handbook");

        DonorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setToolTipText("");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegButton.setText("Register");
        RegButton.setToolTipText("");
        RegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegButtonActionPerformed(evt);
            }
        });

        DonorField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DonorField.setText("PATIENT");

        javax.swing.GroupLayout DonorPanelLayout = new javax.swing.GroupLayout(DonorPanel);
        DonorPanel.setLayout(DonorPanelLayout);
        DonorPanelLayout.setHorizontalGroup(
            DonorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorPanelLayout.createSequentialGroup()
                .addGroup(DonorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonorPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(DonorField))
                    .addGroup(DonorPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(DonorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegButton, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        DonorPanelLayout.setVerticalGroup(
            DonorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(DonorField)
                .addGap(43, 43, 43)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(RegButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        SearchButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchButton1.setText("EXIT");
        SearchButton1.setToolTipText("");
        SearchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton1ActionPerformed(evt);
            }
        });

        DonorPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LoginButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginButton1.setText("Login");
        LoginButton1.setToolTipText("");
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });

        DonorField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DonorField1.setText("DOCTOR");

        javax.swing.GroupLayout DonorPanel1Layout = new javax.swing.GroupLayout(DonorPanel1);
        DonorPanel1.setLayout(DonorPanel1Layout);
        DonorPanel1Layout.setHorizontalGroup(
            DonorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorPanel1Layout.createSequentialGroup()
                .addGroup(DonorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DonorPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(DonorField1))
                    .addGroup(DonorPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        DonorPanel1Layout.setVerticalGroup(
            DonorPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonorPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(DonorField1)
                .addGap(43, 43, 43)
                .addComponent(LoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(DonorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(DonorPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(SearchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(LoginTitle)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(LoginTitle)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DonorPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(SearchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        PatientLogin PL= new PatientLogin();
        PL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_SearchButton1ActionPerformed

    private void RegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegButtonActionPerformed
        // TODO add your handling code here:
        RegistrationForm RF= new RegistrationForm();
        RF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegButtonActionPerformed

    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
        // TODO add your handling code here:
        DoctorLogin DL= new DoctorLogin();
        DL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> {
            new FrontPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DonorField;
    private javax.swing.JLabel DonorField1;
    private javax.swing.JPanel DonorPanel;
    private javax.swing.JPanel DonorPanel1;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JButton RegButton;
    private javax.swing.JButton SearchButton1;
    // End of variables declaration//GEN-END:variables
}
