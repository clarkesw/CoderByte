package runLen;

public class RunLength {
    public static String RunLength(String str) {
        char[] chars = str.toCharArray();
        int currentCount = 1;
        String results = "";
        int i=0;
        while(i < chars.length){
            i++;
            int nextChar = (i == chars.length-1 ? i : i+1);

            if (chars[i] == chars[nextChar]) {
                currentCount++;
            }else{
                results += Integer.toString(currentCount) + chars[i];
                currentCount = 1;
                break;
            }

        }

        return results;
    }

    public static void main(String[] args){
        System.out.println(RunLength("code"));
    }
}
