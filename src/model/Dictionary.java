/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @author minhduy
 */
public class Dictionary{

    private static Map<String, Word> dict;
    private Word w;
    IOFile file = new IOFile();

    public Dictionary() {
        dict = new HashMap<>();
        w = new Word();
    }

    public void loadData(String eng, List<String> vi, String gioiTu, String phienAm) {
        Word word = new Word(eng, vi, gioiTu, phienAm);
        dict.put(word.getEng(), word);
        
    }

    public void loadData(String eng, List<String> vi) {
        Word word = new Word(eng, vi);
        dict.put(word.getEng(), word);
    }

    public Word translateWord(String eng) {
        if (dict.containsKey(eng)) {
            return dict.get(eng);
        }
        return null;
    }

    public void deleteWord(String eng) {
        if (!dict.containsKey(eng)) {
            System.out.println("Khong ton tai");
        } else {
            dict.remove(eng);
            file.ghiFile("anhviet2.txt", this);
        }
    }

//    public Word update(String eng, List<String> vi) {
//        if (!dict.containsKey(eng)) {
//            return null;
//        }
//        w = new Word(eng, vi);
//        return dict.put(eng, w);
//    }

    public void updatee(String eng, List<String> vi) {
        if (!dict.containsKey(eng)) {
            System.out.println("Khong ton tai");
        }else{
            w=new Word(eng,vi);
            dict.put(eng, w);
            file.ghiFile("anhviet2.txt", this);
            file.readFile("anhviet2.txt", this);
            
        }
    }

    public void addWord(String eng, List<String> vi, String gioiTu, String phienAm) {
        if (dict.containsKey(eng)) {
            System.out.println("Tu nay da ton tai");
        } else {
            Word w = new Word();
            w.setEng(eng);
            w.setViet(vi);
            w.setGioiTu(gioiTu);
            w.setPhienAm(phienAm);
            dict.put(eng, w);
            file.ghiFile("anhviet2.txt", this);

        }
    }

    public void addWord(String eng, List<String> vi) {
        if (dict.containsKey(eng)) {
            System.out.println("Tu nay da ton tai");
        } else {
            Word w = new Word();
            w.setEng(eng);
            w.setViet(vi);
            dict.put(eng, w);
            file.ghiFile("anhviet2.txt", this);

        }
    }

    public boolean timTheoKey(String eng) {
        if (dict.containsKey(eng)) {
            return true;
        }
        return false;
    }

    public Word themTu(String eng, List<String> vi) {
        Word w = new Word();
        if (dict.containsKey(eng)) {
            w = new Word(eng, vi);
            dict.put(eng, w);
            file.ghiFile("anhviet2.txt", this);
        } else {
            return null;
        }
        return w;
    }

    public String toString() {
    return dict + "";
    }

    public Map<String, Word> getDict() {
        return dict;
    }

    public void setDict(Map<String, Word> dict) {
        this.dict = dict;
    }

  

    public void sortDictionary(){
        List<Map.Entry<String,Word>> list = new ArrayList<>(dict.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Word>>(){

            public int compare(Map.Entry<String, Word> entry1, Map.Entry<String, Word> entry2) {
              
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });
        // In danh sách đã sắp xếp
        for (Map.Entry<String, Word> entry : list) {
//            System.out.println(entry.getKey());
        }

    }
}
