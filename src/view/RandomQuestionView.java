/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.plaf.FileChooserUI;

import model.DictionaryRecent;
import model.IOFile;
import model.Word;

/**
 *
 * @author minhduy
 */
public class RandomQuestionView extends javax.swing.JFrame {

    private Timer timer;
    private int countdownTime = 30;
    private int seconds=0;
    private IOFile file;
    private DictionaryRecent dictRecent;
    private String randomValue;
    private String randomKey;
    public RandomQuestionView() {
        file=new IOFile();
        dictRecent=new DictionaryRecent();
        file.readFile("recent.txt", dictRecent);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void randomQuestion(){
        Random rd = new Random();
         List<Map.Entry<String,Word>> list = new ArrayList<>(dictRecent.getDict().entrySet());
         if(!list.isEmpty()){
               Map.Entry<String,Word> randomW= list.get(rd.nextInt(list.size()));
               randomValue=randomW.getValue().toString();
               randomKey=randomW.getKey();
               txtCauHoi.setText(randomValue);   
               txtCauHoi.setLineWrap(true);
               txtCauHoi.setWrapStyleWord(true);
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGiay = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDiem = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCauHoi = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuOpen = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuLuatChoi = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("GB18030 Bitmap", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Câu hỏi ôn tập");

        jLabel2.setText("Điền nghĩa của các từ sau đây");

        jLabel3.setText("Câu hỏi :");

        txtTuKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuKhoaActionPerformed(evt);
            }
        });

        jLabel5.setText("Trả lời :");

        jLabel4.setText("Time:");

        lblGiay.setText("00");

        jLabel8.setText("seconds");

        lblDiem.setForeground(new java.awt.Color(255, 51, 51));

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        txtCauHoi.setColumns(20);
        txtCauHoi.setRows(5);
        jScrollPane1.setViewportView(txtCauHoi);

        javax.swing.GroupLayout lblTimeLayout = new javax.swing.GroupLayout(lblTime);
        lblTime.setLayout(lblTimeLayout);
        lblTimeLayout.setHorizontalGroup(
            lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTimeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiem)
                    .addComponent(jLabel6))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTimeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGiay)
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(73, 73, 73))
            .addGroup(lblTimeLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTimeLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnStart)
                        .addGap(86, 86, 86)
                        .addComponent(btnStop))
                    .addGroup(lblTimeLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(txtTuKhoa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblTimeLayout.setVerticalGroup(
            lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblTimeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblDiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblGiay)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblTimeLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lblTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStart)
                            .addComponent(btnStop))
                        .addGap(25, 25, 25))
                    .addGroup(lblTimeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addContainerGap(341, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu4.setText("File");

        jMenuOpen.setText("Open File");
        jMenuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpenActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuOpen);

        jMenuExit.setText("Exit");
        jMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuExit);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Help");

        jMenuLuatChoi.setText("Luật chơi");
        jMenuLuatChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLuatChoiActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuLuatChoi);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void randomTime(){
         timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Giảm thời gian đếm ngược mỗi giây
                countdownTime--;
                lblGiay.setText(countdownTime+"");
                 if(countdownTime >= 60){
                    timer.stop();
                    int luaChon = JOptionPane.showConfirmDialog(jMenuOpen, "You Win you co muon choi lai khong ?", "Thong bao",JOptionPane.YES_OPTION);
                    if(luaChon==JOptionPane.YES_OPTION){
                        resetForm();
                        randomQuestion();
                        randomTime();
                    }
                }
                if(countdownTime <= 0){
                    timer.stop();
                    int luaChon = JOptionPane.showConfirmDialog(jMenuOpen, "Ban da thua cuoc co muon tiep tuc khong ?", "Thong bao",JOptionPane.YES_OPTION);
                    if(luaChon==JOptionPane.YES_OPTION){
                        resetForm();
                        randomQuestion();
                        randomTime();
                    }else{
                        setVisible(false);
                       JOptionPane.showMessageDialog(rootPane, "Ban la thang that bai");
                        timer.stop();
                    }
                }
               
            }
        });
        timer.start();
    }
    public void resetForm(){
              countdownTime=30;
              lblDiem.setText("");
              lblGiay.setText(countdownTime+"");
              txtTuKhoa.setText("");
              
    }
    private void txtTuKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuKhoaActionPerformed
        String kq = txtTuKhoa.getText();
          if (kq.equalsIgnoreCase(randomKey)) {
            JOptionPane.showMessageDialog(this, "Kết quả chính xác.");
            lblDiem.setText("+10s");
            txtTuKhoa.setText("");
            countdownTime+=10;
            randomQuestion();
        } else  {
              
              JOptionPane.showMessageDialog(this, "Sai roi . Ket qua la :"+randomKey);
              countdownTime-=5;
              lblDiem.setText("-5s");
              randomQuestion();
      
        }
    }//GEN-LAST:event_txtTuKhoaActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        randomQuestion();
        randomTime();
    }//GEN-LAST:event_btnStartActionPerformed

    private void jMenuLuatChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLuatChoiActionPerformed
        JOptionPane.showMessageDialog(rootPane, 
                ">>>>>>>>>>LUẬT CHƠI NHƯ SAU<<<<<<<<<<\n"
                + "-> 1. ẤN START ĐỂ BẮT ĐẦU\n"
                + "-> 2. BẠN SẼ ĐIỀN KẾT QUẢ VÀO TRONG ĐÁP ÁN, ẤN ENTER\n"
                + "-> 3. NẾU ĐÚNG SẼ CỘNG THÊM 10 GIÂY\n"
                + "-> 4. NGƯỢC LẠI BẠN SẼ BỊ TRỪ 5 GIÂY\n"
                + "-> 5 .NẾU THỜI GIAN VỀ 0 BẠN SẼ THUA CUỘC\n"
                + "-> 7 .MẶC ĐỊNH TỪ KHÓA SẼ ĐƯỢC RANDOM TỪ KHÓA GẦN ĐÂY\n"
                + "-> 6 .BẠN CÓ THỂ CHỌN FILE TXT KHÁC NẾU MUỐN\n"
                +">>>>>>>>>>LUẬT CHƠI NHƯ SAU<<<<<<<<<<\n"
        ,"Thong Bao",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuLuatChoiActionPerformed

    private void jMenuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpenActionPerformed
        // TODO add your handling code here:
      JFileChooser fileChooser = new JFileChooser(new File("c:\\"));
        fileChooser.setDialogTitle("Open File!");
        fileChooser.showOpenDialog(null);
        File f = fileChooser.getSelectedFile();
        try {
            IOFile file = new IOFile();
            file.readFile(f, dictRecent);
            JOptionPane.showMessageDialog(this, "Nạp File Thành Công!");
        } catch (Exception e) {
               JOptionPane.showMessageDialog(this, "Nạp File Thất Bại!");
        }
    }//GEN-LAST:event_jMenuOpenActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        timer.stop();
    }//GEN-LAST:event_btnStopActionPerformed

    private void jMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformed
        this.setVisible(false);    
        timer.stop();// TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuExitActionPerformed
   
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
            java.util.logging.Logger.getLogger(RandomQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomQuestionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandomQuestionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuExit;
    private javax.swing.JMenuItem jMenuLuatChoi;
    private javax.swing.JMenuItem jMenuOpen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiem;
    private javax.swing.JLabel lblGiay;
    private javax.swing.JPanel lblTime;
    private javax.swing.JTextArea txtCauHoi;
    private javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}
