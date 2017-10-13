
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class departments extends javax.swing.JInternalFrame {

    /**
     * Creates new form departments
     */
    Connection con;
    public departments(Connection con) {
        initComponents();
        
        this.con = con;
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnum = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        depTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setClosable(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel1.setText("Department Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 140, 20);

        txtdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtdname);
        txtdname.setBounds(187, 47, 162, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setText("Department Code");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 100, 110, 20);

        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtcode);
        txtcode.setBounds(187, 100, 162, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel3.setText("Number of Employees");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 150, 140, 20);

        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });
        jPanel1.add(txtnum);
        txtnum.setBounds(187, 143, 162, 25);

        btnAdd.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(120, 200, 60, 29);

        btnModify.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify);
        btnModify.setBounds(210, 200, 80, 29);

        btnDel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel1.add(btnDel);
        btnDel.setBounds(320, 200, 80, 30);

        btnNew.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);
        btnNew.setBounds(23, 200, 60, 29);

        depTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        depTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(depTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 270, 385, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 30, 440, 410);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/as.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 10, 600, 450);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 710, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
      void fillTable()
    {
        try
        {
        Vector heading=new Vector();
        heading.add("Department Name");
        heading.add("Department Code");
        heading.add("Number of Employees");
        
        
        String query="select * from department";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        Vector data=new Vector();
        while(rs.next())
        {
            Vector row=new Vector();
            row.add(rs.getString("dname"));
            row.add(rs.getString("dcode"));
            row.add(rs.getString("nemployee"));
           
            
            data.add(row);
         }
            DefaultTableModel df=new DefaultTableModel(data,heading);
            depTable.setModel(df);
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }

        
    private void txtdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdnameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String dname = txtdname.getText();
            String dcode = txtcode.getText();
            
           
            String nemployee = txtnum.getText();
            
            String sql = "insert into department (dname,dcode,nemployee) values(?,?,?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, dname);
            p.setString(2, dcode);
            p.setString(3, nemployee);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Data Saved");
            fillTable();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(departments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
          try
        {
           
       
            String dname1=txtdname.getText();
        String dcode1 = txtcode.getText();
        String nemployee1=txtnum.getText();
        
           
        String sql = "update department set dname=?,nemployee=? where dcode =? ";

        PreparedStatement p = con.prepareStatement(sql);

        p.setString(1, dname1);
  p.setString(2, nemployee1);
  p.setString(3,dcode1);
  
        p.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Updated");  
        fillTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }  
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void depTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depTableMouseClicked
        int rowindex = depTable.getSelectedRow();
        TableModel tm = depTable.getModel();

        String dname = (String) tm.getValueAt(rowindex, 0);
      
        String dcode = (String) tm.getValueAt(rowindex, 1);
        
       String nemployee = (String)tm.getValueAt(rowindex,2);
        
    txtdname.setText(dname);
    txtcode.setText(dcode);
    txtnum.setText(nemployee);
        
        
        
        
    }//GEN-LAST:event_depTableMouseClicked

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
     try
        {
            String dcode=txtcode.getText();
       
        String sql = "delete from  department where dcode=?";

        PreparedStatement p = con.prepareStatement(sql);
 p.setString(1, dcode);
        p.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Deleted");  
        fillTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }  
              
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtdname.setText("");
        txtcode.setText("");
        txtnum.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNew;
    private javax.swing.JTable depTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdname;
    private javax.swing.JTextField txtnum;
    // End of variables declaration//GEN-END:variables
}