package uom.view.frontend;

import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import uom.common.Constant;
import uom.model.FemaleSwimmer;
import uom.model.MaleSwimmer;
import uom.model.Swimmer;
import uom.controller.HelperService;
import uom.model.SwimmingCompetition;

/**
 * View logics of the registration panel goes here
 *
 */
public class Registration extends javax.swing.JPanel {

    public Registration() {
        initComponents();
        updateSwimmerTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        subPanelSwimmers = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        comboGender = new javax.swing.JComboBox();
        textSwimmerName = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        lableMessage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        subPanelTableContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSwimmers = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jToggleButton1.setText("jToggleButton1");

        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setLayout(new java.awt.BorderLayout());

        subPanelSwimmers.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Register Swimmers"));

        jLabel3.setText("Name");

        jLabel2.setText("Gender");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        comboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male" }));

        textSwimmerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSwimmerNameFocusGained(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textSwimmerName))
                                .addGap(95, 95, 95))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnRegister)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSwimmerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnCancel))
                .addGap(49, 49, 49)
                .addComponent(lableMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Swimmer Registration");

        subPanelTableContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Registered Swimmers"));

        tableSwimmers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSwimmers);

        javax.swing.GroupLayout subPanelTableContainerLayout = new javax.swing.GroupLayout(subPanelTableContainer);
        subPanelTableContainer.setLayout(subPanelTableContainerLayout);
        subPanelTableContainerLayout.setHorizontalGroup(
            subPanelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelTableContainerLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        subPanelTableContainerLayout.setVerticalGroup(
            subPanelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelTableContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout subPanelSwimmersLayout = new javax.swing.GroupLayout(subPanelSwimmers);
        subPanelSwimmers.setLayout(subPanelSwimmersLayout);
        subPanelSwimmersLayout.setHorizontalGroup(
            subPanelSwimmersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelSwimmersLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(subPanelSwimmersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subPanelTableContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        subPanelSwimmersLayout.setVerticalGroup(
            subPanelSwimmersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelSwimmersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subPanelTableContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        add(subPanelSwimmers, java.awt.BorderLayout.PAGE_START);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setText("              Swimmer Registration ");
        add(jLabel4, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.textSwimmerName.setText("");
        this.lableMessage.setText("Swimmer was not added");
        this.lableMessage.setForeground(Color.red);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void textSwimmerNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSwimmerNameFocusGained
        this.lableMessage.setText("");
    }//GEN-LAST:event_textSwimmerNameFocusGained

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        try {
            String swimmerName = this.textSwimmerName.getText();

            //Validations
            if (swimmerName == null || swimmerName.isEmpty()) {
                this.lableMessage.setText("Swimmer Name cannot be empty");
                this.lableMessage.setForeground(Color.red);
            } else {
                //logics to save the swimmer.
                Swimmer swimmer = null;

                String name = this.textSwimmerName.getText();
                String gender = this.comboGender.getSelectedItem().toString();

                if (gender.equals(Constant.FEMALE) && SwimmingCompetition.getFemaleSwimmers().size() < Constant.TRACK_COUNT) {
                    swimmer = new FemaleSwimmer(name, SwimmingCompetition.getFemaleSwimmers().size() + 1);
                    this.lableMessage.setText("Swimmer Successfully Added");
                    this.lableMessage.setForeground(Color.blue);
                } else if (gender.equals(Constant.MALE) && SwimmingCompetition.getMaleSwimmers().size() < Constant.TRACK_COUNT) {
                    swimmer = new MaleSwimmer(name, SwimmingCompetition.getMaleSwimmers().size() + 1);
                    this.lableMessage.setText("Swimmer Successfully Added");
                    this.lableMessage.setForeground(Color.blue);
                }

                this.lableMessage.setText("Swimmer Successfully Added");
                this.lableMessage.setForeground(Color.blue);
                this.textSwimmerName.setText("");
                if (swimmer != null) {
                    HelperService.saveSwimmer(swimmer);
                    updateSwimmerTable();
                } else {
                    this.lableMessage.setText("No of Swimmers cannot exceed 5 ");
                    this.lableMessage.setForeground(Color.red);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
            this.lableMessage.setText("Error occured, please re-try ");
            this.lableMessage.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void updateSwimmerTable() {
        resetSwimmerTable();
        List<Swimmer> registeredSwimmers = HelperService.getAllSwimmers();

        //populate the table with fresh results
        if (registeredSwimmers != null && !registeredSwimmers.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) tableSwimmers.getModel();
            for (Swimmer swimmer : registeredSwimmers) {
                String[] columnValues = new String[2];
                columnValues[0] = swimmer.getpName();
                if (swimmer instanceof FemaleSwimmer) {
                    columnValues[1] = Constant.FEMALE;
                } else {
                    columnValues[1] = Constant.MALE;
                }
                model.addRow(columnValues);
            }

        }
    }

    private void resetSwimmerTable() {
        DefaultTableModel model = (DefaultTableModel) tableSwimmers.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox comboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lableMessage;
    private javax.swing.JPanel subPanelSwimmers;
    private javax.swing.JPanel subPanelTableContainer;
    private javax.swing.JTable tableSwimmers;
    private javax.swing.JTextField textSwimmerName;
    // End of variables declaration//GEN-END:variables

}
