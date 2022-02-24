package Morsekod;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.LowerCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class HelloMorse {

    private HashMap<String, String>Morsecode;


    public HelloMorse() {

        Morsecode = new HashMap<String, String>();
        Morsecode.put("A", "*-");
        Morsecode.put("B" , "-***");
        Morsecode.put("C", "-*-*");
        Morsecode.put("D", "-**");
        Morsecode.put("E", "*");
        Morsecode.put("F", "**-*");
        Morsecode.put("G", "--*");
        Morsecode.put("H", "****");
        Morsecode.put("I", "**");
        Morsecode.put("J", "*---");
        Morsecode.put("K", "-*-");
        Morsecode.put("L", "*-**");
        Morsecode.put("M", "--");
        Morsecode.put("N", "-*");
        Morsecode.put("O", "---");
        Morsecode.put("P", "*--*");
        Morsecode.put("Q", "--*-");
        Morsecode.put("R", "*-*");
        Morsecode.put("S", "***");
        Morsecode.put("T", "-");
        Morsecode.put("U", "**-");
        Morsecode.put("V", "***-");
        Morsecode.put("W", "*--");
        Morsecode.put("X", "-**-");
        Morsecode.put("Y", "-*--");
        Morsecode.put("Z", "--**");
        Morsecode.put("1", "*----");
        Morsecode.put("2", "**---");
        Morsecode.put("3", "***--");
        Morsecode.put("4", "****-");
        Morsecode.put("5", "*****");
        Morsecode.put("6", "-****");
        Morsecode.put("7", "--***");
        Morsecode.put("8", "---**");
        Morsecode.put("9", "----*");
        Morsecode.put("0" , "-----");
        Morsecode.put(".", "*-*-*-");
        Morsecode.put("," , "--*--");

        Morsecode.put("*-", "A");
        Morsecode.put("-***" , "B");
        Morsecode.put("-*-*", "C");
        Morsecode.put("-**", "D");
        Morsecode.put("*", "E");
        Morsecode.put("**-*", "F");
        Morsecode.put("--*", "G");
        Morsecode.put("****", "H");
        Morsecode.put("**", "I");
        Morsecode.put("*---", "J");
        Morsecode.put("-*-", "K");
        Morsecode.put("*-**", "L");
        Morsecode.put("--", "M");
        Morsecode.put("-*", "N");
        Morsecode.put("---", "O");
        Morsecode.put("*--*", "P");
        Morsecode.put("--*-", "Q");
        Morsecode.put("*-'", "R");
        Morsecode.put("***", "S");
        Morsecode.put("-", "T");
        Morsecode.put("**-", "U");
        Morsecode.put("***-", "V");
        Morsecode.put("*--", "W");
        Morsecode.put("-**-", "X");
        Morsecode.put("-*--", "Y");
        Morsecode.put("--**", "Z");
        Morsecode.put("*----", "1");
        Morsecode.put("**---", "2");
        Morsecode.put("***--", "3");
        Morsecode.put("****-", "4");
        Morsecode.put("*****", "5");
        Morsecode.put("-****", "6");
        Morsecode.put("--***", "7");
        Morsecode.put("---**", "8");
        Morsecode.put("----*", "9");
        Morsecode.put("-----" , "0");
        Morsecode.put("*-*-*-", ".");
        Morsecode.put("--*--" , ",");


    }

        public String getMorseCode(String ord) {
            String UpperCase = ord.toUpperCase();
            return Morsecode.get(UpperCase);

        }

        public String agetMorsecode(String letter) {

        String code = Morsecode.get(letter);

        if (code == null); {
                code = "It dosen´t exit";
            }
            return code;

        }




}


