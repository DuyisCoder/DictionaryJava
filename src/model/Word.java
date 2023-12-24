/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author minhduy
 */
public class Word implements Comparable<Word> {

    private String eng;
    private List<String> viet;
    private String gioiTu;
    private String phienAm;

    public Word() {
        viet = new ArrayList<>();
    }

       public Word(String eng, List<String> viet, String gioiTu, String phienAm) {
        this.eng = eng;
        this.viet = viet;
        this.gioiTu = gioiTu;
        this.phienAm = phienAm;
    }

    public Word(String eng, List<String> viet) {
        this.eng = eng;
        this.viet = viet;
    }

    public String getEng() {
        return eng;
    }

    public List<String> getViet() {
        return viet;
    }

    public String getGioiTu() {
        return gioiTu;
    }

    public String getPhienAm() {
        return phienAm;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public void setViet(List<String> viet) {
        this.viet = viet;
    }

    public void setGioiTu(String gioiTu) {
        this.gioiTu = gioiTu;
    }

    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }

    @Override
    public String toString() {
        StringBuilder vietStringBuilder = new StringBuilder();
        for (String item : viet) {
            vietStringBuilder.append(item);
            vietStringBuilder.append(", ");
        }
        // Loại bỏ dấu phẩy cuối cùng nếu có
        if (vietStringBuilder.length() > 0) {
            vietStringBuilder.setLength(vietStringBuilder.length() - 2);
        }
        return vietStringBuilder.toString()
                + (gioiTu != null && !gioiTu.isEmpty() ? "\n- Giới từ: " + gioiTu : "")
                + (phienAm != null && !phienAm.isEmpty() ? "\n- Phiên Âm: " + phienAm : "");
    }

    public String toString2() {
        return eng + "+" + viet;
    }

    @Override
    public int compareTo(Word o) {
        return this.getEng().compareTo(o.getEng());
    }

}
