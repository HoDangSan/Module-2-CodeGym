import java.util.Scanner;

public class CountValue {
    public static void main(String[] args){
        System.out.println("Enter value");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.println("Enter chart need count: ");
        char kitu = 'a';

        int count = 0;
        for (int i = 0; i < value.length(); i++){
            if (kitu == value.charAt(i)){
                count++;
            }
        }

        System.out.println("The character 'a' has the number of occurrences: " + count);
    }

}
