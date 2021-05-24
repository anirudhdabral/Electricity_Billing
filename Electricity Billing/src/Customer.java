import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public final class Customer extends javax.swing.JFrame {

    Connection con;
    Statement stmt,stmt1,stmt2;
    ResultSet rs,rs1,rs2;
    int load,phn,wno,lr;
    String name,hno,query;
    String N,H,L,P,M;
    
    
    
    public Customer() {
        initComponents();
        reset();
       
     
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
    public final void displayRecord(){
    DefaultTableModel cust = (DefaultTableModel)
                CTable.getModel();
        try{con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
            stmt=con.createStatement();
            String query="SELECT * FROM CUSTDETAIL;";
            rs=stmt.executeQuery(query);
            while(rs.next())
             {
            name=rs.getString("NAME");
            hno=rs.getString("HOUSE_NO"); 
            phn=rs.getInt("PHONE");
            wno=rs.getInt("METER_NO"); 
            load=rs.getInt("LOAD_inWatt");
            lr=rs.getInt("LAST_READ");
                cust.addRow (new Object[] {name, hno,load,phn,wno,lr});
             }
           }
    catch(SQLException ec)
        {
            JOptionPane.showMessageDialog(this,ec);
        }
    }

    public final void reset(){
        
        updbtn.setEnabled(false);
        termnbtn.setEnabled(true);
         ntxt.setEditable(false);
        htxt.setEditable(false);
        ntxt.setEditable(false);
        ltxt.setEditable(false);
        ptxt.setEditable(false);
        mtxt.setVisible(false);
        ntxt.setText("");
        htxt.setText("");
        ntxt.setText("");
        ltxt.setText("");
        ptxt.setText("");
        mtxt.setText("");
        clear();
        
    }
    public final void clear(){
       DefaultTableModel model = (DefaultTableModel)
       CTable.getModel(); int rows=model.getRowCount();
        if (rows>0)
        {
            for (int i=0; i<rows; i++)
            model.removeRow(0); 
        }
    }
    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        termnbtn = new javax.swing.JButton();
        clsbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        HnoTxt1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        MnTxt1 = new javax.swing.JTextField();
        NTxt1 = new javax.swing.JTextField();
        scrbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CTable = new javax.swing.JTable();
        shbtn = new javax.swing.JButton();
        rstbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ntxt = new javax.swing.JTextField();
        htxt = new javax.swing.JTextField();
        ltxt = new javax.swing.JTextField();
        ptxt = new javax.swing.JTextField();
        mtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        termnbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        termnbtn.setForeground(new java.awt.Color(255, 0, 0));
        termnbtn.setText("TERMINATE Subscription");
        termnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termnbtnActionPerformed(evt);
            }
        });

        clsbtn.setBackground(new java.awt.Color(255, 102, 102));
        clsbtn.setText("Close");
        clsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel5.setText("CUSTOMER INFRORMATION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("House No.");

        HnoTxt1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Meter No.");

        NTxt1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        scrbtn.setText("Search");
        scrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrbtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HnoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrbtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(NTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(HnoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MnTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(scrbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        CTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "House No.", "Load", "Phone", "Meter No", "Last Reading"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CTable);

        shbtn.setBackground(new java.awt.Color(0, 204, 204));
        shbtn.setText("SHOW RECORDS");
        shbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shbtnActionPerformed(evt);
            }
        });

        rstbtn.setText("Reset");
        rstbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstbtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Name");

        jLabel2.setText("House No.");

        jLabel3.setText("Load");

        jLabel4.setText("Phone");

        updbtn.setBackground(new java.awt.Color(102, 255, 102));
        updbtn.setText("UPDATE");
        updbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updbtnActionPerformed(evt);
            }
        });

        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Update Here");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(ntxt))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(htxt))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ltxt)
                                    .addComponent(ptxt)
                                    .addComponent(mtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editbtn)
                    .addComponent(updbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(htxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rstbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(shbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(termnbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rstbtn)
                            .addComponent(clsbtn)
                            .addComponent(shbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(termnbtn))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updbtnActionPerformed
        N=ntxt.getText();
        H=htxt.getText();
        N=ntxt.getText();
        L=ltxt.getText();
        P=ptxt.getText();
        M=mtxt.getText();
        String query2; 
              try
               {
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
                   stmt1=con.createStatement();
                 
                      int code=JOptionPane.showConfirmDialog(this,"Are you sure you want to update this information?","Confirm?",JOptionPane.YES_NO_OPTION);
                      if(code==JOptionPane.YES_OPTION)
                       {
query2="UPDATE CUSTDETAIL SET NAME='" + N + "', HOUSE_NO = '" + H + "',PHONE=" + P + ",LOAD_inWatt="+ L + " WHERE METER_NO=" + M +";";
                         int ss=stmt1.executeUpdate(query2);
                         if(ss>0) JOptionPane.showMessageDialog(this,"Updation Successful!!");
                         else JOptionPane.showMessageDialog(this,"Incorect values entered");
                        }
               }
              catch(SQLException e){
                JOptionPane.showMessageDialog(this,e);
               }
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
            stmt=con.createStatement();
            String query="SELECT * FROM CUSTDETAIL;";
            rs=stmt.executeQuery(query);
            rs.next();
            displayRecord();
        }
        catch(SQLException ec)
        {
            JOptionPane.showMessageDialog(this, ec);
        }
    }//GEN-LAST:event_updbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        updbtn.setEnabled(true);
        termnbtn.setEnabled(false);
        ntxt.setEditable(true);
        htxt.setEditable(true);
        ntxt.setEditable(true);
        ltxt.setEditable(true);
        ptxt.setEditable(true);
        
    }//GEN-LAST:event_editbtnActionPerformed
                 
    private void termnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termnbtnActionPerformed
     reset();
       M=mtxt.getText();
     String query;
     Statement st;
     ResultSet r;
        try 
        {
            int code=JOptionPane.showConfirmDialog(this,"Are you sure you want to TERMINATE this Subscription?","Confirm?",JOptionPane.YES_NO_OPTION);
            if(code==JOptionPane.YES_OPTION)
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
                query="DELETE FROM CUSTDETAIL WHERE METER_NO='" + M +"';";
                st=con.createStatement();
                int c1=st.executeUpdate(query);
                if(c1>0) JOptionPane.showMessageDialog(this,"Updation Successful!!");   
            }
        }
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, ex);
        }
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
            stmt=con.createStatement();
            String quer="SELECT * FROM CUSTDETAIL;";
            rs=stmt.executeQuery(quer);
            displayRecord();
        }
        catch(SQLException ec)
        {
            JOptionPane.showMessageDialog(this, ec);
        } 
    }//GEN-LAST:event_termnbtnActionPerformed

    private void clsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsbtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_clsbtnActionPerformed

    private void scrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrbtnActionPerformed
       clear();
       String nm=NTxt1.getText(), hou=HnoTxt1.getText(),mn=MnTxt1.getText();
       Statement smt;
       String query1;
       query1="SELECT * FROM CUSTDETAIL WHERE NAME LIKE '%" + nm + "%' AND HOUSE_NO LIKE '%" + hou + "%' AND METER_NO LIKE '%" + mn +"%';"; 
       try
       {   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vista","root","");
           smt=con.createStatement();
           rs1=smt.executeQuery(query1);
               DefaultTableModel cust = (DefaultTableModel)
                CTable.getModel();
              
            while(rs1.next())
             {   name=rs1.getString("NAME");
                 hno=rs1.getString("HOUSE_NO"); 
                 phn=rs1.getInt("PHONE");
                 wno=rs1.getInt("METER_NO"); 
                 load=rs1.getInt("LOAD_inWatt");
                 lr=rs1.getInt("LAST_READ");
                   cust.addRow (new Object[] {name, hno,load,phn,wno,lr});
             }
              if(CTable.getRowCount()==0)JOptionPane.showMessageDialog(this,"No matching records");
              
       }
       catch(SQLException ex){
       JOptionPane.showMessageDialog(this,ex);
       }
    }//GEN-LAST:event_scrbtnActionPerformed

    private void rstbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstbtnActionPerformed
        NTxt1.setText("");
        HnoTxt1.setText("");
        MnTxt1.setText("");
        reset();
        
    }//GEN-LAST:event_rstbtnActionPerformed

    private void shbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shbtnActionPerformed
        clear();
        displayRecord();
    }//GEN-LAST:event_shbtnActionPerformed

    private void CTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CTableMouseClicked
        int i=CTable.getSelectedRow();
        TableModel vl = CTable.getModel();
        
        ntxt.setText(vl.getValueAt(i,0).toString());
        htxt.setText(vl.getValueAt(i,1).toString());
       ltxt.setText(vl.getValueAt(i,2).toString());
        ptxt.setText(vl.getValueAt(i,3).toString());
        mtxt.setText(vl.getValueAt(i,4).toString());
                
    }//GEN-LAST:event_CTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CTable;
    private javax.swing.JTextField HnoTxt1;
    private javax.swing.JTextField MnTxt1;
    private javax.swing.JTextField NTxt1;
    private javax.swing.JButton clsbtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JTextField htxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ltxt;
    private javax.swing.JTextField mtxt;
    private javax.swing.JTextField ntxt;
    private javax.swing.JTextField ptxt;
    private javax.swing.JButton rstbtn;
    private javax.swing.JButton scrbtn;
    private javax.swing.JButton shbtn;
    private javax.swing.JButton termnbtn;
    private javax.swing.JButton updbtn;
    // End of variables declaration//GEN-END:variables
}
