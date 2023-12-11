
package ThongKe;

import Utils.Auth;

/**
 *
 * @author mtsst
 */
public class ThongKeForm extends javax.swing.JPanel {

    /**
     * Creates new form ThongKe
     */
    public ThongKeForm() {
        initComponents();
        if(!Auth.isMG()){
            jTabbedPane1.remove(1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        doanhThu1 = new ThongKe.DoanhThu();
        monBanChay1 = new ThongKe.MonBanChay();
        monBanChay2 = new ThongKe.MonBanChay();

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTabbedPane1.addTab("Doanh Thu     ", doanhThu1);

        javax.swing.GroupLayout monBanChay1Layout = new javax.swing.GroupLayout(monBanChay1);
        monBanChay1.setLayout(monBanChay1Layout);
        monBanChay1Layout.setHorizontalGroup(
            monBanChay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monBanChay1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monBanChay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        monBanChay1Layout.setVerticalGroup(
            monBanChay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monBanChay1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monBanChay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        jTabbedPane1.addTab("Món Bán Chạy", monBanChay1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ThongKe.DoanhThu doanhThu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private ThongKe.MonBanChay monBanChay1;
    private ThongKe.MonBanChay monBanChay2;
    // End of variables declaration//GEN-END:variables
}
