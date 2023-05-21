
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class form extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    String s;
    Connection con;
    String name1;
    public form() {
        initComponents();
        connection();
    }
    
    public form(String n){
        name1=n;
        
        initComponents();
        connection();
    }
    void connection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            String url="jdbc:sqlserver://localhost:1433;databaseName=userloginproject;user=sa;password=shawon420";
            con=DriverManager.getConnection(url);
            String SQL ="SELECT * FROM logindata WHERE username='"+name1+ "'";
            Statement stmt =con.createStatement();
            ResultSet usercheck=stmt.executeQuery(SQL);
            
            if(usercheck.next()){
                id.setText(usercheck.getString("roll"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        birthdate = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        department = new javax.swing.JComboBox<>();
        semester = new javax.swing.JComboBox<>();
        section = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        imagelink = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(570, 600));
        setMinimumSize(new java.awt.Dimension(570, 600));
        setPreferredSize(new java.awt.Dimension(570, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info_icon.png"))); // NOI18N
        jLabel1.setText("Student's Information form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Student's id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Student's name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Date of birth:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Contact No:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Address:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Semester:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Section:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 50, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Department:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 30));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 161, -1));
        getContentPane().add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 161, -1));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 161, -1));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 161, -1));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Civil", "EEE", "CSE", "MPE", "Architecture", "Textile", "BBA" }));
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 161, -1));

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/1", "1/2", "2/1", "2/2", "3/1", "3/2", "4/1", "4/2" }));
        getContentPane().add(semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 161, -1));

        section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        getContentPane().add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 161, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Gender:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, -1));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        male.setForeground(new java.awt.Color(0, 0, 204));
        male.setText("MALE");
        getContentPane().add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 60, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        female.setForeground(new java.awt.Color(0, 0, 204));
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 70, -1));

        imagelink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagelinkActionPerformed(evt);
            }
        });
        getContentPane().add(imagelink, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 149, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_icon.png"))); // NOI18N
        jButton1.setText("Add Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 110, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 161, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("E-Mail Address:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saveicon.png"))); // NOI18N
        jButton2.setText("Save and proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 230, 30));

        jLabel13.setText("example:15.01.01.001");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("***All fields are required.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("               Image");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel11.setAlignmentX(1.0F);
        jLabel11.setAlignmentY(2.0F);
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(0, 0, 128, 128);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, 130));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form_back2.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 570, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser ob =new JFileChooser();
       ob.showOpenDialog(null);
       File f =ob.getSelectedFile();
      String file_name=f.getAbsolutePath();
      imagelink.setText(file_name);
      ImageIcon imageIcon = new ImageIcon(new ImageIcon(file_name).getImage().getScaledInstance(jLabel11.getWidth(),jLabel11.getHeight(), Image.SCALE_DEFAULT));
        
      jLabel11.setIcon(imageIcon);
      s=file_name;
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    private void imagelinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagelinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagelinkActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_femaleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            String query="insert into information (roll,name,birthdate,gender,contact,email,address,department,semester,section,image) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst =con.prepareStatement(query);
            
            
            loginform ob= new loginform();
            //System.out.println(ob.loginusername);
            
            
            if(id.getText().isEmpty()||name.getText().isEmpty()||birthdate.getText().isEmpty()||contact.getText().isEmpty()||email.getText().isEmpty()||email.getText().isEmpty()||(!male.isSelected()&&!female.isSelected()))
            {
                JOptionPane.showMessageDialog(null, "Fill up all the fields");
            }
            else{
                
                pst.setString(1,id.getText());
                pst.setString(2,name.getText());
                pst.setString(3,birthdate.getText());
                male.setActionCommand("Male");
                female.setActionCommand("Female");
                pst.setString(4,buttonGroup1.getSelection().getActionCommand());
                pst.setString(5,contact.getText());
                pst.setString(6,email.getText());
                pst.setString(7,address.getText());
                pst.setString(8,department.getSelectedItem().toString());
                pst.setString(9,semester.getSelectedItem().toString());
                pst.setString(10,section.getSelectedItem().toString());
                InputStream is=new FileInputStream(new File(s));
                pst.setBlob(11, is);
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Successfully registered your infromation");
                messege_user ms =new messege_user(id.getText());
                this.setVisible(false);
                ms.setVisible(true);
            }
        }   
        
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField birthdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JTextField imagelink;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> section;
    private javax.swing.JComboBox<String> semester;
    // End of variables declaration//GEN-END:variables
}
