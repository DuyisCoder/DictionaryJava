/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.*;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author minhduy
 */
public final class MainView extends javax.swing.JFrame {

    IOFile file = new IOFile();

    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel modelRecent;
    Dictionary dictionary;
    DictionaryFavorite dictF;
    DictionaryVNtoEN dictV;
    DictionaryRecent dictRecent;
    private int pos = 0;
    private int posDislike = 0;
    private int posRecent = 0;

    private String fileENtoVN = "anhviet2.txt";
    private String fileVNtoEN = "vietanh.txt";
    private String fileRecent = "recent.txt";
    private String fileFavorite = "favorite.txt";

    Word word;
    WordVN wordVN;

    /**
     * Creates new form NewJFrame
     */
    public MainView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Dictionary Anh Viet!!");
        dictionary = new Dictionary();
        dictionary.getDict();
        dictF = new DictionaryFavorite();
        dictV = new DictionaryVNtoEN();
        dictRecent = new DictionaryRecent();

        file.readFile(fileENtoVN, dictionary);
        file.readFile(fileFavorite, dictF);
        file.readFile(fileVNtoEN, dictV);
        file.readFile(fileRecent, dictRecent);
        model1 = (DefaultTableModel) tableFavorite.getModel();
        modelRecent = (DefaultTableModel) tableRecent.getModel();
        viewTableFavorite();
        viewTableRecent();
    }

    public void viewTableRecent() {
        modelRecent.setRowCount(0);
        tableRecent.setShowVerticalLines(true);
        tableRecent.setGridColor(Color.gray);
        for (Map.Entry<String, Word> entry : dictRecent.getDict().entrySet()) {
            modelRecent.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
    }

    public void viewTableFavorite() {
        tableFavorite.setShowVerticalLines(true);
        tableFavorite.setGridColor(Color.gray);
        model1.setRowCount(0);
        for (Map.Entry<String, Word> entry : dictF.getDict().entrySet()) {
            model1.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
    }

    public void viewTableVietoENG() {
        model1.setRowCount(0);
        for (Map.Entry<String, WordVN> entry : dictV.getDict().entrySet()) {
            model1.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLike = new javax.swing.JButton();
        btnDisLike = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFavorite = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtWord = new javax.swing.JTextArea();
        comboLanguages = new javax.swing.JComboBox<>();
        btnLoad = new javax.swing.JButton();
        btnPhatAm = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNghia = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        ComboLangueges2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecent = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuSave = new javax.swing.JMenu();
        jMenuFileFavorite = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuExit = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuAnhViet = new javax.swing.JMenuItem();
        jMenuVietAnh = new javax.swing.JMenuItem();
        jMenuOntap = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Euphemia UCAS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("DICTIONARY ANH VIET");

        jToggleButton1.setText("On");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Chế độ Kiểm Tra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jToggleButton1))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
        );

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 51));
        jLabel2.setText("Word");

        jLabel4.setFont(new java.awt.Font("ITF Devanagari", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("YOUR FAVORITE WORD :");

        btnLike.setText("Like");
        btnLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLikeActionPerformed(evt);
            }
        });

        btnDisLike.setText("DisLike");
        btnDisLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisLikeActionPerformed(evt);
            }
        });

        tableFavorite.setModel(new javax.swing.table.DefaultTableModel(
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
        tableFavorite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFavoriteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableFavorite);

        txtWord.setColumns(20);
        txtWord.setRows(5);
        txtWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWordKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(txtWord);

        comboLanguages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ANH - VIET", "VIET - ANH" }));
        comboLanguages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLanguagesActionPerformed(evt);
            }
        });

        btnLoad.setBackground(new java.awt.Color(191, 63, 127));
        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnPhatAm.setBackground(new java.awt.Color(203, 90, 147));
        btnPhatAm.setText("Voice");
        btnPhatAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhatAmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboLanguages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(btnLike)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisLike)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPhatAm)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboLanguages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoad)
                    .addComponent(btnPhatAm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLike)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(btnDisLike)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNghia.setColumns(20);
        txtNghia.setRows(5);
        jScrollPane2.setViewportView(txtNghia);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Meaning");

        ComboLangueges2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIET - ANH", "ANH - VIET" }));

        tableRecent.setModel(new javax.swing.table.DefaultTableModel(
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
        tableRecent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRecentMouseClicked(evt);
            }
        });
        tableRecent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableRecentKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableRecent);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("Recent Word Search:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboLangueges2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboLangueges2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        jMenu1.setText("File");

        jMenu2.setText("New");
        jMenu1.add(jMenu2);

        jMenuSave.setText("Save");
        jMenuSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSaveMouseClicked(evt);
            }
        });

        jMenuFileFavorite.setText("Recent");
        jMenuFileFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileFavoriteActionPerformed(evt);
            }
        });
        jMenuSave.add(jMenuFileFavorite);

        jMenuItem2.setText("Favorite");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuSave.add(jMenuItem2);

        jMenu1.add(jMenuSave);

        jMenu6.setText("File");
        jMenu1.add(jMenu6);

        jMenuItem1.setText("Save As");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuExit.setText("Exit");
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenu1.add(jMenuExit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");

        jMenu4.setText("Dictionary");

        jMenuAnhViet.setText("ANH - VIET");
        jMenuAnhViet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAnhVietActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuAnhViet);

        jMenuVietAnh.setText("VIET - ANH");
        jMenuVietAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVietAnhActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuVietAnh);

        jMenu3.add(jMenu4);

        jMenuOntap.setText("On Tap");
        jMenuOntap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOntapActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuOntap);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {
        WordView view = new WordView();
        view.setVisible(true);
    }

    private void btnLikeActionPerformed(java.awt.event.ActionEvent evt) {

        String word = txtWord.getText().trim();
        String meaning = txtNghia.getText().trim();
        List<String> list = new ArrayList<>();
        list.add(meaning);
        int indexCombo = comboLanguages.getSelectedIndex();
        if (indexCombo == 0) {
            if (word != null) {
                if (dictionary.translateWord(word) == null) {
                    JOptionPane.showMessageDialog(this, "Them that bai vi tu ban nhap khong co trong tu dien!!");
                } else {
                    if (dictF.timTheoKey(word) == true) {
                        JOptionPane.showMessageDialog(this, "Tu khoa da ton tai");
                    } else {
                        dictF.addWord(word, list);
                        viewTableFavorite();
                        JOptionPane.showMessageDialog(this, "Them thanh cong");
                        txtWord.setText("");
                        txtNghia.setText("");
                    }
                }
            }
        } else {
            if (word != null) {
                if (dictV.translateWord(word) == null) {
                    JOptionPane.showMessageDialog(this, "Them that bai vi tu ban nhap khong co trong tu dien!!");
                } else {
                    if (dictF.timTheoKey(word) == true) {
                        JOptionPane.showMessageDialog(this, "Tu khoa da ton tai");
                    } else {
                        dictF.addWord(word, list);
                        viewTableFavorite();
                        JOptionPane.showMessageDialog(this, "Thêm thành công !");
                        txtWord.setText("");
                        txtNghia.setText("");
                    }
                }
            }
        }

    }

    private void btnDisLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisLikeActionPerformed
        String eng = txtWord.getText().trim();

        if (eng != null) {
            if (dictF.timTheoKey(eng) == true) {
                dictF.removeWord(eng);
                viewTableFavorite();
                JOptionPane.showMessageDialog(this, " Xóa thành công !");
                txtWord.setText("");
                txtNghia.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Từ bạn xóa không có trong từ điển chương trình !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Xóa thất bại !");
        }

    }//GEN-LAST:event_btnDisLikeActionPerformed

    private void comboLanguagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLanguagesActionPerformed
        // TODO add your handling code here:
        int combo1 = comboLanguages.getSelectedIndex();
        if (combo1 == 0) {
            ComboLangueges2.setSelectedIndex(0);
        } else {
            ComboLangueges2.setSelectedIndex(1);
        }

    }//GEN-LAST:event_comboLanguagesActionPerformed

    private void txtWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWordKeyPressed

        String searchText = txtWord.getText();
        String meaning = txtNghia.getText();
        List<String> list = new ArrayList<>();
        list.add(meaning);
        int index = comboLanguages.getSelectedIndex();
        int index2 = ComboLangueges2.getSelectedIndex();
        if (index == 0 && index2 == 0) {
            ComboLangueges2.setSelectedIndex(0);
            if (searchText != null && !searchText.isEmpty() && dictionary.translateWord(searchText) != null) {
                word = dictionary.translateWord(searchText);
                if (word != null) {
                    txtNghia.setText(word + "");
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        dictRecent.addWord(searchText, list);
                        file.readFile(fileRecent, dictRecent);
                        viewTableRecent();
                    }
                }
            } else {
                txtNghia.setText("Từ bạn tìm không có trong từ điển chương trình!");
            }
        } else {
            ComboLangueges2.setSelectedIndex(1);

            if (searchText != null && !searchText.isEmpty() && dictV.translateWord(searchText) != null) {
                wordVN = dictV.translateWord(searchText);
                if (wordVN != null) {
                    txtNghia.setText(wordVN + "");
                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        dictRecent.addWord(searchText, list);
                        file.readFile(fileRecent, dictRecent);
                        viewTableRecent();
                    }
                }
            } else {
                txtNghia.setText("Từ bạn tìm không có trong từ điển chương trình!");

            }
        }
    }//GEN-LAST:event_txtWordKeyPressed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        txtWord.setText("");
        txtNghia.setText("");
        file.readFile(fileENtoVN, dictionary);
        file.ghiFile(fileENtoVN, dictionary);
        file.readFile(fileENtoVN, dictF);
        file.readFile(fileENtoVN, dictRecent);
        file.readFile(fileENtoVN, dictV);

    }//GEN-LAST:event_btnLoadActionPerformed

    private void tableRecentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRecentMouseClicked
        posRecent = tableRecent.getSelectedRow();
        String selectedWord = (String) modelRecent.getValueAt(posRecent, 0);
        word = dictRecent.translateWord(selectedWord);
        viewTableRecent();
        if (word != null) {
            txtWord.setText(word.getEng());
            txtNghia.setText(word + "");

        }

    }//GEN-LAST:event_tableRecentMouseClicked

    private void txtWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWordKeyReleased

//        String searchText = txtWord.getText();
//        String meaning = txtNghia.getText();
//        List<String> list = new ArrayList<>();
//        list.add(meaning);
//        int index = comboLanguages.getSelectedIndex();
//        int index1 = ComboLangueges2.getSelectedIndex();
//        if (index == 0) {
//            ComboLangueges2.setSelectedIndex(0);
//            if (searchText != null && !searchText.isEmpty() && word != null) {
//                word = dictionary.translateWord(searchText);
//                if (word != null) {
//                    txtNghia.setText(word + "");
//                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//                        dictRecent.addWord(searchText, list);
//                        file.ghiFile(fileRecent, dictRecent);
//                        viewTableRecent();
//                    }
//                }
//            } else {
//                JOptionPane.showConfirmDialog(this, "Khong tim thay");
////                word=dictionary.translateWord(searchText);
////                System.out.println("word"+word);
//            }
//        } else {
//            ComboLangueges2.setSelectedIndex(1);
//            if (searchText != null && !searchText.isEmpty()) {
//                wordVN = dictV.translateWord(searchText);
//                if (wordVN != null) {
//                    txtNghia.setText(wordVN + "");
//
//                    if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtNghia.getText().equals("")) {
//                        dictRecent.addWord(searchText, list);
//                        file.ghiFile(fileRecent, dictRecent);
//                        viewTableRecent();
//                    }
//                }
//            } else {
//                txtNghia.setText("Không tìm thấy!");
//            }
//        }

    }//GEN-LAST:event_txtWordKeyReleased

    private void tableRecentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableRecentKeyReleased

    }//GEN-LAST:event_tableRecentKeyReleased

    private void jMenuAnhVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAnhVietActionPerformed
        WordView view = new WordView();
        view.setVisible(true);
    }//GEN-LAST:event_jMenuAnhVietActionPerformed

    private void jMenuVietAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVietAnhActionPerformed
        WordViewViet view = new WordViewViet();
        view.setVisible(true);
    }//GEN-LAST:event_jMenuVietAnhActionPerformed

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void jMenuSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSaveMouseClicked

    }//GEN-LAST:event_jMenuSaveMouseClicked

    private void jMenuFileFavoriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileFavoriteActionPerformed
        JFileChooser fileChooser = new JFileChooser(new File("c:\\"));
        fileChooser.setDialogTitle("Save File !");
        fileChooser.showSaveDialog(null);
        File f = fileChooser.getSelectedFile();
        try {
            IOFile file = new IOFile();
            file.ghiFile(f, dictRecent);

        } catch (Exception e) {
        }


    }//GEN-LAST:event_jMenuFileFavoriteActionPerformed

    private void jMenuOntapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOntapActionPerformed
        QuestionView view = new QuestionView();
        view.setVisible(true);
    }//GEN-LAST:event_jMenuOntapActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int delay = 5000;
        if (jToggleButton1.isSelected()) {
            dictRecent.setBat(true);
            Timer timer = new Timer(delay, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    QuestionView view = new QuestionView();
                    view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    view.setVisible(true);
                }

            });
            timer.setRepeats(false);
            timer.start();
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnPhatAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhatAmActionPerformed
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
//        System.setProperty("freetts.voices ",   "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
//        Voice[] voiceList = VoiceManager.getInstance().getVoices();
//        for (int i = 0; i < voiceList.length; i++) {
//            System.out.println("# Voice :" + voiceList[i].getName());
//        }
        String txt = txtWord.getText();
        if (voice != null) {
            voice.allocate();
            System.out.println("Voice Rate :" + voice.getRate());
            System.out.println("Voice Pitch :" + voice.getPitch());

            System.out.println("Voice Volumn :" + voice.getVolume());
            boolean status = voice.speak(txt);
//            System.out.println("Status :"+txt);
            voice.deallocate();

        }
    }//GEN-LAST:event_btnPhatAmActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fileChooser = new JFileChooser(new File("c:\\"));
        fileChooser.setDialogTitle("Save File !");
        fileChooser.showSaveDialog(null);
        File f = fileChooser.getSelectedFile();
        try {
            IOFile file = new IOFile();
            file.ghiFile(f, dictRecent);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fileChooser = new JFileChooser(new File("c:\\"));
        fileChooser.setDialogTitle("Save File !");
        fileChooser.showSaveDialog(null);
        File f = fileChooser.getSelectedFile();
        try {
            IOFile file = new IOFile();
            file.ghiFile(f, dictF);
            
        } catch (Exception e) {
        }
            
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tableFavoriteMouseClicked(java.awt.event.MouseEvent evt) {
        posDislike = tableFavorite.getSelectedRow();
        String selectedWord = (String) model1.getValueAt(posDislike, 0);
        word = dictF.translateWord(selectedWord);
        viewTableFavorite();
        if (word != null) {
            txtWord.setText(word.getEng());
            txtNghia.setText(word + "");

        }
    }

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboLangueges2;
    private javax.swing.JButton btnDisLike;
    private javax.swing.JButton btnLike;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnPhatAm;
    private javax.swing.JComboBox<String> comboLanguages;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuAnhViet;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenuItem jMenuFileFavorite;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuOntap;
    private javax.swing.JMenu jMenuSave;
    private javax.swing.JMenuItem jMenuVietAnh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tableFavorite;
    private javax.swing.JTable tableRecent;
    private javax.swing.JTextArea txtNghia;
    private javax.swing.JTextArea txtWord;
    // End of variables declaration//GEN-END:variables
}
