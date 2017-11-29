import java.util.Arrays;
import java.util.Comparator;

public class Compare{
    public static void main(String[] args){
        String input = "clarke zax me rush xeon";
        String[] split = input.split(" ");

        String temp = "";
        for(int i = 0; i < split.length; i++){
            for(int j = 0; j < split.length; j++){
                if(split[i].compareTo(split[j]) > 0) {
                    temp = split[i];
                    split[i] = split[j];
                    split[j] = temp;
                }

            }
        }

        for(String out : split)
            System.out.print(out + " ");

    }
}

//         for(int i = 0; i < split.length; i++){
//    count = 0;
//            for(int j = 0; j < split.length; j++){
//        if(split[i] != null && split[j] != null){
//
//            String out = "";
//            int comp = split[i].compareTo(split[j]);
//
//            if(comp < 0 && count - 1 >= 0){
//                answer[count - 1] = split[i];
//                answer[count] = split[i - 1];
//            }else if(comp < 0 && i == 0){
//                answer[count] = split[i];
//                answer[count + 1] = split[i + 1];
//            }else if(comp > 0&& count+1 < split.length && i+1 < split.length){
//                answer[count + 1] = split[i];
//                answer[count] = split[i + 1];
//            }
//            count++;
//
//            //              System.out.println("I: " + split[i] + " J: " + split[j]+ " COMP: "+comp +"    "+out);
//        }
//    }
//}
////
//
// int j = (i < split.length -1) ? i+1 : i;
//    int comp = split[i].compareTo(split[j]);
//            System.out.println("comp " + comp + " i " + split[i]  + " j "+split[j] );
//
//                if(comp < 0)
//    answer[i] = split[i];
//                else if(comp == 0)
//    answer[i] = split[i];
//                else if(comp > 0)
//    answer[i] = split[j];

