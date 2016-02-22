import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.*; 
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import static javax.swing.JOptionPane.showConfirmDialog;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vineet
 */
public class remove extends javax.swing.JFrame {

    /**
     * Creates new form remove
     */
    public remove() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BtnHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtAuthor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtBID = new javax.swing.JTextField();
        TxtISBN = new javax.swing.JTextField();
        TxtBName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TxtPublisher = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtCopies = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cimg = new javax.swing.JLabel();
        TxtCURL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtBType = new javax.swing.JTextField();
        BtnGo = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        RemoveMBtnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        BtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        BtnHome.setFocusable(false);
        BtnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/homero.png"))); // NOI18N
        BtnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnHome);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        jLabel2.setText("Choose Details To Delete");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setText("Type:");

        jLabel1.setText("Enter Book ID:");

        jLabel6.setText("Author Name:");

        TxtAuthor.setEditable(false);
        TxtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAuthorActionPerformed(evt);
            }
        });

        jLabel3.setText("ISBN:");

        TxtBID.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtBIDCaretUpdate(evt);
            }
        });
        TxtBID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBIDActionPerformed(evt);
            }
        });

        TxtISBN.setEditable(false);
        TxtISBN.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtISBNCaretUpdate(evt);
            }
        });
        TxtISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtISBNActionPerformed(evt);
            }
        });

        TxtBName.setEditable(false);
        TxtBName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Book Name:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TxtPublisher.setEditable(false);
        TxtPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPublisherActionPerformed(evt);
            }
        });

        jLabel7.setText("Publisher:");

        TxtCopies.setEditable(false);
        TxtCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCopiesActionPerformed(evt);
            }
        });

        jLabel8.setText("Copies:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cover Photo"));

        cimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cimg, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cimg, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        TxtCURL.setEditable(false);
        TxtCURL.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtCURLCaretUpdate(evt);
            }
        });
        TxtCURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCURLActionPerformed(evt);
            }
        });

        jLabel9.setText("Cover Photo URL:");

        TxtBType.setEditable(false);
        TxtBType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBTypeActionPerformed(evt);
            }
        });

        BtnGo.setText("Go");
        BtnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtBName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtBType, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(TxtCURL, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtBID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BtnGo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtBType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtCopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtCURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del.png"))); // NOI18N
        BtnRemove.setText("Remove");
        BtnRemove.setIconTextGap(12);
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        RemoveMBtnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        RemoveMBtnExit.setText("Exit");
        RemoveMBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveMBtnExitActionPerformed(evt);
            }
        });
        jMenu1.add(RemoveMBtnExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Status");

        jMenuItem1.setText("Total Books");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Currently Available");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Total Fine Earned");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(BtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int isStatus;
    private void RemoveMBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveMBtnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_RemoveMBtnExitActionPerformed

    private void TxtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAuthorActionPerformed

    private void TxtBIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBIDActionPerformed

    private void TxtBNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBNameActionPerformed

    private void TxtPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPublisherActionPerformed

    private void TxtCopiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCopiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCopiesActionPerformed

    private void TxtCURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCURLActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void TxtBTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBTypeActionPerformed

    private void TxtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtISBNActionPerformed

    private void TxtISBNCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtISBNCaretUpdate
        
    }//GEN-LAST:event_TxtISBNCaretUpdate

    private void TxtCURLCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtCURLCaretUpdate
        Image img = Toolkit.getDefaultToolkit().createImage(TxtCURL.getText()).getScaledInstance(192, 235, 0);
        ImageIcon ic = new ImageIcon(img);
        cimg.setIcon(ic);
    }//GEN-LAST:event_TxtCURLCaretUpdate

    private void TxtBIDCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtBIDCaretUpdate
    }//GEN-LAST:event_TxtBIDCaretUpdate
    private void getIssuedStatus(){
        try{
            Class.forName("java.sql.Driver");
            Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Library","root","");
            Statement stmt=(Statement) con.createStatement();
            String q2="SELECT count(Book_ID) FROM Issue WHERE Book_ID='"+TxtBID.getText()+"';";
            ResultSet rs2=stmt.executeQuery(q2);
            while(rs2.next())
            {
                isStatus=rs2.getInt("count(Book_ID)");
                System.out.println("isStatus: "+isStatus);
            }
            rs2.close();
        }catch(Exception e){
            
        }
    }
    private void BtnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGoActionPerformed
        if (TxtBID.getText().equals("")==false)
        {   
            TxtISBN.setText("");
            TxtBName.setText("");
            TxtBType.setText("");
            TxtAuthor.setText("");
            TxtPublisher.setText("");
            TxtCopies.setText("");
            TxtCURL.setText("");
            try
            {
                Class.forName("java.sql.Driver");
                Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Library","root","");
                Statement stmt=(Statement) con.createStatement();
                String q1="SELECT * FROM Books WHERE Book_ID='"+TxtBID.getText()+"';";
                String q2="SELECT count(Book_ID) FROM Issue WHERE Book_ID='"+TxtBID.getText()+"';";
                System.out.println(q1);
                System.out.println(q2);
                ResultSet rs=stmt.executeQuery(q1);
                while(rs.next())
                {
                    getIssuedStatus();
                    TxtISBN.setText(rs.getString("ISBN"));
                    TxtBName.setText(rs.getString("Book_Name"));
                    TxtBType.setText(rs.getString("Book_Type"));
                    TxtAuthor.setText(rs.getString("Author"));
                    TxtPublisher.setText(rs.getString("Publisher"));
                    TxtCopies.setText(rs.getString("Copies"));
                    String CURL=rs.getString("CURL");
                    TxtCURL.setText("E:\\temp\\"+CURL+".jpg");
                }
                if (TxtISBN.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Book with Book_ID["+TxtBID.getText()+"] does not exists! Enter a valid Book ID");
                    TxtBID.setText("");
                }
                rs.close();               
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else JOptionPane.showMessageDialog(this, "Invalid Book ID !!!");
    }//GEN-LAST:event_BtnGoActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
        if(isStatus>0){
            System.out.println();
            if(JOptionPane.showConfirmDialog(this, "Book is issued by someone. Are you sure you waant to continue..", null, 0, 2)==0){
                try
                {
                    Class.forName("java.sql.Driver");
                    Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Library","root","");
                    Statement stmt=(Statement) con.createStatement();
                    String q1="DELETE FROM Books WHERE Book_ID='"+TxtBID.getText()+"';";
                    String query = "DELETE FROM ISSUE WHERE Book_ID='" + TxtBID.getText() + "';";
                    stmt.executeUpdate(q1);
                    stmt.executeUpdate(query);                    
                    JOptionPane.showMessageDialog(this,"Book Deleted Successfully!!!");
                    this.dispose();
                    new remove().setVisible(true);
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(this, e.getMessage()); 
                }
            }
        }
        else{
            try
            {
                Class.forName("java.sql.Driver");
                Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/Library","root","");
                Statement stmt=(Statement) con.createStatement();
                String q1="DELETE FROM Books WHERE Book_ID='"+TxtBID.getText()+"';";
                stmt.executeUpdate(q1);
                JOptionPane.showMessageDialog(this,"Book Deleted Successfully!!!");
                this.dispose();
                new remove().setVisible(true);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage()); 
            }
        }
    }//GEN-LAST:event_BtnRemoveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new remove().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGo;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JMenuItem RemoveMBtnExit;
    private javax.swing.JTextField TxtAuthor;
    private javax.swing.JTextField TxtBID;
    private javax.swing.JTextField TxtBName;
    private javax.swing.JTextField TxtBType;
    private javax.swing.JTextField TxtCURL;
    private javax.swing.JTextField TxtCopies;
    private javax.swing.JTextField TxtISBN;
    private javax.swing.JTextField TxtPublisher;
    private javax.swing.JLabel cimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
