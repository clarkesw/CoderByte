package car;

public class MedDifficulty {

    public static void main(String[] args){
       // System.out.println(12%5);
        System.out.println(PrimeTime(12));
    }

    public static String PrimeTime(int num) {
        System.out.print(num+"  ");
        if(num == 2 || num == 5 || num ==7){
            return "true";
        }else if(num % 2 == 0){
            return "false";
        }else if(num % 3 == 0){
            return "false";
        }else if(num % 5 == 0){
            return "false";
        }
        return "true";
    }
}
