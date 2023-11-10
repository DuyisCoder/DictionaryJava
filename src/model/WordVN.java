/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minhduy
 */
public class WordVN {
    private String viet;
    private List<String> eng;
    private String gioiTu;
    private String phienAm;

    public WordVN(String viet, List<String> eng, String gioiTu, String phienAm) {
        this.viet = viet;
        this.eng = eng;
        this.gioiTu = gioiTu;
        this.phienAm = phienAm;
    }

      public WordVN(String viet, List<String> eng) {
        this.viet = viet;
        this.eng = eng;
    }

    public WordVN() {
        eng = new ArrayList<>();
    }

    public String getViet() {
        return viet;
    }

    public void setViet(String viet) {
        this.viet = viet;
    }

    public List<String> getEng() {
        return eng;
    }

    public void setEng(List<String> eng) {
        this.eng = eng;
    }

    public String getGioiTu() {
        return gioiTu;
    }

    public void setGioiTu(String gioiTu) {
        this.gioiTu = gioiTu;
    }

    public String getPhienAm() {
        return phienAm;
    }

    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }
    
      @Override
    public String toString() {
        StringBuilder vietStringBuilder = new StringBuilder();
        for (String item : eng) {
            vietStringBuilder.append(item);
            vietStringBuilder.append(", ");
        }

        // Loại bỏ dấu phẩy cuối cùng nếu có
        if (vietStringBuilder.length() > 0) {
            vietStringBuilder.setLength(vietStringBuilder.length() - 2);
        }

        return  vietStringBuilder.toString() +
                (gioiTu != null && !gioiTu.isEmpty() ? "\n- Giới từ: " + gioiTu : "") +
                (phienAm != null && !phienAm.isEmpty() ? "\n- Phiên Âm: " + phienAm : "");
    }

}
