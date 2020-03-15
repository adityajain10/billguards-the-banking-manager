package bank.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;

    public Login() {
        initComponents();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Login Panel");

        jLabel2.setText("Employee ID");

        jLabel3.setText("Password");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("BillGuards- The Banking System");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Signup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 159, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(179, 179, 179))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(53, 53, 53)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int z = 0;
        HomePage h = new HomePage();
        employeehome h2 = new employeehome();
        try {
            Class.forName("java.sql.Driver");
            String db = "jdbc:mysql://localhost:3306";
            Connection conn = DriverManager.getConnection(db, "root", "12345");
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            String b = "show databases";
            ResultSet rs = stmt.executeQuery(b);
            while (rs.next()) {
                String b1 = rs.getString("Database");
                if (b1.equals("bank"))
                    z = 1;
            }
            if (z == 0) {
                String b0 = "create database bank";
                stmt2.executeUpdate(b0);
                conn.close();
                Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "12345");
                Statement stmt1 = conn1.createStatement();
                String b2 = "create table branch( branch_no int(5) primary key not null auto_increment, ifsc_code varchar(10) unique,area Varchar(10),address varchar(50),city varchar(20));";
                String b3 = "create table account( account_no int(10) primary key not null auto_increment,balance int(19), branch_no int(5),type varchar(10) , constraint acc_fk foreign key (branch_no) references branch(branch_no) on delete cascade );";
                String b4 = "create table customers(adhaar_no int(10) primary key not null,name varchar(20), phone int(11), address varchar(50)); ";
                String b5 = "create table account_holder( account_no int(10), adhaar_no int(10),constraint acchold_fk1 foreign key (account_no) references account(account_no),constraint acchold_fk2 foreign key (adhaar_no) references customers(adhaar_no)on delete cascade);";
                String b6 = "create table department (dep_no int(3) primary key not null auto_increment,dep_name varchar(20));";
                String b7 = "create table employee( employee_id int(10) primary key not null auto_increment, name Varchar(20),adhaar_no int(10) unique,address varchar(50),phone int(11),Dep_no int(3),branch_no int(5),salary int(10),dob date,constraint emp_fk foreign key(dep_no) references department(dep_no)on delete cascade,constraint emp2_fk foreign key (branch_no) references branch(branch_no)on delete cascade);";
                String b8 = "create table credit_card(credit_card int(19) primary key not null,account_no int(10),cvv int(3), type varchar(10),expiry date,constraint cc_fk foreign key(account_no) references account(account_no) on delete cascade);";
                String b9 = "create table transaction(transaction_id int(10) primary key not null auto_increment,account_no int(10),amount int(19),date_of_trans date,type varchar(6),balance int(19),constraint trans_fk foreign key(account_no) references account(account_no) on delete cascade);";
                String b10 = "create table signup(employee_id int(10) primary key not null,password varchar(20));";
                String b11 = "insert into signup values('9007','admin007');";
                String b12 = "alter table branch AUTO_INCREMENT=00001";
                String b13 = "alter table account AUTO_INCREMENT=0000000001";
                String b14 = "alter table employee AUTO_INCREMENT=0000000001";
                String b15 = "alter table transaction AUTO_INCREMENT=0000000001";
                String b16 = "alter table department AUTO_INCREMENT=001";
                stmt1.executeUpdate(b2);
                stmt1.executeUpdate(b3);
                stmt1.executeUpdate(b4);
                stmt1.executeUpdate(b5);
                stmt1.executeUpdate(b6);
                stmt1.executeUpdate(b7);
                stmt1.executeUpdate(b8);
                stmt1.executeUpdate(b9);
                stmt1.executeUpdate(b10);
                stmt1.executeUpdate(b11);
                stmt1.executeUpdate(b12);
                stmt1.executeUpdate(b13);
                stmt1.executeUpdate(b14);
                stmt1.executeUpdate(b15);
                stmt1.executeUpdate(b16);
                conn1.close();
                //if(jTextField1.getText().equals("9007") && jPasswordField1.getText().equals("admin007"))
                // h.setVisible(true);
// else
                //JOptionPane.showMessageDialog(this,"Incorrect credentials..try again!");
            }
            if (jTextField1.getText().equals("9007") && jPasswordField1.getText().equals("admin007"))
                h.setVisible(true);
            else {
                Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "12345");
                String b0 = "select * from signup where employee_id='" + jTextField1.getText() + "' and password='" + jPasswordField1.getText() + "';";
                Statement stmt3 = conn2.createStatement();
                ResultSet result = stmt3.executeQuery(b0);
                result.next();
                if (result.getRow() == 1) {
                    this.setVisible(false);
                    h2.setVisible(true);
                } else
                    JOptionPane.showMessageDialog(this, "Incorrect Credentials..try again");
                conn.close();
            }
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        CustomerLogin hu = new CustomerLogin();
        hu.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        signup sign = new signup();
        sign.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    // End of variables declaration//GEN-END:variables
}
