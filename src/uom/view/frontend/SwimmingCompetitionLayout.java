package uom.view.frontend;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import uom.common.Constant;
import uom.controller.HelperService;
import uom.model.Judge;
import uom.model.ScoreBoard;
import uom.model.Spectator;
import uom.model.SupportingStaff;
import uom.model.Swimmer;
import uom.model.SwimmingCompetition;

/**
 * Container class for holding of tracks and Touch-pads
 *
 */
public class SwimmingCompetitionLayout extends javax.swing.JPanel {

    private DefaultTableModel model = null;
    private ScoreBoard scoreBoard = null;

    private static List<javax.swing.JPanel> tracks = null;
    private static List<javax.swing.JPanel> touchPads = null;

    public SwimmingCompetitionLayout() {
        tracks = new ArrayList<>();
        touchPads = new ArrayList<>();

        scoreBoard = SwimmingCompetition.getScoreBoard();

        initComponents();

        addTracks();
        addTouchPads();
        resetTouchPads();
        resetScoreBoard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPavilion = new uom.view.frontend.PavilionLayout();
        jLabel9 = new javax.swing.JLabel();
        panelTrack = new javax.swing.JPanel();
        track3 = new uom.view.frontend.TrackLayout(3);
        touchPad3 = new uom.view.frontend.TouchPadLayout()
        ;
        track1 = new uom.view.frontend.TrackLayout(1);
        touchPad1 = new uom.view.frontend.TouchPadLayout();
        track2 = new uom.view.frontend.TrackLayout(2);
        touchPad2 = new uom.view.frontend.TouchPadLayout();
        track5 = new uom.view.frontend.TrackLayout(5);
        touchPad5 = new uom.view.frontend.TouchPadLayout();
        track4 = new uom.view.frontend.TrackLayout(4);
        touchPad4 = new uom.view.frontend.TouchPadLayout();
        btnStart = new javax.swing.JButton();
        btnShowresults = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblScoreBoard = new uom.view.frontend.ScoreBoardLayout();
        ;
        jLabel1 = new javax.swing.JLabel();
        labelScoreBoard = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTotalSwimmers = new javax.swing.JLabel();
        labelFemaleSwimmers = new javax.swing.JLabel();
        labelMaleSwimmers = new javax.swing.JLabel();
        labelJudges = new javax.swing.JLabel();
        labelSpectators = new javax.swing.JLabel();
        labelStaff = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelCurrentStats = new javax.swing.JLabel();
        labelSepectatorComments = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 600));
        setLayout(null);

        panelPavilion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Thibus29STru", 1, 14)); // NOI18N
        jLabel9.setText("Pavilion");

        javax.swing.GroupLayout panelPavilionLayout = new javax.swing.GroupLayout(panelPavilion);
        panelPavilion.setLayout(panelPavilionLayout);
        panelPavilionLayout.setHorizontalGroup(
            panelPavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPavilionLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 86, Short.MAX_VALUE))
        );
        panelPavilionLayout.setVerticalGroup(
            panelPavilionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPavilionLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 319, Short.MAX_VALUE))
        );

        add(panelPavilion);
        panelPavilion.setBounds(40, 80, 150, 340);

        panelTrack.setAutoscrolls(true);

        track3.setBackground(new java.awt.Color(153, 255, 255));
        track3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        track3.setForeground(new java.awt.Color(204, 255, 255));
        track3.setAutoscrolls(true);

        touchPad3.setBackground(new java.awt.Color(204, 255, 255));
        touchPad3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout touchPad3Layout = new javax.swing.GroupLayout(touchPad3);
        touchPad3.setLayout(touchPad3Layout);
        touchPad3Layout.setHorizontalGroup(
            touchPad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        touchPad3Layout.setVerticalGroup(
            touchPad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout track3Layout = new javax.swing.GroupLayout(track3);
        track3.setLayout(track3Layout);
        track3Layout.setHorizontalGroup(
            track3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, track3Layout.createSequentialGroup()
                .addGap(0, 794, Short.MAX_VALUE)
                .addComponent(touchPad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        track3Layout.setVerticalGroup(
            track3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(touchPad3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        track1.setBackground(new java.awt.Color(153, 255, 255));
        track1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        track1.setForeground(new java.awt.Color(204, 255, 255));
        track1.setAutoscrolls(true);

        touchPad1.setBackground(new java.awt.Color(204, 255, 255));
        touchPad1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout touchPad1Layout = new javax.swing.GroupLayout(touchPad1);
        touchPad1.setLayout(touchPad1Layout);
        touchPad1Layout.setHorizontalGroup(
            touchPad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        touchPad1Layout.setVerticalGroup(
            touchPad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout track1Layout = new javax.swing.GroupLayout(track1);
        track1.setLayout(track1Layout);
        track1Layout.setHorizontalGroup(
            track1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, track1Layout.createSequentialGroup()
                .addGap(0, 794, Short.MAX_VALUE)
                .addComponent(touchPad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        track1Layout.setVerticalGroup(
            track1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(touchPad1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        track2.setBackground(new java.awt.Color(153, 255, 255));
        track2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        track2.setForeground(new java.awt.Color(204, 255, 255));
        track2.setAutoscrolls(true);

        touchPad2.setBackground(new java.awt.Color(204, 255, 255));
        touchPad2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout touchPad2Layout = new javax.swing.GroupLayout(touchPad2);
        touchPad2.setLayout(touchPad2Layout);
        touchPad2Layout.setHorizontalGroup(
            touchPad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        touchPad2Layout.setVerticalGroup(
            touchPad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout track2Layout = new javax.swing.GroupLayout(track2);
        track2.setLayout(track2Layout);
        track2Layout.setHorizontalGroup(
            track2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, track2Layout.createSequentialGroup()
                .addGap(0, 793, Short.MAX_VALUE)
                .addComponent(touchPad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        track2Layout.setVerticalGroup(
            track2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(touchPad2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        track5.setBackground(new java.awt.Color(153, 255, 255));
        track5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        track5.setForeground(new java.awt.Color(204, 255, 255));
        track5.setAutoscrolls(true);

        touchPad5.setBackground(new java.awt.Color(204, 255, 255));
        touchPad5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout touchPad5Layout = new javax.swing.GroupLayout(touchPad5);
        touchPad5.setLayout(touchPad5Layout);
        touchPad5Layout.setHorizontalGroup(
            touchPad5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        touchPad5Layout.setVerticalGroup(
            touchPad5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout track5Layout = new javax.swing.GroupLayout(track5);
        track5.setLayout(track5Layout);
        track5Layout.setHorizontalGroup(
            track5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, track5Layout.createSequentialGroup()
                .addGap(0, 794, Short.MAX_VALUE)
                .addComponent(touchPad5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        track5Layout.setVerticalGroup(
            track5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(touchPad5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        track4.setBackground(new java.awt.Color(153, 255, 255));
        track4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        track4.setForeground(new java.awt.Color(204, 255, 255));
        track4.setAutoscrolls(true);

        touchPad4.setBackground(new java.awt.Color(204, 255, 255));
        touchPad4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout touchPad4Layout = new javax.swing.GroupLayout(touchPad4);
        touchPad4.setLayout(touchPad4Layout);
        touchPad4Layout.setHorizontalGroup(
            touchPad4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        touchPad4Layout.setVerticalGroup(
            touchPad4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout track4Layout = new javax.swing.GroupLayout(track4);
        track4.setLayout(track4Layout);
        track4Layout.setHorizontalGroup(
            track4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, track4Layout.createSequentialGroup()
                .addGap(0, 794, Short.MAX_VALUE)
                .addComponent(touchPad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        track4Layout.setVerticalGroup(
            track4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(touchPad4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTrackLayout = new javax.swing.GroupLayout(panelTrack);
        panelTrack.setLayout(panelTrackLayout);
        panelTrackLayout.setHorizontalGroup(
            panelTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(track5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(track2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(track1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(track3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(track4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        panelTrackLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {track1, track2, track3, track4, track5});

        panelTrackLayout.setVerticalGroup(
            panelTrackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrackLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(track1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(track2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(track3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(track4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(track5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        panelTrackLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {track1, track2, track3, track4, track5});

        add(panelTrack);
        panelTrack.setBounds(210, 130, 840, 290);

        btnStart.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        btnStart.setText("Start");
        btnStart.setToolTipText("Click to start the competition");
        btnStart.setActionCommand("btnStart");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        add(btnStart);
        btnStart.setBounds(230, 90, 155, 24);

        btnShowresults.setFont(new java.awt.Font("Traditional Arabic", 1, 11)); // NOI18N
        btnShowresults.setText("Show Results");
        btnShowresults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowresultsActionPerformed(evt);
            }
        });
        add(btnShowresults);
        btnShowresults.setBounds(410, 90, 155, 24);

        tblScoreBoard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rank", "Name", "Track Number", "Time Duration (s)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblScoreBoard);

        add(jScrollPane3);
        jScrollPane3.setBounds(30, 510, 480, 140);

        jLabel1.setFont(new java.awt.Font("Thibus29STru", 1, 18)); // NOI18N
        jLabel1.setText("        Swimming Competition");
        add(jLabel1);
        jLabel1.setBounds(350, 20, 340, 22);

        labelScoreBoard.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelScoreBoard.setText(" ScoreBoard:");
        add(labelScoreBoard);
        labelScoreBoard.setBounds(40, 480, 110, 17);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        labelTotalSwimmers.setToolTipText("Overall Game Statistics");
        labelTotalSwimmers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelTotalSwimmers);
        labelTotalSwimmers.setBounds(0, 0, 530, 20);

        labelFemaleSwimmers.setToolTipText("Overall Game Statistics");
        labelFemaleSwimmers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelFemaleSwimmers);
        labelFemaleSwimmers.setBounds(0, 20, 770, 20);

        labelMaleSwimmers.setToolTipText("Overall Game Statistics");
        labelMaleSwimmers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelMaleSwimmers);
        labelMaleSwimmers.setBounds(0, 40, 530, 20);

        labelJudges.setToolTipText("Overall Game Statistics");
        labelJudges.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelJudges);
        labelJudges.setBounds(0, 60, 530, 20);

        labelSpectators.setToolTipText("Overall Game Statistics");
        labelSpectators.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelSpectators);
        labelSpectators.setBounds(0, 80, 530, 20);

        labelStaff.setToolTipText("Overall Game Statistics");
        labelStaff.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(labelStaff);
        labelStaff.setBounds(0, 100, 630, 20);

        add(jPanel1);
        jPanel1.setBounds(520, 510, 530, 140);

        labelTime.setForeground(new java.awt.Color(0, 0, 204));
        labelTime.setToolTipText("Latest Swimming Competition");
        add(labelTime);
        labelTime.setBounds(150, 480, 350, 17);

        labelCurrentStats.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCurrentStats.setText("Current Statistics");
        add(labelCurrentStats);
        labelCurrentStats.setBounds(520, 480, 150, 17);

        labelSepectatorComments.setText("Spectator Comments");
        labelSepectatorComments.setToolTipText("We are waiting for the swimming competition to start!!");
        add(labelSepectatorComments);
        labelSepectatorComments.setBounds(40, 430, 150, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void addTracks() {
        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);
        tracks.add(track4);
        tracks.add(track5);
    }

    private void addTouchPads() {
        touchPads.add(touchPad1);
        touchPads.add(touchPad2);
        touchPads.add(touchPad3);
        touchPads.add(touchPad4);
        touchPads.add(touchPad5);
    }
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        try {
            if (isValidCompetition()) {
                SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
                this.labelTime.setText("\t\t" + CompetitionSelection.getSelectedGender() + " - " + CompetitionSelection.getSelectedStroke() + " : " + format.format(new Date()));
                this.labelTotalSwimmers.setText("Total No of Swimmers : " + SwimmingCompetition.getSwimmers().size());
                this.labelFemaleSwimmers.setText("No of Female Swimmers : " + SwimmingCompetition.getFemaleSwimmers().size());
                this.labelMaleSwimmers.setText("No of Male Swimmers : " + SwimmingCompetition.getMaleSwimmers().size());
                this.labelSpectators.setText("No of Spectators : " + SwimmingCompetition.getSpectator().size());
                this.labelJudges.setText("No of Judges : " + Judge.getNoOfJudges());
                this.labelStaff.setText("No of Supporting Staff : " + SupportingStaff.getStaffCounter());

                Image image = new ImageIcon(this.getClass().getResource("/uom/view/images/SpectatorBefore.jpg")).getImage();

                PavilionLayout pavilion = (PavilionLayout) BaseGUI.getSwimmingCompetitionLayout().getPanelPavilion();
                pavilion.changeLayout(image);
                
                 BaseGUI.getSwimmingCompetitionLayout().getLabelSepectatorComments().setToolTipText("Come on...(cheering)");

                resetScoreBoard();
                resetTouchPads();
                SwimmingCompetition.getRespovdibleJudge().blowTheWhistle();
            }
        } catch (Exception e) {
            Logger.getLogger(SwimmingCompetitionLayout.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private boolean isValidCompetition() {
        boolean valid = true;
        String selectedGender = CompetitionSelection.getSelectedGender();
        String selectedStroke = CompetitionSelection.getSelectedStroke();

        if (selectedGender == null || selectedStroke == null) {
            JOptionPane.showMessageDialog(this, "Please navigate through 'competition Selection'");
            valid = false;

        }
        return valid;
    }

    private void resetScoreBoard() {
        model = (DefaultTableModel) tblScoreBoard.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        List<Spectator> spectators = HelperService.getAllSpectators();
        if (spectators != null && !spectators.isEmpty()) {
            for (Spectator spectator : spectators) {
                SwimmingCompetition.getScoreBoard().addObserver(spectator);
            }
        }
    }

    private void resetTouchPads() {
        List<JPanel> touchPadPanels = getTouchPads();
        for (JPanel touchPadPanel : touchPadPanels) {
            TouchPadLayout touchPad = (TouchPadLayout) touchPadPanel;
            touchPad.resetTouchPad();
        }
    }

    private void btnShowresultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowresultsActionPerformed
        try {
            if (isValidCompetition()) {
                resetScoreBoard();

                String selectedGender = CompetitionSelection.getSelectedGender();
                model = (DefaultTableModel) tblScoreBoard.getModel();

                List<Swimmer> swimmers = null;

                if (selectedGender.equals(Constant.FEMALE)) {
                    swimmers = SwimmingCompetition.getFemaleSwimmers();
                } else {
                    swimmers = SwimmingCompetition.getMaleSwimmers();
                }

                if (swimmers != null && !swimmers.isEmpty()) {
                    Collections.sort(swimmers);
                    int competitionNo = HelperService.getNextCompetitionNumber();

                    for (int rank = 1; rank <= swimmers.size(); rank++) {
                        Object[] score = scoreBoard.getScoreUpdates(competitionNo, swimmers.get(rank - 1), rank);
                        model.addRow(score);
                    }
                }
            }
        } catch (Exception e) {
            Logger.getLogger(SwimmingCompetitionLayout.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_btnShowresultsActionPerformed

    public static List<JPanel> getTouchPads() {
        return touchPads;
    }

    public static List<JPanel> getTracks() {
        return tracks;
    }

    public JTable getTblScoreBoard() {
        return tblScoreBoard;
    }

    public JPanel getPanelPavilion() {
        return panelPavilion;
    }

    public JLabel getLabelSepectatorComments() {
        return labelSepectatorComments;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowresults;
    private static javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCurrentStats;
    private javax.swing.JLabel labelFemaleSwimmers;
    private javax.swing.JLabel labelJudges;
    private javax.swing.JLabel labelMaleSwimmers;
    private javax.swing.JLabel labelScoreBoard;
    private javax.swing.JLabel labelSepectatorComments;
    private javax.swing.JLabel labelSpectators;
    private javax.swing.JLabel labelStaff;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTotalSwimmers;
    private javax.swing.JPanel panelPavilion;
    private javax.swing.JPanel panelTrack;
    private javax.swing.JTable tblScoreBoard;
    private javax.swing.JPanel touchPad1;
    private javax.swing.JPanel touchPad2;
    private javax.swing.JPanel touchPad3;
    private javax.swing.JPanel touchPad4;
    private javax.swing.JPanel touchPad5;
    private javax.swing.JPanel track1;
    private javax.swing.JPanel track2;
    private javax.swing.JPanel track3;
    private javax.swing.JPanel track4;
    private javax.swing.JPanel track5;
    // End of variables declaration//GEN-END:variables

}
