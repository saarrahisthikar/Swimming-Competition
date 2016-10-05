package uom.view.frontend;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import uom.common.Constant;
import uom.model.SwimmingCompetition;

/**
 * Encapsulates the view generation logics for Competition selection
 *
 */
public class CompetitionSelection extends javax.swing.JPanel {

    private static String selectedGender;
    private static String selectedStroke;

    public CompetitionSelection() {
        initComponents();
        selectedGender = null;
        selectedStroke = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelUserMessage = new javax.swing.JLabel();
        btnSelection = new javax.swing.JButton();
        btnSelectionCancel = new javax.swing.JButton();
        radioFree = new javax.swing.JRadioButton();
        radioBreast = new javax.swing.JRadioButton();
        radioBack = new javax.swing.JRadioButton();
        radioButterfly = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioMale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 600));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Competition Selection");
        add(jLabel6);
        jLabel6.setBounds(30, 30, 300, 19);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selections"));

        labelUserMessage.setForeground(new java.awt.Color(255, 0, 51));

        btnSelection.setText("OK");
        btnSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectionActionPerformed(evt);
            }
        });

        btnSelectionCancel.setText("Cancel");
        btnSelectionCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectionCancelActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioFree);
        radioFree.setText("Free Stroke");
        radioFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFreeActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBreast);
        radioBreast.setText("Breast Stroke");
        radioBreast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBreastActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioBack);
        radioBack.setText("Back Stroke");
        radioBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBackActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioButterfly);
        radioButterfly.setText("Butterfly Stroke");
        radioButterfly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButterflyActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioFemale);
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioMale);
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        jLabel8.setText("Strokes");

        jLabel7.setText("Gender ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFree)
                            .addComponent(radioBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBreast)
                            .addComponent(radioButterfly, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelectionCancel)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioFemale)
                            .addComponent(radioMale))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelUserMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioMale)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(radioButterfly))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBreast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioFree)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelection)
                    .addComponent(btnSelectionCancel))
                .addGap(18, 18, 18)
                .addComponent(labelUserMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(30, 80, 340, 310);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectionActionPerformed

        try {
            selectedGender = null;
            if (this.radioFemale.isSelected()) {
                selectedGender = Constant.FEMALE;
            } else if (this.radioMale.isSelected()) {
                selectedGender = Constant.MALE;
            }

            if (selectedGender == null) {
                labelUserMessage.setText("Please select the gender");
                return;
            }

            selectedStroke = null;
            if (this.radioButterfly.isSelected()) {
                selectedStroke = Constant.BUTTERFLY_STROKE;
            } else if (this.radioBreast.isSelected()) {
                selectedStroke = Constant.BREAST_STROKE;
            } else if (this.radioBack.isSelected()) {
                selectedStroke = Constant.BACK_STROKE;
            } else if (this.radioFree.isSelected()) {
                selectedStroke = Constant.FREE_STYLE;
            }

            if (selectedStroke == null) {
                this.labelUserMessage.setText("Please select the stroke");
                return;
            }

            constructPoolLayout();

            SwimmingCompetition.getResponsibleSupportingStaffMember().cleanThePool();
            SwimmingCompetition.getResponsibleSupportingStaffMember().positionTheSwimmers();

            Image image = new ImageIcon(this.getClass().getResource("/uom/view/images/SpectatorBefore.jpg")).getImage();

            PavilionLayout pavilion = (PavilionLayout) BaseGUI.getSwimmingCompetitionLayout().getPanelPavilion();
            pavilion.changeLayout(image);
            
            BaseGUI.getSwimmingCompetitionLayout().getLabelSepectatorComments().setToolTipText("Lets start the game soon");

        } catch (Exception e) {
            Logger.getLogger(CompetitionSelection.class.getName()).log(Level.SEVERE, null, e);
        }


    }//GEN-LAST:event_btnSelectionActionPerformed

    private void constructPoolLayout() {

        this.removeAll();
        this.repaint();
        this.revalidate();

        this.add(BaseGUI.getSwimmingCompetitionLayout());
        this.repaint();
        this.revalidate();

    }

    public static String getSelectedGender() {
        return selectedGender;
    }

    public static String getSelectedStroke() {
        return selectedStroke;
    }
    private void btnSelectionCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectionCancelActionPerformed
        this.labelUserMessage.setText("Competition is not selected");

    }//GEN-LAST:event_btnSelectionCancelActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        selectedGender = Constant.FEMALE;
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        selectedGender = Constant.MALE;
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioButterflyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButterflyActionPerformed
        selectedStroke = Constant.BUTTERFLY_STROKE;
    }//GEN-LAST:event_radioButterflyActionPerformed

    private void radioBreastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBreastActionPerformed
        selectedStroke = Constant.BREAST_STROKE;
    }//GEN-LAST:event_radioBreastActionPerformed

    private void radioBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBackActionPerformed
        selectedStroke = Constant.BACK_STROKE;
    }//GEN-LAST:event_radioBackActionPerformed

    private void radioFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFreeActionPerformed
        selectedStroke = Constant.FREE_STYLE;
    }//GEN-LAST:event_radioFreeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelection;
    private javax.swing.JButton btnSelectionCancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelUserMessage;
    private javax.swing.JRadioButton radioBack;
    private javax.swing.JRadioButton radioBreast;
    private javax.swing.JRadioButton radioButterfly;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioFree;
    private javax.swing.JRadioButton radioMale;
    // End of variables declaration//GEN-END:variables

}
