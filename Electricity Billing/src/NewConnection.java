import java.sql.*;
import javax.swing.JOptionPane;
public final class NewConnection extends javax.swing.JFrame {

    Connection con;
    Statement stmt,stmt1;
    ResultSet rs,rs1;
    int load,phn,wno,lr;
    String name,hno;
    public NewConnection() {
        initComponents();
      try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
            stmt=con.createStatement();
            String query="SELECT * FROM CUSTDETAIL;";
            rs=stmt.executeQuery(query);
            rs.next();   
        }
        catch(SQLException ec)
        {
            JOptionPane.showMessageDialog(this, ec);
        } 
    }
    public final void clear(){
        NTxt.setText("");
        LTxt.setText("");
        HnoTxt.setText("");
        PTxt.setText("");
        MnTxt.setText("");
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clsbtn = new javax.swing.JButton();
        NTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HnoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LTxt = new javax.swing.JTextField();
        PTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MnTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clsbtn.setBackground(new java.awt.Color(255, 102, 102));
        clsbtn.setText("Cancel");
        clsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(clsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 80, 60));

        NTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NTxtActionPerformed(evt);
            }
        });
        getContentPane().add(NTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("House No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        HnoTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(HnoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Load");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 55, -1));

        LTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(LTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        PTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(PTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Phone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Meter No.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 62, 20));
        getContentPane().add(MnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel5.setText("NEW CONNECTION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Addbtn.setText("ADD");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 80, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 130, 150));

        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 20, -1));

        jLabel9.setText(" ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 170, 0, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_clsbtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
    int ramt=JOptionPane.showConfirmDialog(this,"Registration amount = Rs.1000","Confirm?",JOptionPane.YES_NO_OPTION);
                 if(ramt==JOptionPane.YES_OPTION)
{
        String nm=NTxt.getText(), hou=HnoTxt.getText();
    int ld=Integer.parseInt(LTxt.getText()), ph=Integer.parseInt(PTxt.getText()), mn=Integer.parseInt(MnTxt.getText());
            String query1="SELECT * FROM CUSTDETAIL WHERE METER_NO=" + mn + ";";
            String query2; 
        try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
             stmt1=con.createStatement();
             rs1=stmt1.executeQuery(query1);
              if(!(rs1.next())) 
                {
                 int code=JOptionPane.showConfirmDialog(this,"Insert Record?","Confirm?",JOptionPane.YES_NO_OPTION);
                 if(code==JOptionPane.YES_OPTION)
                   {
                    query2="INSERT INTO CUSTDETAIL VALUES('" + nm + "','" + hou + "'," + ph + "," + ld + "," + mn + ",NULL);";
                    int ss=stmt1.executeUpdate(query2);
                    if(ss>0) JOptionPane.showMessageDialog(this,"Updation Successful!!");
                    else     JOptionPane.showMessageDialog(this,"Meter number already exists");
                    clear();
                   }
                }
                 else {JOptionPane.showMessageDialog(this,"Meter number already exists");}
            }
              catch(SQLException e){
                JOptionPane.showMessageDialog(this,e);
               }
}
    }//GEN-LAST:event_AddbtnActionPerformed

    private void NTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField HnoTxt;
    private javax.swing.JTextField LTxt;
    private javax.swing.JTextField MnTxt;
    private javax.swing.JTextField NTxt;
    private javax.swing.JTextField PTxt;
    private javax.swing.JButton clsbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
