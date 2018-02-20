package abcheck;

public class Main {

    static String abcheck(String str){
        String comp = str.replace(" ","").toLowerCase();
        boolean isAinThere = false;

        do{
            int i = comp.indexOf('a');
            int j = comp.indexOf("b");
            if(i > 0){
                isAinThere = true;
                comp = comp.substring(i+1);
            }else{
                isAinThere = false;
            }

            if(i >= j)
                break;
            if(i+3 == j)
                return "true";
            if(i > 0)
                isAinThere = true;
        }while(isAinThere);
        return "false";
    }

    public static void main(String[] agrs){
        System.out.println(abcheck("away obe"));
//        System.out.println("abc".indexOf('f'));
    }
}
