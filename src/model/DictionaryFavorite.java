/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author minhduy
 */
public class DictionaryFavorite {

    private Map<String, Word> dict;
    private Word w;
    IOFile file = new IOFile();

    public DictionaryFavorite() {
        dict = new HashMap<>();
        w = new Word();
        file.readFile("favorite.txt", this);
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

    public void addWord(String eng, List<String> vi) {
        if (!dict.containsKey(eng)) {
            Word w = new Word();
            w.setEng(eng);
            w.setViet(vi);
            w.setGioiTu(null);
            w.setPhienAm(null);
            dict.put(eng, w);
            file.ghiFile("favorite.txt", this);

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
        return "Tieng viet";
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
