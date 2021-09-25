
public class subjects extends javax.swing.JFrame {

    
    public subjects() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        java = new javax.swing.JRadioButton();
        am3 = new javax.swing.JRadioButton();
        ld = new javax.swing.JRadioButton();
        pcom = new javax.swing.JRadioButton();
        dbms = new javax.swing.JRadioButton();
        dsa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Choose One Subject");

        buttonGroup2.add(java);
        java.setText("JAVA");
        java.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaActionPerformed(evt);
            }
        });

        buttonGroup2.add(am3);
        am3.setText("AM 3");
        am3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                am3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(ld);
        ld.setText("LD");
        ld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldActionPerformed(evt);
            }
        });

        buttonGroup2.add(pcom);
        pcom.setText("PCOM");
        pcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcomActionPerformed(evt);
            }
        });

        buttonGroup2.add(dbms);
        dbms.setText("DBMS");

        buttonGroup2.add(dsa);
        dsa.setText("DSA");
        dsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dsa)
                    .addComponent(dbms)
                    .addComponent(pcom)
                    .addComponent(ld)
                    .addComponent(am3)
                    .addComponent(java))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(java)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(am3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dbms)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsa)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void javaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaActionPerformed
       OnlineTest ot=new OnlineTest();
       ot.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_javaActionPerformed

    private void am3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_am3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_am3ActionPerformed

    private void pcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:
       OnlineTestpcom ot2=new OnlineTestpcom();
       ot2.setVisible(true);
       setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_pcomActionPerformed

    private void ldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldActionPerformed
       OnlineTestLd ot1=new OnlineTestLd();
       ot1.setVisible(true);
       setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_ldActionPerformed

    private void dsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsaActionPerformed

    public static void main(String args[]) 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
       
       {
                new subjects().setVisible(true);
       }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton am3;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton dbms;
    private javax.swing.JRadioButton dsa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton java;
    private javax.swing.JRadioButton ld;
    private javax.swing.JRadioButton pcom;
    // End of variables declaration//GEN-END:variables
}
