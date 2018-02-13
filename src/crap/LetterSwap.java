package crap;

public class LetterSwap {
    public static void main(String[] args){
        System.out.print(LetterChanges("ahcde"));
//        Scanner s = new Scanner(System.in);
//        String in = s.nextLine();
//        System.out.print(LetterChanges(in));
    }

    public static String LetterChanges(String str) {

        char[] tempChar = new char[str.length()];
        for(int i=0; i < str.length(); i++){
            int ascii = (int)str.charAt(i);
            Character testChar = (char)ascii;

            if(testChar.toString().matches("[a-zA-Z]"))
                ++ascii;
            testChar = (char)ascii;

            if(testChar.toString().matches("[a|e|i|o|u]"))
                ascii = ascii - 32;

            tempChar[i] = (char)ascii;
        }
        return new String(tempChar);
    }
}