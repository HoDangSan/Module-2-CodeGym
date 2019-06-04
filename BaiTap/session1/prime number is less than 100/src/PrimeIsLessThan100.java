public class PrimeIsLessThan100 {
    public static boolean isPrime(int number){
        if (number < 2)
            return false;
        for (int i = 2; i < Math.sqrt(number); i++){
            if (number % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        for (int i = 0; i < 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
