/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Database.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.pool.OracleDataSource;
/**
 *
 * @author Sara
 */
public class SignNurseFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignNurseFrame
     */
    public SignNurseFrame() {
        initComponents();
        this.setDefaultCloseOperation(SignNurseFrame.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtRN_Name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtxtRN_NID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnRN_SignNurse = new javax.swing.JButton();
        jbtnRN_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setResizable(false);

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Name");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 204, 255), null, null));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Nurses Information ");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jtxtRN_NID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtRN_NID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtRN_NID.setEnabled(false);
        jtxtRN_NID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRN_NIDActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nurse ID");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 204, 255), null, null));

        jbtnRN_SignNurse.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbtnRN_SignNurse.setForeground(new java.awt.Color(102, 102, 255));
        jbtnRN_SignNurse.setText("Register");
        jbtnRN_SignNurse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), null, null));
        jbtnRN_SignNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRN_SignNurseActionPerformed(evt);
            }
        });

        jbtnRN_Clear.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jbtnRN_Clear.setForeground(new java.awt.Color(102, 102, 255));
        jbtnRN_Clear.setText("Clear");
        jbtnRN_Clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 0), null, null));
        jbtnRN_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRN_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jbtnRN_SignNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnRN_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jtxtRN_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(jtxtRN_NID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtRN_NID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtRN_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRN_SignNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRN_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtRN_NIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRN_NIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRN_NIDActionPerformed

    private void jbtnRN_SignNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRN_SignNurseActionPerformed
        this.Initializer();
        String Name;
        try {
            
            Name = this.jtxtRN_Name.getText();
            if(!Name.equals("")){
                this.tempNurse.setNursename(Name);
                this.tempNurse.setNid("N"+this.jtxtRN_NID.getText());
                this.tempReception.setRid("R"+FirstFrame.countNewRID);
                this.EM.getTransaction().begin();
                this.EM.persist(this.tempReception);
                this.EM.getTransaction().commit();
                this.tempNurse.setNurid(this.tempReception);
                this.EM.getTransaction().begin();
                this.EM.clear();
                this.EM.persist(this.tempNurse);
                this.EM.getTransaction().commit();
                this.EM.close();
                JOptionPane.showMessageDialog(rootPane, "Signed up Successfully");
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Enter The Required Information Correctly!");
                return;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnRN_SignNurseActionPerformed

    private void jbtnRN_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRN_ClearActionPerformed
        this.jtxtRN_Name.setText("");
    }//GEN-LAST:event_jbtnRN_ClearActionPerformed
    
    public static void viewNurse(){
        Connection con;
        InputStream input;
        JasperDesign jasperDesign;
        JasperReport jasperReport;
        JasperPrint jasperPrint;
        OutputStream output;
        OracleDataSource ods;
    try {
        ods=new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@192.168.1.117:1521:XE");
        ods.setUser("c##Aamer");
        ods.setPassword("Aamer154");
        con=ods.getConnection();
        input=new FileInputStream(new File("BloodBankJR_Nurse.jrxml"));
        jasperDesign=JRXmlLoader.load(input);
        jasperReport=JasperCompileManager.compileReport(jasperDesign);
        jasperPrint=JasperFillManager.fillReport(jasperReport, null, con); 
        if(jasperPrint.getPages().size() != 0){
            JFrame frame = new JFrame("Nurses Report");
            frame.getContentPane().add(new JRViewer(jasperPrint));
            frame.pack();
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setVisible(true);
        output= new FileOutputStream(new File("JR_SignedNurses.pdf"));
        JasperExportManager.exportReportToPdfStream(jasperPrint,output);
        JOptionPane.showMessageDialog(null, "PDF File Was Generated Successfully!");
        }
        else{
            JOptionPane.showMessageDialog(null, "No available units for the following blood type!");
        }
    }   
    catch (Exception ex) {
        ex.printStackTrace();   
    }
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignNurseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignNurseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignNurseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignNurseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignNurseFrame().setVisible(true);
            }
        });
    }
    public void Initializer(){
        	emf = Persistence.createEntityManagerFactory("com.mycompany_BloodDonationProgram_jar_1.0-SNAPSHOTPU");
        	EM = emf.createEntityManager();
        	tempDonator=new Donators();
        	tempReception = new Reception();
        	tempPatient=new Patients();
        	tempNurse = new Nurses();
        	tempLab = new Lab();
        	tempBloodbank = new Bloodbank();
     	}
    public EntityManagerFactory emf;
    public EntityManager EM;
    public Donators tempDonator;
    public Reception tempReception;
    public Patients tempPatient;
    public Nurses tempNurse;
    public Lab tempLab;
    public Bloodbank tempBloodbank;
    public Query tempQuery;
    public int countNewDID_DRegister,countNewRID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbtnRN_Clear;
    private javax.swing.JButton jbtnRN_SignNurse;
    public javax.swing.JTextField jtxtRN_NID;
    private javax.swing.JTextField jtxtRN_Name;
    // End of variables declaration//GEN-END:variables
}
