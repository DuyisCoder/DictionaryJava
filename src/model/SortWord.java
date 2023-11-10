package model;

import java.util.Comparator;

public class SortWord implements Comparator<Word> {
    public int compare(Word o1, Word o2) {
        String eng1 =o1.getEng();
        String eng2 = o2.getEng();
        return Character.compare(eng1.charAt(0), eng2.charAt(0));
    }
}
