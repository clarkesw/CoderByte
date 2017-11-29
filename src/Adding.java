public class Adding {
    public static void main(String[] args){
        System.out.print(SimpleAdding(4));
    }

    public static int SimpleAdding(int num) {
        int answer = 0;
        for(int i=1; i<= num; i++){
            answer = answer + i;
            System.out.println(answer+"   i:"+i);
        }

        return answer;
    }
}