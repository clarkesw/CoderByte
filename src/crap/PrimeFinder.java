package crap;

public class PrimeFinder {
    public static void main(String[] args){

        for(int i = 2; i < 100; i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int prime){
        if(prime == 2 || prime == 3 || prime == 5)
            return true;

        if(prime%2 == 0){
            return false;
        }else if(prime % 3 == 0){
            return false;
        }else if(prime % 5 == 0){
            return false;
        }
        return true;
    }
}
