package uom.view.frontend;

import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import uom.model.People;
import uom.model.Spectator;
import uom.controller.HelperService;
import uom.model.SwimmingCompetition;

public class TicketCounter extends javax.swing.JPanel {

    public TicketCounter() {
        initComponents();
        updateSpectatorTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTickets = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        txtSpectatorName = new javax.swing.JTextField();
        btnBuyTickets = new javax.swing.JButton();
        labelShowMessage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSpectators = new javax.swing.JTable();

        setLayout(null);

        labelTickets.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        labelTickets.setText("Ticket Counter");
        add(labelTickets);
        labelTickets.setBounds(30, 20, 133, 19);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Spectator"));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        labelName.setText("Name:");

        btnBuyTickets.setText("Buy Tickets");
        btnBuyTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyTicketsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(labelShowMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelName)
                            .addComponent(btnBuyTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSpectatorName)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelName))
                    .addComponent(txtSpectatorName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyTickets)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelShowMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(30, 50, 330, 130);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registered Spectators"));

        tableSpectators.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Spectator List"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableSpectators);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(30, 190, 340, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.txtSpectatorName.setText("");
        this.labelShowMessage.setText("Spectator was not added");
        this.labelShowMessage.setForeground(Color.red);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBuyTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyTicketsActionPerformed
        try {
            String spectatorName = this.txtSpectatorName.getText();

            if (spectatorName == null || spectatorName.trim().isEmpty()) {
                this.labelShowMessage.setText("Please enter the spectator name");
                this.labelShowMessage.setForeground(Color.red);
                return;
            }
            Spectator spectator = new Spectator(this.txtSpectatorName.getText());
            List<People> people = SwimmingCompetition.getPeople();
            people.add(spectator);
            System.out.println(Spectator.getNoOfSpectators() + " " + spectator.getpName());

            this.labelShowMessage.setText("Spectator successfully added");
            this.labelShowMessage.setForeground(Color.blue);

            HelperService.saveSpectator(spectator);

            this.txtSpectatorName.setText("");

            updateSpectatorTable();
        } catch (Exception e) {
            this.labelShowMessage.setText("Error while adding the spectator");
            this.labelShowMessage.setForeground(Color.red);
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);

        }
    }//GEN-LAST:event_btnBuyTicketsActionPerformed

    private void updateSpectatorTable() {
        resetSpectatorTable();

        List<Spectator> sepectators = HelperService.getAllSpectators();
        if (sepectators != null && !sepectators.isEmpty()) {
            DefaultTableModel model = (DefaultTableModel) tableSpectators.getModel();
            for (Spectator spectator : sepectators) {
                String[] column = new String[1];
                column[0] = spectator.getpName();
                model.addRow(column);
            }

        }
    }

    private void resetSpectatorTable() {
        DefaultTableModel model = (DefaultTableModel) tableSpectators.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyTickets;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelShowMessage;
    private javax.swing.JLabel labelTickets;
    private javax.swing.JTable tableSpectators;
    private javax.swing.JTextField txtSpectatorName;
    // End of variables declaration//GEN-END:variables

}
