/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package layouts;

import javax.swing.JButton;
import ui.AdminScreen;
import ui.AllEventsPage;
import ui.FavouritesScreen;
import ui.HomeScreen;
import ui.ListsScreen;
import ui.UserScreen;

/**
 *
 * @author vikas
 */
public class MainLayout extends javax.swing.JPanel {

    /**
     * Creates new form MainLayout
     */
    public MainLayout() {
        initComponents();
        pnlCenter.add(new AllEventsPage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pnlNav = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1200, 800));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.BorderLayout());

        pnlRoot.setPreferredSize(new java.awt.Dimension(1200, 800));
        pnlRoot.setRequestFocusEnabled(false);
        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(23, 25, 27));
        pnlSide.setPreferredSize(new java.awt.Dimension(80, 50));

        jPanel2.setBackground(new java.awt.Color(23, 25, 27));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlSide.add(jPanel2);

        jButton1.setBackground(new java.awt.Color(23, 25, 27));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/house-solid.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton1);

        jButton3.setBackground(new java.awt.Color(23, 25, 27));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list-solid.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton3);

        jButton4.setBackground(new java.awt.Color(23, 25, 27));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star-solid.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton4);

        jButton5.setBackground(new java.awt.Color(23, 25, 27));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-solid.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton5);

        jButton6.setBackground(new java.awt.Color(23, 25, 27));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus-solid (1).png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton6);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        pnlNav.setBackground(new java.awt.Color(20, 104, 171));
        pnlNav.setPreferredSize(new java.awt.Dimension(900, 50));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0);
        flowLayout1.setAlignOnBaseline(true);
        pnlNav.setLayout(flowLayout1);

        jPanel1.setBackground(new java.awt.Color(20, 104, 171));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 80));

        jLabel1.setFont(new java.awt.Font("Arima Koshi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/output-onlinepngtools.png"))); // NOI18N
        jLabel1.setText("HUSKY EVENTS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setIconTextGap(5);
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pnlNav.add(jPanel1);

        pnlRoot.add(pnlNav, java.awt.BorderLayout.PAGE_START);

        pnlCenter.setBackground(new java.awt.Color(231, 237, 239));
        pnlCenter.setPreferredSize(new java.awt.Dimension(1200, 750));
        pnlCenter.setLayout(new java.awt.BorderLayout());
        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        add(pnlRoot, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pnlCenter.removeAll();
        pnlCenter.revalidate();
        pnlCenter.repaint();
        
        pnlCenter.add(new AllEventsPage());
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         pnlCenter.removeAll();
        pnlCenter.revalidate();
        pnlCenter.repaint();
        pnlCenter.add(new ListsScreen());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        pnlCenter.removeAll();
        pnlCenter.revalidate();
        pnlCenter.repaint();
        pnlCenter.add(new FavouritesScreen());
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        pnlCenter.removeAll();
        pnlCenter.revalidate();
        pnlCenter.repaint();
        pnlCenter.add(new UserScreen());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        pnlCenter.removeAll();
        pnlCenter.revalidate();
        pnlCenter.repaint();
        pnlCenter.add(new AdminScreen());
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlNav;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
