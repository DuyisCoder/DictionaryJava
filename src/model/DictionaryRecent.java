/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author minhduy
 */
public class DictionaryRecent{
    private Map<String, Word> dict;
    private Word w;
    private static boolean bat;
    IOFile file = new IOFile();

    public DictionaryRecent() {
        dict = new HashMap<>();
        w = new Word();
        file.readFile("recent.txt", this);
    }

    public Word translateWord(String eng) {
        if (dict.containsKey(eng)) {
            return dict.get(eng);
        }
        return null;
    }

    public boolean timTheoKey(String eng) {
        if (dict.containsKey(eng)) {
            return true;
        }
        return false;
    }
   public List<String> timTheoNghia(String tuCanTim) {
    List<String> ketQua = new ArrayList<>();

    for (Map.Entry<String, Word> entry : dict.entrySet()) {
        Word word = entry.getValue();
        for (String nghia : word.getViet()) {
            if (nghia.equalsIgnoreCase(tuCanTim)) {
                ketQua.add(word.getEng());
                break; // Bạn có thể chọn thoát khỏi vòng lặp sau khi tìm thấy kết quả đầu tiên (hoặc không tùy theo yêu cầu của bạn)
            }
        }
    }

    return ketQua;
}

    public static boolean isBat() {
        return bat;
    }

    public static void setBat(boolean bat) {
        DictionaryRecent.bat = bat;
    }





    public void addWord(String eng, List<String> vi) {
        if (!dict.containsKey(eng)) {
            Word w = new Word();
            w.setEng(eng);
            w.setViet(vi);
            dict.put(eng, w);
            file.ghiFile("recent.txt", this);

        }

    }

    public void removeWord(String eng) {
        if (!dict.containsKey(eng)) {
        } else {
            dict.remove(eng);
        }
    }

    public Map<String, Word> getDict() {
        return dict;
    }

    @Override
    public String toString() {
        return "DictionaryRecent{" + "dict=" + dict ;
    }

    

    public void loadData(String eng, List<String> vi, String gioiTu, String phienAm) {
        Word word = new Word(eng, vi, gioiTu, phienAm);
        dict.put(word.getEng(), word);
    }

    public void loadData(String eng, List<String> vi) {
        Word word = new Word(eng, vi);
        dict.put(eng, word);
    }
}
