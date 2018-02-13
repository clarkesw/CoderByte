package sortInt;

public class Sorter implements SortInterface{
    public static void main(String[] args){
        int[] sortMe = {9,2,4,3,5};

        sortMe = sortArray(sortMe);
        printMe(sortMe);
    }
    public static void main(String[] args,int me){
        System.out.println("Hiiiii");
    }


    public static void printMe(int[] sortMe){
        for(int i=0; i < sortMe.length; i++){
            System.out.print(sortMe[i] + ",");
        }
    }

    public static int[] sortArray(int[] sortMe){

        for(int i=0; i < sortMe.length; i++){
            for(int j=0; j < sortMe.length; j++){
                if(sortMe[i] > sortMe[j]) {
                    int temp = sortMe[j];
                    sortMe[j] = sortMe[i];
                    sortMe[i] = temp;
                }
            }
        }
        return sortMe;
    }
}
