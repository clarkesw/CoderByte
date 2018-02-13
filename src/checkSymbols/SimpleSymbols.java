package checkSymbols;

public class SimpleSymbols {

    public static int KaprekarsConstant(int num) {
        int count = 1;
        int result =  changeDir("fow",String.format("%04d",num)) - changeDir("rev",String.format("%04d",num));
        while(result != 6174){
            count++;
            result = changeDir("fow",String.format("%04d",result)) - changeDir("rev",String.format("%04d",result));
        }
        return count;
    }

    public static int changeDir(String dir,String num){
        char[] revNum = {0,0,0,0};

        for(int h=0; h < 4; h++){
            revNum[h] = num.charAt(h);
        }
        for(int i=0; i < revNum.length; i++){
            for(int j=0; j < revNum.length; j++){
                switch (dir){
                    case "rev":
                        if(revNum[i] < revNum[j]){
                            char temp = revNum[j];
                            revNum[j] = revNum[i];
                            revNum[i] = temp;
                        }
                        break;
                    case "fow":
                        if(revNum[i] > revNum[j]){
                            char temp = revNum[j];
                            revNum[j] = revNum[i];
                            revNum[i] = temp;
                        }
                }

            }
        }
        return Integer.parseInt(new String(revNum));
    }

    public static void main (String[] args) {
        System.out.println(KaprekarsConstant(2111));
    }

    public static String AlphabetSoup(String str) {

        char[] myChar = str.toCharArray();
        for(int i=0; i < str.length(); i++){
            for(int j=0; j < str.length(); j++){
                if(myChar[i] < myChar[j]){
                    char temp = myChar[i];
                    myChar[i] = myChar[j];
                    myChar[j] = temp;
                }
            }
        }
        return new String(myChar);
    }

    public static String TimeConvert(int num) {

        if(num < 60){
            return "0:"+num;
        }
        int hours = num / 60;
        return hours + ":" + (num % 60);
    }
    public static String CheckNums(int num1, int num2) {
        if( num1 < num2){
            return "true";
        }else if(num1 == num2){
            return "-1";
        }
        return "false";
    }

    public static boolean SimpleSymbols(String str) {

        if(str.isEmpty() || !str.matches(".*[a-zA-Z].*"))
            return false;
        for(int i=0; i < str.length(); i++){
            if((i == 0 || i == str.length())&& Character.isLetter(str.charAt(i))){
                return false;
            }else if(Character.isLetter(str.charAt(i))&& (str.charAt(i-1) != '+' || str.charAt(i+1) != '+') &&
                    (str.charAt(i-1) != '=' || str.charAt(i+1) != '=')) {
                return false;
            }
        }
        return true;
    }

}
