/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Shubham
 */
public class RegularEntry extends javax.swing.JFrame {

    /**
     * Creates new form RegularEntry
     */
    public RegularEntry() {
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

        BgGenerate = new javax.swing.ButtonGroup();
        RegularTab = new javax.swing.JTabbedPane();
        RegularGenerate = new javax.swing.JPanel();
        jRTwoWheel = new javax.swing.JRadioButton();
        jRFourWheel = new javax.swing.JRadioButton();
        jRHeavyDuty = new javax.swing.JRadioButton();
        jVehicleType = new javax.swing.JLabel();
        jButtonGenerate = new javax.swing.JButton();
        RegularCheck = new javax.swing.JPanel();
        jSerialNo = new javax.swing.JLabel();
        jTextSerial = new javax.swing.JTextField();
        jButtonCheck = new javax.swing.JButton();
        jLabelHours = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        jTextHours = new javax.swing.JTextField();
        jTextAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegularTab.setToolTipText("");

        BgGenerate.add(jRTwoWheel);
        jRTwoWheel.setText("2 wheeler");
        jRTwoWheel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTwoWheelActionPerformed(evt);
            }
        });

        BgGenerate.add(jRFourWheel);
        jRFourWheel.setText("4 wheeler");

        BgGenerate.add(jRHeavyDuty);
        jRHeavyDuty.setText("Heavy duty");

        jVehicleType.setText("Vehicle_Type");

        jButtonGenerate.setText("Generate");
        jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegularGenerateLayout = new javax.swing.GroupLayout(RegularGenerate);
        RegularGenerate.setLayout(RegularGenerateLayout);
        RegularGenerateLayout.setHorizontalGroup(
            RegularGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegularGenerateLayout.createSequentialGroup()
                .addGroup(RegularGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegularGenerateLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(RegularGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRFourWheel)
                            .addComponent(jRTwoWheel)
                            .addComponent(jRHeavyDuty)))
                    .addGroup(RegularGenerateLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RegularGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGenerate)
                            .addComponent(jVehicleType))))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        RegularGenerateLayout.setVerticalGroup(
            RegularGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegularGenerateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVehicleType)
                .addGap(15, 15, 15)
                .addComponent(jRTwoWheel)
                .addGap(18, 18, 18)
                .addComponent(jRFourWheel)
                .addGap(18, 18, 18)
                .addComponent(jRHeavyDuty)
                .addGap(33, 33, 33)
                .addComponent(jButtonGenerate)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        RegularTab.addTab("GENERATE", null, RegularGenerate, "To genrate the ticket");

        jSerialNo.setText("Serial No");

        jTextSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSerialActionPerformed(evt);
            }
        });

        jButtonCheck.setText("CHECK");

        jLabelHours.setText("Hours");

        jLabelAmount.setText("Amount");

        jTextHours.setFocusable(false);
        jTextHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHoursActionPerformed(evt);
            }
        });

        jTextAmount.setFocusable(false);

        javax.swing.GroupLayout RegularCheckLayout = new javax.swing.GroupLayout(RegularCheck);
        RegularCheck.setLayout(RegularCheckLayout);
        RegularCheckLayout.setHorizontalGroup(
            RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegularCheckLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCheck)
                    .addGroup(RegularCheckLayout.createSequentialGroup()
                        .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSerialNo)
                            .addGroup(RegularCheckLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelHours)
                                    .addComponent(jLabelAmount))))
                        .addGap(28, 28, 28)
                        .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(jTextHours, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        RegularCheckLayout.setVerticalGroup(
            RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegularCheckLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSerialNo)
                    .addComponent(jTextSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCheck)
                .addGap(18, 18, 18)
                .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHours)
                    .addComponent(jTextHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(RegularCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAmount)
                    .addComponent(jTextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        RegularTab.addTab("CHECK", null, RegularCheck, "to check the amount");
        RegularCheck.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegularTab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegularTab))
        );

        RegularTab.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRTwoWheelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTwoWheelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRTwoWheelActionPerformed

    private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonGenerateActionPerformed

    private void jTextSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSerialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSerialActionPerformed

    private void jTextHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHoursActionPerformed

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
            java.util.logging.Logger.getLogger(RegularEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegularEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegularEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegularEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegularEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BgGenerate;
    private javax.swing.JPanel RegularCheck;
    private javax.swing.JPanel RegularGenerate;
    private javax.swing.JTabbedPane RegularTab;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelHours;
    private javax.swing.JRadioButton jRFourWheel;
    private javax.swing.JRadioButton jRHeavyDuty;
    private javax.swing.JRadioButton jRTwoWheel;
    private javax.swing.JLabel jSerialNo;
    private javax.swing.JTextField jTextAmount;
    private javax.swing.JTextField jTextHours;
    private javax.swing.JTextField jTextSerial;
    private javax.swing.JLabel jVehicleType;
    // End of variables declaration//GEN-END:variables
}
