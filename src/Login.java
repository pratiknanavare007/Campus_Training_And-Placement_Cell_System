import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
public class Login extends javax.swing.JFrame 
{
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public Login() 
    {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_img1.gif"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOK)
                            .addComponent(btnCancel))
                        .addGap(11, 11, 11)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked

    }//GEN-LAST:event_txtUserNameMouseClicked

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) 
    {                                   
        if (txtUserName.getText().equals("")) 
        {
           JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
           return;
            
        }
        String Password= String.valueOf(txtPassword.getPassword());
        if (Password.equals("")) 
        {
           JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
           return;  
        }
        con=Connect.ConnectDB();
        String sql= "select * from users where UserName= '" + txtUserName.getText() + "' and user_Password ='" + txtPassword.getText() + "'";
        try
        {
            pst=con.prepareStatement(sql);
            rs= pst.executeQuery();
            if (rs.next())
            {
                this.hide();
                MainMenu frm=new MainMenu();
                frm.setVisible(true);
            }
            else
            { 
                JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e); 
        }                                     
    }                                  

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed

    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            con=Connect.ConnectDB();
            String sql= "select * from admin where UserName= '" + txtUserName.getText() + "' and user_Password ='" + txtPassword.getText() + "'";
            try
            {
                pst=con.prepareStatement(sql);
                rs= pst.executeQuery();
                if (rs.next())
                {
                    this.hide();
                    MainMenu frm=new MainMenu();
                    frm.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login Failed..Try again !","Access denied",JOptionPane.ERROR_MESSAGE);
                    txtUserName.setText("");
                    txtPassword.setText("");
                    txtUserName.requestDefaultFocus();
                }
            }
            catch(SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e); 
            }            
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
      
    }//GEN-LAST:event_btnOKActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() 
            {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
