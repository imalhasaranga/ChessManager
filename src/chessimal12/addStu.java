/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addStu.java
 *
 * Created on May 19, 2010, 7:31:04 PM
 */

package chessimal12;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class addStu extends javax.swing.JFrame {
int pressedbutton =0;

    void  myfile(ImageIcon filepath){
     try {
            
            l1.setIcon(filepath);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    /** Creates new form addStu */
    public addStu() {
        

        initComponents();
        DB.ChangeJframeImage(this);
        id.setEditable(false);
        jdate2.setDate(new Date());
        jdate1.setDate(new Date());
        b13.setEnabled(false);
        b14.setEnabled(false);

         try {
            Connection con = DB.getMyConnection();
            Statement st = con.createStatement();
             ResultSet rs =  st.executeQuery("select* from groupstr");


                Vector v1 = new Vector();
                v1.add("select Group");
           while ((rs.next())) {

            v1.add(rs.getString("grName"));
            group1.setModel(new DefaultComboBoxModel(v1));

            }
        } catch (Exception e) {
            System.out.println(e);
        }

          try {
            Connection con = DB.getMyConnection();
            Statement st = con.createStatement();
             ResultSet rs =  st.executeQuery("select MAX(StuID) as id from students");




           if((rs.next())) {

           id.setText(String.valueOf(rs.getInt("id")+1));

            }
        } catch (Exception e) {
            System.out.println(e+"gfgf");
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

        jLabel4 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        group1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Name1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Name2 = new javax.swing.JTextField();
        Name3 = new javax.swing.JTextField();
        jdate1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jdate2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        rating = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        age1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        b16 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();

        jLabel4.setText("jLabel4");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFocusGained(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 202, 30, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Age  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 204, 30, -1));

        jLabel8.setText("Group*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 236, -1, 20));

        group1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select Group" }));
        group1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                group1MouseClicked(evt);
            }
        });
        group1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                group1ActionPerformed(evt);
            }
        });
        jPanel1.add(group1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 236, 250, -1));

        jLabel2.setText("Name with Initials *");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 60, -1, -1));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, -1));

        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 250, -1));

        jLabel5.setText("Adress");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 144, -1, -1));
        jPanel1.add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 144, 176, -1));
        jPanel1.add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 176, -1));

        jdate1.setDateFormatString("yyyy,MM,dd");
        jdate1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jdate1FocusLost(evt);
            }
        });
        jPanel1.add(jdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 180, -1));

        jLabel6.setText("Birth Day*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel9.setText("Student ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 39, -1, -1));

        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 79, -1));

        jLabel10.setText("Joind Date*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jdate2.setDateFormatString("yyyy,MM,dd");
        jPanel1.add(jdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 176, -1));

        jLabel11.setText("Rating*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));

        rating.setText("1500");
        rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingActionPerformed(evt);
            }
        });
        rating.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ratingKeyTyped(evt);
            }
        });
        jPanel1.add(rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 71, -1));

        jLabel12.setText("Tel");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 369, -1, -1));

        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 135, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton1.setText("Insert Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 100, -1));

        b12.setText("Add");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 70, -1));

        b13.setText("Change");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        jPanel1.add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 80, -1));

        b14.setText("Delete");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        jPanel1.add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 75, -1));

        b15.setText("Back");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        jPanel1.add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 74, -1));

        jLabel13.setText("FIDE Rating");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 66, 20));

        age1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                age1KeyTyped(evt);
            }
        });
        jPanel1.add(age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 71, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/no-user.jpg"))); // NOI18N
        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 210, 220));

        b16.setText("clear");
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        jPanel1.add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 80, -1));

        jRadioButton2.setText("Change Details");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 20));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton3.setText("Default");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 100, -1));

        jLabel1.setText("Gender");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        buttonGroup1.add(female);
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 116, 90, -1));

        buttonGroup1.add(male);
        male.setSelected(true);
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 116, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-638)/2, (screenSize.height-501)/2, 638, 501);
    }// </editor-fold>//GEN-END:initComponents

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
      this.setVisible(false);
      new students1().setVisible(true);
    }//GEN-LAST:event_b15ActionPerformed

    private void ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed

        String Gender = male.isSelected() ? "Male" : "Female";

        File f1;
        try {
           f1  =jfilechose.file1;
            System.out.println(f1.toString());

        } catch (Exception e) {
            f1 = new File("C:/WINDOWS/Chess/no-user.jpg");
            System.out.println(f1.toString());
        }
    String groups = group1.getSelectedItem().toString();
    DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
    String datebirth = dateformat.format(jdate1.getDate());
    String datejoind = dateformat.format(jdate2.getDate());

    File f = f1;
    System.out.println(f1.toString());
     FileInputStream in;



    if( !groups.equals("select Group") & !Name.getText().isEmpty() & !dateformat.format(jdate1.getDate()).equals(dateformat.format(new Date())) & !rating.getText().isEmpty() & !jRadioButton2.isSelected()){
              
        try {

            in = new FileInputStream(f);
            byte[] image = new byte[(int) f.length()];
            in.read(image);

 


           Connection con = DB.getMyConnection();
           Statement st = con.createStatement();
        // st.executeUpdate("insert into students values('"+id.getText()+"','"+Name.getText()+"','"+Name1.getText()+"','"+Name2.getText()+"','"+Name3.getText()+"','"+datebirth+"','"+age.getText()+"','"+groups+"','"+datejoind+"','"+rating.getText()+"','"+age1.getText()+"','"+tel.getText()+"','"+l1.getText()+"')");
         String sql = "insert into students(image,StuID,Nameinit,Namefull,Adress1,Adress2,Birth,age,groupStu,joindDate,rating,fiderating,tel,Gender) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

         PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
         stmt.setBytes(1, image);
         stmt.setString(2, id.getText());
         stmt.setString(3, Name.getText());
         stmt.setString(4, Name1.getText());
         stmt.setString(5, Name2.getText());
         stmt.setString(6, Name3.getText());
         stmt.setString(7, datebirth);
         stmt.setString(8, age.getText());
         stmt.setString(9, groups);
         stmt.setString(10, datejoind);
         stmt.setString(11, rating.getText());
         stmt.setString(12, age1.getText());
         stmt.setString(13, tel.getText());
         stmt.setString(14, Gender);
         stmt.executeUpdate();
         stmt.close();

         st.executeUpdate("insert into atten values('"+id.getText()+"','"+datejoind+"','1')");
         JOptionPane.showMessageDialog(null, "student added");
        } catch (Exception e) {
            System.out.println(e+"gg");
        }
        id.setText(String.valueOf(Integer.parseInt(id.getText())+1));
    }else{
    JOptionPane.showMessageDialog(null,"Important Details are not filled or Change Details RedioButton is selected");
    }


        
    }//GEN-LAST:event_b12ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        Name.setText("");
        Name1.setText("");
          Name2.setText("");
           Name3.setText("");
          age.setText("");
             age1.setText("");
        tel.setText("");
        l1.setText("");
        jdate1.setDate(new Date());
        jdate2.setDate(new Date());
       
           

    }//GEN-LAST:event_b16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   jfilechose jf1 = new jfilechose();
   jf1.setVisible(true);
   jf1.myfile1(this);
   pressedbutton =2;

   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
         String groups1 = group1.getSelectedItem().toString();
         String Gende1 = male.isSelected() ? "Male" : "Female";

        String filesituation = String.valueOf(jfilechose.file1);
        System.out.println(filesituation);
        if(filesituation.equals("null")){
           

        }else{
        File f  =jfilechose.file1;
           
            try {
                if(pressedbutton ==2){
                    f  =jfilechose.file1;
                }else if(pressedbutton==1){
                    f = new File("C:/WINDOWS/Chess/no-user.jpg");
                }
                FileInputStream in;
                 in = new FileInputStream(f);
                byte[] image = new byte[(int) f.length()];
                in.read(image);

               String sql = "update students set image=? where stuid=?";
               Connection con = DB.getMyConnection();
               PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
               stmt.setBytes(1, image);
               stmt.setString(2, id.getText());
               stmt.executeUpdate();
                stmt.close();

            } catch (Exception e) {
                System.out.println(e);
            }

        }

        
    if(!groups1.equals("select Group")){
       
      
   
    DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
    String datebirth = dateformat.format(jdate1.getDate());
    String datejoind = dateformat.format(jdate2.getDate());
       
        try {

            
            String sql = "update students set Nameinit =?,Namefull =?,Adress1=?,Adress2 =?,Birth =?,age =?,joindDate =?,rating =?,fiderating =?,tel =?,groupStu=?,Gender='"+Gende1+"' where stuID=?";

            Connection con = DB.getMyConnection();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);
         
           
            stmt.setString(1, Name.getText());
            stmt.setString(2, Name1.getText());
            stmt.setString(3, Name2.getText());
            stmt.setString(4, Name3.getText());
            stmt.setString(5, datebirth);
            stmt.setString(6, age.getText());
            stmt.setString(7, datejoind);
            stmt.setString(8, rating.getText());
            stmt.setString(9, age1.getText());
            stmt.setString(10, tel.getText());
            stmt.setString(11, groups1);
            stmt.setString(12, id.getText());
            
            stmt.executeUpdate();
            stmt.close();

           

        } catch (Exception e) {
            System.out.println(e);
        }
    }else{
    JOptionPane.showMessageDialog(null, "Please select group");
    }
    }//GEN-LAST:event_b13ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       if(!jRadioButton2.isSelected()){


          try {
            Connection con = DB.getMyConnection();
            Statement st = con.createStatement();
             ResultSet rs =  st.executeQuery("select MAX(StuID) as id from students");




           if((rs.next())) {

           id.setText(String.valueOf(rs.getInt("id")+1));

            }
             id.setEditable(false);
                b13.setEnabled(false);
             b14.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e+"gfgf");
        }
       }else{
        id.setEditable(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      l1.setIcon(new ImageIcon("C:/WINDOWS/Chess/no-user.jpg"));
     jfilechose.file1 = new File("C:/WINDOWS/Chess/no-user.jpg");
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jdate1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdate1FocusLost
        
    }//GEN-LAST:event_jdate1FocusLost

    private void ageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusGained
        int birtday = jdate1.getDate().getYear();
        int today = new Date().getYear();
        int difarance = today-birtday;
        age.setText(String.valueOf(difarance));
    }//GEN-LAST:event_ageFocusGained

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
      
    }//GEN-LAST:event_idKeyReleased

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost

        DateFormat foramatdate = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Connection con = DB.getMyConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select* from students where stuID ='"+id.getText()+"'");
            while(rs.next()){
               Name.setText(rs.getString("Nameinit"));
               Name1.setText(rs.getString("Namefull"));
                Name2.setText(rs.getString("Adress1"));
                 Name3.setText(rs.getString("Adress2"));
                 group1.setSelectedItem(rs.getString("groupStu"));
                 jdate1.setDate(foramatdate.parse(rs.getString("Birth")));
                  age.setText(rs.getString("age"));
                  jdate2.setDate(foramatdate.parse(rs.getString("joindDate")));
                 rating.setText(rs.getString("rating"));
                 age1.setText(rs.getString("fiderating"));
                 tel.setText(rs.getString("tel"));
                 String gender = rs.getString("Gender");
                 System.out.println(gender);
                 if(gender.equals("Male")){
                     
                     male.setSelected(true);

                 }else{
                     
                    female.setSelected(true);
                 }

                Blob b = (Blob) rs.getBlob("image");
                ImageIcon icon = new ImageIcon(b.getBytes(1L, (int) b.length()));
                l1.setIcon(icon);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_idFocusLost

    private void group1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_group1ActionPerformed
     
    }//GEN-LAST:event_group1ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        if(jRadioButton2.isSelected()){
        Object[] options = { "Yes", "No" };
        int respon = JOptionPane.showOptionDialog(null, "Are You Sure You want to Proceed", "Warning",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            if(respon==0){

                try {
                    Connection con = DB.getMyConnection();
                    Statement st = con.createStatement();
                    st.executeUpdate("delete from students where stuID = '"+id.getText()+"'");
                    st.executeUpdate("delete from atten where id='"+id.getText()+"'");
                    st.executeUpdate("delete from indivdual where id='"+id.getText()+"'");
                    st.executeUpdate("delete from playerrec where id='"+id.getText()+"'");
                    st.executeUpdate("delete from tounamentplay where stuid='"+id.getText()+"'");

                } catch (Exception e) {
                }

            }
        }
    }//GEN-LAST:event_b14ActionPerformed

    private void group1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_group1MouseClicked
this.ageFocusGained(null);
    }//GEN-LAST:event_group1MouseClicked

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char c = evt.getKeyChar();
       if(!Character.isDigit(c) ){
        evt.consume();
       }
    }//GEN-LAST:event_idKeyTyped

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
       char c = evt.getKeyChar();
       if(!Character.isDigit(c) | age.getText().length()>=2){
        evt.consume();
       }
    }//GEN-LAST:event_ageKeyTyped

    private void ratingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ratingKeyTyped
        char c = evt.getKeyChar();
       if(!Character.isDigit(c) | rating.getText().length()>=4){
        evt.consume();
       }
    }//GEN-LAST:event_ratingKeyTyped

    private void age1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age1KeyTyped
        char c = evt.getKeyChar();
       if(!Character.isDigit(c) | age1.getText().length()>=4){
        evt.consume();
       }
    }//GEN-LAST:event_age1KeyTyped

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
       char c = evt.getKeyChar();
       if(!Character.isDigit(c) ){
        evt.consume();
       }
    }//GEN-LAST:event_telKeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Name1;
    private javax.swing.JTextField Name2;
    private javax.swing.JTextField Name3;
    private javax.swing.JTextField age;
    private javax.swing.JTextField age1;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JComboBox group1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private com.toedter.calendar.JDateChooser jdate1;
    private com.toedter.calendar.JDateChooser jdate2;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField rating;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables

}