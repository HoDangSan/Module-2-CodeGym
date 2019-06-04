public class Prime20First {
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
        int countPrime = 0;
        int i = 0;
        while (countPrime != 20){
            if (isPrime(i)){
                System.out.println(i);
                countPrime++;
            }
            i++;
        }
    }
}
