package uom.view.frontend;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import uom.controller.HelperService;
import uom.model.ScoreEntry;

/**
 * Responsible of constructing the view of the swimming results
 */
public class ResultsUpdate extends javax.swing.JPanel {

    public ResultsUpdate() {
        initComponents();
        updateResultsUpdateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelResults = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResultsUpdate = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tableResultsUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Competition Number", "Name", "Rank", "Lane Number", "Time Duration (s)", "Gender", "Stroke"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableResultsUpdate);

        jLabel1.setText("Swimming Competition Overrall Results");

        javax.swing.GroupLayout panelResultsLayout = new javax.swing.GroupLayout(panelResults);
        panelResults.setLayout(panelResultsLayout);
        panelResultsLayout.setHorizontalGroup(
            panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultsLayout.createSequentialGroup()
                .addGroup(panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResultsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelResultsLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelResultsLayout.setVerticalGroup(
            panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1073, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateResultsUpdateTable() {
        resetResultsUpdateTable();
        try {
            List<ScoreEntry> storedScores = HelperService.getScoreEntries();
            if (storedScores != null && !storedScores.isEmpty()) {
                DefaultTableModel model = (DefaultTableModel) tableResultsUpdate.getModel();
                for (ScoreEntry storedScore : storedScores) {
                    Object[] column = new Object[8];
                    column[0] = storedScore.getId();
                    column[1] = storedScore.getCompetitionNumber();
                    column[2] = storedScore.getName();
                    column[3] = storedScore.getRank();
                    column[4] = storedScore.getLaneNo();
                    column[5] = storedScore.getTimeDuration();
                    column[6] = storedScore.getGender();
                    column[7] = storedScore.getStroke();

                    model.addRow(column);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(ResultsUpdate.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void resetResultsUpdateTable() {
        DefaultTableModel model = (DefaultTableModel) tableResultsUpdate.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelResults;
    private javax.swing.JTable tableResultsUpdate;
    // End of variables declaration//GEN-END:variables

}
