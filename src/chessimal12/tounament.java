/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * tounament.java
 *
 * Created on May 20, 2010, 10:38:36 AM
 */

package chessimal12;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class tounament extends javax.swing.JFrame {

    /** Creates new form tounament */
    public tounament() {
        initComponents();


         try {
            Connection con = DB.getMyConnection();
            Statement st = con.createStatement();
             ResultSet rs =  st.executeQuery("select* from groupstr");


                Vector v1 = new Vector();
                v1.add("select group");


           while ((rs.next())) {

            v1.add(rs.getString("grName"));
            group.setModel(new DefaultComboBoxModel(v1));

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tou = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        group = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        rem = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tournament  Details");
        setResizable(false);

        tou.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Held date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                touMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tou);
        tou.getColumnModel().getColumn(0).setPreferredWidth(20);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Tounament");

        group.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "group1" }));
        group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Complete Details"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Birthday", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 465, 103));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("Team");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 510, 19));

        jLabel6.setText("Organized by");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel8.setText("Email");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 53, -1));

        jLabel7.setText("Contact Person");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel12.setText("Age category");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setText("Date");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 37, -1));

        jLabel3.setText("Venue");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setText("Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel2.setText("Tounament");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel10.setText("Tounament ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 84, -1));
        jPanel2.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 86, 14));

        jLabel11.setText("Tel");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 34, -1));
        jPanel2.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 344, 16));
        jPanel2.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 150, 14));
        jPanel2.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 132, 16));
        jPanel2.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 118, 14));
        jPanel2.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 107, 14));
        jPanel2.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 156, 15));
        jPanel2.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 401, 14));
        jPanel2.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 156, 14));
        jPanel2.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 156, 14));
        jPanel2.add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 156, 14));

        rem.setText("Remove");
        rem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                        .addComponent(group, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rem)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(rem))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-556)/2, (screenSize.height-585)/2, 556, 585);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupActionPerformed
   try {
        DefaultTableModel df1 = (DefaultTableModel) tou.getModel();
        df1.setRowCount(0);

        Connection con = DB.getMyConnection();
            Statement st = con.createStatement();
             ResultSet rs =  st.executeQuery("select* from tounaments where groupe1 = '"+group.getSelectedItem().toString()+"'");



               


           while ((rs.next())) {
               Vector v1 = new Vector();

            v1.add(rs.getString("tounamentid"));
            v1.add(rs.getString("tounament"));
            v1.add(rs.getString("Date"));

           df1.addRow(v1);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
}//GEN-LAST:event_groupActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       try {
        DefaultTableModel df1 = (DefaultTableModel) tou.getModel();
        df1.setRowCount(0);

        Connection con = DB.getMyConnection();

            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery("select* from tounaments where groupe1 = '"+group.getSelectedItem().toString()+"' && tounament like '%"+jTextField1.getText()+"%'");

           while ((rs.next())) {
               Vector v1 = new Vector();

            v1.add(rs.getString("tounamentid"));
            v1.add(rs.getString("tounament"));
            v1.add(rs.getString("Date"));

           df1.addRow(v1);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void touMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_touMouseClicked
        try {

        Connection con = DB.getMyConnection();

            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery("select* from tounaments where tounamentid = '"+tou.getValueAt(tou.getSelectedRow(), 0).toString()+"' ");

           while ((rs.next())) {
               Vector v1 = new Vector();

            l1.setText(rs.getString("tounamentid"));
            l2.setText(rs.getString("tounament"));
            l8.setText(rs.getString("organized"));
            l3.setText(rs.getString("venue1"));
            l4.setText(rs.getString("venue2"));
            l5.setText(rs.getString("type"));
            l6.setText(rs.getString("ageCate"));
            l7.setText(rs.getString("Date"));
            l9.setText(rs.getString("contatctp"));
            l10.setText(rs.getString("email"));
            l11.setText(rs.getString("tel"));





            }

        } catch (Exception e) {
            System.out.println(e);
        }




          try {
        DefaultTableModel df1 = (DefaultTableModel) jTable1.getModel();
        df1.setRowCount(0);

        Connection con = DB.getMyConnection();

            Statement st = con.createStatement();
            ResultSet rs =  st.executeQuery("select* from students where stuid in (select stuid from tounamentplay where tounamentid = '"+tou.getValueAt(tou.getSelectedRow(), 0).toString()+"') ");

           while ((rs.next())) {
               Vector v1 = new Vector();

           v1.add(rs.getString("stuid"));
           v1.add(rs.getString("Nameinit"));
           v1.add(rs.getString("Birth"));
           v1.add(rs.getString("rating"));
           v1.add(rs.getString("stuid"));
           v1.add(rs.getString("stuid"));



           df1.addRow(v1);

            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_touMouseClicked

    private void remActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remActionPerformed
       String id123 = l1.getText();
       Object[] options = { "Yes", "No" };
        int respon = JOptionPane.showOptionDialog(null, "All the Details will be removed Are You Sure You want to Proceed", "Warning",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
if(respon==0){
        try {
            Statement st = DB.getMyConnection().createStatement();
            st.executeUpdate("delete from tounaments where tounamentid ='"+id123+"'");
            st.executeUpdate("delete from tounamentplay where tounamentid ='"+id123+"'");
        } catch (Exception e) {
        }
}
    }//GEN-LAST:event_remActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tounament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox group;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JButton rem;
    private javax.swing.JTable tou;
    // End of variables declaration//GEN-END:variables

}