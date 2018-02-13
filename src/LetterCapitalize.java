import java.util.*;
import java.io.*;

class Main {
    public static String LetterCapitalize(String str) {

        char[] capMe = str.toCharArray();
        for(int i = 0; i < capMe.length; i++){
            if(i == 0)
                capMe[i] = java.lang.Character.toUpperCase(capMe[i]);
            if(capMe[i] == ' ' && i+1< capMe.length)
                capMe[i+1] = java.lang.Character.toUpperCase(capMe[i+1]);
         }

        return new String(capMe);
    }

    public static void main (String[] args) {
        System.out.print(LetterCapitalize("i ran there "));
    }
}