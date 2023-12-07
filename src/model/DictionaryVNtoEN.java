/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author minhduy
 */
public class DictionaryVNtoEN {
    private  static  Map<String,WordVN> dict;
    private WordVN word;
    private IOFile file = new IOFile();
    public DictionaryVNtoEN(){
        dict = new HashMap<>();
        file.readFile("vietanh.txt", this);
        
    }

    public DictionaryVNtoEN(Map<String, WordVN> dict) {
        this.dict = dict;
    }

    public Map<String, WordVN> getDict() {
        return dict;
    }

    public void setDict(Map<String, WordVN> dict) {
        this.dict = dict;
    }

    public WordVN translateWord(String vi ) {
        if (dict.containsKey(vi)) {
            return dict.get(vi);
        }
        return null;
    }
//    public void loadData(String vi, List<String> eng, String gioiTu, String phienAm) {
//        word = new WordVN(vi, eng, gioiTu, phienAm);
//        dict.put(word.getViet(), word);
//    }

    public void loadData(String eng, List<String> vi) {
         word = new WordVN(eng, vi);
        dict.put(word.getViet(), word);
    }

    @Override
    public String toString() {
        return "DictionaryVNtoEN{" + "dict=" + dict + ", word=" + word + '}';
    }

    public boolean timTheoKey(String vi) {
        if (dict.containsKey(vi)) {
            return true;
        }
        return false;
    }

    public void addWord(String vi, List<String> eng) {
        if (!dict.containsKey(eng)) {
            WordVN w = new WordVN();
            w.setViet(vi);
            w.setEng(eng);
            dict.put(vi, w);
            file.ghiFile("favorite.txt", this);

        }

    }

 
      public void deleteWord(String eng) {
        if (!dict.containsKey(eng)) {
            System.out.println("Khong ton tai");
        } else {
            dict.remove(eng);
            file.ghiFile("vietanh.txt", this);
        }
    }
   public void update(String eng, List<String> vi) {
        if (!dict.containsKey(eng)) {
            System.out.println("Khong ton tai");
        }else{
            word=new WordVN(eng,vi);
            dict.put(eng, word);
            file.ghiFile("vietanh.txt", this);
            file.readFile("vietanh1.txt", this);
            
        }
    }
  
    
    
    
}
