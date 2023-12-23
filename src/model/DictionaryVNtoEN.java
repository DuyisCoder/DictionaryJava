/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
            w.setGioiTu(null);
            w.setPhienAm(null);
            dict.put(vi, w);
            file.ghiFile("vietanh.txt", this);

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
//            file.readFile("vietanh1.txt", this);
            
        }
    }
  
    public List<Map.Entry<String, WordVN>>  sortDictionary(){
        List<Map.Entry<String,WordVN>> list = new ArrayList<>(dict.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, WordVN>>(){
            @Override
            public int compare(Map.Entry<String, WordVN> o1, Map.Entry<String, WordVN> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
           
        });
        return list;
    }
    
}
