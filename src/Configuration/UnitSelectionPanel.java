/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

/**
 *
 * @author Alec
 */
public class UnitSelectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form UnitSelectionPanel
     */
    public UnitSelectionPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        saveAsNewButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pilotWeightLabel = new javax.swing.JLabel();
        pilotWeightTextField = new javax.swing.JTextField();
        gliderGrossWeightLabel = new javax.swing.JLabel();
        gliderGrossWeightTextField = new javax.swing.JTextField();
        pilotLabel = new javax.swing.JLabel();
        gliderLabel = new javax.swing.JLabel();
        gliderEmptyWeightLabel = new javax.swing.JLabel();
        gliderEmptyWeightTextField = new javax.swing.JTextField();
        gliderWinchingSpeedLabel = new javax.swing.JLabel();
        gliderWinchingSpeedTextField = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout());

        saveButton.setText("Save");
        jPanel1.add(saveButton);

        saveAsNewButton.setText("Save as new profile");
        jPanel1.add(saveAsNewButton);

        resetButton.setText("Reset");
        jPanel1.add(resetButton);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pilotWeightLabel.setText("Weight");

        pilotWeightTextField.setText("jTextField1");
        pilotWeightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotWeightTextFieldActionPerformed(evt);
            }
        });

        gliderGrossWeightLabel.setText("Max Gross Weight");

        gliderGrossWeightTextField.setText("jTextField2");

        pilotLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pilotLabel.setText("Pilot");

        gliderLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        gliderLabel.setText("Glider");

        gliderEmptyWeightLabel.setText("Empty Weight");

        gliderEmptyWeightTextField.setText("jTextField1");

        gliderWinchingSpeedLabel.setText("Max Winching Speed");

        gliderWinchingSpeedTextField.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pilotWeightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pilotWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pilotLabel)
                    .addComponent(gliderLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(gliderGrossWeightLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gliderGrossWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(gliderWinchingSpeedLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(gliderWinchingSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(gliderEmptyWeightLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gliderEmptyWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pilotLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pilotWeightLabel)
                    .addComponent(pilotWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gliderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gliderGrossWeightLabel)
                            .addComponent(gliderGrossWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gliderEmptyWeightLabel)
                            .addComponent(gliderEmptyWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gliderWinchingSpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gliderWinchingSpeedLabel)))
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void pilotWeightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilotWeightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilotWeightTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gliderEmptyWeightLabel;
    private javax.swing.JTextField gliderEmptyWeightTextField;
    private javax.swing.JLabel gliderGrossWeightLabel;
    private javax.swing.JTextField gliderGrossWeightTextField;
    private javax.swing.JLabel gliderLabel;
    private javax.swing.JLabel gliderWinchingSpeedLabel;
    private javax.swing.JTextField gliderWinchingSpeedTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pilotLabel;
    private javax.swing.JLabel pilotWeightLabel;
    private javax.swing.JTextField pilotWeightTextField;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveAsNewButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
