package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPrime(6548));
    }

    public static boolean isPrime(int number) {
        if (number > 1){
            if (number == 2){
                return true;
            } else if(number % 2 == 0){
                return false;
            } else {
                for(int current=3; current<(int)Math.sqrt(number); current+=2){
                    if(number % current == 0){
                        return false;
                    }
                }
                return false;
            }
        } else {
            return false;
        }
    }
}