package runLen;

public class RunLength {
    public static String RunLength(String str) {
        String output = "";
        int i = 0;
        while (i < str.length()) {
            int counter = 0;
            char ch = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == ch)
                    counter++;
                else
                    break;
            }
            output += Integer.toString(counter) + ch;
            i += counter;
            counter = 0;
        }
        return output;
    }

    public static void main(String[] args){
      //  System.out.println(RunLength("codee"));

        String str = "co";
        int i = 0;

        while (i < str.length()) {
            System.out.println("While "+i);
            char ch = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) == ch)
                    System.out.println("If "+i);
                else
                    System.out.println("Else "+i);
                break;
            }
            i++;
            System.out.println("Bottom "+i);
        }
    }
}
