package Day8;

import java.util.HashMap;
import java.util.Map;

public class Day8 {

    public static void main(String[] args) {

        Map<String, String> myDict = new HashMap<String, String>();

        // TR TO ENG...

        myDict.put("PAZARTESİ", "MONDAY");
        myDict.put("SALI", "TUESDAY");
        myDict.put("ÇARŞAMBA", "WEDNESDAY");
        myDict.put("PERŞEMBE", "THURSDAY");
        myDict.put("CUMA", "FRIDAY");
        myDict.put("CUMARTESİ", "SATURDAY");
        myDict.put("PAZAR", "SUNDAY");

        // GET METODU KEY ALIR..

        System.out.println(myDict.get("PAZARTESİ"));
        // key verdik value aldık..

        // tüm keyleri yazdır:
        System.out.println(myDict.keySet());

        // tüm valueleri yazdırır..
        System.out.println(myDict.values());
        // veriler sıralı tutulmuyor..

        // tüm dict basma
        System.out.println(myDict.toString());
        /*
         * expected output:
         * {PERŞEMBE=THURSDAY, CUMARTESİ=SATURDAY, CUMA=FRIDAY, PAZAR=SUNDAY,
         * PAZARTESİ=MONDAY, SALI=TUESDAY, ÇARŞAMBA=WEDNESDAY}
         */

        // Veri setinden, value vererek veya key ve value vererek eleman silebiliriz.
        myDict.remove("SALI");
        myDict.remove("ÇARŞAMBA", "WEDNESDAY");

        // size alımı:
        System.out.println("The size of the dictionary: " + myDict.size());

        myDict.clear(); // TEMİZLER.............

        System.out.println(myDict.size());
        System.out.println(myDict.isEmpty()); // T-F Döner

        // boolean içeren başka bir dict...

        Map<String, Boolean> secondDict = new HashMap<String, Boolean>();

        secondDict.put("ekmek", Boolean.TRUE); // gerekli
        secondDict.put("dondurma", Boolean.FALSE); // gerek yok gibisinden..

        System.out.println(secondDict.toString());

        // REPLACE METODU İLE DE DEĞİŞİKLİK YAPABİLİRİZ.
        secondDict.replace("ekmek", Boolean.FALSE);

        System.out.println(secondDict.toString());

    }

}
