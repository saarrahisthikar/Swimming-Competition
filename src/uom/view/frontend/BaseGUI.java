package uom.view.frontend;

import javax.swing.JPanel;

/**
 * Base UI component to generate the VIEW to the user.
 *
 * - On demand construction of views.
 *
 * - Each view generation is delegated to each responsible classes.
 *
 */
public class BaseGUI extends javax.swing.JFrame {
    
    private static SwimmingCompetitionLayout swimmingCompetitionLayout;
    
    public BaseGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        swimmingCompetitionLayout= new uom.view.frontend.SwimmingCompetitionLayout();
        panelMain.add(swimmingCompetitionLayout);

        menuBar = new javax.swing.JMenuBar();
        menuRegistration = new javax.swing.JMenu();
        menuTickets = new javax.swing.JMenu();
        menuCompetitionSelection = new javax.swing.JMenu();
        menuResults = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setLayout(new java.awt.CardLayout());

        menuRegistration.setText("Registration");
        menuRegistration.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuRegistrationMenuSelected(evt);
            }
        });
        menuBar.add(menuRegistration);

        menuTickets.setText("Tickets");
        menuTickets.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuTicketsMenuSelected(evt);
            }
        });
        menuBar.add(menuTickets);

        menuCompetitionSelection.setText("Compete");
        menuCompetitionSelection.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuCompetitionSelectionMenuSelected(evt);
            }
        });
        menuBar.add(menuCompetitionSelection);

        menuResults.setText("Results");
        menuResults.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuResultsMenuSelected(evt);
            }
        });
        menuBar.add(menuResults);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRegistrationMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuRegistrationMenuSelected
        Registration registration = new Registration();
        buildPanel(registration);
    }//GEN-LAST:event_menuRegistrationMenuSelected

    private void menuCompetitionSelectionMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuCompetitionSelectionMenuSelected
        CompetitionSelection competitionSelection = new CompetitionSelection();
        buildPanel(competitionSelection);
    }//GEN-LAST:event_menuCompetitionSelectionMenuSelected

    private void menuTicketsMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuTicketsMenuSelected
        TicketCounter spectator = new TicketCounter();
        buildPanel(spectator);
    }//GEN-LAST:event_menuTicketsMenuSelected

    private void menuResultsMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuResultsMenuSelected
        ResultsUpdate resultsUpdate = new ResultsUpdate();
        buildPanel(resultsUpdate);
        
    }//GEN-LAST:event_menuResultsMenuSelected

//Helper functions
    private void buildPanel(JPanel component) {
        //removing the existing components in the main panel
        this.panelMain.removeAll();
        this.panelMain.repaint();
        this.panelMain.revalidate();

        //generating and repaint the given component in the main panel
        this.panelMain.add(component);
        this.panelMain.repaint();
        this.panelMain.revalidate();
    }
    
    public static SwimmingCompetitionLayout getSwimmingCompetitionLayout() {
        return swimmingCompetitionLayout;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCompetitionSelection;
    private javax.swing.JMenu menuRegistration;
    private javax.swing.JMenu menuResults;
    private javax.swing.JMenu menuTickets;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables

}
