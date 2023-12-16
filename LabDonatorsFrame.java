/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Database.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Sara
 */
public class LabDonatorsFrame extends javax.swing.JFrame {

    /**
     * Creates new form LabForDonators
     */
    public LabDonatorsFrame() {
        initComponents();
        this.setDefaultCloseOperation(LabDonatorsFrame.HIDE_ON_CLOSE);
        this.jtxtLD_Quantity.setInputVerifier(FirstFrame.tempVerifierQuantity);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtLD_DID = new javax.swing.JTextField();
        jcobLD_bloodType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jchboxLD_HC = new javax.swing.JCheckBox();
        jbtnLD_Submit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtLD_Quantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donators Test");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Donator's ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose The proper Blood Type:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ability to donate:");

        jcobLD_bloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "AB+", "AB-", "B+", "B-", "O+", "O-" }));
        jcobLD_bloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcobLD_bloodTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("ACCORDING TO THE TESTS FILL IN THE FOLLOWING:");

        jchboxLD_HC.setText("Able To Donate");

        jbtnLD_Submit.setText("Submit");
        jbtnLD_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLD_SubmitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");

        jtxtLD_Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLD_QuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jbtnLD_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtLD_DID)
                                    .addComponent(jcobLD_bloodType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jchboxLD_HC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtLD_Quantity))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtLD_DID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcobLD_bloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jchboxLD_HC))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtLD_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jbtnLD_Submit)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcobLD_bloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcobLD_bloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcobLD_bloodTypeActionPerformed

    private void jtxtLD_QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLD_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLD_QuantityActionPerformed

    private void jbtnLD_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLD_SubmitActionPerformed
        this.Initializer();
        Date tempDate; 
        String url,user,pass;
        Connection con = null;
        String LID="";
        Statement stm = null;
        LocalDate tempLocal;
        if(EM.createNamedQuery("Donators.findByDid").setParameter("did", this.jtxtLD_DID.getText()).getResultList().size() > 0 && !this.jtxtLD_Quantity.getText().equals("0")){
            tempDate = (Date)(EM.createNamedQuery("Donators.findLastDonationDate").setParameter("did", this.jtxtLD_DID.getText()).getResultList().get(0));
            tempLocal = tempDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LID = ("L"+(1+Integer.parseInt(EM.createNamedQuery("Lab.findNewLID").getResultList().get(0).toString())));
                String BloodType = (this.jcobLD_bloodType.getSelectedItem().toString());
                if(this.jchboxLD_HC.isSelected() && (Period.between(tempLocal, LocalDate.now()).toTotalMonths() >= 2)){
                    EM.getTransaction().begin();
                    this.tempLab.setBloodtype(BloodType);
                    this.tempLab.setHealthcond("Healthy");
                    this.tempLab.setLabrid(null);
                    this.tempLab.setLid(LID);
            }
            else if(this.jchboxLD_HC.isSelected()){
                JOptionPane.showMessageDialog(null, "Please come back whenever your pass two months since your last donation!");
                    EM.getTransaction().begin();
                    this.tempLab.setBloodtype(BloodType);
                    this.tempLab.setHealthcond("Healthy");
                    this.tempLab.setLabrid(null);
                    this.tempLab.setLid(LID);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Please come back whenever you get Healthy!");
                    EM.getTransaction().begin();
                    this.tempLab.setBloodtype(BloodType);
                    this.tempLab.setHealthcond("Sick");
                    this.tempLab.setLabrid(null);
                    this.tempLab.setLid(LID);
            }
                    EM.persist(this.tempLab);
                    EM.getTransaction().commit();
            if(this.jchboxLD_HC.isSelected() && (Period.between(tempLocal, LocalDate.now()).toTotalMonths() >= 2)){
                this.tempBloodbank.setBlid(this.tempLab);
                this.tempBloodbank.setBid("B"+(1+Integer.parseInt(EM.createNamedQuery("Bloodbank.findLastBID").getResultList().get(0).toString())));
                this.tempBloodbank.setBloodtype(this.jcobLD_bloodType.getSelectedItem().toString());
                this.tempBloodbank.setEntrydate(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                this.tempBloodbank.setExpirydate(Date.from(LocalDate.now().plusDays(42).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                this.tempBloodbank.setQuantity(BigInteger.valueOf(Long.parseLong(this.jtxtLD_Quantity.getText())));
                EM.getTransaction().begin();
                EM.clear();
                EM.persist(this.tempBloodbank);
                EM.getTransaction().commit();
                EM.getTransaction().begin();
                EM.clear();
                EM.createQuery("UPDATE Donators SET lastdonationdate = '"
                + LocalDate.now().getYear() + "-" + LocalDate.now().getMonthValue() + "-" + LocalDate.now().getDayOfMonth()
                + "' WHERE did = :DIDPar").setParameter("DIDPar", this.jtxtLD_DID.getText()).executeUpdate();
                EM.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "Donated Successfully!");
            }
            else{
                JOptionPane.showMessageDialog(null, "TEST");
            }
            EM.close();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter valid Donator ID and Quantity between 1-9!");
        }        
    }//GEN-LAST:event_jbtnLD_SubmitActionPerformed
//"TO_DATE('" +LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/" + LocalDate.now().getYear() + "','DD/MM/YYYY')" 

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
            java.util.logging.Logger.getLogger(LabDonatorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabDonatorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabDonatorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabDonatorsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabDonatorsFrame().setVisible(true);
            }
        });
    }

    public void Initializer() {
        emf = Persistence.createEntityManagerFactory("com.mycompany_BloodDonationProgram_jar_1.0-SNAPSHOTPU");
        EM = emf.createEntityManager();
        tempDonator = new Donators();
        tempReception = new Reception();
        tempPatient = new Patients();
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
    public int countNewDID_DRegister, countNewRID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnLD_Submit;
    private javax.swing.JCheckBox jchboxLD_HC;
    private javax.swing.JComboBox<String> jcobLD_bloodType;
    private javax.swing.JTextField jtxtLD_DID;
    private javax.swing.JTextField jtxtLD_Quantity;
    // End of variables declaration//GEN-END:variables
}
