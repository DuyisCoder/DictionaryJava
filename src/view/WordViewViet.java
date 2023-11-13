/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author minhduy
 */
public class WordViewViet extends javax.swing.JFrame {

    MainView main;
    ListWord list;

    DictionaryVNtoEN dict;
    DefaultTableModel model;
    
    private int pos = 0;
    WordVN word;
    IOFile file;
    private String fileVNtoEN = "vietanh.txt";

    public WordViewViet() {
        initComponents();
        file = new IOFile();
        dict = new DictionaryVNtoEN();
        word = new WordVN();
        list = new ListWord();
        main = new MainView();
        model = (DefaultTableModel) tableWord.getModel();
        file.readFile(fileVNtoEN, dict);
        viewTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWord = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMeaning = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableWord = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("DICTIONARY VIET ANH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Find Word");

        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Word");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Meaning");

        txtMeaning.setColumns(20);
        txtMeaning.setRows(5);
        jScrollPane1.setViewportView(txtMeaning);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(txtWord, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFind, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(31, 31, 31)
                                .addComponent(btnClear))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnAdd)
                                    .addGap(26, 26, 26)
                                    .addComponent(btnRemove))
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnRemove)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnExit)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableWord.setAutoCreateRowSorter(true);
        tableWord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Word", "Meaning"
            }
        ));
        tableWord.setShowGrid(true);
        tableWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableWordMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableWord);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed
    public void viewTable() {
        model.setRowCount(0);
        tableWord.setShowVerticalLines(true);
        tableWord.setGridColor(Color.gray);
        List<Map.Entry<String,WordVN>> list = new ArrayList<>(dict.getDict().entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<String, WordVN>>(){

            public int compare(Map.Entry<String, WordVN> o1, Map.Entry<String, WordVN> o2) {
                
                return o1.getKey().compareTo(o2.getKey());
            }
            
        });
        for (Map.Entry<String, WordVN> entry : list) {
            model.addRow(new Object[]{entry.getKey(),entry.getValue()});
        }

    }


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String eng = txtWord.getText();
        String vi = txtMeaning.getText();
        List<String> list = new ArrayList<>();
        list.add(vi);
        if (eng != null) {
            if (eng.isEmpty() && vi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui long nhap tu can them", "Thong bao", JOptionPane.ERROR_MESSAGE);

            } else if (dict.timTheoKey(eng) == true) {
                JOptionPane.showMessageDialog(this, "Tu ban them da ton tai! Vui long update!", "Thong bao", JOptionPane.ERROR_MESSAGE);
            } else {
                dict.addWord(eng, list);
                JOptionPane.showMessageDialog(this, "Them thanh cong!!", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
                txtWord.setText("");
                txtMeaning.setText("");
                txtFind.setText("");
                viewTable();
                dict.setDict((Map<String, WordVN>) dict);
                
            }

        } else {
            JOptionPane.showConfirmDialog(this, "Them that bai", "Thong bao", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyPressed
        String find = txtFind.getText();
        word = dict.translateWord(find);
        if (word != null) {
            for (int row = 0; row < tableWord.getRowCount(); row++) {
                String wordTable = (String) tableWord.getValueAt(row, 0);
                if (find.equals(wordTable)) {
                    tableWord.setRowSelectionInterval(row, row);
                    tableWord.scrollRectToVisible(tableWord.getCellRect(row, 0, true));
                    break;
                }
            }
        }
    }//GEN-LAST:event_txtFindKeyPressed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtFind.setText("");
        txtMeaning.setText("");
        txtWord.setText("");


    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String word = txtWord.getText();
        if (word != null) {
            if (word.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui long chon tu can xoa", "Thong bao", JOptionPane.ERROR_MESSAGE);
            } else if (dict.timTheoKey(word) == true) {
                int choose = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa từ \" " + word + " \"không ?", word, WIDTH);

                if (choose == JOptionPane.YES_OPTION) {
                    dict.deleteWord(word);
                    JOptionPane.showMessageDialog(this, "Xoa thanh cong", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
                    txtFind.setText("");
                    txtMeaning.setText("");
                    txtWord.setText("");
                    viewTable();
                    dict.setDict((Map<String, WordVN>) dict);

                }

            } else {
                JOptionPane.showMessageDialog(this, "Tu ban xoa khong co trong tu dien", "Thong bao", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Xoa that bai", "Thong bao", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String eng = txtWord.getText();
        String meaning = txtMeaning.getText();
        meaning = meaning.replaceAll("\\[|\\]", "");
        System.out.println("LIST" + meaning.replaceAll("\\[]", ""));
        list = new ListWord();
        list.getList().add(meaning);

        if (eng != null) {
            if (eng.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui long chon tu can update", "Thong bao", JOptionPane.ERROR_MESSAGE);
            } else if (dict.timTheoKey(eng) == true) {
                dict.updatee(eng, list.getList());
                file.ghiFile(fileVNtoEN, dict);
                JOptionPane.showMessageDialog(this, "Update thanh cong", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
                txtFind.setText("");
                txtMeaning.setText("");
                txtWord.setText("");
                viewTable();
                dict.setDict((Map<String, WordVN>) dict);

            } else {
                JOptionPane.showMessageDialog(this, "Tu ban can update khong co trong tu dien", "Thong bao", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Update that bai", "Thong bao", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableWordMouseClicked
        pos = tableWord.getSelectedRow();
        String selectedWord = (String) tableWord.getValueAt(pos, 0);
        word = dict.translateWord(selectedWord);
        if (word != null) {
            String[] parts =word.toString().split(",");
            StringBuilder bd = new StringBuilder();
            for (String part : parts) {
                bd.append(part).append("\n");
            }
            txtWord.setText(word.getViet());
            txtMeaning.setText(bd + "");
        }
    }//GEN-LAST:event_tableWordMouseClicked

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
            java.util.logging.Logger.getLogger(WordViewViet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordViewViet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordViewViet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordViewViet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordViewViet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableWord;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextArea txtMeaning;
    private javax.swing.JTextField txtWord;
    // End of variables declaration//GEN-END:variables
}
