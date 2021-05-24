import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Payment extends javax.swing.JFrame {
  

    Connection con;
    Statement stmt,stmt1,stmt2,stmt3;
    ResultSet rs,rs1,rs2,rs3;
    int mno,read;
    double am;
    String date,query,query2;
    
    public Payment() {
        initComponents(); 
    }
    
    public final void displayrec(){
    try{
         while(rs.next())
        {   date=rs.getString("PAY_DATE");
            read=rs.getInt("READING");
            am=rs.getInt("AMT");
            mno=rs.getInt("METER_NO"); 
            DefaultTableModel cust = (DefaultTableModel)
            PayTable.getModel();
            cust.addRow (new Object[] {mno, read,date,am});
            
        }
       }
    catch(SQLException ec) {JOptionPane.showMessageDialog(this,ec);}
    }
    
    
    public final void clear(){
       DefaultTableModel model = (DefaultTableModel)
       PayTable.getModel(); int rows=model.getRowCount();
        if (rows>0)
        {   for (int i=0; i<rows; i++)
            model.removeRow(0); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        srchbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        MnoTxt1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PayTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MnoTxt = new javax.swing.JTextField();
        RngTxt = new javax.swing.JTextField();
        CalcAmt = new javax.swing.JButton();
        dtchs = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        resbtn = new javax.swing.JButton();
        clsbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel4.setText("PAYMENT");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        srchbtn.setText("Search");
        srchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchbtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Meter No.");

        PayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meter No.", "Reading", "Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PayTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(MnoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(srchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MnoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(srchbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setText(" ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pay Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setText("Meter No.");

        jLabel3.setText("Reading");

        CalcAmt.setBackground(new java.awt.Color(102, 255, 102));
        CalcAmt.setText("Calculate Amount");
        CalcAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcAmtActionPerformed(evt);
            }
        });

        jLabel2.setText("Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalcAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RngTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtchs, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(MnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dtchs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(RngTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CalcAmt)
                .addContainerGap())
        );

        resbtn.setText("Reset");
        resbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resbtnActionPerformed(evt);
            }
        });

        clsbtn.setBackground(new java.awt.Color(255, 102, 102));
        clsbtn.setText("Close");
        clsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resbtn)
                            .addComponent(clsbtn))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcAmtActionPerformed
 int mno;
 SimpleDateFormat dform=new SimpleDateFormat("yyyy-MM-dd");
 String date = dform.format(dtchs.getDate());
 double nrd,amt=0,lrd=0,rd; 
 mno=Integer.parseInt(MnoTxt.getText());
 nrd=Double.parseDouble(RngTxt.getText());
     
      String query="SELECT * FROM CUSTDETAIL;"; 
      String queryy="SELECT * FROM PAYMENT WHERE METER_NO=" + mno + ";";
      String query1,query2; 
      
      try 
         {
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
      stmt3=con.createStatement();
      String query3="SELECT * FROM CUSTDETAIL WHERE METER_NO=" + mno +";";
      rs3=stmt3.executeQuery(query3);
      rs3.next();
      String naam=rs3.getString("NAME");
      lrd=rs3.getInt("LAST_READ");
      if(nrd>lrd  && nrd>=0){
      rd=nrd-lrd;
      if (rd<=400)
 { amt=(rd*6)+200;
   JOptionPane.showMessageDialog(this,"Name of Customer = "+naam+"\nCurrent reading = "+nrd+"\nLast Reading = "+lrd+"\nUnits charged for = " + rd + "\n" + "Amount to be paid = " + amt + "\n" + "Charge per unit = Rs.6.00\nFixed Charge = Rs.200");
 }
     else 
 { amt=(rd*6.5)+250;
   JOptionPane.showMessageDialog(this,"Name of Customer = "+naam+"\nCurrent reading = "+nrd+"\nLast Reading = "+lrd+"\nUnits charged for = " + rd + "\n" + "Amount to be paid = " + amt + "\n" + "Charge per unit = Rs.6.50\nFixed Charge = Rs.250");
 }
          stmt1=con.createStatement();
          rs1=stmt1.executeQuery(queryy);
             int code=JOptionPane.showConfirmDialog(this,"Is amount paid?","Confirm?",JOptionPane.YES_NO_OPTION);
             if(code==JOptionPane.YES_OPTION)
               { query1="UPDATE CUSTDETAIL SET LAST_READ=" + nrd + "WHERE METER_NO=" + mno +";";
                 query2="INSERT INTO PAYMENT VALUES("+ mno+","+rd+",'"+date+"',"+amt+");";
                 int ss=stmt1.executeUpdate(query1);
                 if(ss>0) {JOptionPane.showMessageDialog(this,"Updation Successful!!");
                           int st=stmt1.executeUpdate(query2);
                 }
                 else      JOptionPane.showMessageDialog(this,"Meter Number not Registered");
               }
            
         }else      JOptionPane.showMessageDialog(this,"Reading Incorrect");
         }
              catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Meter Number not Registered");
               }
      MnoTxt.setText("");
      RngTxt.setText("");
      dtchs.setDate(null);
    }//GEN-LAST:event_CalcAmtActionPerformed

    private void clsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsbtnActionPerformed
         this.dispose();
    }//GEN-LAST:event_clsbtnActionPerformed

    private void srchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchbtnActionPerformed
        
        clear();  
        CalcAmt.setEnabled(false);
        String  mn=MnoTxt1.getText();
        Statement smt;
        String query1,query2;
        query1="SELECT * FROM PAYMENT WHERE METER_NO LIKE '%" + mn + "%' ORDER BY PAY_DATE DESC;";
        
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
            smt=con.createStatement();
            rs=smt.executeQuery(query1);
            displayrec();
            if(PayTable.getRowCount()==0)
                JOptionPane.showMessageDialog(this,"No Matching Records Found!!!");
                                
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
    }//GEN-LAST:event_srchbtnActionPerformed

    private void resbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resbtnActionPerformed
        MnoTxt1.setText("");
        MnoTxt.setText("");
        RngTxt.setText("");
        dtchs.setDate(null);
        CalcAmt.setEnabled(true);
        clear();
    }//GEN-LAST:event_resbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcAmt;
    private javax.swing.JTextField MnoTxt;
    private javax.swing.JTextField MnoTxt1;
    private javax.swing.JTable PayTable;
    private javax.swing.JTextField RngTxt;
    private javax.swing.JButton clsbtn;
    private com.toedter.calendar.JDateChooser dtchs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resbtn;
    private javax.swing.JButton srchbtn;
    // End of variables declaration//GEN-END:variables
}
